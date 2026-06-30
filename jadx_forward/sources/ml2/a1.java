package ml2;

/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f408727a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 f408728b;

    /* renamed from: c, reason: collision with root package name */
    public long f408729c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f408730d;

    public a1(java.lang.String hashCode, java.lang.String pagId, java.lang.String commentScene, java.lang.String contextId, org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashCode, "hashCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagId, "pagId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        this.f408727a = hashCode;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 c6465xc36db3c4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4();
        c6465xc36db3c4.r(pagId);
        c6465xc36db3c4.p(commentScene);
        c6465xc36db3c4.q(contextId);
        c6465xc36db3c4.s((jSONObject == null || (jSONObject2 = jSONObject.toString()) == null) ? "" : r26.i0.t(jSONObject2, ",", ";", false));
        this.f408728b = c6465xc36db3c4;
    }

    /* renamed from: toString */
    public java.lang.String m147424x9616526c() {
        return "hashCode:" + this.f408727a + ", exposeTime:" + this.f408729c + ", pageInStruct:" + this.f408728b.n();
    }

    public a1(java.lang.String hashCode, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashCode, "hashCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        this.f408727a = hashCode;
        this.f408728b = struct;
    }
}
