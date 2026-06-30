package dl4;

/* loaded from: classes3.dex */
public final class n implements ff0.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff0.u f316972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316973c;

    public n(dl4.m0 m0Var, ff0.u uVar, java.lang.String str) {
        this.f316971a = m0Var;
        this.f316972b = uVar;
        this.f316973c = str;
    }

    public void a(java.lang.String str, byte[] bArr, boolean z17) {
        byte[] Ai;
        java.lang.String str2 = this.f316973c;
        if (bArr != null && z17 && (Ai = this.f316971a.Ai(bArr)) != null) {
            int S = com.p314xaae8f345.mm.vfs.w6.S(str2, Ai, 0, Ai.length);
            r1 = S >= 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingImageFeatureService", "createThumbAndSave onImageDownloaded saveThumb ret: " + S + ", data: %s, thumbPath: %s", java.lang.Integer.valueOf(Ai.length), str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingImageFeatureService", "createThumbAndSave onImageDownloaded get thumb suc: " + r1);
        ff0.u uVar = this.f316972b;
        if (uVar != null) {
            if (!r1) {
                str2 = null;
            }
            uVar.a(r1, str2);
        }
    }
}
