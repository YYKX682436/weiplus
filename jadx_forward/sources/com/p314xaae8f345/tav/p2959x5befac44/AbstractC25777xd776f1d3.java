package com.p314xaae8f345.tav.p2959x5befac44;

/* renamed from: com.tencent.tav.decoder.ReActionThread */
/* loaded from: classes10.dex */
public abstract class AbstractC25777xd776f1d3 extends java.lang.Thread {
    private static final java.lang.String TAG = "ReActionThread";

    /* renamed from: hasAction */
    private boolean f48182xd0202170;

    /* renamed from: release */
    private boolean f48183x41012807;

    public AbstractC25777xd776f1d3(java.lang.String str) {
        super(str);
        this.f48183x41012807 = false;
        this.f48182xd0202170 = false;
    }

    /* renamed from: action */
    public void m97616xab2f7e36() {
        this.f48182xd0202170 = true;
        synchronized (this) {
            notifyAll();
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(TAG, "action: " + this + " " + hashCode());
    }

    /* renamed from: doAction */
    public abstract void m97617xf85da2a1();

    /* renamed from: release */
    public synchronized void m97618x41012807() {
        if (!this.f48183x41012807) {
            this.f48183x41012807 = true;
            synchronized (this) {
                notifyAll();
                try {
                    synchronized (this) {
                        wait(20L);
                    }
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "run start: " + this + " " + hashCode());
        while (!this.f48183x41012807) {
            while (!this.f48182xd0202170 && !this.f48183x41012807) {
                synchronized (this) {
                    try {
                        wait(10L);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            this.f48182xd0202170 = false;
            if (!this.f48183x41012807) {
                m97617xf85da2a1();
            }
            synchronized (this) {
                notifyAll();
            }
        }
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "run finish: " + this + " " + hashCode());
    }
}
