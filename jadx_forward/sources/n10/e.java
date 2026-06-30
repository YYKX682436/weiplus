package n10;

/* loaded from: classes7.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getBizPreloadData";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        xq0.b bVar = (xq0.b) this.f399423a;
        if (bVar != null) {
            n10.d dVar = new n10.d(this);
            qp0.c cVar = bVar.f407160f;
            jz5.f0 f0Var = null;
            java.lang.String str = bVar.f407173v;
            if (cVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleJsApiEvent, event: ".concat("getBizPreloadData"));
                cVar.ca("getBizPreloadData", null, dVar);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleJsApiEvent, but delegate is null, event: ".concat("getBizPreloadData"));
            }
        }
    }
}
