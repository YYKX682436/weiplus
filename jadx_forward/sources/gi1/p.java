package gi1;

/* loaded from: classes.dex */
public class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f353788e = {l75.n0.m145250x3fdc6f77(dm.y8.f322761t, "OpenVoiceServiceVoipRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f353789d;

    public p(l75.k0 k0Var) {
        super(k0Var, dm.y8.f322761t, "OpenVoiceServiceVoipRecord", dm.y8.f322754m);
        this.f353789d = k0Var;
    }

    public gi1.o y0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceServiceVoipRecordStorage", "getVoipRecord appId:%s, roomId:%s", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        gi1.o oVar = new gi1.o();
        oVar.f69197x28d45f97 = str;
        oVar.f69201xef00797b = str2;
        if (super.get(oVar, new java.lang.String[0])) {
            return oVar;
        }
        return null;
    }
}
