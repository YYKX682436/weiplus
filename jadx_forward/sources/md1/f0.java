package md1;

/* loaded from: classes7.dex */
public class f0 implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407264d;

    public f0(md1.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407264d = c0Var;
    }

    @Override // fb1.h
    public void a(fb1.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "onStatusChange");
        if (cVar instanceof fb1.a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "onStatusChange:%s", ((fb1.a) cVar).f342360a);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.j(null, dz.k.ReasonInCommingCall);
        }
    }

    @Override // fb1.h
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo10388x95c7fa5f() {
        return this.f407264d.t3().P;
    }
}
