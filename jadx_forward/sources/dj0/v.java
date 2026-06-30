package dj0;

/* loaded from: classes14.dex */
public class v extends dj0.u {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f314417r = 0;

    static {
        new dj0.x(android.view.WindowInsets.CONSUMED);
    }

    public v(dj0.x xVar, dj0.v vVar) {
        super(xVar, vVar);
    }

    @Override // dj0.r, dj0.w
    public final void d(android.view.View view) {
    }

    @Override // dj0.r, dj0.w
    public dj0.l f(int i17) {
        int statusBars;
        int i18 = 0;
        for (int i19 = 1; i19 <= 256; i19 <<= 1) {
            if ((i17 & i19) != 0) {
                if (i19 == 1) {
                    statusBars = android.view.WindowInsets.Type.statusBars();
                } else if (i19 == 2) {
                    statusBars = android.view.WindowInsets.Type.navigationBars();
                } else if (i19 == 4) {
                    statusBars = android.view.WindowInsets.Type.captionBar();
                } else if (i19 == 8) {
                    statusBars = android.view.WindowInsets.Type.ime();
                } else if (i19 == 16) {
                    statusBars = android.view.WindowInsets.Type.systemGestures();
                } else if (i19 == 32) {
                    statusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                } else if (i19 == 64) {
                    statusBars = android.view.WindowInsets.Type.tappableElement();
                } else if (i19 == 128) {
                    statusBars = android.view.WindowInsets.Type.displayCutout();
                }
                i18 |= statusBars;
            }
        }
        return dj0.l.b(this.f314408c.getInsets(i18));
    }
}
