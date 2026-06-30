package bm4;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(java.util.HashMap hashMap, int i17, bw5.lp0 lp0Var, bw5.o50 o50Var) {
        bw5.e70 g17;
        bw5.v70 d17;
        bw5.v70 d18;
        bw5.v70 d19;
        int i18 = 0;
        if (i17 == 0) {
            return;
        }
        java.lang.String m13170xcc16feb8 = (lp0Var == null || (d19 = lp0Var.d()) == null) ? null : d19.m13170xcc16feb8();
        if (m13170xcc16feb8 == null) {
            m13170xcc16feb8 = "";
        }
        hashMap.put("currlistenid", m13170xcc16feb8);
        hashMap.put("listenidtype", java.lang.Integer.valueOf((lp0Var == null || (d18 = lp0Var.d()) == null) ? 0 : d18.f115722e));
        hashMap.put("currcategorytype", java.lang.Integer.valueOf(o50Var != null ? o50Var.f112497n : 0));
        java.lang.String c17 = o50Var != null ? o50Var.c() : null;
        hashMap.put("currcategoryid", c17 != null ? c17 : "");
        if ((lp0Var == null || (d17 = lp0Var.d()) == null || d17.f115722e != 4) ? false : true) {
            bw5.v70 d27 = lp0Var.d();
            if (d27 != null && (g17 = d27.g()) != null) {
                i18 = g17.f108307w;
            }
            hashMap.put("listenidmediatype", java.lang.Integer.valueOf(i18));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0079, code lost:
    
        if (r9 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.util.HashMap r6, bw5.ar0 r7, int r8, java.lang.Integer r9, bw5.lp0 r10, bw5.o50 r11) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm4.a.b(java.util.HashMap, bw5.ar0, int, java.lang.Integer, bw5.lp0, bw5.o50):void");
    }
}
