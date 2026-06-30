package k53;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f385925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.v f385926e;

    public u(k53.v vVar, android.graphics.Bitmap bitmap) {
        this.f385926e = vVar;
        this.f385925d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        k53.v vVar = this.f385926e;
        vVar.f385939e.f385873g.setVisibility(8);
        vVar.f385939e.f385872f.setImageBitmap(this.f385925d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "load thumb:%s", vVar.f385938d.f433140i);
    }
}
