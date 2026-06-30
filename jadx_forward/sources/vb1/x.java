package vb1;

/* loaded from: classes7.dex */
public final class x extends gb1.f {

    /* renamed from: CTRL_INDEX */
    public static final int f77278x366c91de = 596;

    /* renamed from: NAME */
    public static final java.lang.String f77279x24728b = "removeWebGLCanvas";

    @Override // gb1.i
    public int H(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.getInt("canvasId");
    }

    @Override // gb1.f
    public boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 component = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRemoveHTMLCanvasElement", "remove HTMLCanvasElement for canvasId[" + i17 + ']');
        vb1.b bVar = vb1.d.f516006c;
        java.lang.String mo48798x74292566 = component.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        bVar.a(mo48798x74292566).f516009b.remove(java.lang.Integer.valueOf(i17));
        return true;
    }
}
