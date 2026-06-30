package ey4;

/* loaded from: classes8.dex */
public class s implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        if (f17 > 0.0f) {
            double d17 = f17;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb.A;
            if (d17 < 0.5d) {
                return 0.0f;
            }
        }
        double d18 = f17;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb.A;
        float f18 = 1.0f - ((float) (d18 * (1.0d - ((1.0d - d18) / 0.5d))));
        return 1.0f - (f18 * f18);
    }
}
