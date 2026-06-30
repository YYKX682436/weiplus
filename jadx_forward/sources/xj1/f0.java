package xj1;

/* loaded from: classes7.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj1.h0 f536319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f536320e;

    public f0(xj1.h0 h0Var, android.view.View view, java.lang.String str) {
        this.f536319d = h0Var;
        this.f536320e = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4;
        android.view.View view = this.f536320e;
        xj1.h0 h0Var = this.f536319d;
        if (i17 == 0) {
            h0Var.l(view, "?wechat_appbrand_test=1");
            return;
        }
        if (i17 == 1 && (c11714x918fd2e4 = h0Var.f536333m) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            android.content.Context context = view.getContext();
            java.lang.String str = c11714x918fd2e4.f157894d;
            k91.z5 z5Var = new k91.z5();
            z5Var.f387396a = c11714x918fd2e4.f157895e;
            z5Var.f387405j = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12663x79416297.V6(context, str, 3, "", true, z5Var.a(), null, null);
        }
    }
}
