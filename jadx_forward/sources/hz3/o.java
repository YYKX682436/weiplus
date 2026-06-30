package hz3;

/* loaded from: classes12.dex */
public final class o implements hz3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz3.z f367886a;

    public o(hz3.z zVar) {
        this.f367886a = zVar;
    }

    @Override // hz3.r
    public void a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        hz3.z zVar = this.f367886a;
        if (zVar != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new iz3.a(((iz3.d) zVar).f377602a, mediaId));
        }
    }

    @Override // hz3.r
    public void b(hz3.t checkImageResult) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkImageResult, "checkImageResult");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(checkImageResult.f367896c);
        objArr[1] = java.lang.Integer.valueOf(checkImageResult.f367897d);
        r45.si siVar = checkImageResult.f367895b;
        if (siVar != null) {
            str = java.lang.String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", java.util.Arrays.copyOf(new java.lang.Object[]{siVar.f467279g, java.lang.Integer.valueOf(siVar.f467277e), java.lang.Integer.valueOf(siVar.f467278f), java.lang.Integer.valueOf(siVar.f467276d), java.lang.Integer.valueOf(siVar.f467281i)}, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
        } else {
            str = null;
        }
        objArr[2] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanDefaultImageCDNStrategy", "getCDNImageInfoList-default errType: %s, errCode: %s: reUploadInfo: %s", objArr);
        int i17 = checkImageResult.f367896c;
        hz3.z zVar = this.f367886a;
        if (i17 != 0 || checkImageResult.f367897d != 0) {
            if (zVar != null) {
                ((iz3.d) zVar).a(i17, checkImageResult.f367897d, checkImageResult.f367898e);
                return;
            }
            return;
        }
        if (checkImageResult.f367895b == null) {
            if (zVar != null) {
                ((iz3.d) zVar).a(4, 403, "checkImageCdnStatus re-upload cdn error");
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.si siVar2 = new r45.si();
        siVar2.f467281i = 1;
        siVar2.f467276d = 3;
        r45.si siVar3 = checkImageResult.f367895b;
        siVar2.f467279g = siVar3 != null ? siVar3.f467279g : null;
        siVar2.f467280h = siVar3 != null ? siVar3.f467280h : null;
        arrayList.add(siVar2);
        if (zVar != null) {
            ((iz3.d) zVar).b(arrayList);
        }
    }
}
