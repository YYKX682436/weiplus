package sj3;

/* loaded from: classes14.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f490268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490269e;

    public s1(sj3.u1 u1Var, java.lang.String str) {
        this.f490268d = u1Var;
        this.f490269e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f490269e;
        if (str == null) {
            str = "";
        }
        sj3.u1 u1Var = this.f490268d;
        u1Var.b(str);
        u1Var.e().setVisibility(8);
        android.widget.TextView textView = u1Var.f490287b;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
