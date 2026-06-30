package yk5;

/* loaded from: classes11.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f544427e;

    public o(yk5.u uVar, java.lang.String str) {
        this.f544427e = uVar;
        this.f544426d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        yk5.u uVar = this.f544427e;
        if (!uVar.f544442s.u2()) {
            uVar.f544442s.U2();
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = uVar.f544442s;
        z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-33));
        if (uVar.f544446w) {
            c01.d9.e().g(new tg3.r1(this.f544426d, 3));
            uVar.B = true;
        }
    }
}
