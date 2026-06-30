package hz3;

/* loaded from: classes8.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367857e;

    /* renamed from: f, reason: collision with root package name */
    public int f367858f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367859g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367860h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f367861i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f367860h = str;
        this.f367861i = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hz3.f fVar = new hz3.f(this.f367860h, this.f367861i, interfaceC29045xdcb5ca57);
        fVar.f367859g = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hz3.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        android.graphics.Bitmap bitmap;
        f04.i iVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f367858f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str2 = this.f367860h;
            f04.a aVar2 = new f04.a(str2);
            int i18 = this.f367861i;
            if (i18 < 0) {
                jz5.g gVar = hz3.i.f367865a;
                i18 = ((java.lang.Number) ((jz5.n) hz3.i.f367865a).mo141623x754a37bb()).intValue();
            }
            aVar2.f339952c = i18;
            f04.i a17 = f04.f.a(aVar2, (f04.b) ((jz5.n) hz3.i.f367867c).mo141623x754a37bb());
            android.graphics.Bitmap bitmap2 = a17.f339958a;
            if (bitmap2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AIScanImageCdnUploadUtil", "decode error, bitmap is null");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "decode result,width:" + bitmap2.getWidth() + ", height:" + bitmap2.getHeight());
            byte[] bytes = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String str3 = "wcf://ImageSearchFilePath/" + kk.k.g(bytes);
            this.f367859g = a17;
            this.f367856d = bitmap2;
            this.f367857e = str3;
            this.f367858f = 1;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new hz3.h(bitmap2, str3, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            str = str3;
            bitmap = bitmap2;
            iVar = a17;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f367857e;
            bitmap = (android.graphics.Bitmap) this.f367856d;
            iVar = (f04.i) this.f367859g;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        if (!booleanValue || !j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "save Image Fail, saveSuccess:" + booleanValue + ", fileExist:" + j17);
            return null;
        }
        hz3.b bVar = new hz3.b();
        android.graphics.Point point = iVar.f339959b;
        bVar.f367848b = point != null ? point.y : 0;
        bVar.f367847a = point != null ? point.x : 0;
        bVar.f367850d = bitmap.getWidth();
        bVar.f367851e = bitmap.getHeight();
        bVar.f367849c = str;
        return bVar;
    }
}
