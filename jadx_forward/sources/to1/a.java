package to1;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to1.c f502435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ro1.d f502436g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.lang.String str2, to1.c cVar, ro1.d dVar) {
        super(0);
        this.f502433d = str;
        this.f502434e = str2;
        this.f502435f = cVar;
        this.f502436g = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f502433d;
        java.io.File file = new java.io.File(str);
        long length = file.length();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copyLocal2UDisk, localPath=");
        sb6.append(str);
        sb6.append(", remotePath=");
        java.lang.String str2 = this.f502434e;
        sb6.append(str2);
        sb6.append(", exist=");
        sb6.append(file.exists());
        sb6.append(", len=");
        sb6.append(length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskChannel", sb6.toString());
        to1.k kVar = this.f502435f.f502438a;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(str2, true);
        if (a17 == null) {
            return ro1.f.f479514g;
        }
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fromFile);
        if (a17.f502470b) {
            return ro1.f.f479515h;
        }
        to1.i iVar = to1.i.f502448a;
        android.net.Uri destUri = a17.f502469a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destUri, "destUri");
        return (ro1.f) bm5.v1.a("copyFile", new to1.h(fromFile, destUri, this.f502436g));
    }
}
