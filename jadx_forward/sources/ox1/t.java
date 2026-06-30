package ox1;

/* loaded from: classes12.dex */
public abstract class t {
    public static ox1.d a(android.view.View view) {
        if (view == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.m8b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azt);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azq);
        if (c13158x154ec45a != null) {
            return new ox1.d(c13158x154ec45a);
        }
        if (c13158x154ec45a2 == null || c13158x154ec45a3 == null) {
            return null;
        }
        return new ox1.d(c13158x154ec45a2, c13158x154ec45a3);
    }

    public static android.view.View b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        if (c1163xf1deaba4 == null) {
            return null;
        }
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
                return null;
            }
            ((fx1.b) c1163xf1deaba4.mo7946xf939df19()).getClass();
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).mo7935xa188593e(i17 + 0);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
