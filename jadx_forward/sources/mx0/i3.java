package mx0;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.j3 f413575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413576e;

    public i3(mx0.j3 j3Var, java.lang.String str) {
        this.f413575d = j3Var;
        this.f413576e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx0.j3 j3Var = this.f413575d;
        android.view.View view = j3Var.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) j3Var.f413347d).setText(this.f413576e);
    }
}
