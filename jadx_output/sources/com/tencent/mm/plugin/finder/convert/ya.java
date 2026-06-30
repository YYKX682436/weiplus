package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ya extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f105003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        super(1);
        this.f105003d = qeVar;
        this.f105004e = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent it = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.convert.qe.q(this.f105003d, this.f105004e, it);
        return jz5.f0.f302826a;
    }
}
