package oc2;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public oc2.w f425752a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f425753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425754c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f425755d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f425756e;

    public l0(oc2.w renderNodeType, boolean z17, int i17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderNodeType, "renderNodeType");
        this.f425752a = renderNodeType;
        this.f425753b = z17;
        this.f425754c = i17;
        this.f425755d = z18;
        if (z19) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RenderContext", "[init] renderNodeType=" + this.f425752a + ",isClientThumbnail=" + this.f425753b + ",maxWidth=" + i17 + ",dropOverSizeRedDot=" + z18);
    }

    public static oc2.l0 a(oc2.l0 l0Var, boolean z17, int i17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = l0Var.f425753b;
        }
        boolean z19 = z17;
        if ((i18 & 2) != 0) {
            i17 = l0Var.f425754c;
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z18 = l0Var.f425755d;
        }
        oc2.l0 l0Var2 = new oc2.l0(l0Var.f425752a, z19, i19, z18, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[copy] origin[");
        sb6.append(l0Var.f425752a);
        sb6.append(',');
        sb6.append(l0Var.f425753b);
        sb6.append(',');
        sb6.append(l0Var.f425754c);
        sb6.append(',');
        sb6.append(l0Var.f425755d);
        sb6.append("] new[");
        sb6.append(l0Var2.f425752a);
        sb6.append(',');
        sb6.append(l0Var2.f425753b);
        sb6.append(',');
        int i27 = l0Var2.f425754c;
        sb6.append(i27);
        sb6.append(',');
        sb6.append(l0Var2.f425755d);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b.H) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.RenderContext", sb7, new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RenderContext", sb7);
        }
        if (i27 <= 0) {
            pm0.z.b(xy2.b.f539688b, "RenderContext_maxWidth_less_than_0", false, null, null, false, false, new oc2.k0(sb7), 60, null);
        }
        return l0Var2;
    }

    /* renamed from: toString */
    public java.lang.String m151006x9616526c() {
        return "renderNodeType=" + this.f425752a + ",isClientThumbnail=" + this.f425753b + ",maxWidth=" + this.f425754c + ",dropOverSizeRedDot=" + this.f425755d + ",isCalculate=" + this.f425756e;
    }
}
