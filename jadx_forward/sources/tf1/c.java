package tf1;

/* loaded from: classes7.dex */
public class c implements tf.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf1.f f500389a;

    public c(tf1.f fVar) {
        this.f500389a = fVar;
    }

    @Override // tf.m
    public void a(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onSnapshotGot");
        java.util.Iterator it = new java.util.ArrayList(this.f500389a.f500396i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).c(bitmap);
        }
    }
}
