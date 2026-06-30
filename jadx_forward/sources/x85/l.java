package x85;

/* loaded from: classes9.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x85.j f534131a;

    public l(x85.j jVar) {
        this.f534131a = jVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetLensListTask", "cgi callback : " + fVar.f152148a + ' ' + fVar.f152149b);
        x85.j jVar = this.f534131a;
        if (jVar == null) {
            return null;
        }
        jVar.a(fVar.f152148a, fVar.f152149b, (r45.xh3) fVar.f152151d);
        return jz5.f0.f384359a;
    }
}
