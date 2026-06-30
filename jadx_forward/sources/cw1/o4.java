package cw1;

/* loaded from: classes12.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f304729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.d4 f304730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.BitSet f304731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f304732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f304733h;

    public o4(cw1.q4 q4Var, cw1.d4 d4Var, java.util.BitSet bitSet, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f304729d = q4Var;
        this.f304730e = d4Var;
        this.f304731f = bitSet;
        this.f304732g = g0Var;
        this.f304733h = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.q4 q4Var = this.f304729d;
        q4Var.f304805n = null;
        cw1.d4 d4Var = this.f304730e;
        q4Var.f304799e = d4Var.f304403a;
        q4Var.f304800f = d4Var.f304404b;
        q4Var.f304801g = d4Var.f304405c;
        q4Var.f304802h = this.f304731f;
        q4Var.m8146xced61ae5();
        long j17 = this.f304732g.f391654d;
        q4Var.f304803i = j17;
        q4Var.f304804m = this.f304733h.f391649d;
        q4Var.f304798d.h7(j17, q4Var.f304799e.size(), q4Var.f304804m);
    }
}
