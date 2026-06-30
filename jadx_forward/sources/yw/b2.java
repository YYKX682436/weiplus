package yw;

/* loaded from: classes.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f547814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f547814d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            java.lang.ref.WeakReference weakReference = this.f547814d;
            if (weakReference.get() != null) {
                yw.q2 q2Var = yw.q2.f547967a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference.get();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                jd5.a aVar = new jd5.a();
                aVar.p(str);
                n13.r rVar = new n13.r();
                rVar.f415650a = true;
                rVar.f415653d.f415672a = 9;
                n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
                ((dk5.b0) b0Var).Bi(abstractActivityC21394xb3d2c0cf.mo55332x76847179(), aVar, rVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
