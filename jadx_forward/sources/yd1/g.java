package yd1;

/* loaded from: classes7.dex */
public class g implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f542533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f542534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd1.h f542535d;

    public g(yd1.h hVar, int i17, ta1.t0 t0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f542535d = hVar;
        this.f542532a = i17;
        this.f542533b = t0Var;
        this.f542534c = c0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f542532a) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: on result callback, result code: %d", java.lang.Integer.valueOf(i18));
        ta1.t0 t0Var = this.f542533b;
        if (i18 == 0 || i18 == 3001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: user cancelled share!");
            t0Var.a(3, 803, "user cancelled", new org.json.JSONObject());
        } else if (i18 == -1 && intent != null && intent.hasExtra("key_req_result")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
            int intExtra = intent.getIntExtra("key_selected_item", 0);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c16527xe4fc886.f230339d);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intExtra);
            java.lang.String str = c16527xe4fc886.f230342g;
            java.lang.String str2 = c16527xe4fc886.f230343h;
            java.lang.String str3 = c16527xe4fc886.f230345m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: is video: %b, video path %s, thumb path: %s, md5: %s, selectedItem: %d", valueOf, str, str2, str3, valueOf2);
            if (!c16527xe4fc886.f230339d) {
                t0Var.a(3, 804, "not a video", new org.json.JSONObject());
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16527xe4fc886.f230344i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                t0Var.a(1, 804, "edit failed", new org.json.JSONObject());
            } else {
                ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(str);
                if (p17 != null) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRecord.JsApiOpenVideoEditor", e17, "hy: exception when convert bitmap", new java.lang.Object[0]);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: generated thumb path is null!");
                }
                ta1.q0 E = this.f542535d.E(this.f542534c);
                E.f498198a.m77784x795fa299(new ta1.j0(E, str, new yd1.f(this, str, str2, intExtra)));
            }
        } else {
            t0Var.a(1, 804, "edit file failed", new org.json.JSONObject());
        }
        return true;
    }
}
