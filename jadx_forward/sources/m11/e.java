package m11;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f404207d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f404208e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f404209f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f404210g;

    public e(java.lang.String str, android.graphics.Bitmap bitmap, java.util.HashMap hashMap, byte[] bArr) {
        this.f404207d = str;
        this.f404208e = bitmap;
        this.f404209f = hashMap;
        this.f404210g = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        k70.u uVar;
        m11.g wi6 = m11.b1.wi();
        java.lang.String str = this.f404207d;
        android.graphics.Bitmap bitmap = this.f404208e;
        wi6.c(str, bitmap);
        java.util.HashMap hashMap = this.f404209f;
        if (hashMap != null && (uVar = (k70.u) hashMap.remove(str)) != null) {
            uVar.a(bitmap, this.f404210g);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageService", "finish download post job, url[%s]", objArr);
    }
}
