package yt3;

/* loaded from: classes3.dex */
public abstract class a implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f546865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f546866e;

    public a(ju3.d0 status, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546865d = status;
        this.f546866e = str;
        status.f(this);
    }

    @Override // yt3.r2
    /* renamed from: name */
    public java.lang.String mo122733x337a8b() {
        return android.text.TextUtils.isEmpty(this.f546866e) ? getClass().getName() : this.f546866e;
    }

    public final android.view.View y(int i17) {
        java.lang.Object obj = this.f546865d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View findViewById = ((android.view.ViewGroup) obj).findViewById(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }
}
