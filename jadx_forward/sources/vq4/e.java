package vq4;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f520819a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f520820b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f520821c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f520822d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f520823e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f520824f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f520825g;

    public e(org.json.JSONObject BTBatteryTemp, org.json.JSONObject CTCpuTemp, org.json.JSONObject PTDeviceTemp, java.lang.String avgCurrentValue, java.lang.String avgMemoryPss, java.lang.String avgCpuLoad, java.lang.String cpuLoadInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(BTBatteryTemp, "BTBatteryTemp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(CTCpuTemp, "CTCpuTemp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(PTDeviceTemp, "PTDeviceTemp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avgCurrentValue, "avgCurrentValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avgMemoryPss, "avgMemoryPss");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avgCpuLoad, "avgCpuLoad");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cpuLoadInfo, "cpuLoadInfo");
        this.f520819a = BTBatteryTemp;
        this.f520820b = CTCpuTemp;
        this.f520821c = PTDeviceTemp;
        this.f520822d = avgCurrentValue;
        this.f520823e = avgMemoryPss;
        this.f520824f = avgCpuLoad;
        this.f520825g = cpuLoadInfo;
    }

    /* renamed from: equals */
    public boolean m172506xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq4.e)) {
            return false;
        }
        vq4.e eVar = (vq4.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520819a, eVar.f520819a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520820b, eVar.f520820b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520821c, eVar.f520821c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520822d, eVar.f520822d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520823e, eVar.f520823e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520824f, eVar.f520824f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520825g, eVar.f520825g);
    }

    /* renamed from: hashCode */
    public int m172507x8cdac1b() {
        return (((((((((((this.f520819a.hashCode() * 31) + this.f520820b.hashCode()) * 31) + this.f520821c.hashCode()) * 31) + this.f520822d.hashCode()) * 31) + this.f520823e.hashCode()) * 31) + this.f520824f.hashCode()) * 31) + this.f520825g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172508x9616526c() {
        return "ProfileReportInfo(BTBatteryTemp=" + this.f520819a + ", CTCpuTemp=" + this.f520820b + ", PTDeviceTemp=" + this.f520821c + ", avgCurrentValue=" + this.f520822d + ", avgMemoryPss=" + this.f520823e + ", avgCpuLoad=" + this.f520824f + ",cpuLoadInfo:" + this.f520825g + ')';
    }
}
