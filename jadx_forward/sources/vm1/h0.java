package vm1;

/* loaded from: classes11.dex */
public final class h0 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f519546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vm1.x0 x0Var, android.content.Context context) {
        super(context, 3);
        this.f519546a = x0Var;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        vm1.x0 x0Var = this.f519546a;
        if (x0Var.f519610p) {
            if (x0Var.f519609o) {
                if ((i17 >= 0 && i17 < 31) || java.lang.Math.abs(360 - i17) <= 30) {
                    x0Var.mo92879x3a6a1204(true);
                    x0Var.f519609o = false;
                    return;
                }
                return;
            }
            if (x0Var.f519608n) {
                if (!(75 <= i17 && i17 < 106)) {
                    int abs = java.lang.Math.abs(360 - i17);
                    if (!(75 <= abs && abs < 106)) {
                        return;
                    }
                }
                x0Var.mo92879x3a6a1204(true);
                x0Var.f519608n = false;
            }
        }
    }
}
