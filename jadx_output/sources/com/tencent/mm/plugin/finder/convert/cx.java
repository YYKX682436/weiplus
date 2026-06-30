package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cx extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n6 f103102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(android.content.Context context, so2.n6 n6Var) {
        super(1);
        this.f103101d = context;
        this.f103102e = n6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = this.f103101d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sr2.w0 w0Var = (sr2.w0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sr2.w0.class);
        w0Var.getClass();
        so2.n6 modModel = this.f103102e;
        kotlin.jvm.internal.o.g(modModel, "modModel");
        r45.gb4 gb4Var = modModel.f410509i;
        java.lang.String string = gb4Var != null ? gb4Var.getString(2) : null;
        java.lang.String string2 = gb4Var != null ? gb4Var.getString(0) : null;
        com.tencent.mars.xlog.Log.i("Finder.PostEditUIC", "[openProfileUI] nickName:" + string + " userName:" + string2);
        if (string2 == null || string2.length() == 0) {
            java.lang.String string3 = w0Var.getContext().getResources().getString(com.tencent.mm.R.string.f492118o33);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.app.Activity context2 = w0Var.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var.f211776c = string3;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
        } else {
            android.app.Activity context3 = w0Var.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context3 : null;
            if (mMActivity != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", string2);
                com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = w0Var.I;
                if (finderPostTextModifyView != null) {
                    finderPostTextModifyView.setVisibility(8);
                }
                com.tencent.mm.plugin.finder.assist.m3.f102381a.b(mMActivity, intent, lk5.s.a(mMActivity), false, new sr2.p0(w0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
