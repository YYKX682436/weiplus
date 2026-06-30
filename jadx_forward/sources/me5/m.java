package me5;

/* loaded from: classes4.dex */
public class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f407514g;

    public m(me5.n nVar, java.lang.String str, java.lang.String str2, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f407511d = str;
        this.f407512e = str2;
        this.f407513f = context;
        this.f407514g = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 101) {
            vg3.i3 i3Var = new vg3.i3();
            i3Var.f518245d = this.f407511d;
            i3Var.f518251m = this.f407512e;
            i3Var.f518253o = 2;
            vg3.k3 k3Var = (vg3.k3) i95.n0.c(vg3.k3.class);
            ((hn.s) k3Var).wi(this.f407513f, i3Var, new me5.l(this));
            this.f407514g.u();
        }
    }
}
