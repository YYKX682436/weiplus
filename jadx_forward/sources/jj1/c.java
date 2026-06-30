package jj1;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f381499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj1.d f381500e;

    public c(jj1.d dVar, android.graphics.Bitmap bitmap) {
        this.f381500e = dVar;
        this.f381499d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        jj1.d dVar = this.f381500e;
        boolean z17 = dVar.f381501a;
        android.graphics.Bitmap bitmap = this.f381499d;
        if (z17) {
            dVar.f381502b.f170391n.setImageBitmap(bitmap);
            dVar.f381502b.f170386f.setImageBitmap(bitmap);
        } else {
            dVar.f381502b.f170391n.setImageBitmap(bitmap);
            dVar.f381502b.f170386f.setImageBitmap(bitmap);
        }
    }
}
