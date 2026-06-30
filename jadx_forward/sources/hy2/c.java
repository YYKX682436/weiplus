package hy2;

/* loaded from: classes.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hy2.f f367585a;

    public c(hy2.f fVar) {
        this.f367585a = fVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        android.app.Activity context = this.f367585a.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String str3 = "";
        if (V6 == null || (str2 = V6.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(2)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.m75939xb282bd08(5) : 0));
        return kz5.c1.k(lVarArr);
    }
}
