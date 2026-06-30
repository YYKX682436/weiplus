package nz4;

/* loaded from: classes12.dex */
public abstract class z {
    public static nz4.g a(android.view.View view) {
        if (view == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.m8b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azt);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azq);
        if (c19515x154ec45a != null) {
            return new nz4.g(c19515x154ec45a);
        }
        if (c19515x154ec45a2 == null || c19515x154ec45a3 == null) {
            return null;
        }
        return new nz4.g(c19515x154ec45a2, c19515x154ec45a3);
    }

    public static android.view.View b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        if (c1163xf1deaba4 == null) {
            return null;
        }
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).mo7935xa188593e(i17);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
