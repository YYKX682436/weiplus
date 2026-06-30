package ii;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ji.h[] f373137a;

    /* renamed from: b, reason: collision with root package name */
    public final ji.p[] f373138b;

    /* renamed from: c, reason: collision with root package name */
    public final ki.b f373139c;

    public a(ji.h[] appBgSumPssMonitorConfigs, ji.p[] processBgMemoryMonitorConfigs, ki.b trimMemoryConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBgSumPssMonitorConfigs, "appBgSumPssMonitorConfigs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processBgMemoryMonitorConfigs, "processBgMemoryMonitorConfigs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trimMemoryConfig, "trimMemoryConfig");
        this.f373137a = appBgSumPssMonitorConfigs;
        this.f373138b = processBgMemoryMonitorConfigs;
        this.f373139c = trimMemoryConfig;
    }

    /* renamed from: equals */
    public boolean m136638xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii.a)) {
            return false;
        }
        ii.a aVar = (ii.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373137a, aVar.f373137a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373138b, aVar.f373138b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373139c, aVar.f373139c);
    }

    /* renamed from: hashCode */
    public int m136639x8cdac1b() {
        ji.h[] hVarArr = this.f373137a;
        int hashCode = (hVarArr != null ? java.util.Arrays.hashCode(hVarArr) : 0) * 31;
        ji.p[] pVarArr = this.f373138b;
        int hashCode2 = (hashCode + (pVarArr != null ? java.util.Arrays.hashCode(pVarArr) : 0)) * 31;
        ki.b bVar = this.f373139c;
        return hashCode2 + (bVar != null ? bVar.m143479x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m136640x9616526c() {
        return "MemoryCanaryConfig(appBgSumPssMonitorConfigs=" + java.util.Arrays.toString(this.f373137a) + ", processBgMemoryMonitorConfigs=" + java.util.Arrays.toString(this.f373138b) + ", trimMemoryConfig=" + this.f373139c + ")";
    }
}
