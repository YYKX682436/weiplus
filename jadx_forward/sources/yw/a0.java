package yw;

/* loaded from: classes11.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.c0 f547793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547794e;

    public a0(yw.c0 c0Var, int i17) {
        this.f547793d = c0Var;
        this.f547794e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e eVar = this.f547793d.f547817a;
        if (eVar != null) {
            eVar.f(this.f547794e);
        }
    }
}
