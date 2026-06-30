package kp1;

/* loaded from: classes11.dex */
public final class k0 implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392449a;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        this.f392449a = c12881xbe3683d3;
    }

    @Override // ff0.v
    public void a(java.lang.String imageKey, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3 = this.f392449a;
        c12881xbe3683d3.getClass();
        if ((imageKey == null || imageKey.length() == 0) || !z17) {
            c12881xbe3683d3.q();
            return;
        }
        if (bitmap == null || bitmap.isRecycled()) {
            c12881xbe3683d3.q();
            return;
        }
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        android.widget.RelativeLayout relativeLayout = c12881xbe3683d3.f174539p;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendContainer");
            throw null;
        }
        kp1.e0 e0Var = new kp1.e0(c12881xbe3683d3);
        dl4.m0 m0Var = (dl4.m0) tVar;
        m0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        m0Var.ij(imageKey, relativeLayout, bitmap, null, e0Var);
    }
}
