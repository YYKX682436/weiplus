package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class m0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b f279376d;

    public m0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b) {
        this.f279376d = abstractC21556x9c39960b;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b abstractC21556x9c39960b = this.f279376d;
        if (i17 < abstractC21556x9c39960b.f279298e.getHeaderViewsCount()) {
            return false;
        }
        return abstractC21556x9c39960b.o0(abstractC21556x9c39960b.f279297d, (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) abstractC21556x9c39960b.f279297d.getItem(i17 - abstractC21556x9c39960b.f279298e.getHeaderViewsCount()), abstractC21556x9c39960b.f279298e);
    }
}
