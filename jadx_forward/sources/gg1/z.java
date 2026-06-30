package gg1;

/* loaded from: classes7.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353191d;

    public z(gg1.c1 c1Var) {
        this.f353191d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gg1.w wVar = this.f353191d.f353073f;
        if (wVar != null) {
            if (wVar != null) {
                wVar.e();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectDeviceBottomSheet");
                throw null;
            }
        }
    }
}
