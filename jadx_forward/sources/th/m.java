package th;

/* loaded from: classes12.dex */
public class m implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f500791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f500792b;

    public m(th.n nVar, rh.o2 o2Var, java.util.Map map) {
        this.f500791a = o2Var;
        this.f500792b = map;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o2 o2Var2 = this.f500791a;
        boolean containsKey = ((uh.g) o2Var2.f477019c).f509214f.containsKey("power-wifi-statByte");
        rh.d3 d3Var = o2Var2.f477019c;
        java.util.Map map = this.f500792b;
        if (containsKey) {
            java.lang.Object obj2 = ((uh.g) d3Var).f509214f.get("power-wifi-statByte");
            if (obj2 instanceof java.lang.Double) {
                map.put(" - wifi-PowerBytes", new m3.d("mAh", java.lang.Double.valueOf(((java.lang.Double) obj2).doubleValue())));
                map.put("   - wifi-RxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f477019c).f477003d.f477085a).longValue())));
                map.put("   - wifi-TxBytes", new m3.d("byte", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f477019c).f477004e.f477085a).longValue())));
            }
        }
        if (((uh.g) d3Var).f509214f.containsKey("power-wifi-statPacket")) {
            java.lang.Object obj3 = ((uh.g) d3Var).f509214f.get("power-wifi-statPacket");
            if (obj3 instanceof java.lang.Double) {
                map.put(" - wifi-PowerPackets", new m3.d("mAh", java.lang.Double.valueOf(((java.lang.Double) obj3).doubleValue())));
                map.put("   - wifi-RxPackets", new m3.d("packet", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f477019c).f477005f.f477085a).longValue())));
                map.put("   - wifi-TxPackets", new m3.d("packet", java.lang.Double.valueOf(((java.lang.Long) ((rh.n3) o2Var.f477019c).f477006g.f477085a).longValue())));
            }
        }
    }
}
