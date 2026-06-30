package gj;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f353873a;

    /* renamed from: b, reason: collision with root package name */
    public gj.e f353874b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f353875c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f353876d;

    public e(int i17) {
        this.f353873a = i17;
    }

    public void a() {
        gj.e eVar;
        this.f353875c = false;
        gj.e eVar2 = null;
        for (eVar = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20042xa3772750; eVar != null; eVar = eVar.f353874b) {
            if (eVar == this) {
                if (eVar2 != null) {
                    eVar2.f353874b = eVar.f353874b;
                } else {
                    gj.e unused = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.f20042xa3772750 = eVar.f353874b;
                }
                eVar.f353874b = null;
                return;
            }
            eVar2 = eVar;
        }
    }

    /* renamed from: toString */
    public java.lang.String m131662x9616526c() {
        return "index:" + this.f353873a + ",\tisValid:" + this.f353875c + " source:" + this.f353876d;
    }

    public e() {
    }
}
