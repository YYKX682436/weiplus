package dk5;

/* loaded from: classes9.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk5.c2 f316055d;

    public b2(dk5.c2 c2Var) {
        this.f316055d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dk5.c2 c2Var = this.f316055d;
        if (c2Var.f316084k) {
            android.content.Context context = c2Var.f316075b;
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).finish();
            }
        }
    }
}
