package ea1;

/* loaded from: classes12.dex */
public class b implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea1.g f332041d;

    public b(ea1.g gVar) {
        this.f332041d = gVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp storage change: event=%s | eventData=%s", str, w0Var);
        int i17 = w0Var.f398507b;
        ea1.g gVar = this.f332041d;
        if (i17 == 2 || i17 == 3) {
            if (!"batch".equals(str)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) gVar.f332050e).b(65616, new ea1.d(gVar, w0Var.f398509d.toString()));
                return;
            }
            java.lang.Object obj = w0Var.f398509d;
            if (obj == null || !(obj instanceof java.util.List)) {
                return;
            }
            for (java.lang.String str2 : (java.util.List) obj) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) gVar.f332050e).b(65616, new ea1.d(gVar, str2));
            }
            return;
        }
        if (i17 != 5) {
            return;
        }
        if (!"batch".equals(str)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) gVar.f332050e).b(65616, new ea1.c(gVar, w0Var.f398509d.toString()));
            return;
        }
        java.lang.Object obj2 = w0Var.f398509d;
        if (obj2 == null || !(obj2 instanceof java.util.List)) {
            return;
        }
        for (java.lang.String str3 : (java.util.List) obj2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) gVar.f332050e).b(65616, new ea1.c(gVar, str3));
        }
    }
}
