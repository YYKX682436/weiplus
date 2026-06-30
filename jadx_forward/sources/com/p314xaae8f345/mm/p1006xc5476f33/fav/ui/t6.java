package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class t6 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182982d;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d) {
        this.f182982d = activityC13572xe5ee659d;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182982d;
        activityC13572xe5ee659d.f181950g.p(str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f fVar = activityC13572xe5ee659d.f181954n;
        ((java.util.HashSet) fVar.f182033g).remove(str);
        fVar.notifyDataSetChanged();
        activityC13572xe5ee659d.T6();
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d = this.f182982d;
        activityC13572xe5ee659d.f181950g.d(str, true);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f fVar = activityC13572xe5ee659d.f181954n;
        ((java.util.HashSet) fVar.f182033g).add(str);
        fVar.notifyDataSetChanged();
        activityC13572xe5ee659d.T6();
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
