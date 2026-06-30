package vq4;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f520867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f520869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.Map.Entry entry, rh.c1 c1Var, int i17) {
        super(1);
        this.f520867d = entry;
        this.f520868e = c1Var;
        this.f520869f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        rh.f fVar;
        rh.x2 x2Var;
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subJson, "$this$subJson");
        java.util.Map.Entry entry = this.f520867d;
        java.lang.String str = (java.lang.String) entry.getKey();
        int size = ((java.util.List) entry.getValue()).size();
        java.lang.Object value = entry.getValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
        java.util.Iterator it = ((java.lang.Iterable) value).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            rh.o2 o2Var = (rh.o2) ((m3.d) it.next()).f404626b;
            java.lang.Long l17 = (o2Var == null || (fVar = (rh.f) o2Var.f477019c) == null || (x2Var = fVar.f476910g) == null) ? null : (java.lang.Long) x2Var.f477085a;
            j17 += l17 == null ? 0L : l17.longValue();
        }
        qh.b bVar = this.f520868e.f476863l;
        float b17 = vq4.x.b(j17, bVar != null ? bVar.f444854n : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "runnable " + this.f520869f + ": " + str + '(' + size + ") = " + b17);
        subJson.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str);
        subJson.put("count", size);
        subJson.put("cpuLoad", java.lang.Float.valueOf(b17));
        return jz5.f0.f384359a;
    }
}
