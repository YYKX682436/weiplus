package at2;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f13710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f13711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f13712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f13713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.view.MenuItem menuItem) {
        super(1);
        this.f13710d = context;
        this.f13711e = k0Var;
        this.f13712f = finderObject;
        this.f13713g = menuItem;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "onClick onMenuItemSelect");
        android.content.Context context = this.f13710d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(this.f13712f, 16384);
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            a17.setEcSource(c1Var != null ? c1Var.f328786c3 : null);
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            android.view.MenuItem menuItem = this.f13713g;
            kotlin.jvm.internal.o.d(menuItem);
            ((c61.p2) ybVar).Nj(appCompatActivity, userName, (db5.h4) menuItem, a17, at2.m0.f13706d);
        }
        this.f13711e.u();
        return jz5.f0.f302826a;
    }
}
