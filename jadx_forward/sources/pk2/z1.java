package pk2;

/* loaded from: classes3.dex */
public final class z1 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f437943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f437944b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f437945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437946d;

    public z1(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.j32 j32Var, r45.c32 c32Var, boolean z17) {
        this.f437943a = abstractActivityC21394xb3d2c0cf;
        this.f437944b = j32Var;
        this.f437945c = c32Var;
        this.f437946d = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        if (i17 == -1) {
            r45.h32 h32Var = null;
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
            r45.j32 j32Var = this.f437944b;
            if (byteArrayExtra != null) {
                r45.h32 h32Var2 = new r45.h32();
                try {
                    h32Var2.mo11468x92b714fd(byteArrayExtra);
                    h32Var = h32Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                if (h32Var != null && j32Var != null) {
                    j32Var.m75941xfb821914(0).add(h32Var);
                    j32Var.set(2, java.lang.Integer.valueOf(j32Var.m75939xb282bd08(2) + 1));
                }
            }
            pk2.l2.f437471m.d(this.f437943a, j32Var, this.f437945c, this.f437946d);
        }
    }
}
