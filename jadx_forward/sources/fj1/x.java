package fj1;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.y f344675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fj1.y yVar) {
        super(0);
        this.f344675d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fj1.y yVar = this.f344675d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) yVar.f344687n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        org.json.JSONObject jSONObject = ((k91.r) mo141623x754a37bb).f387271e;
        org.json.JSONObject a17 = jSONObject != null ? cf.f.a(jSONObject) : new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5 u5Var = yVar.f344686m;
        if (u5Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scriptInjectConfig");
            throw null;
        }
        a17.put("isLazyLoad", u5Var.a());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String str = yVar.f344679f;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        jSONObject2.put("appId", str);
        jSONObject2.put("nickname", yVar.e().f387374d);
        jSONObject2.put("icon", yVar.e().f387376f);
        a17.put("accountInfo", jSONObject2);
        return a17;
    }
}
