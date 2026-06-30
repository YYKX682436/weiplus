package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class zzgk extends java.lang.Thread {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzgg zzalz;
    private final java.lang.Object zzamc;
    private final java.util.concurrent.BlockingQueue<com.google.android.gms.internal.measurement.zzgj<?>> zzamd;

    public zzgk(com.google.android.gms.internal.measurement.zzgg zzggVar, java.lang.String str, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.measurement.zzgj<?>> blockingQueue) {
        this.zzalz = zzggVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(blockingQueue);
        this.zzamc = new java.lang.Object();
        this.zzamd = blockingQueue;
        setName(str);
    }

    private final void zza(java.lang.InterruptedException interruptedException) {
        this.zzalz.zzge().zzip().zzg(java.lang.String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.util.concurrent.Semaphore semaphore;
        java.lang.Object obj2;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        com.google.android.gms.internal.measurement.zzgk zzgkVar2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.concurrent.Semaphore semaphore2;
        java.lang.Object obj5;
        com.google.android.gms.internal.measurement.zzgk zzgkVar3;
        com.google.android.gms.internal.measurement.zzgk zzgkVar4;
        boolean z17;
        java.util.concurrent.Semaphore semaphore3;
        boolean z18 = false;
        while (!z18) {
            try {
                semaphore3 = this.zzalz.zzalv;
                semaphore3.acquire();
                z18 = true;
            } catch (java.lang.InterruptedException e17) {
                zza(e17);
            }
        }
        try {
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            while (true) {
                com.google.android.gms.internal.measurement.zzgj<?> poll = this.zzamd.poll();
                if (poll == null) {
                    synchronized (this.zzamc) {
                        if (this.zzamd.peek() == null) {
                            z17 = this.zzalz.zzalw;
                            if (!z17) {
                                try {
                                    this.zzamc.wait(30000L);
                                } catch (java.lang.InterruptedException e18) {
                                    zza(e18);
                                }
                            }
                        }
                    }
                    obj3 = this.zzalz.zzalu;
                    synchronized (obj3) {
                        if (this.zzamd.peek() == null) {
                            break;
                        }
                    }
                } else {
                    android.os.Process.setThreadPriority(poll.zzamb ? threadPriority : 10);
                    poll.run();
                }
            }
            obj4 = this.zzalz.zzalu;
            synchronized (obj4) {
                semaphore2 = this.zzalz.zzalv;
                semaphore2.release();
                obj5 = this.zzalz.zzalu;
                obj5.notifyAll();
                zzgkVar3 = this.zzalz.zzalo;
                if (this == zzgkVar3) {
                    com.google.android.gms.internal.measurement.zzgg.zza(this.zzalz, null);
                } else {
                    zzgkVar4 = this.zzalz.zzalp;
                    if (this == zzgkVar4) {
                        com.google.android.gms.internal.measurement.zzgg.zzb(this.zzalz, null);
                    } else {
                        this.zzalz.zzge().zzim().log("Current scheduler thread is neither worker nor network");
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            obj = this.zzalz.zzalu;
            synchronized (obj) {
                semaphore = this.zzalz.zzalv;
                semaphore.release();
                obj2 = this.zzalz.zzalu;
                obj2.notifyAll();
                zzgkVar = this.zzalz.zzalo;
                if (this != zzgkVar) {
                    zzgkVar2 = this.zzalz.zzalp;
                    if (this == zzgkVar2) {
                        com.google.android.gms.internal.measurement.zzgg.zzb(this.zzalz, null);
                    } else {
                        this.zzalz.zzge().zzim().log("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    com.google.android.gms.internal.measurement.zzgg.zza(this.zzalz, null);
                }
                throw th6;
            }
        }
    }

    public final void zzjn() {
        synchronized (this.zzamc) {
            this.zzamc.notifyAll();
        }
    }
}
