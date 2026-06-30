package im1;

/* loaded from: classes14.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.q f373738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f373739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f373740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ im1.x f373741g;

    public r(im1.x xVar, yf.q qVar, int i17, float f17) {
        this.f373741g = xVar;
        this.f373738d = qVar;
        this.f373739e = i17;
        this.f373740f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        im1.x xVar = this.f373741g;
        if (xVar.f373754c) {
            int ordinal = this.f373738d.ordinal();
            float f17 = this.f373740f;
            int i17 = this.f373739e;
            if (ordinal == 0) {
                ((p05.l4) xVar.f373753b).D(3, i17);
                xVar.f373755d = f17;
                return;
            }
            if (ordinal == 1) {
                ((p05.l4) xVar.f373753b).D(0, i17);
                xVar.f373756e = f17;
            } else if (ordinal == 2) {
                ((p05.l4) xVar.f373753b).D(2, i17 * 2);
                xVar.f373757f = f17 * 2.0f;
            } else {
                if (ordinal != 3) {
                    return;
                }
                ((p05.l4) xVar.f373753b).D(1, i17);
                xVar.f373758g = f17;
            }
        }
    }
}
