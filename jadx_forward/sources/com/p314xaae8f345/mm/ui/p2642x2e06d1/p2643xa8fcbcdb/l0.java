package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b f279373d;

    public l0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b) {
        this.f279373d = abstractC21556x9c39960b;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b = this.f279373d;
        if (i17 < abstractC21556x9c39960b.f279298e.getHeaderViewsCount()) {
            return;
        }
        int headerViewsCount = i17 - abstractC21556x9c39960b.f279298e.getHeaderViewsCount();
        if (!(abstractC21556x9c39960b.f279297d.f279342h.size() > headerViewsCount)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "checkSafeList false");
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) abstractC21556x9c39960b.f279297d.getItem(headerViewsCount);
        if (c21560x1fce98fb.r() && c21560x1fce98fb.f279316t && !(c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe)) {
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063) c21560x1fce98fb;
                c21544x57e6e063.M();
                c21544x57e6e063.N = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.j0(this, c21544x57e6e063, c21560x1fce98fb);
            }
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5) c21560x1fce98fb;
                c21545xcb424ea5.M();
                c21545xcb424ea5.M = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.k0(this, c21545xcb424ea5, c21560x1fce98fb);
            }
            abstractC21556x9c39960b.getClass();
            if (abstractC21556x9c39960b instanceof com.p314xaae8f345.mm.ui.C21417xe2e4fa74) {
                view.setSelected(true);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b.f279296i = new java.lang.ref.WeakReference(view);
            }
            if (c21560x1fce98fb.f279313q != null) {
                abstractC21556x9c39960b.n0(abstractC21556x9c39960b.f279297d, c21560x1fce98fb, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0.OnClick);
            }
        }
    }
}
