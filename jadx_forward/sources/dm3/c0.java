package dm3;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f323205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f323205d = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dm3.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1919x34264a.p1920xd6f4cb44.C16660xe738cfd0 c16660xe738cfd0;
        java.lang.String str = (java.lang.String) obj;
        if (str != null && (e0Var = (dm3.e0) this.f323205d.get()) != null && (c16660xe738cfd0 = e0Var.f323216o) != null) {
            c16660xe738cfd0.m67277x8f970a37(str);
        }
        return jz5.f0.f384359a;
    }
}
