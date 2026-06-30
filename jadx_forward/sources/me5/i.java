package me5;

/* loaded from: classes4.dex */
public class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f407497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ me5.j f407499f;

    public i(me5.j jVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context) {
        this.f407499f = jVar;
        this.f407497d = k0Var;
        this.f407498e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        this.f407497d.u();
        int itemId = menuItem.getItemId();
        me5.j jVar = this.f407499f;
        if (itemId == 100) {
            me5.n nVar = jVar.f407509q;
            java.lang.String str = jVar.f407503h;
            nVar.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(str);
            nVar.d(-1L, linkedList, 0);
            return;
        }
        if (itemId != 101) {
            return;
        }
        me5.n nVar2 = jVar.f407509q;
        java.lang.String str2 = jVar.f407504i;
        java.lang.String str3 = jVar.f407502g;
        java.lang.String str4 = jVar.f407505m;
        nVar2.getClass();
        android.content.Context context = this.f407498e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayd, str3), new java.lang.Object[0]), 17, i65.a.b(context, 14), null);
        k0Var.f293405n = new me5.k(nVar2, context);
        k0Var.f293414s = new me5.m(nVar2, str2, str4, context, k0Var);
        k0Var.v();
    }
}
