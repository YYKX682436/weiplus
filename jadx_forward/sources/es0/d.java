package es0;

/* loaded from: classes10.dex */
public class d extends es0.a {

    /* renamed from: b, reason: collision with root package name */
    public int f337845b;

    /* renamed from: c, reason: collision with root package name */
    public int f337846c;

    /* renamed from: d, reason: collision with root package name */
    public int f337847d;

    /* renamed from: e, reason: collision with root package name */
    public int f337848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f337849f;

    /* renamed from: g, reason: collision with root package name */
    public int f337850g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f337851h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f337852i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f337853j;

    /* renamed from: k, reason: collision with root package name */
    public int f337854k;

    /* renamed from: l, reason: collision with root package name */
    public int f337855l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodecInfo f337856m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f337857n;

    public d(boolean z17) {
        this.f337849f = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48031x5e80f9d5;
        this.f337850g = 1;
        this.f337857n = "video/avc";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "init, enableHevc:" + z17);
        if (z17) {
            android.media.MediaCodecInfo a17 = a("video/hevc");
            this.f337856m = a17;
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCodecConfig", "cannot found hevc codec info! fallback to select avc codec");
                this.f337856m = a("video/avc");
                this.f337857n = "video/avc";
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1280L, 61L, 1L);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success select hevc codec:");
                sb6.append(a17 != null ? a17.getName() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", sb6.toString());
                this.f337857n = "video/hevc";
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1280L, 60L, 1L);
            }
        } else {
            this.f337856m = a("video/avc");
            this.f337857n = "video/avc";
        }
        android.media.MediaCodecInfo mediaCodecInfo = this.f337856m;
        if (mediaCodecInfo == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1047L, 0L, 1L);
            this.f337852i = true;
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaCodecInfo);
        java.lang.String name = mediaCodecInfo.getName();
        this.f337851h = name;
        this.f337850g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_media_iframe, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCodecConfig", "codecInfo.name : " + name + "  iFrameInterval " + this.f337850g);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(3:58|59|(21:63|(10:66|67|68|69|70|71|72|(2:(1:75)(1:87)|(2:81|82))(2:(1:104)(1:93)|(2:99|100))|83|64)|108|109|110|(2:112|(2:116|(1:120)))(2:121|(2:125|(1:129)))|4|5|6|(2:12|(1:14)(2:15|(1:17)(1:18)))|19|20|(1:22)(1:54)|23|(2:29|(1:32))|33|(1:35)(1:53)|36|(2:38|(5:40|(1:42)|43|(1:47)|48)(1:49))|50|51))|3|4|5|6|(4:8|10|12|(0)(0))|19|20|(0)(0)|23|(4:25|27|29|(1:32))|33|(0)(0)|36|(0)|50|51|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f1, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoCodecConfig", "trySetBitRateMode error: %s", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01cf A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:6:0x01b6, B:8:0x01bc, B:10:0x01c2, B:12:0x01c8, B:14:0x01cf, B:15:0x01d9, B:17:0x01e0, B:18:0x01ea), top: B:5:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d9 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:6:0x01b6, B:8:0x01bc, B:10:0x01c2, B:12:0x01c8, B:14:0x01cf, B:15:0x01d9, B:17:0x01e0, B:18:0x01ea), top: B:5:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01bc A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:6:0x01b6, B:8:0x01bc, B:10:0x01c2, B:12:0x01c8, B:14:0x01cf, B:15:0x01d9, B:17:0x01e0, B:18:0x01ea), top: B:5:0x01b6 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.MediaFormat b() {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es0.d.b():android.media.MediaFormat");
    }

    /* renamed from: toString */
    public java.lang.String mo128077x9616526c() {
        return "VideoCodecConfig(targetWidth=" + this.f337845b + ", targetHeight=" + this.f337846c + ", bitrate=" + this.f337847d + ", frameRate=" + this.f337848e + ", colorFormat=" + this.f337849f + ", iFrameInterval=" + this.f337850g + ", name=" + this.f337851h + ", initError=" + this.f337852i + ", forceCQ=" + this.f337853j + ", codecInfo=" + this.f337856m + ')';
    }

    public /* synthetic */ d(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
