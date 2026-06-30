package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class a1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f181981d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f181981d = activityC13563x72179722;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o72.j2 j2Var = (o72.j2) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = this.f181981d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = activityC13563x72179722.f181840e;
        if (cVar != null) {
            cVar.C = j2Var;
            cVar.c();
            activityC13563x72179722.f181840e.notifyDataSetChanged();
        }
        return jz5.f0.f384359a;
    }
}
