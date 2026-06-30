package gp4;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        super(2);
        this.f355977d = context;
        this.f355978e = c18801xf3fcf614;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String title = (java.lang.String) obj;
        java.lang.String menuString = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuString, "menuString");
        android.content.Context context = this.f355977d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.q(title, 17);
        k0Var.f293405n = new gp4.w(k0Var, context, menuString);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355978e;
        k0Var.f293414s = new gp4.x(c18801xf3fcf614);
        k0Var.f293387d = new gp4.y(c18801xf3fcf614);
        return k0Var;
    }
}
