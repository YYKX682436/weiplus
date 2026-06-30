package hb5;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hb5.e0 f361688e;

    public c0(hb5.e0 e0Var, java.lang.String str) {
        this.f361688e = e0Var;
        this.f361687d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hb5.e0 e0Var = this.f361688e;
        java.lang.String str = e0Var.f361699f;
        java.lang.String str2 = this.f361687d;
        if (str2.equals(str)) {
            c01.d9.e().g(new s01.e0(e0Var.f361697d, str2, 0, null));
        }
    }
}
