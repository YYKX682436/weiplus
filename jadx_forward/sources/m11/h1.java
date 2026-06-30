package m11;

/* loaded from: classes12.dex */
public class h1 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f404240a;

    public h1(m11.l1 l1Var) {
        this.f404240a = l1Var;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        java.lang.String[] strArr = (java.lang.String[]) objArr;
        if (strArr.length <= 0) {
            return null;
        }
        java.lang.String c17 = m11.l1.c(strArr[0]);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c17);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(c17);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        m11.l1 l1Var = this.f404240a;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UrlImageCacheService", "try load from " + l1Var.f404283b.f404261a);
            m11.b1.wi().a(l1Var.f404283b.f404261a, true, l1Var);
            return;
        }
        if (!l1Var.f404284c) {
            if (l1Var.f404283b != null) {
                m11.b1.wi().c(l1Var.f404283b.f404261a, bitmap);
                k70.f0 f0Var = (k70.f0) l1Var.f404283b.f404263c.get();
                if (f0Var != null) {
                    java.lang.String str = l1Var.f404283b.f404261a;
                    f0Var.a(str, bitmap, m11.l1.c(str));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "onPostExecute mCurTaskItem is null");
            }
        }
        l1Var.f404283b = null;
        l1Var.e();
    }
}
