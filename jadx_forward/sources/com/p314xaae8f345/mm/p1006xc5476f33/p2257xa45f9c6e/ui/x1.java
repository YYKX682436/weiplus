package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class x1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254282d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.AnonymousClass1 anonymousClass1) {
        this.f254282d = c18557xc00aa3f3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int m71607x1550ffe7;
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(view);
        if (w07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskBarView", "null holder");
            return;
        }
        int m8183xf806b362 = w07.m8183xf806b362();
        if (h3Var.f93602k && m8183xf806b362 == -1) {
            m8183xf806b362 = w07.m8187x9323db3a();
        }
        int m8185xcdaf1228 = w07.m8185xcdaf1228();
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254282d;
        if (m8183xf806b362 == 0) {
            rect.top = 0;
        } else if (m8185xcdaf1228 == 2 || m8185xcdaf1228 == 7) {
            rect.top = 0;
        } else if (m8185xcdaf1228 == 4) {
            if (c18557xc00aa3f3.f254058e2.contains(2) || c18557xc00aa3f3.f254058e2.contains(1) || c18557xc00aa3f3.f254058e2.contains(7)) {
                rect.top = i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            } else {
                rect.top = 0;
            }
        }
        if (m8185xcdaf1228 == 3) {
            m71607x1550ffe7 = c18557xc00aa3f3.m71607x1550ffe7();
            rect.top = m71607x1550ffe7;
        }
        java.util.ArrayList arrayList = c18557xc00aa3f3.f254058e2;
        if (m8185xcdaf1228 == ((java.lang.Integer) arrayList.get(arrayList.size() - 1)).intValue()) {
            rect.bottom = i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "getItemOffsets index:%d sectionType:%d rect:%s", java.lang.Integer.valueOf(m8183xf806b362), java.lang.Integer.valueOf(m8185xcdaf1228), rect);
    }
}
