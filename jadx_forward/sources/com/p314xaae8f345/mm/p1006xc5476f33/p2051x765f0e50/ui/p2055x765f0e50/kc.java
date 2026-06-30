package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class kc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d f242768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d) {
        super(2);
        this.f242768d = c17423x715c600d;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        android.view.View view = (android.view.View) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d = this.f242768d;
        java.util.Iterator it = c17423x715c600d.f241946i.iterator();
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) it.next();
            int i18 = 0;
            while (true) {
                if (!(i18 < linearLayout.getChildCount())) {
                    z17 = false;
                    break;
                }
                int i19 = i18 + 1;
                android.view.View childAt = linearLayout.getChildAt(i18);
                if (childAt == null) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                if (childAt == view) {
                    z17 = true;
                    break;
                }
                i18 = i19;
            }
            if (z17) {
                break;
            }
            i17++;
        }
        java.lang.Object obj3 = c17423x715c600d.f241946i.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
        q26.i iVar = (q26.i) q26.h0.p(new n3.r1((android.view.ViewGroup) obj3), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jc.f242725d);
        q26.h hVar = new q26.h(iVar);
        while (true) {
            if (!hVar.hasNext()) {
                z18 = true;
                break;
            }
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780) hVar.next()).getHasPlayed()) {
                break;
            }
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gc playFinishedListener = c17423x715c600d.getPlayFinishedListener();
            if (playFinishedListener != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891) playFinishedListener;
                activityC17429xf3011891.a7(true);
                activityC17429xf3011891.Z6();
            }
            q26.h hVar2 = new q26.h(iVar);
            while (hVar2.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780) hVar2.next()).m68970x66e38cbd(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
