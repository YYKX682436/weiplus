package b21;

/* loaded from: classes10.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f98898a;

    /* renamed from: b, reason: collision with root package name */
    public r45.xs4 f98899b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f98900c;

    public static b21.t a(java.lang.String str, r45.xs4 xs4Var) {
        b21.t tVar = new b21.t();
        tVar.f98898a = str;
        if (xs4Var != null) {
            try {
                r45.xs4 xs4Var2 = new r45.xs4();
                xs4Var2.mo11468x92b714fd(xs4Var.mo14344x5f01b1f6());
                tVar.f98899b = xs4Var2;
                tVar.f98900c = xs4Var2.m75945x2fec8307(13);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var2.m75945x2fec8307(13))) {
                    tVar.f98900c = xs4Var2.m75945x2fec8307(16);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MusicWrapperExtend", e17, "alvinluo createMusicWrapperExtend exception", new java.lang.Object[0]);
            }
        }
        return tVar;
    }
}
