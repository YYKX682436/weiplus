package yj4;

/* loaded from: classes11.dex */
public final class e implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yj4.f f544229a;

    public e(yj4.f fVar) {
        this.f544229a = fVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "page_out");
        yj4.f fVar = this.f544229a;
        if (b17) {
            linkedHashMap.put("status_page_exit_type", java.lang.Integer.valueOf(fVar.f544230d.f445459d));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = fVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078) m158354x19263085 : null;
        bi4.d1 d1Var = activityC18639xf6f98078 != null ? activityC18639xf6f98078.f255146x1 : null;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str2 = d1Var != null ? d1Var.G : null;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("status_clipostid", str2);
        java.lang.String str3 = d1Var != null ? d1Var.f436474h : null;
        lVarArr[1] = new jz5.l("status_sessionid", str3 != null ? str3 : "");
        java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), linkedHashMap);
        m17.toString();
        return m17;
    }
}
