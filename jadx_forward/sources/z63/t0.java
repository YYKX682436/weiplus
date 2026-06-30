package z63;

/* loaded from: classes5.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab f551976d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab) {
        this.f551976d = activityC16081x2d23fdab;
    }

    @Override // java.lang.Runnable
    public void run() {
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = this.f551976d;
        java.lang.String str = activityC16081x2d23fdab.B.f66136xb1e12de7;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str);
        if (a17 == null) {
            activityC16081x2d23fdab.f223753f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            activityC16081x2d23fdab.f223753f.setImageBitmap(a17);
        }
    }
}
