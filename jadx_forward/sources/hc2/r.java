package hc2;

/* loaded from: classes2.dex */
public abstract class r {
    public static final int a(r45.ay0 ay0Var) {
        java.lang.Object m143895xf1229813;
        java.lang.String m75945x2fec8307 = ay0Var != null ? com.p314xaae8f345.mm.ui.bk.C() ? ay0Var.m75945x2fec8307(1) : ay0Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(android.graphics.Color.parseColor(m75945x2fec8307)));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Integer num = (java.lang.Integer) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }
}
