package m11;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f404216d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f404217e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f404218f;

    public f(java.lang.String str, java.util.HashMap hashMap, boolean z17) {
        this.f404216d = str;
        this.f404217e = hashMap;
        this.f404218f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        k70.u uVar;
        java.lang.String str = this.f404216d;
        byte[] u07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u0(str);
        android.graphics.Bitmap bitmap = null;
        java.util.HashMap hashMap = this.f404217e;
        if (u07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageService", "download fail: url[%s] data is null", str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m11.e(str, null, hashMap, u07));
            return;
        }
        try {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(u07);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageService", "download fail: url[%s] decode bitmap error[%s]", str, e17.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageService", "download finish, url[%s], do post job", str);
        if (this.f404218f) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m11.e(str, bitmap, hashMap, u07));
            return;
        }
        m11.b1.wi().c(str, bitmap);
        if (hashMap != null && (uVar = (k70.u) hashMap.remove(str)) != null) {
            uVar.a(bitmap, u07);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageService", "finish download post job, url[%s]", objArr);
    }
}
