package b21;

/* loaded from: classes10.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f17365a;

    /* renamed from: b, reason: collision with root package name */
    public r45.xs4 f17366b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f17367c;

    public static b21.t a(java.lang.String str, r45.xs4 xs4Var) {
        b21.t tVar = new b21.t();
        tVar.f17365a = str;
        if (xs4Var != null) {
            try {
                r45.xs4 xs4Var2 = new r45.xs4();
                xs4Var2.parseFrom(xs4Var.toByteArray());
                tVar.f17366b = xs4Var2;
                tVar.f17367c = xs4Var2.getString(13);
                if (com.tencent.mm.sdk.platformtools.t8.K0(xs4Var2.getString(13))) {
                    tVar.f17367c = xs4Var2.getString(16);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MusicWrapperExtend", e17, "alvinluo createMusicWrapperExtend exception", new java.lang.Object[0]);
            }
        }
        return tVar;
    }
}
