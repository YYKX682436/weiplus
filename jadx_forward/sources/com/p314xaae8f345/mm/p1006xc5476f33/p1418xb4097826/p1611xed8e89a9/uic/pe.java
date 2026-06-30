package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class pe implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f205661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205662b;

    public pe(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd) {
        this.f205661a = viewGroup;
        this.f205662b = c14900x9bf524dd;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        android.content.Context context = this.f205661a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.String str5 = "";
        if (nyVar == null || (str2 = nyVar.f216919r) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (nyVar == null || (str3 = nyVar.f216915p) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        if (nyVar != null && (str4 = nyVar.f216918q) != null) {
            str5 = str4;
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", str5);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(nyVar != null ? nyVar.f216913n : 0));
        lVarArr[4] = new jz5.l("finder_username", this.f205662b.F7());
        return kz5.c1.k(lVarArr);
    }
}
