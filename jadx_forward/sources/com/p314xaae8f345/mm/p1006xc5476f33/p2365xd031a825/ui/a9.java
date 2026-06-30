package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class a9 implements java.util.Comparator {
    public a9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c activityC19123x554b2e1c) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.jd jdVar = (r45.jd) obj;
        r45.jd jdVar2 = (r45.jd) obj2;
        if (jdVar != null && jdVar2 != null) {
            if ("wx".equals(jdVar.f459243d) && "cft".equals(jdVar2.f459243d)) {
                return -1;
            }
            if ("cft".equals(jdVar.f459243d) && "wx".equals(jdVar2.f459243d)) {
                return 1;
            }
        }
        return 0;
    }
}
