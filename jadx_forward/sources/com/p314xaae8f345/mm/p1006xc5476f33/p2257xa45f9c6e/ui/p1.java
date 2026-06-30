package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254217d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3) {
        this.f254217d = c18557xc00aa3f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph4.e eVar;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254217d;
        if (!c18557xc00aa3f3.f254058e2.contains(4) || (eVar = c18557xc00aa3f3.f254067n2) == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) eVar.m145780xa0ab20ce().f400257d).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next()).f66793x2262335f == 21) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 != -1) {
            java.util.Iterator it6 = eVar.m145780xa0ab20ce().f400256c.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) obj).f66793x2262335f == 21) {
                        break;
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) obj;
            if (c16601x7ed0e40c != null) {
                ((java.util.ArrayList) eVar.m145780xa0ab20ce().f400257d).set(i17, c16601x7ed0e40c);
            }
            eVar.f436007n.m8147xed6e4d18(i17);
        }
    }
}
