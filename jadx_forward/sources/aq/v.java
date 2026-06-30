package aq;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94518f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94517e = str;
        this.f94518f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq.v(this.f94517e, this.f94518f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94516d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (aq.r0.f94476d == null) {
                aq.r0.f94476d = p3325xe03a0797.p3326xc267989b.z0.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", "applyLocateOcrKeywordReq start, " + java.lang.Thread.currentThread().getName());
            aq.r0 r0Var = aq.r0.f94473a;
            java.lang.String str = this.f94517e;
            this.f94516d = 1;
            obj = r0Var.g(str, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.util.Pair pair = (android.util.Pair) obj;
        java.nio.Buffer buffer = (java.nio.Buffer) pair.first;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) pair.second;
        if (bitmap == null || buffer == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageQuerySDKCore", "applyLocateOcrKeywordReq >> decode error " + this.f94517e);
            return "";
        }
        ny4.e eVar = aq.r0.f94475c;
        if (eVar == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        java.lang.String keyWords = this.f94518f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyWords, "keyWords");
        synchronized (eVar.f422995f) {
            com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1 c27770xd9cf22d1 = eVar.f422993d;
            if (c27770xd9cf22d1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "locateKeywords >> no init");
                return null;
            }
            java.lang.String b17 = eVar.b(c27770xd9cf22d1.m119939x77192637(new com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46(width, height, 3, (java.nio.ByteBuffer) buffer), keyWords, 3));
            eVar.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "WeVision2.TextRecognizer locate, result: ".concat(b17));
            return b17;
        }
    }
}
