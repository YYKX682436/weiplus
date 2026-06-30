package yi0;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f544016d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f544017e;

    /* renamed from: f, reason: collision with root package name */
    public int f544018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544020h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544021i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f544019g = str;
        this.f544020h = str2;
        this.f544021i = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yi0.d(this.f544019g, this.f544020h, this.f544021i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yi0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String path;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f544018f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xe0.d0 d0Var = (xe0.d0) i95.n0.c(xe0.d0.class);
            java.lang.String statusId = this.f544019g;
            java.lang.String url = this.f544020h;
            ((we0.w0) d0Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            java.lang.String g17 = bk4.n.f103046a.g("image", statusId, url);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
            if (com.p314xaae8f345.mm.vfs.w6.j(g17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusDataSource", "getImageFile: file is ready: ".concat(g17));
                return g17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusDataSource", "start downloading image: " + this.f544020h + ", path=" + g17);
            java.lang.String str = this.f544020h;
            this.f544016d = g17;
            this.f544017e = str;
            this.f544018f = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new yi0.c(nVar));
            java.lang.Object a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            path = g17;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            path = (java.lang.String) this.f544016d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatusDataSource", "failed to download bitmap, url=" + this.f544020h + ", path=" + path);
            return null;
        }
        xe0.i0 i0Var = (xe0.i0) i95.n0.c(xe0.i0.class);
        java.lang.String str2 = this.f544021i;
        ((we0.l1) i0Var).getClass();
        mj4.h b17 = ai4.m0.f86706a.G().b(str2);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatusDataSource", "no text status found for " + this.f544021i);
            return null;
        }
        mj4.k kVar = (mj4.k) b17;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544019g, kVar.l())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusDataSource", "status changed, discard this request, expected status id is " + this.f544019g + ", latest one is " + kVar.l());
            return path;
        }
        synchronized (yi0.f.class) {
            if (com.p314xaae8f345.mm.vfs.w6.j(path)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatusDataSource", "File has been created by another task, so we can reuse it");
                return path;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, path, false);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatusDataSource", "save bitmap to image failed: " + e17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusDataSource", "bitmap has been exported to ".concat(path));
            return path;
        }
    }
}
