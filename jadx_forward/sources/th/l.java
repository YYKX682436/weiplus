package th;

/* loaded from: classes12.dex */
public class l implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f500789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f500790b;

    public l(th.n nVar, rh.o2 o2Var, java.util.Map map) {
        this.f500789a = o2Var;
        this.f500790b = map;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = this.f500789a;
        if (((uh.g) o2Var2.f477019c).f509214f.containsKey("power-mobile-statByte")) {
            java.lang.Object obj2 = ((uh.g) o2Var2.f477019c).f509214f.get("power-mobile-statByte");
            if (obj2 instanceof java.lang.Double) {
                m3.d dVar = new m3.d("mAh", java.lang.Double.valueOf(((java.lang.Double) obj2).doubleValue()));
                java.util.Map map = this.f500790b;
                map.put(" - mobile-PowerBytes", dVar);
                map.put("   - mobile-RxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f477019c).f477007h.f477085a).longValue())));
                map.put("   - mobile-TxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f477019c).f477008i.f477085a).longValue())));
            }
        }
    }
}
