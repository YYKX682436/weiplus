package gg1;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353153d;

    public q0(gg1.c1 c1Var) {
        this.f353153d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.w wVar = this.f353153d.f353073f;
        if (wVar != null) {
            wVar.e();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
            throw null;
        }
    }
}
