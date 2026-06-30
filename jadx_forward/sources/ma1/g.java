package ma1;

/* loaded from: classes7.dex */
public class g implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f406695b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f406696c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ma1.h f406697d;

    public g(ma1.h hVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i18) {
        this.f406697d = hVar;
        this.f406694a = i17;
        this.f406695b = c0Var;
        this.f406696c = i18;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (i17 != this.f406694a) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: on result callback, result code: %d", java.lang.Integer.valueOf(i18));
        ma1.h hVar = this.f406697d;
        int i19 = this.f406696c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f406695b;
        if (i18 == 0 || i18 == 3001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: user cancelled share!");
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("errCode", 803);
            c0Var.a(i19, hVar.p("fail: user cancelled", hashMap));
        } else if (i18 == -1 && intent != null && intent.hasExtra("key_req_result")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
            int intExtra = intent.getIntExtra("key_selected_item", 0);
            java.lang.String stringExtra = intent.getStringExtra("key_ext_url");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: is video: %b, video path %s, thumb path: %s, md5: %s, selectedItem: %d, extUrl: %s", java.lang.Boolean.valueOf(c16527xe4fc886.f230339d), c16527xe4fc886.f230342g, c16527xe4fc886.f230343h, c16527xe4fc886.f230345m, java.lang.Integer.valueOf(intExtra), stringExtra);
            if (c16527xe4fc886.f230339d) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16527xe4fc886.f230344i)) {
                    java.lang.String str = c16527xe4fc886.f230345m;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        java.lang.String str2 = c16527xe4fc886.f230342g;
                        java.lang.String str3 = c16527xe4fc886.f230343h;
                        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                        android.graphics.Bitmap p17 = ai3.d.p(str2);
                        if (p17 != null) {
                            try {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str3, true);
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WAGameJsApiScreenRecorderEditWC", e17, "hy: exception when convert bitmap", new java.lang.Object[0]);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: generated thumb path is null!");
                        }
                        ma1.c E = this.f406697d.E(this.f406695b, str2, "edited_video.mp4", true, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra));
                        ma1.c E2 = this.f406697d.E(this.f406695b, str3, "edited_video_thumb.jpg", true, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra));
                        if (E == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: save video temp file failed!");
                            this.f406697d.F(this.f406695b, this.f406696c, 1, 804, "video file save to file system failed!");
                            return true;
                        }
                        if (E2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WAGameJsApiScreenRecorderEditWC", "hy: save thumb temp file failed!");
                            this.f406697d.F(this.f406695b, this.f406696c, 1, 804, "video thumb file save to file system failed!");
                            return true;
                        }
                        java.util.HashMap hashMap2 = new java.util.HashMap(3);
                        hashMap2.put("errCode", 0);
                        hashMap2.put("videoPath", E.f406686b);
                        hashMap2.put("thumbPath", E2.f406686b);
                        hashMap2.put("videoMD5", str);
                        hashMap2.put("chosenId", java.lang.Integer.valueOf(intExtra));
                        hashMap2.put("extUrl", stringExtra);
                        c0Var.a(i19, hVar.p("ok", hashMap2));
                    }
                }
                this.f406697d.F(this.f406695b, this.f406696c, 1, 804, "edit failed!");
            } else {
                this.f406697d.F(this.f406695b, this.f406696c, 3, 804, "not a video");
            }
        } else {
            this.f406697d.F(this.f406695b, this.f406696c, 1, 804, "edit file failed!");
        }
        return true;
    }
}
