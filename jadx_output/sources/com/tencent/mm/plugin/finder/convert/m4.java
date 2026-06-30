package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f103973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        super(1);
        this.f103973d = u4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        boolean z17 = true;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.finder.convert.u4 u4Var = this.f103973d;
            if (u4Var.f104670e.l0()) {
                u4Var.f104670e.B0(false);
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
