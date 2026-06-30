package df2;

/* loaded from: classes3.dex */
public final class t3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f312939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f312940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f312941f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(df2.u3 u3Var, yz5.a aVar, int i17) {
        super(1);
        this.f312939d = u3Var;
        this.f312940e = aVar;
        this.f312941f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String topic = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSetMicTopicController", "set topic: ".concat(topic));
        df2.u3 u3Var = this.f312939d;
        u3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(u3Var, null, null, new df2.s3(u3Var, topic, null), 3, null);
        yz5.a aVar = this.f312940e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("topic", topic);
        if (((mm2.c1) u3Var.m56788xbba4bfc0(mm2.c1.class)).T) {
            df2.h3[] h3VarArr = df2.h3.f311813d;
            jSONObject.put(ya.b.f77502x92235c1b, 3);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.f408771i3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        } else if (((mm2.c1) u3Var.m56788xbba4bfc0(mm2.c1.class)).N7()) {
            jSONObject.put(ya.b.f77502x92235c1b, this.f312941f);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.K2, jSONObject.toString(), null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
