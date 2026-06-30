package c13;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f37933d;

    public x(y03.f fVar) {
        this.f37933d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y03.f fVar = this.f37933d;
        int i17 = fVar.f458641d;
        int i18 = fVar.f458642e;
        int i19 = fVar.f458643f;
        com.tencent.pigeon.flutter_voip.FLTextureInfo fLTextureInfo = new com.tencent.pigeon.flutter_voip.FLTextureInfo(fVar.f458638a, i17, i18, i19, false);
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onTextureInfoChanged(fLTextureInfo, new c13.b("callback onTextureInfoChanged textureId:" + fLTextureInfo.getTextureId() + ", width:" + fLTextureInfo.getWidth() + ", height:" + fLTextureInfo.getHeight() + ", orientation:" + i19 + ", oldWidth:" + i17 + ", oldHeight:" + i18 + ", "));
        }
    }
}
