package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.c0.class)
/* loaded from: classes12.dex */
public final class x4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.c0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f281747e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f281748f;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        ((java.util.LinkedHashMap) this.f281747e).clear();
        this.f281748f = null;
    }

    @Override // yn.d
    public void e0() {
        m0(true);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            m0(true);
        }
    }

    public final void m0(boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x476120062;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x476120063;
        java.lang.Object p17 = this.f280113d.p();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x476120064 = null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = p17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17 : null;
        if (c1163xf1deaba4 == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return;
        }
        if (this.f281748f != null) {
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            if (w17 == -1 || y17 == -1 || w17 > y17) {
                this.f281748f = null;
            } else {
                if (w17 <= y17) {
                    while (true) {
                        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(w17);
                        if (mo7935xa188593e != null && (c22100x47612006 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.sr8)) != null && c22100x47612006.u()) {
                            java.lang.Object tag = c22100x47612006.getTag(com.p314xaae8f345.mm.R.id.sr9);
                            java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                            if (str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f281748f)) {
                                break;
                            }
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
                this.f281748f = null;
            }
        }
        c22100x47612006 = null;
        if (c22100x47612006 == null) {
            int t17 = c1162x665295de.t();
            int x17 = c1162x665295de.x();
            if (t17 != -1 && x17 != -1 && t17 <= x17) {
                float m8018x1c4fb41d = c1162x665295de.m8018x1c4fb41d() * 0.4f;
                if (t17 <= x17) {
                    float f17 = Float.MAX_VALUE;
                    while (true) {
                        android.view.View mo7935xa188593e2 = c1162x665295de.mo7935xa188593e(t17);
                        if (mo7935xa188593e2 != null && (c22100x476120063 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) mo7935xa188593e2.findViewById(com.p314xaae8f345.mm.R.id.sr8)) != null && c22100x476120063.u()) {
                            c22100x476120063.getLocationInWindow(new int[2]);
                            float f18 = r10[1] - m8018x1c4fb41d;
                            if (f18 < f17) {
                                c22100x476120064 = c22100x476120063;
                                f17 = f18;
                            }
                        }
                        if (t17 == x17) {
                            break;
                        } else {
                            t17++;
                        }
                    }
                }
            }
            if (c22100x476120064 == null) {
                return;
            } else {
                c22100x47612006 = c22100x476120064;
            }
        }
        int w18 = c1162x665295de.w();
        int y18 = c1162x665295de.y();
        if (w18 == -1 || y18 == -1 || w18 > y18 || w18 > y18) {
            return;
        }
        while (true) {
            android.view.View mo7935xa188593e3 = c1162x665295de.mo7935xa188593e(w18);
            if (mo7935xa188593e3 != null && (c22100x476120062 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) mo7935xa188593e3.findViewById(com.p314xaae8f345.mm.R.id.sr8)) != null) {
                c22100x476120062.E(c22100x476120062 == c22100x47612006 && z17);
            }
            if (w18 == y18) {
                return;
            } else {
                w18++;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f281747e).entrySet()) {
            ((b11.c) entry.getValue()).f98564d = t21.d3.a((int) r1.f98563c, r1.f98561a) * 1000;
        }
        m0(true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        m0(false);
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f281747e).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            b11.c cVar = (b11.c) entry.getValue();
            if (!cVar.f98566f) {
                t21.d3.w(str, (int) cVar.f98564d, cVar.f98565e);
                cVar.f98566f = true;
            }
        }
    }
}
