package gt4;

/* loaded from: classes5.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.NinePatchDrawable f356948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.e2 f356949e;

    public d2(gt4.e2 e2Var, android.graphics.drawable.NinePatchDrawable ninePatchDrawable) {
        this.f356949e = e2Var;
        this.f356948d = ninePatchDrawable;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.e2 e2Var = this.f356949e;
        e2Var.f356959a.f262270i.setImageDrawable(this.f356948d);
        e2Var.f356959a.f262270i.setVisibility(0);
        e2Var.f356959a.f262270i.post(new gt4.c2(this));
    }
}
