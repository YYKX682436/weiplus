package za3;

/* loaded from: classes15.dex */
public class f1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f552443d;

    public f1(za3.i1 i1Var) {
        this.f552443d = i1Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.Object obj;
        if (!z17) {
            return false;
        }
        double d27 = f18;
        double d28 = f17;
        za3.i1 i1Var = this.f552443d;
        i1Var.getClass();
        java.lang.String.format("latitude = %f, longtitude = %f", java.lang.Double.valueOf(d27), java.lang.Double.valueOf(d28));
        if (i1Var.f552478c == null) {
            i1Var.f552478c = new r45.mw6();
            i1Var.f552478c.f462406e = new r45.wa5();
            java.lang.String r17 = c01.z1.r();
            r45.mw6 mw6Var = i1Var.f552478c;
            mw6Var.f462405d = r17;
            r45.wa5 wa5Var = mw6Var.f462406e;
            wa5Var.f470544d = d27;
            wa5Var.f470545e = d28;
            if (i1Var.f552488m && i1Var.f552480e) {
                i1Var.f();
            }
        }
        r45.mw6 mw6Var2 = i1Var.f552478c;
        r45.wa5 wa5Var2 = mw6Var2.f462406e;
        wa5Var2.f470544d = d27;
        wa5Var2.f470545e = d28;
        java.lang.String str = mw6Var2.f462405d;
        ab3.h hVar = i1Var.f552487l;
        java.lang.Object mo1006x62748683 = hVar.mo1006x62748683(str);
        if (mo1006x62748683 != null) {
            mo1006x62748683.hashCode();
            obj = mo1006x62748683;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128 = (com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128) hVar.mo1007xb0d6012();
            android.content.Context context = i1Var.f552476a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f6725 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725(context, c16319x94a0c128, com.p314xaae8f345.mm.R.C30861xcebc809e.cj_);
            i1Var.f552487l.mo994xbb8aeee6(c16298xbb1f6725, 0.0d, 0.0d, i1Var.f552478c.f462405d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c1282 = c16298xbb1f6725.f226254p;
            if (c16319x94a0c1282 != null) {
                c16319x94a0c1282.m65994xbb8aeee6(c16298xbb1f6725.f226246e, d27, d28);
                c16298xbb1f6725.f226254p.m65994xbb8aeee6(c16298xbb1f6725.f226247f, d27, d28);
            }
            if (i1Var.f552485j) {
                c16298xbb1f6725.m65968x23b704c3(null);
                c16298xbb1f6725.m65969xb4a07727(null);
                c16298xbb1f6725.a();
            } else {
                c16298xbb1f6725.m65968x23b704c3(i1Var.f552496u);
                c16298xbb1f6725.m65969xb4a07727(i1Var.f552495t);
            }
            c16298xbb1f6725.m65966x47f185b(i1Var.f552478c.f462405d);
            new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16299x7c6037cf(context);
            obj = c16298xbb1f6725;
        }
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f67252 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725) obj;
            i1Var.f552479d = c16298xbb1f67252;
            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c1283 = c16298xbb1f67252.f226254p;
            if (c16319x94a0c1283 != null) {
                c16319x94a0c1283.m66011x37843fd8(c16298xbb1f67252.f226246e, d27, d28, false);
                c16298xbb1f67252.f226254p.m66008x3c714321(c16298xbb1f67252.f226247f, d27, d28, false);
            }
            if (i1Var.f552482g) {
                i1Var.f552479d.getClass();
            } else {
                i1Var.f552479d.getClass();
            }
        }
        if (!i1Var.f552489n) {
            return true;
        }
        ab3.f mo1001x8873d7af = hVar.mo1001x8873d7af();
        r45.wa5 wa5Var3 = i1Var.f552478c.f462406e;
        mo1001x8873d7af.mo991x6ff2357(wa5Var3.f470544d, wa5Var3.f470545e);
        return true;
    }
}
