package hr3;

/* loaded from: classes9.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f364953d;

    public b6(hr3.t6 t6Var) {
        this.f364953d = t6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.t6 t6Var = this.f364953d;
        t6Var.p(4, null);
        if (t6Var.f365535d.getIntent().getIntExtra("Kdel_from", -1) == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(t6Var.f365535d, intent, false);
        }
    }
}
