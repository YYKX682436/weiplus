package cw1;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.t0 f304833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f304834e;

    public s0(cw1.t0 t0Var, java.util.ArrayList arrayList) {
        this.f304833d = t0Var;
        this.f304834e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.t0 t0Var = this.f304833d;
        t0Var.f304857d = this.f304834e;
        t0Var.m8146xced61ae5();
        t0Var.f304859f.mo152xb9724478();
    }
}
