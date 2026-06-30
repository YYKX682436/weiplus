package zl1;

/* loaded from: classes7.dex */
public class c extends zl1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f555106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555107b;

    public c(zl1.t tVar, android.widget.ImageView imageView) {
        this.f555107b = tVar;
        this.f555106a = imageView;
    }

    @Override // zl1.z
    public void a(android.graphics.Bitmap bitmap, zl1.y yVar) {
        super.a(bitmap, yVar);
        int i17 = zl1.t.f555147q;
        zl1.t tVar = this.f555107b;
        tVar.getClass();
        tVar.e(new zl1.f(tVar, this.f555106a, bitmap));
    }
}
