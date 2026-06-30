package hz3;

/* loaded from: classes12.dex */
public final class u implements hz3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz3.t f367899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hz3.w f367900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hz3.r f367901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz3.s f367902d;

    public u(hz3.t tVar, hz3.w wVar, hz3.r rVar, hz3.s sVar) {
        this.f367899a = tVar;
        this.f367900b = wVar;
        this.f367901c = rVar;
        this.f367902d = sVar;
    }

    public void a(hz3.x checkCDNImageResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkCDNImageResult, "checkCDNImageResult");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkImageCdnStatus result errType: ");
        int i17 = checkCDNImageResult.f367908a;
        sb6.append(i17);
        sb6.append(", errCode: ");
        int i18 = checkCDNImageResult.f367909b;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageCDNCheckHelper", sb6.toString());
        hz3.t tVar = this.f367899a;
        tVar.f367896c = i17;
        tVar.f367897d = i18;
        tVar.getClass();
        tVar.f367898e = "check cdn image error";
        if (i17 == 0 && i18 == 0) {
            hz3.w wVar = this.f367900b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar.f367903a, checkCDNImageResult.f367910c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(wVar.f367904b, checkCDNImageResult.f367911d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageCDNCheckHelper", "checkImageCdnStatus no need to re-upload, fileId: %s", wVar.f367903a);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageCDNCheckHelper", "checkImageCdnStatus re-upload image fileId: %s", checkCDNImageResult.f367910c);
                r45.si siVar = new r45.si();
                hz3.s sVar = this.f367902d;
                int i19 = sVar.f367892f;
                if (i19 == 1) {
                    siVar.f467276d = 3;
                } else if (i19 == 0) {
                    siVar.f467276d = 5;
                }
                android.graphics.Point point = sVar.f367889c;
                siVar.f467277e = point != null ? point.x : 0;
                siVar.f467278f = point != null ? point.y : 0;
                siVar.f467281i = 1;
                siVar.f467279g = checkCDNImageResult.f367910c;
                siVar.f467280h = checkCDNImageResult.f367911d;
                tVar.f367895b = siVar;
            }
        }
        hz3.r rVar = this.f367901c;
        if (rVar != null) {
            rVar.b(tVar);
        }
    }
}
