package ug1;

/* loaded from: classes7.dex */
public final class c extends af.c {
    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 qualitySession) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualitySession, "qualitySession");
        java.util.Iterator it = this.f85975a.entrySet().iterator();
        while (it.hasNext()) {
            af.b bVar = (af.b) ((java.util.Map.Entry) it.next()).getValue();
            if (bVar.f85970a != null) {
                try {
                    ((ug1.a) bVar).d(qualitySession);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandParallelTaskCollection", "reportAll:report #" + bVar.b() + " task fail %s", e17.getMessage());
                }
            }
        }
    }
}
