package ph5;

/* loaded from: classes12.dex */
public final class c implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final wh.t0 f436024a;

    public c(wh.t0 t0Var) {
        this.f436024a = t0Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.o2 o2Var = (rh.o2) obj;
        if (o2Var != null) {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c;
            if (c4635xec0343cc.f134091d != android.os.Process.myPid()) {
                int i17 = c4635xec0343cc.f134091d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : c4635xec0343cc.f134095h.f477093a) {
                    float k17 = sh.c.k(((java.lang.Long) threadJiffiesEntry.f477085a).longValue(), o2Var.f477020d / 10);
                    if (k17 >= 1.0f) {
                        arrayList.add(java.lang.Integer.valueOf(threadJiffiesEntry.f134098b));
                    } else if (k17 < 0.1f || arrayList.size() >= 3) {
                        break;
                    } else {
                        arrayList.add(java.lang.Integer.valueOf(threadJiffiesEntry.f134098b));
                    }
                }
                if (!arrayList.isEmpty()) {
                    ph5.b.a(i17, arrayList);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopThreadDumpTask", "Dump skip, no tid needs");
                    ph5.b.c("Skip dump: no tid needed", 0);
                    return;
                }
            }
        }
        this.f436024a.mo40853xab27b508(o2Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopThreadDumpTask", "Dump local process finished");
    }
}
