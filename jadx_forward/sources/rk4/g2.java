package rk4;

/* loaded from: classes11.dex */
public final class g2 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f478205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(rk4.l3 l3Var, android.content.Context context) {
        super(context, 3);
        this.f478205a = l3Var;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        rk4.l3 l3Var = this.f478205a;
        if (l3Var.f478360r) {
            if (l3Var.f478359q) {
                if ((i17 >= 0 && i17 < 31) || java.lang.Math.abs(360 - i17) <= 30) {
                    l3Var.mo92879x3a6a1204(true);
                    l3Var.f478359q = false;
                    return;
                }
                return;
            }
            if (l3Var.f478358p) {
                if (!(75 <= i17 && i17 < 106)) {
                    int abs = java.lang.Math.abs(360 - i17);
                    if (!(75 <= abs && abs < 106)) {
                        return;
                    }
                }
                l3Var.mo92879x3a6a1204(true);
                l3Var.f478358p = false;
            }
        }
    }
}
