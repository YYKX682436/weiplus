package jp3;

/* loaded from: classes14.dex */
public final class k implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 f382544d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382545e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382546f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f382547g;

    /* renamed from: h, reason: collision with root package name */
    public kp3.h f382548h;

    /* renamed from: i, reason: collision with root package name */
    public kp3.g f382549i;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f382544d = activity;
        this.f382545e = "";
        this.f382546f = "";
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public final dn.m a(java.lang.String str) {
        dn.m mVar = new dn.m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        mVar.f69601xaca5bdda = kk.k.g(bytes);
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = "";
        mVar.f69592xf1ebe47b = 5;
        mVar.f69618x114ef53e = "";
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69597x853bb235 = false;
        mVar.f69580x454032b6 = 1;
        mVar.f69584x89a4c0cf = 0;
        mVar.f69598x47e3df1e = 0;
        mVar.f323322h = 5;
        return mVar;
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        byte[] bArr;
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult;
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintLogic", "[cdnCallback] mediaId:" + str + "，startRet:" + i17 + "，proginfo:" + gVar + "，res:" + hVar);
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintLogic", "[cdnCallback] failed，repeated request, this mediaID is uploading");
            return 0;
        }
        jp3.g gVar2 = jp3.g.f382533a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 activityC16781xd3c41868 = this.f382544d;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f382545e, str)) {
            if (i17 != 0) {
                jp3.t.f382562a.e(this.f382545e, hVar != null ? hVar.f69522xf9dbbe9c : null, activityC16781xd3c41868.f234406f, java.lang.Integer.valueOf(i17), hVar != null ? java.lang.Long.valueOf(hVar.f69523x17c343e7) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintLogic", "[cdnCallback] failed：startRet != 0");
                gVar2.a(this.f382546f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.ActivityC16781xd3c41868 activityC16781xd3c418682 = this.f382544d;
                gVar2.i(activityC16781xd3c418682, 80042, "ERR_PALM_CDN_UPLOAD", activityC16781xd3c418682.U6() ? this.f382548h : null, activityC16781xd3c41868.U6() ? this.f382549i : null);
            }
            return 0;
        }
        jp3.t tVar = jp3.t.f382562a;
        tVar.e(this.f382545e, hVar.f69522xf9dbbe9c, activityC16781xd3c41868.f234406f, 0, java.lang.Long.valueOf(hVar.f69523x17c343e7));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintLogic", "[cdnCallback] success, do check palm result");
        gVar2.a(this.f382546f);
        java.lang.String str2 = hVar.f69522xf9dbbe9c;
        java.lang.String str3 = hVar.f69502xf11df5f5;
        kp3.h hVar2 = this.f382548h;
        java.lang.String str4 = (hVar2 == null || (imageDataResult2 = hVar2.f392526b) == null) ? null : imageDataResult2.f61427xbf9a9cbd;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = (hVar2 == null || (imageDataResult = hVar2.f392527c) == null) ? null : imageDataResult.f61427xbf9a9cbd;
        java.lang.String str7 = str6 == null ? "" : str6;
        kp3.g gVar3 = this.f382549i;
        java.lang.String str8 = gVar3 != null ? gVar3.f392523b : null;
        if (str3 != null) {
            bArr = str3.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        java.lang.String f17 = gVar2.f(bArr, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
        java.lang.String f18 = gVar2.f(this.f382547g, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
        if (!(f17.length() == 0)) {
            if (!(f18.length() == 0)) {
                tVar.d("checkpalmuseronlineopenresource");
                pq5.g l17 = new ip3.a(activityC16781xd3c41868.f234406f, f17, f18, str2, activityC16781xd3c41868.f234413p, str5, str7, str8).l();
                l17.f(activityC16781xd3c41868);
                l17.K(new jp3.h(this));
                return 0;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintLogic", "[doCheckPalmResult] error, encrypt key failed. encryptedCdnKey.len:" + f17.length() + "，encryptedPalmFileKey.len:" + f18.length());
        gVar2.i(activityC16781xd3c41868, 80044, "ERR_PALM_KEY_ENCRYPT_FAIL", activityC16781xd3c41868.U6() ? this.f382548h : null, activityC16781xd3c41868.U6() ? this.f382549i : null);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
