package m11;

/* loaded from: classes10.dex */
public class d0 implements kk.h {
    public d0(m11.l0 l0Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[preRemoveCallback] key:%s remove bitmap without recycle! :%s size:%s", str, bitmap.toString(), java.lang.Integer.valueOf(bitmap.getByteCount()));
    }
}
