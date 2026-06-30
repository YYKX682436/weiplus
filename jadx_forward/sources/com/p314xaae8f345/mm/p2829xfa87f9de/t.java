package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class t extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 f296420d;

    public t(com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 c22987x97ad1828) {
        this.f296420d = c22987x97ad1828;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 c22987x97ad1828 = this.f296420d;
        com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47 c22988x4db43e47 = c22987x97ad1828.f296346i;
        if (c22988x4db43e47 == null || (runnable = c22987x97ad1828.f296349o) == null) {
            return;
        }
        c22988x4db43e47.post(runnable);
    }
}
