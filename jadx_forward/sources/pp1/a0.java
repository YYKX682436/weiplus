package pp1;

/* loaded from: classes14.dex */
public interface a0 {
    static void a(pp1.a0 a0Var, boolean z17, int i17, java.lang.Integer num, java.lang.Integer num2, boolean z18, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        java.lang.Integer num3;
        boolean z28;
        pp1.z zVar;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateByOverScrollStart");
        }
        java.lang.Integer num4 = (i18 & 4) != 0 ? null : num;
        java.lang.Integer num5 = (i18 & 8) != 0 ? null : num2;
        boolean z29 = (i18 & 16) != 0 ? true : z18;
        boolean z37 = (i18 & 32) != 0 ? false : z19;
        boolean z38 = (i18 & 64) != 0 ? false : z27;
        pp1.z zVar2 = (pp1.z) a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar2.f438981f;
        if (c12917x19ac03e7 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = zVar2.f438979d;
        java.lang.Object layoutManager = c12916x4253bec6 != null ? c12916x4253bec6.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int m8020x7e414b06 = c1162x665295de.m8020x7e414b06();
        int m54114x7b7d5832 = c12917x19ac03e7.m54114x7b7d5832() - c12917x19ac03e7.m54116xa290d101();
        float m54108x4480f5e7 = c12917x19ac03e7.m54108x4480f5e7();
        int n17 = c12917x19ac03e7.n(false);
        if (!z17 && z37) {
            n17 += m54114x7b7d5832;
        }
        int n18 = c12917x19ac03e7.n(true);
        if (!z17 && !z37) {
            n18 -= m54114x7b7d5832;
        }
        int i19 = n18;
        float m54116xa290d101 = ((c12917x19ac03e7.m54116xa290d101() + n17) - qp1.c0.f447233i) + pp1.b.f438929e;
        if (num5 != null) {
            if (num5.intValue() > n17) {
                n17 = num5.intValue();
            }
            if (num5.intValue() > m54116xa290d101) {
                m54116xa290d101 = num5.intValue();
            }
        }
        float f17 = 1.0f;
        float min = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((i17 - n17) * 1.0f) / (i19 - n17)));
        float f18 = i17;
        if (f18 >= m54116xa290d101) {
            float min2 = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, (f18 - m54116xa290d101) / (i19 - m54116xa290d101)));
            float f19 = ((m54108x4480f5e7 - 1.0f) * min2) + 1.0f;
            int i27 = 0;
            while (i27 < m8020x7e414b06) {
                android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(i27);
                android.view.View g17 = zVar2.g(mo7935xa188593e);
                float f27 = 1.0f - min;
                float d17 = zVar2.d(i27, z17, m8020x7e414b06) + ((0 - r4) * f27);
                if (g17 != null) {
                    g17.setPivotX(0.0f);
                    g17.setPivotY(g17.getHeight() / 2.0f);
                    g17.setScaleX(f19);
                    g17.setScaleY(f19);
                    g17.setTranslationX(d17);
                    g17.setTranslationY(0.0f);
                }
                zVar2.r(z17, mo7935xa188593e, i27, m8020x7e414b06, f27, z38);
                int i28 = i27;
                float f28 = f19;
                zVar2.o(z17, mo7935xa188593e, i28, m8020x7e414b06, min2, f28, z38);
                i27 = i28 + 1;
                m8020x7e414b06 = m8020x7e414b06;
                zVar2 = zVar2;
                f19 = f28;
                c1162x665295de = c1162x665295de;
                z29 = z29;
                num4 = num4;
                f17 = 1.0f;
            }
            num3 = num4;
            float f29 = f17;
            z28 = z29;
            float f37 = f19;
            zVar = zVar2;
            zVar.t(f29 - min2, z38);
            if (z38) {
                zVar.n(z17, true, min2, f37, z37);
            } else {
                zVar.n(z17, true, 0.0f, f37, z37);
            }
        } else {
            num3 = num4;
            z28 = z29;
            zVar = zVar2;
            for (int i29 = 0; i29 < m8020x7e414b06; i29++) {
                android.view.View mo7935xa188593e2 = c1162x665295de.mo7935xa188593e(i29);
                float f38 = 1.0f - min;
                zVar.s(zVar.g(mo7935xa188593e2), zVar.d(i29, z17, m8020x7e414b06) + ((0 - r0) * f38));
                zVar.r(z17, mo7935xa188593e2, i29, m8020x7e414b06, f38, z38);
                zVar.o(z17, mo7935xa188593e2, i29, m8020x7e414b06, 0.0f, 1.0f, z38);
            }
            zVar.t(1.0f, z38);
            zVar.n(z17, true, 0.0f, 1.0f, z37);
        }
        zVar.q(true, 1.0f - min);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = zVar.f438981f;
        if (c12917x19ac03e72 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.P(c12917x19ac03e72, i17, num3, false, z28, true, false, 32, null);
        }
    }

    static void b(pp1.a0 a0Var, boolean z17, int i17, java.lang.Integer num, java.lang.Integer num2, boolean z18, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        pp1.z zVar;
        float f17;
        boolean z28;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateByOverScrollEnd");
        }
        java.lang.Integer num3 = (i18 & 4) != 0 ? null : num;
        java.lang.Integer num4 = (i18 & 8) != 0 ? null : num2;
        boolean z29 = (i18 & 16) != 0 ? true : z18;
        boolean z37 = (i18 & 32) != 0 ? false : z19;
        boolean z38 = (i18 & 64) != 0 ? false : z27;
        pp1.z zVar2 = (pp1.z) a0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar2.f438981f;
        if (c12917x19ac03e7 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = zVar2.f438979d;
        java.lang.Object layoutManager = c12916x4253bec6 != null ? c12916x4253bec6.getLayoutManager() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        int m8020x7e414b06 = c1162x665295de.m8020x7e414b06();
        int m54114x7b7d5832 = z37 ? c12917x19ac03e7.m54114x7b7d5832() : c12917x19ac03e7.m54116xa290d101();
        float m54108x4480f5e7 = c12917x19ac03e7.m54108x4480f5e7();
        int p17 = c12917x19ac03e7.p(z17, true, (int) ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.f174948p0).mo141623x754a37bb()).floatValue(), m54114x7b7d5832);
        int m17 = c12917x19ac03e7.m(false);
        float f18 = ((-pp1.b.f438929e) - m54114x7b7d5832) + qp1.c0.f447233i;
        if (num4 != null) {
            if (num4.intValue() <= m17) {
                m17 = num4.intValue();
            }
            if (num4.intValue() <= f18) {
                f18 = num4.intValue();
            }
        }
        float f19 = i17 - p17;
        float min = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, (f19 * 1.0f) / (m17 - p17)));
        if (i17 <= f18) {
            float f27 = f19 / (f18 - p17);
            float f28 = m54108x4480f5e7 + ((1.0f - m54108x4480f5e7) * f27);
            int i19 = 0;
            while (i19 < m8020x7e414b06) {
                android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(i19);
                android.view.View g17 = zVar2.g(mo7935xa188593e);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c1162x665295de;
                float d17 = zVar2.d(i19, z17, m8020x7e414b06) + ((0 - r1) * min);
                if (g17 != null) {
                    g17.setPivotX(g17.getWidth());
                    g17.setPivotY(g17.getHeight() / 2.0f);
                    g17.setScaleX(f28);
                    g17.setScaleY(f28);
                    g17.setTranslationX(d17);
                    z28 = false;
                    g17.setTranslationY(0.0f);
                } else {
                    z28 = false;
                }
                zVar2.r(z17, mo7935xa188593e, i19, m8020x7e414b06, min, z38);
                zVar2.o(z17, mo7935xa188593e, i19, m8020x7e414b06, 1.0f - f27, f28, z38);
                i19++;
                zVar2 = zVar2;
                min = min;
                m8020x7e414b06 = m8020x7e414b06;
                c1162x665295de = c1162x665295de2;
            }
            float f29 = min;
            zVar = zVar2;
            zVar.t(f27, z38);
            if (z38) {
                zVar.n(z17, true, 1.0f - f27, f28, z37);
            } else {
                zVar.n(z17, true, 0.0f, f28, z37);
            }
            f17 = f29;
        } else {
            float f37 = min;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de3 = c1162x665295de;
            zVar = zVar2;
            int i27 = 0;
            while (i27 < m8020x7e414b06) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de4 = c1162x665295de3;
                android.view.View mo7935xa188593e2 = c1162x665295de4.mo7935xa188593e(i27);
                float f38 = f37;
                zVar.s(zVar.g(mo7935xa188593e2), zVar.d(i27, z17, m8020x7e414b06) + ((0 - r0) * f38));
                zVar.r(z17, mo7935xa188593e2, i27, m8020x7e414b06, f38, z38);
                zVar.o(z17, mo7935xa188593e2, i27, m8020x7e414b06, 0.0f, 1.0f, z38);
                i27++;
                c1162x665295de3 = c1162x665295de4;
                f37 = f38;
            }
            zVar.t(1.0f, z38);
            zVar.n(z17, true, 0.0f, 1.0f, z37);
            f17 = f37;
        }
        zVar.q(true, f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = zVar.f438981f;
        if (c12917x19ac03e72 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.P(c12917x19ac03e72, i17, num3, false, z29, true, false, 32, null);
        }
    }
}
