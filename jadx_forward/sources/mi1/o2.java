package mi1;

/* loaded from: classes7.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f408188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f408189e;

    public o2(mi1.n2 n2Var, android.graphics.drawable.Drawable drawable) {
        this.f408189e = n2Var;
        this.f408188d = drawable;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.drawable.Drawable drawable = this.f408188d;
        mi1.n2 n2Var = this.f408189e;
        n2Var.f408167d = drawable;
        if (n2Var.a()) {
            android.graphics.drawable.Drawable drawable2 = n2Var.f408167d;
            mi1.g gVar = (mi1.g) n2Var.f408175o;
            gVar.f408090g = drawable2;
            if (gVar.p()) {
                return;
            }
            gVar.f408089f.c(drawable2);
        }
    }
}
