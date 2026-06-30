package k5;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final b5.w f385673d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f385674e;

    /* renamed from: f, reason: collision with root package name */
    public final a5.x0 f385675f;

    public m(b5.w wVar, java.lang.String str, a5.x0 x0Var) {
        this.f385673d = wVar;
        this.f385674e = str;
        this.f385675f = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f385673d.f99433f.f(this.f385674e, this.f385675f);
    }
}
