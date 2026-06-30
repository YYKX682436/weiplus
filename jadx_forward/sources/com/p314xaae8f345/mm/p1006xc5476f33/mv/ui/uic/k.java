package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q f232764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f232765b;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f232764a = qVar;
        this.f232765b = activityC0065xcd7aa112;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a
    /* renamed from: onPageSelected */
    public void mo67286x510f45c9(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07;
        java.util.ArrayList arrayList;
        im3.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar = this.f232764a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16664x54fdbbae c16664x54fdbbae = qVar.f232899i;
        if (c16664x54fdbbae != null && (arrayList = c16664x54fdbbae.f233598o) != null && (jVar = (im3.j) kz5.n0.a0(arrayList, i17)) != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f232765b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b) a17).O6().B3(new pm3.d(pm3.c.f438404d, jVar));
        }
        int childCount = qVar.m67288x4905e9fa().getChildCount();
        if (childCount < 0) {
            return;
        }
        int i18 = 0;
        while (true) {
            android.view.View childAt = qVar.m67288x4905e9fa().getChildAt(i18);
            if (childAt != null && (m07 = qVar.m67288x4905e9fa().m0(childAt)) != null) {
                android.view.KeyEvent.Callback findViewById = m07.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k0o);
                qk4.a aVar = findViewById instanceof qk4.a ? (qk4.a) findViewById : null;
                if (aVar != null) {
                    qk4.b recycler = qVar.Q6();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) aVar;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
                    qk4.f fVar = (qk4.f) recycler;
                    android.view.ViewParent parent = c18698xd8450806.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(c18698xd8450806);
                    }
                    kk4.v player = c18698xd8450806.getPlayer();
                    if (player != null) {
                        player.R();
                    }
                    kk4.v player2 = c18698xd8450806.getPlayer();
                    if (player2 != null) {
                        kk4.b.i(player2, false, false, 3, null);
                    }
                    pm0.v.O(fVar.f445978c, new qk4.e(c18698xd8450806, fVar));
                    android.view.View findViewById2 = m07.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.kwj);
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC", "stopAllVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC", "stopAllVideo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            if (i18 == childCount) {
                return;
            } else {
                i18++;
            }
        }
    }
}
