package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f254135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254136e;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, int i17) {
        this.f254136e = c18557xc00aa3f3;
        this.f254135d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f254135d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "onSectionDeleted %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254136e;
        if (i17 == 4 && !((java.util.ArrayList) c18557xc00aa3f3.f254056c2.a(4).f400257d).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "showDataList not empty!");
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.f254052c3;
        int indexOf = c18557xc00aa3f3.f254058e2.indexOf(java.lang.Integer.valueOf(i17));
        if (indexOf == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "section not found!");
            return;
        }
        java.util.ArrayList arrayList = c18557xc00aa3f3.f254058e2;
        arrayList.remove(indexOf);
        c18557xc00aa3f3.mo7946xf939df19().m8155x27702c4(indexOf);
        int size = arrayList.size();
        boolean z17 = false;
        int i19 = (arrayList.contains(5) || arrayList.contains(10)) ? 1 : 0;
        if (size - i19 == 1 && ((java.lang.Integer) arrayList.get(i19)).intValue() == 3) {
            z17 = true;
        }
        c18557xc00aa3f3.w1();
        if (arrayList.size() > size || z17) {
            if (z17) {
                c18557xc00aa3f3.mo7946xf939df19().m8147xed6e4d18(arrayList.indexOf(3));
                return;
            }
            if (arrayList.size() > i19 + 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "other tips show[remove section], mark");
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TASKBAR_HAS_SHOWED_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
            c18557xc00aa3f3.mo7946xf939df19().m8149x8b456734(arrayList.size() - 1);
        }
    }
}
