package fp3;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f346848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp3.n f346849e;

    public m(fp3.n nVar, android.graphics.Bitmap bitmap) {
        this.f346849e = nVar;
        this.f346848d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f346849e.f346850d.setImageBitmap(this.f346848d);
    }
}
