package zt5;

/* loaded from: classes9.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static zt5.p f557142b;

    /* renamed from: a, reason: collision with root package name */
    public zt5.c f557143a = null;

    public p() {
        b();
    }

    public java.lang.Object a(java.lang.String str, java.lang.Object obj) {
        zt5.c cVar = this.f557143a;
        if (cVar == null) {
            return null;
        }
        ((zt5.q) cVar).getClass();
        synchronized (zt5.q.class) {
            if ("fingerprint_type".equals(str)) {
                int i17 = zt5.q.f557144a;
                if (i17 != 0) {
                    obj = java.lang.Integer.valueOf(i17);
                }
            } else {
                if (!"fingerprint_hardware_position".equals(str)) {
                    return null;
                }
                int[] iArr = zt5.q.f557145b;
                if (iArr != null) {
                    obj = iArr;
                }
            }
            return obj;
        }
    }

    public void b() {
        try {
            this.f557143a = (zt5.c) java.lang.Class.forName("com.tencent.soter.core.model.SoterExParameterProvider").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            zt5.h.c("SoterExParameters", "soter: get system SoterExParameterProvider class success", new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zt5.h.c("SoterExParameters", "soter: get system SoterExParameterProvider class fail", new java.lang.Object[0]);
            if (wt5.a.g() != 1) {
                zt5.h.b("SoterExParameters", "soter: SoterExParameters updateExtraParam fail, SoterCoreType is not TREBLE", new java.lang.Object[0]);
                return;
            }
            this.f557143a = new zt5.q();
            au5.b bVar = wt5.a.f531070c;
            if (bVar != null) {
                bVar.t();
            } else {
                zt5.h.b("SoterExParameters", "soter: SoterExParameters updateExtraParam fail, SoterCore.getImpl is null", new java.lang.Object[0]);
            }
        }
    }
}
