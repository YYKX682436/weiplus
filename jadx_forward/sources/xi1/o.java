package xi1;

/* loaded from: classes7.dex */
public enum o {
    PORTRAIT(1),
    UNSPECIFIED(-1),
    LANDSCAPE_SENSOR(6),
    LANDSCAPE_LOCKED(0),
    LANDSCAPE_LEFT(8),
    LANDSCAPE_RIGHT(0);


    /* renamed from: n, reason: collision with root package name */
    public static final xi1.o[] f536243n;

    /* renamed from: d, reason: collision with root package name */
    public final int f536245d;

    static {
        xi1.o oVar = LANDSCAPE_SENSOR;
        xi1.o oVar2 = LANDSCAPE_LOCKED;
        f536243n = new xi1.o[]{LANDSCAPE_LEFT, LANDSCAPE_RIGHT, oVar2, oVar};
    }

    o(int i17) {
        this.f536245d = i17;
    }

    public static boolean b(xi1.o oVar) {
        return u46.a.b(f536243n, oVar);
    }

    public static xi1.o d(java.lang.String str) {
        xi1.o oVar;
        if (!"landscape".equals(str)) {
            if (!"portrait".equals(str)) {
                if (!"landscapeLeft".equals(str)) {
                    if (!"landscapeRight".equals(str)) {
                        if (!"auto".equals(str) && !"UNSPECIFIED".equalsIgnoreCase(str)) {
                            xi1.o[] m175596xcee59d22 = m175596xcee59d22();
                            int length = m175596xcee59d22.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= length) {
                                    oVar = null;
                                    break;
                                }
                                xi1.o oVar2 = m175596xcee59d22[i17];
                                if (oVar2.name().equalsIgnoreCase(str)) {
                                    oVar = oVar2;
                                    break;
                                }
                                i17++;
                            }
                        } else {
                            oVar = UNSPECIFIED;
                        }
                    } else {
                        oVar = LANDSCAPE_RIGHT;
                    }
                } else {
                    oVar = LANDSCAPE_LEFT;
                }
            } else {
                oVar = PORTRAIT;
            }
        } else {
            oVar = LANDSCAPE_SENSOR;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = oVar != null ? oVar.name() : null;
        objArr[2] = java.lang.Integer.valueOf(oVar == null ? -1 : oVar.f536245d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.Window.Orientation", "parseOrientationString [%s]->[%s][%d]", objArr);
        return oVar;
    }

    public static xi1.o e(int i17) {
        for (xi1.o oVar : m175596xcee59d22()) {
            if (oVar.f536245d == i17) {
                return oVar;
            }
        }
        return UNSPECIFIED;
    }

    public boolean a(xi1.o oVar) {
        if (this != oVar) {
            xi1.o oVar2 = LANDSCAPE_SENSOR;
            xi1.o oVar3 = LANDSCAPE_LOCKED;
            if ((this != oVar2 || oVar != oVar3) && (this != oVar3 || oVar != oVar2)) {
                return false;
            }
        }
        return true;
    }
}
