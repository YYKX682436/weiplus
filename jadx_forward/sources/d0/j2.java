package d0;

/* loaded from: classes14.dex */
public abstract class j2 {
    public static final int a(java.util.List list, yz5.p pVar, yz5.p pVar2, int i17, int i18, d0.t1 t1Var, d0.t1 t1Var2) {
        if (t1Var == t1Var2) {
            int size = list.size();
            float f17 = 0.0f;
            int i19 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size; i28++) {
                s1.t tVar = (s1.t) list.get(i28);
                float c17 = c(b(tVar));
                int intValue = ((java.lang.Number) pVar.mo149xb9724478(tVar, java.lang.Integer.valueOf(i17))).intValue();
                if (c17 == 0.0f) {
                    i27 += intValue;
                } else if (c17 > 0.0f) {
                    f17 += c17;
                    i19 = java.lang.Math.max(i19, a06.d.b(intValue / c17));
                }
            }
            return a06.d.b(i19 * f17) + i27 + ((list.size() - 1) * i18);
        }
        int min = java.lang.Math.min((list.size() - 1) * i18, i17);
        int size2 = list.size();
        float f18 = 0.0f;
        int i29 = 0;
        for (int i37 = 0; i37 < size2; i37++) {
            s1.t tVar2 = (s1.t) list.get(i37);
            float c18 = c(b(tVar2));
            if (c18 == 0.0f) {
                int min2 = java.lang.Math.min(((java.lang.Number) pVar2.mo149xb9724478(tVar2, Integer.MAX_VALUE)).intValue(), i17 - min);
                min += min2;
                i29 = java.lang.Math.max(i29, ((java.lang.Number) pVar.mo149xb9724478(tVar2, java.lang.Integer.valueOf(min2))).intValue());
            } else if (c18 > 0.0f) {
                f18 += c18;
            }
        }
        int b17 = f18 == 0.0f ? 0 : i17 == Integer.MAX_VALUE ? Integer.MAX_VALUE : a06.d.b(java.lang.Math.max(i17 - min, 0) / f18);
        int size3 = list.size();
        for (int i38 = 0; i38 < size3; i38++) {
            s1.t tVar3 = (s1.t) list.get(i38);
            float c19 = c(b(tVar3));
            if (c19 > 0.0f) {
                i29 = java.lang.Math.max(i29, ((java.lang.Number) pVar.mo149xb9724478(tVar3, java.lang.Integer.valueOf(b17 != Integer.MAX_VALUE ? a06.d.b(b17 * c19) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i29;
    }

    public static final d0.k2 b(s1.t tVar) {
        java.lang.Object g17 = tVar.g();
        if (g17 instanceof d0.k2) {
            return (d0.k2) g17;
        }
        return null;
    }

    public static final float c(d0.k2 k2Var) {
        if (k2Var != null) {
            return k2Var.f306689a;
        }
        return 0.0f;
    }

    public static final s1.t0 d(d0.t1 orientation, yz5.s arrangement, float f17, d0.b3 crossAxisSize, d0.p0 crossAxisAlignment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientation, "orientation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrangement, "arrangement");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crossAxisSize, "crossAxisSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crossAxisAlignment, "crossAxisAlignment");
        return new d0.i2(orientation, f17, crossAxisSize, arrangement, crossAxisAlignment);
    }
}
