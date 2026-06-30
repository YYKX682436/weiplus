package c72;

/* loaded from: classes12.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c72.v f39592e;

    public u(c72.v vVar, int i17) {
        this.f39592e = vVar;
        this.f39591d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((gv.a) ((hv.e) i95.n0.c(hv.e.class))).getClass();
        new com.tencent.mm.modelsimple.l0(this.f39591d).doScene(this.f39592e.dispatcher(), new c72.t(this));
    }
}
