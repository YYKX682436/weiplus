package org.p3343x72743996.p3344x2e06d1.p3351x363585;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395)
/* renamed from: org.chromium.base.task.TaskRunnerImpl */
/* loaded from: classes13.dex */
public class C29446x400e18f5 implements org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73630x7118e671 = false;

    /* renamed from: mDidOneTimeInitialization */
    private boolean f73633x15fcd821;

    /* renamed from: mNativeTaskRunnerAndroid */
    private volatile long f73634x73a24116;

    /* renamed from: mPreNativeDelayedTasks */
    private java.util.List<android.util.Pair<java.lang.Runnable, java.lang.Long>> f73635xeae4d299;

    /* renamed from: mPreNativeTaskLock */
    private final java.lang.Object f73636x917bfe1d;

    /* renamed from: mPreNativeTasks */
    private java.util.LinkedList<java.lang.Runnable> f73637xe250bce1;

    /* renamed from: mRunPreNativeTaskClosure */
    protected final java.lang.Runnable f73638xe3e47ffa;

    /* renamed from: mTaskRunnerType */
    private final int f73639x827f83bc;

    /* renamed from: mTaskTraits */
    private final int f73640x17947257;

    /* renamed from: mTraceEvent */
    private final java.lang.String f73641x15aa8ca2;

    /* renamed from: sQueue */
    private static final java.lang.ref.ReferenceQueue<java.lang.Object> f73632xc8e9785e = new java.lang.ref.ReferenceQueue<>();

    /* renamed from: sCleaners */
    private static final java.util.Set<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.TaskRunnerCleaner> f73631xcdb18410 = new java.util.HashSet();

    /* renamed from: org.chromium.base.task.TaskRunnerImpl$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: belongsToCurrentThread */
        boolean mo153037xbdc9b874(long j17);

        /* renamed from: destroy */
        void mo153038x5cd39ffa(long j17);

        /* renamed from: init */
        long mo153039x316510(int i17, int i18);

        /* renamed from: postDelayedTask */
        void mo153040x6a420547(long j17, java.lang.Runnable runnable, long j18, java.lang.String str);
    }

    /* renamed from: org.chromium.base.task.TaskRunnerImpl$TaskRunnerCleaner */
    /* loaded from: classes13.dex */
    public static class TaskRunnerCleaner extends java.lang.ref.WeakReference<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5> {

        /* renamed from: mNativePtr */
        final long f73642x3e9ea96a;

        public TaskRunnerCleaner(org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5 c29446x400e18f5) {
            super(c29446x400e18f5, org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.f73632xc8e9785e);
            this.f73642x3e9ea96a = c29446x400e18f5.f73634x73a24116;
        }

        /* renamed from: destroy */
        public void m153041x5cd39ffa() {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153038x5cd39ffa(this.f73642x3e9ea96a);
        }
    }

    public C29446x400e18f5(int i17) {
        this(i17, "TaskRunnerImpl", 0);
        m153033x7eb1ca70();
    }

    /* renamed from: destroyGarbageCollectedTaskRunners */
    private static void m153033x7eb1ca70() {
        while (true) {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.TaskRunnerCleaner taskRunnerCleaner = (org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.TaskRunnerCleaner) f73632xc8e9785e.poll();
            if (taskRunnerCleaner == null) {
                return;
            }
            taskRunnerCleaner.m153041x5cd39ffa();
            java.util.Set<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.TaskRunnerCleaner> set = f73631xcdb18410;
            synchronized (set) {
                set.remove(taskRunnerCleaner);
            }
        }
    }

    /* renamed from: oneTimeInitialization */
    private void m153034x758c09d3() {
        if (this.f73633x15fcd821) {
            return;
        }
        this.f73633x15fcd821 = true;
        if (!org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153011xc157edac(this)) {
            mo153019x794ecdbc();
        } else {
            this.f73637xe250bce1 = new java.util.LinkedList<>();
            this.f73635xeae4d299 = new java.util.ArrayList();
        }
    }

    /* renamed from: belongsToCurrentThreadInternal */
    public java.lang.Boolean m153035x696e2f51() {
        synchronized (this.f73636x917bfe1d) {
            m153034x758c09d3();
        }
        if (this.f73634x73a24116 == 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153037xbdc9b874(this.f73634x73a24116));
    }

    /* renamed from: clearTaskQueueForTesting */
    public int m153036xa7228126() {
        int i17;
        synchronized (this.f73636x917bfe1d) {
            java.util.LinkedList<java.lang.Runnable> linkedList = this.f73637xe250bce1;
            if (linkedList != null) {
                i17 = linkedList.size() + this.f73635xeae4d299.size();
                this.f73637xe250bce1.clear();
                this.f73635xeae4d299.clear();
            } else {
                i17 = 0;
            }
        }
        return i17;
    }

    /* renamed from: initNativeTaskRunner */
    public void mo153019x794ecdbc() {
        long mo153039x316510 = org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153039x316510(this.f73639x827f83bc, this.f73640x17947257);
        synchronized (this.f73636x917bfe1d) {
            java.util.LinkedList<java.lang.Runnable> linkedList = this.f73637xe250bce1;
            if (linkedList != null) {
                java.util.Iterator<java.lang.Runnable> it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.Runnable next = it.next();
                    org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153040x6a420547(mo153039x316510, next, 0L, next.getClass().getName());
                }
                this.f73637xe250bce1 = null;
            }
            java.util.List<android.util.Pair<java.lang.Runnable, java.lang.Long>> list = this.f73635xeae4d299;
            if (list != null) {
                for (android.util.Pair<java.lang.Runnable, java.lang.Long> pair : list) {
                    org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153040x6a420547(mo153039x316510, (java.lang.Runnable) pair.first, ((java.lang.Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.f73635xeae4d299 = null;
            }
            this.f73634x73a24116 = mo153039x316510;
        }
        java.util.Set<org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.TaskRunnerCleaner> set = f73631xcdb18410;
        synchronized (set) {
            set.add(new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.TaskRunnerCleaner(this));
        }
        m153033x7eb1ca70();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535
    /* renamed from: postDelayedTask */
    public void mo153030x6a420547(java.lang.Runnable runnable, long j17) {
        if (this.f73634x73a24116 != 0) {
            org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153040x6a420547(this.f73634x73a24116, runnable, j17, runnable.getClass().getName());
            return;
        }
        synchronized (this.f73636x917bfe1d) {
            m153034x758c09d3();
            if (this.f73634x73a24116 != 0) {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.C29448x288b6a70.get().mo153040x6a420547(this.f73634x73a24116, runnable, j17, runnable.getClass().getName());
                return;
            }
            if (j17 == 0) {
                this.f73637xe250bce1.add(runnable);
                mo153021xda48bfe8();
            } else if (!mo153024xc2472a44(runnable, j17)) {
                this.f73635xeae4d299.add(new android.util.Pair<>(runnable, java.lang.Long.valueOf(j17)));
            }
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535
    /* renamed from: postTask */
    public void mo153031x2d1ef245(java.lang.Runnable runnable) {
        mo153030x6a420547(runnable, 0L);
    }

    /* renamed from: runPreNativeTask */
    public void mo153020x75a92474() {
        org.p3343x72743996.p3344x2e06d1.C29371xb04a7075 m152702xc9e48c90 = org.p3343x72743996.p3344x2e06d1.C29371xb04a7075.m152702xc9e48c90(this.f73641x15aa8ca2);
        try {
            synchronized (this.f73636x917bfe1d) {
                java.util.LinkedList<java.lang.Runnable> linkedList = this.f73637xe250bce1;
                if (linkedList == null) {
                    if (m152702xc9e48c90 != null) {
                        m152702xc9e48c90.close();
                        return;
                    }
                    return;
                }
                java.lang.Runnable poll = linkedList.poll();
                int i17 = this.f73640x17947257;
                if (i17 == 0 || i17 == 1) {
                    android.os.Process.setThreadPriority(10);
                } else if (i17 == 2 || i17 == 3) {
                    android.os.Process.setThreadPriority(0);
                } else if (i17 == 4 || i17 == 5) {
                    android.os.Process.setThreadPriority(-1);
                }
                poll.run();
                if (m152702xc9e48c90 != null) {
                    m152702xc9e48c90.close();
                }
            }
        } catch (java.lang.Throwable th6) {
            if (m152702xc9e48c90 != null) {
                try {
                    m152702xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: schedulePreNativeDelayedTask */
    public boolean mo153024xc2472a44(java.lang.Runnable runnable, long j17) {
        return false;
    }

    /* renamed from: schedulePreNativeTask */
    public void mo153021xda48bfe8() {
        org.p3343x72743996.p3344x2e06d1.p3351x363585.C29436x30f95665.m153004xda1fbd1d().execute(this.f73638xe3e47ffa);
    }

    public C29446x400e18f5(int i17, java.lang.String str, int i18) {
        this.f73638xe3e47ffa = new java.lang.Runnable() { // from class: org.chromium.base.task.TaskRunnerImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5.this.mo153020x75a92474();
            }
        };
        this.f73636x917bfe1d = new java.lang.Object();
        this.f73640x17947257 = i17;
        this.f73641x15aa8ca2 = str + ".PreNativeTask.run";
        this.f73639x827f83bc = i18;
    }
}
