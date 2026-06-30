package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes12.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f179131b = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 f179130a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4();

    public void a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4 = this.f179130a;
        am.t4 t4Var = c5327x7bab71d4.f135640g;
        t4Var.f89512a = str;
        t4Var.f89513b = i17;
        t4Var.f89514c = i18;
        t4Var.f89515d = str2;
        c5327x7bab71d4.e();
        java.util.Map map = this.f179131b;
        if (i17 != 6) {
            ((java.util.HashMap) map).remove(str);
        } else if (i18 < 0 || i18 >= 100) {
            ((java.util.HashMap) map).remove(str);
        } else {
            ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i18));
        }
    }

    public int b(java.lang.String str) {
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) this.f179131b).get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
