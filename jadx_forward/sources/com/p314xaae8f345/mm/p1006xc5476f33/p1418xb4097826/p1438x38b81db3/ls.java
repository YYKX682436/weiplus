package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ls implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ js2.a f185479b;

    public ls(in5.s0 s0Var, js2.a aVar) {
        this.f185478a = s0Var;
        this.f185479b = aVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Intent intent;
        java.lang.String stringExtra;
        in5.s0 s0Var = this.f185478a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        jz5.l[] lVarArr = new jz5.l[7];
        java.lang.String str5 = "";
        if (nyVar == null || (str2 = nyVar.f216919r) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (nyVar == null || (str3 = nyVar.f216915p) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        if (nyVar == null || (str4 = nyVar.f216918q) == null) {
            str4 = "";
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", str4);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f216913n : 0));
        android.content.Context context2 = s0Var.f374654e;
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("finder_username")) != null) {
            str5 = stringExtra;
        }
        lVarArr[4] = new jz5.l("finder_username", str5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47.f204946t;
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        lVarArr[5] = new jz5.l("profile_more_tab", p0Var.a(context3, this.f185479b.f383037d));
        lVarArr[6] = new jz5.l("profile_tab_name", s0Var.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ey7));
        return kz5.c1.k(lVarArr);
    }
}
