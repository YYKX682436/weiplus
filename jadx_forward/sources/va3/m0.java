package va3;

@j95.b
/* loaded from: classes8.dex */
public class m0 extends i95.w implements u45.f {

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f515860d = new jt0.i(20, va3.m0.class);

    public synchronized android.graphics.Bitmap Ai(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) this.f515860d).get(str);
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                return bitmap;
            }
        }
        return null;
    }

    public synchronized void Bi(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (((jt0.i) this.f515860d).get(str) != null) {
            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) this.f515860d).get(str);
            if (!bitmap2.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackAvatarCacheService", "bitmap recycle %s", bitmap2.toString());
                bitmap2.recycle();
            }
            ((jt0.i) this.f515860d).mo141381xc84af884(str);
        }
        ((jt0.i) this.f515860d).put(str, bitmap);
        ((lt0.f) this.f515860d).mo143586x35e001();
    }

    public synchronized void wi(java.lang.String str) {
        for (java.lang.String str2 : ((jt0.i) this.f515860d).l().keySet()) {
            if (str2.startsWith(str)) {
                ((jt0.i) this.f515860d).mo141381xc84af884(str2);
            }
        }
    }
}
