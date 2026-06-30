package p10;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        super(1);
        this.f432540d = c10541x905158a3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String result = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "takeHeapSnapshot evaluate done, result=".concat(result));
        this.f432540d.f147347d.post(new p10.u(result));
        return jz5.f0.f384359a;
    }
}
