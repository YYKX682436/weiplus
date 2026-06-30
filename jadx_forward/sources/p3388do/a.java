package p3388do;

/* loaded from: classes10.dex */
public final class a extends g75.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.t
    public void e() {
        g75.r rVar = this.f350934a;
        g75.z zVar = (g75.z) rVar.f350933o.f379609g;
        zVar.getClass();
        java.lang.Object obj = zVar.f().get("KeyAppMsgSubType");
        int intValue = obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : 0;
        java.lang.String j17 = ((g75.z) rVar.f350933o.f379609g).j("Common_ImageKey", "");
        java.lang.String j18 = ((g75.z) rVar.f350933o.f379609g).j("Common_TargetPath", "");
        java.lang.String j19 = ((g75.z) rVar.f350933o.f379609g).j("KeyFileMd5", "");
        i95.m c17 = i95.n0.c(a00.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zz.b vi6 = a00.i.vi((a00.i) c17, j18, intValue, j19, null, 8, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageLoaderAppMsgCheckDupPPC", "onDestroy " + j17 + ' ' + vi6.f559224a + ' ' + vi6.f559225b);
    }
}
