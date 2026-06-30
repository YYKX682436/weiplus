package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class p7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f104243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(com.tencent.mm.plugin.finder.convert.s7 s7Var) {
        super(1);
        this.f104243d = s7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        boolean z17 = true;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.finder.convert.s7 s7Var = this.f104243d;
            if (s7Var.f104528e.l0()) {
                s7Var.f104528e.B0(false);
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
