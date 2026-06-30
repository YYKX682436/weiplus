package yw;

/* loaded from: classes9.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f547796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(java.lang.ref.WeakReference weakReference, java.lang.String str, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a) {
        super(1);
        this.f547796d = weakReference;
        this.f547797e = str;
        this.f547798f = c23232x91bb1d7a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            java.lang.ref.WeakReference weakReference = this.f547796d;
            if (weakReference.get() != null) {
                yw.q2 q2Var = yw.q2.f547967a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference.get();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.f9.a(this.f547798f.m85529x1e741da2());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC21394xb3d2c0cf.mo55332x76847179();
                java.lang.String str2 = this.f547797e;
                yw.e2 e2Var = new yw.e2(str2, mo55332x76847179, str);
                android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str);
                ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).getClass();
                r35.i1 i1Var = new r35.i1(mo55332x76847179);
                i1Var.l(str2);
                i1Var.g(java.lang.Boolean.TRUE);
                i1Var.j(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
                i1Var.d(i07, 3);
                java.lang.String string = mo55332x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i27);
                i65.a.b(mo55332x76847179, (int) (i65.a.q(mo55332x76847179) * 20.0f));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    i1Var.f450668b.f293354b.f293242a = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(mo55332x76847179, string.toString());
                }
                i1Var.a(e2Var);
                i1Var.k();
            }
        }
        return jz5.f0.f384359a;
    }
}
