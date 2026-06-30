package qu2;

/* loaded from: classes12.dex */
public final class d implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qu2.f f448294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f448295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f448296c;

    public d(qu2.f fVar, rh.c1 c1Var, java.util.Map map) {
        this.f448294a = fVar;
        this.f448295b = c1Var;
        this.f448296c = map;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o2Var);
        rh.c1 c1Var = this.f448295b;
        qu2.f fVar = this.f448294a;
        qu2.f.c(fVar, c1Var, o2Var);
        java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - fVar.f448312n) / 1000);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        long longValue = valueOf != null ? valueOf.longValue() : 1L;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("c_record_seconds", longValue);
        uh.g gVar = (uh.g) o2Var.f477019c;
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509232o.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        jSONObject.put("c_flash_light", java.lang.Float.valueOf(java.lang.Float.parseFloat(format)));
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509228m.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        jSONObject.put("c_sensors", java.lang.Float.valueOf(java.lang.Float.parseFloat(format2)));
        java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509226l.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
        jSONObject.put("c_gps", java.lang.Float.valueOf(java.lang.Float.parseFloat(format3)));
        java.lang.String format4 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509218h.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, "format(...)");
        jSONObject.put("c_wake_lock", java.lang.Float.valueOf(java.lang.Float.parseFloat(format4)));
        java.lang.String format5 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509224k.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format5, "format(...)");
        jSONObject.put("c_blue_tooth", java.lang.Float.valueOf(java.lang.Float.parseFloat(format5)));
        java.lang.String format6 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509238r.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format6, "format(...)");
        jSONObject.put("c_screen", java.lang.Float.valueOf(java.lang.Float.parseFloat(format6)));
        java.lang.String format7 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509216g.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format7, "format(...)");
        jSONObject.put("c_cpu", java.lang.Float.valueOf(java.lang.Float.parseFloat(format7)));
        java.lang.String format8 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509230n.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format8, "format(...)");
        jSONObject.put("c_camera", java.lang.Float.valueOf(java.lang.Float.parseFloat(format8)));
        java.lang.String format9 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509220i.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format9, "format(...)");
        jSONObject.put("c_mobile", java.lang.Float.valueOf(java.lang.Float.parseFloat(format9)));
        java.lang.String format10 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509234p.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format10, "format(...)");
        jSONObject.put("c_audio", java.lang.Float.valueOf(java.lang.Float.parseFloat(format10)));
        java.lang.String format11 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{gVar.f509236q.f477085a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format11, "format(...)");
        jSONObject.put("c_video", java.lang.Float.valueOf(java.lang.Float.parseFloat(format11)));
        java.lang.String format12 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f448310l.f512109c)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format12, "format(...)");
        jSONObject.put("c_system", java.lang.Float.valueOf(java.lang.Float.parseFloat(format12)));
        java.lang.String format13 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f448307i.f512112c)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format13, "format(...)");
        jSONObject.put("c_wifi", java.lang.Float.valueOf(java.lang.Float.parseFloat(format13)));
        java.lang.String format14 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f448305g.f512112c)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format14, "format(...)");
        jSONObject.put("c_charging_rate", java.lang.Float.valueOf(java.lang.Float.parseFloat(format14)));
        java.lang.String format15 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f448306h.f512112c)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format15, "format(...)");
        jSONObject.put("c_un_charging_rate", java.lang.Float.valueOf(java.lang.Float.parseFloat(format15)));
        java.lang.String format16 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f448309k.f512109c)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format16, "format(...)");
        jSONObject.put("c_total", java.lang.Float.valueOf(java.lang.Float.parseFloat(format16)));
        java.lang.String format17 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(fVar.f448311m.f512109c)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format17, "format(...)");
        jSONObject.put("c_idle", java.lang.Float.valueOf(java.lang.Float.parseFloat(format17)));
        fVar.b(jSONObject, this.f448296c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvgPowerConsumeCollector", "#compositor done. duration=" + gVar.f476896a + ", json=" + jSONObject);
        ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(fVar.f448299a, jSONObject);
    }
}
