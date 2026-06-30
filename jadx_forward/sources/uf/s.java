package uf;

/* loaded from: classes7.dex */
public final class s implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f508631a;

    public s(yz5.l lVar) {
        this.f508631a = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaCastController", "get volume  fail" + eVar.f84020c);
        }
    }

    @Override // z91.a
    public void b(aa1.e response) {
        aa1.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.util.Map map = response.f84022b;
        java.lang.String str = (map == null || (aVar = (aa1.a) map.get("CurrentVolume")) == null) ? null : aVar.f84014a;
        if (!(str == null || str.length() == 0)) {
            uf.h2 h2Var = new uf.h2(true);
            h2Var.f508564b = java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
            this.f508631a.mo146xb9724478(h2Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "get volume success : " + str);
    }
}
