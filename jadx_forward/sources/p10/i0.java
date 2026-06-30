package p10;

/* loaded from: classes7.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 f432490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f432491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f432492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f432493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f432494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1, java.util.List list, java.util.HashSet hashSet, double d17, boolean z17) {
        super(0);
        this.f432490d = activityC10542x4d3a27a1;
        this.f432491e = list;
        this.f432492f = hashSet;
        this.f432493g = d17;
        this.f432494h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1 = this.f432490d;
        java.lang.String str = activityC10542x4d3a27a1.f147376o;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bizName");
            throw null;
        }
        p10.g0 g0Var = new p10.g0(activityC10542x4d3a27a1);
        java.util.List list = this.f432491e;
        java.util.HashSet hashSet = this.f432492f;
        p10.h0 h0Var = new p10.h0(activityC10542x4d3a27a1);
        double d17 = this.f432493g;
        boolean z17 = this.f432494h;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("use_skwasm_mode", this.f432494h);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return new iq0.h(str, null, g0Var, list, hashSet, h0Var, d17, "ilinkres_4274070d", z17, jSONObject2);
    }
}
