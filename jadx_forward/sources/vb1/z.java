package vb1;

/* loaded from: classes7.dex */
public final class z extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f77282x366c91de = 595;

    /* renamed from: NAME */
    public static final java.lang.String f77283x24728b = "updateWebGLCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("canvasId");
    }

    @Override // gb1.h
    public boolean I() {
        return true;
    }

    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiUpdateHTMLCanvasElement", "update HTMLCanvasElement for canvasId[" + i17 + ']');
        return true;
    }
}
