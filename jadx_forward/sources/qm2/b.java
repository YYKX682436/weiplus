package qm2;

/* loaded from: classes3.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.e f446239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f446240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qm2.e eVar, yz5.a aVar) {
        super(1);
        this.f446239d = eVar;
        this.f446240e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String topic = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveMicTopicUIC", "set topic: ".concat(topic));
        qm2.e eVar = this.f446239d;
        gk2.e eVar2 = eVar.f446244d;
        mm2.g1 g1Var = eVar2 != null ? (mm2.g1) eVar2.a(mm2.g1.class) : null;
        if (g1Var != null) {
            g1Var.A = topic;
        }
        android.widget.TextView textView = eVar.f446246f;
        if (textView != null) {
            textView.setText(topic);
        }
        yz5.a aVar = this.f446240e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("topic", topic);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 82L, jSONObject.toString(), null, 4, null);
        return jz5.f0.f384359a;
    }
}
