package bi4;

/* loaded from: classes11.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f21073a;

    /* renamed from: b, reason: collision with root package name */
    public pj4.j0 f21074b;

    public o0(java.lang.String str) {
        this.f21073a = str;
    }

    public bi4.d1 a() {
        return null;
    }

    public boolean b(android.content.Context context) {
        return false;
    }

    public boolean c(android.content.Context context) {
        return d(context, null);
    }

    public abstract boolean d(android.content.Context context, android.os.Bundle bundle);

    public void e(pj4.w wVar) {
    }

    public java.lang.CharSequence f() {
        return "";
    }

    public java.lang.String g() {
        return this.f21073a;
    }

    public java.lang.String h() {
        return "";
    }

    public java.lang.CharSequence i() {
        return "";
    }

    public abstract boolean j();

    public boolean k() {
        return true;
    }

    public boolean l() {
        return true;
    }

    public void m(java.lang.String str, pj4.j0 j0Var) {
        com.tencent.mars.xlog.Log.i("TextStatusThreadIStatusCustomParts", "onAttach() called with: textStatusID = [" + str + "], jumpInfo = [" + j0Var + "]");
        this.f21074b = j0Var;
    }

    public abstract void n();

    public boolean o(android.widget.FrameLayout frameLayout) {
        return false;
    }

    public boolean p(android.widget.FrameLayout frameLayout) {
        return false;
    }

    public boolean q(android.widget.FrameLayout frameLayout) {
        return false;
    }
}
