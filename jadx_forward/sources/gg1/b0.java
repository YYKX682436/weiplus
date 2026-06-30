package gg1;

/* loaded from: classes7.dex */
public final class b0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f353064a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(gg1.c1 c1Var, yz5.l lVar) {
        super(c1Var);
        this.f353064a = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        if (eVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCast.VideoCastController", "get volume  fail" + eVar.f84020c);
        }
    }

    @Override // z91.a
    public void b(aa1.e response) {
        aa1.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.util.Map map = response.f84022b;
        java.lang.String str = (map == null || (aVar = (aa1.a) map.get("CurrentVolume")) == null) ? null : aVar.f84014a;
        if (!android.text.TextUtils.isEmpty(str)) {
            gg1.j jVar = new gg1.j(true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            jVar.f353109a = java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
            this.f353064a.mo146xb9724478(jVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "get volume success : " + str);
    }
}
