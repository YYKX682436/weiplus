package m11;

/* loaded from: classes12.dex */
public class i1 extends android.os.AsyncTask {
    public i1(m11.l1 l1Var) {
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        m11.j1 j1Var;
        android.graphics.Bitmap bitmap;
        m11.j1[] j1VarArr = (m11.j1[]) objArr;
        if (j1VarArr.length == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j1VarArr[0].f404257a) || (bitmap = (j1Var = j1VarArr[0]).f404258b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "nothing to save");
            return null;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, j1Var.f404257a, false);
            return null;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlImageCacheService", "save bitmap to image failed: " + e17.toString());
            return null;
        }
    }
}
