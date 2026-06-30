package fw;

/* loaded from: classes7.dex */
public final class h extends fw.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dq0.q mbPlugin) {
        super(mbPlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbPlugin, "mbPlugin");
    }

    @Override // fw.v
    public void B(java.lang.String frameSetName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        fw.b bVar = (fw.b) ((cw.e) i95.n0.c(cw.e.class));
        bVar.getClass();
        jz5.g gVar = bVar.f348558d;
        if (i17 <= 0) {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).remove(frameSetName);
        } else {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putInt(frameSetName, i17);
        }
    }

    @Override // fw.v, dq0.a0
    public void m(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        super.m(binding);
        ((hw.v0) ((gw.i) i95.n0.c(gw.i.class))).K6(1);
        this.f348570r = null;
    }

    @Override // dq0.a0
    public void v(fq0.x frameSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
    }

    @Override // dq0.a0
    public void w(fq0.x frameSet, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        super.w(frameSet, jSONObject);
    }

    @Override // fw.v
    public int z(java.lang.String frameSetName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        fw.b bVar = (fw.b) ((cw.e) i95.n0.c(cw.e.class));
        bVar.getClass();
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) bVar.f348558d).mo141623x754a37bb()).getInt(frameSetName, 0);
    }
}
