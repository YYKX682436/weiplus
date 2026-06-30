package vq4;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f520863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f520865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, rh.c1 c1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f520863d = g0Var;
        this.f520864e = c1Var;
        this.f520865f = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        long j17 = this.f520863d.f391654d;
        qh.b bVar = this.f520864e.f476863l;
        float b17 = vq4.x.b(j17, bVar != null ? bVar.f444854n : 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thread r: REMAINS(");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f520865f;
        sb6.append(f0Var.f391649d);
        sb6.append(") = ");
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", sb6.toString());
        subJson.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "REMAINS");
        subJson.put("count", f0Var.f391649d);
        subJson.put("cpuLoad", java.lang.Float.valueOf(b17));
        return jz5.f0.f384359a;
    }
}
