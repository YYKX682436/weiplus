package to1;

/* loaded from: classes4.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f502458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f502459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String[] strArr, android.net.Uri uri) {
        super(0);
        this.f502458d = strArr;
        this.f502459e = uri;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.net.Uri uri = this.f502459e;
        if (this.f502458d.length == 0) {
            return null;
        }
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
        try {
            java.util.Objects.toString(uri);
            return contentResolver.query(this.f502459e, this.f502458d, null, null, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WxDocumentFile", "Fail to query. uri=" + uri + ", exception=" + e17);
            return null;
        }
    }
}
