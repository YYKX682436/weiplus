package ur3;

/* loaded from: classes4.dex */
public class a extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f511965d = {l75.n0.m145250x3fdc6f77(sr3.j.U, "ProfileInfo")};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f511966e = new java.lang.String[0];

    public a(l75.k0 k0Var) {
        super(k0Var, sr3.j.U, "ProfileInfo", f511966e);
    }

    public sr3.j y0(java.lang.String str) {
        sr3.j jVar = new sr3.j();
        jVar.f68074xdec927b = str;
        if (get(jVar, dm.i4.f66875xa013b0d5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileInfoStorage", "get username:%s", jVar.f68074xdec927b);
            return jVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileInfoStorage", "profileInfo is null");
        return null;
    }
}
