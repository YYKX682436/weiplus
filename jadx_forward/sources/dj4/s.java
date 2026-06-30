package dj4;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314577h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, java.lang.String str2, mj4.h hVar, android.graphics.Bitmap bitmap, java.lang.String str3) {
        super(0);
        this.f314573d = str;
        this.f314574e = str2;
        this.f314575f = hVar;
        this.f314576g = bitmap;
        this.f314577h = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public final java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerDownloadThumb update ");
        java.lang.String str = this.f314573d;
        sb6.append(str);
        sb6.append(' ');
        java.lang.String str2 = this.f314574e;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb6.toString());
        si4.a G = ai4.m0.f86706a.G();
        mj4.h hVar = this.f314575f;
        mj4.h t17 = G.t(((mj4.k) hVar).l());
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (t17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb update " + str2 + ' ' + str);
            dj4.w.c(this.f314576g, str2);
            android.graphics.Bitmap b17 = dj4.w.b(str2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("triggerDownloadThumb: cache bitmap statusId=");
            sb7.append(((mj4.k) hVar).l());
            sb7.append(", imgUrl=");
            java.lang.String str3 = this.f314577h;
            sb7.append(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", sb7.toString());
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Vi(str3, b17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.StatusImgHandler", "triggerDownloadThumb TextStatus is null");
        }
        return f0Var;
    }
}
