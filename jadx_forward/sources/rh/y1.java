package rh;

/* loaded from: classes12.dex */
public class y1 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.x1 f477092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(rh.x1 x1Var, boolean z17) {
        super(z17);
        this.f477092b = x1Var;
    }

    @Override // ph.f, ph.h
    public boolean b(java.lang.String str) {
        str.getClass();
        boolean equals = str.equals("android.intent.action.SCREEN_OFF");
        rh.x1 x1Var = this.f477092b;
        if (equals) {
            if (x1Var.f477081a) {
                return false;
            }
            x1Var.f477084d.mo40853xab27b508(3);
            return false;
        }
        if (!str.equals("android.intent.action.SCREEN_ON") || x1Var.f477081a) {
            return false;
        }
        x1Var.f477084d.mo40853xab27b508(5);
        return false;
    }

    @Override // ph.f, ph.g
    public boolean g(ph.c cVar, boolean z17) {
        rh.x1 x1Var = this.f477092b;
        if (z17 != x1Var.f477081a) {
            x1Var.f477081a = z17;
            x1Var.f477084d.mo40853xab27b508(java.lang.Integer.valueOf(z17 ? 1 : 2));
        } else {
            oj.j.f("Matrix.battery.DeviceStatusMonitorFeature", "redundant charging state: " + z17, new java.lang.Object[0]);
        }
        return false;
    }
}
