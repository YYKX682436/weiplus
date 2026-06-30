package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ls implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ js2.a f103946b;

    public ls(in5.s0 s0Var, js2.a aVar) {
        this.f103945a = s0Var;
        this.f103946b = aVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Intent intent;
        java.lang.String stringExtra;
        in5.s0 s0Var = this.f103945a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String str5 = "";
        if (nyVar == null || (str2 = nyVar.f135386r) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (nyVar == null || (str3 = nyVar.f135382p) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        if (nyVar == null || (str4 = nyVar.f135385q) == null) {
            str4 = "";
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", str4);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f135380n : 0));
        android.content.Context context2 = s0Var.f293121e;
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("finder_username")) != null) {
            str5 = stringExtra;
        }
        lVarArr[4] = new jz5.l("finder_username", str5);
        com.tencent.mm.plugin.finder.profile.uic.p0 p0Var = com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.f123413t;
        android.content.Context context3 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        lVarArr[5] = new jz5.l("profile_more_tab", p0Var.a(context3, this.f103946b.f301504d));
        lVarArr[6] = new jz5.l("profile_tab_name", s0Var.f293121e.getResources().getString(com.tencent.mm.R.string.ey7));
        return kz5.c1.k(lVarArr);
    }
}
