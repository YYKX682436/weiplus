package m11;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.v0 f404332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f404333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m11.t0 f404335g;

    public u0(m11.t0 t0Var, com.p314xaae8f345.mm.p944x882e457a.v0 v0Var, int i17, int i18) {
        this.f404335g = t0Var;
        this.f404332d = v0Var;
        this.f404333e = i17;
        this.f404334f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f404332d.S(this.f404333e, this.f404334f, this.f404335g);
    }
}
