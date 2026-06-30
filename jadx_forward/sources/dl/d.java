package dl;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.b f316611d;

    public d(dl.b bVar) {
        this.f316611d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.b bVar = this.f316611d;
        android.graphics.Bitmap bitmap = bVar.f316578g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseArtist" + bVar.m(), "[recycleCacheBitmap]");
        bVar.f316578g.recycle();
    }
}
