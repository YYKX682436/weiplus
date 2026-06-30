package rh;

/* loaded from: classes12.dex */
public class n0 implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh.n1 f476996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f476997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f476998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f476999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f477000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rh.o0 f477001f;

    public n0(rh.o0 o0Var, wh.n1 n1Var, double d17, double d18, double d19, double d27) {
        this.f477001f = o0Var;
        this.f476996a = n1Var;
        this.f476997b = d17;
        this.f476998c = d18;
        this.f476999d = d19;
        this.f477000e = d27;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        rh.o0 o0Var = this.f477001f;
        rh.c1 c1Var = o0Var.f477015d;
        if (c1Var.f476862k == null || c1Var.f476867p == null) {
            return;
        }
        rh.n3 n3Var = (rh.n3) o2Var.f477019c;
        double longValue = ((java.lang.Long) n3Var.f477007h.f477085a).longValue();
        double d17 = this.f476997b;
        double longValue2 = ((java.lang.Long) n3Var.f477008i.f477085a).longValue();
        double d18 = this.f476998c;
        wh.n1 n1Var = this.f476996a;
        double e17 = ((n1Var.e("modem.controller.rx") / 3600000.0d) * ((long) ((longValue / (d17 / 8.0d)) * 1000.0d))) + 0.0d + ((n1Var.e("modem.controller.tx") / 3600000.0d) * ((long) ((longValue2 / (d18 / 8.0d)) * 1000.0d))) + ((n1Var.e("modem.controller.idle") / 3600000.0d) * (r12 + r4));
        uh.g gVar = o0Var.f477014c;
        gVar.f509214f.put("power-mobile-statByte", java.lang.Double.valueOf(e17));
        rh.n3 n3Var2 = (rh.n3) o2Var.f477019c;
        double e18 = n1Var.e("radio.active");
        if (e18 <= 0.0d) {
            double a17 = n1Var.a("modem.controller.rx") + 0.0d;
            int h17 = n1Var.h("modem.controller.tx");
            for (int i17 = 0; i17 < h17; i17++) {
                a17 += n1Var.b("modem.controller.tx", i17);
            }
            e18 = a17 / (h17 + 1);
        }
        gVar.f509214f.put("power-mobile-statPacket", java.lang.Double.valueOf(((((e18 / 3600.0d) / (((d17 + d18) / 8.0d) / 2048.0d)) / 3600.0d) * (((java.lang.Long) n3Var2.f477009j.f477085a).longValue() + ((java.lang.Long) n3Var2.f477010k.f477085a).longValue())) + 0.0d));
        double longValue3 = ((java.lang.Long) n3Var2.f477003d.f477085a).longValue();
        double d19 = this.f476999d;
        double longValue4 = ((java.lang.Long) n3Var2.f477004e.f477085a).longValue();
        double d27 = this.f477000e;
        gVar.f509214f.put("power-wifi-statByte", java.lang.Double.valueOf(((n1Var.e("wifi.controller.rx") / 3600000.0d) * ((long) ((longValue3 / (d19 / 8.0d)) * 1000.0d))) + 0.0d + ((n1Var.e("wifi.controller.tx") / 3600000.0d) * ((long) ((longValue4 / (d27 / 8.0d)) * 1000.0d))) + ((n1Var.e("wifi.controller.idle") / 3600000.0d) * (r10 + r4))));
        gVar.f509214f.put("power-wifi-statPacket", java.lang.Double.valueOf((((n1Var.e("wifi.active") / 3600.0d) / (((d19 + d27) / 8.0d) / 2048.0d)) * (((java.lang.Long) n3Var2.f477005f.f477085a).longValue() + ((java.lang.Long) n3Var2.f477006g.f477085a).longValue())) + 0.0d));
    }
}
