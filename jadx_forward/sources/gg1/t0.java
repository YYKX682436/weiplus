package gg1;

/* loaded from: classes7.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353162d;

    public t0(gg1.c1 c1Var) {
        this.f353162d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.w wVar = this.f353162d.f353073f;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
            throw null;
        }
        if (wVar.d() && wVar.f353170g != null) {
            gg1.p pVar = wVar.f353173m;
            if (pVar != null) {
                pVar.m8146xced61ae5();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recycleViewAdapter");
                throw null;
            }
        }
    }
}
