package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public class n implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 f171660d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90) {
        this.f171660d = c12723x5ab2de90;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f;
        android.os.Looper.myQueue().removeIdleHandler(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12723x5ab2de90 c12723x5ab2de90 = this.f171660d;
        if (c12723x5ab2de90.Z || (c12808x5de4409f = c12723x5ab2de90.f171546w) == null) {
            return false;
        }
        try {
            c12808x5de4409f.mo7966xf161ffec(true);
            return false;
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }
}
