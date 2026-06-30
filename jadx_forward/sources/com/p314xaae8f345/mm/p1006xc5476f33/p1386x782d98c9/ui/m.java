package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 f181093d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1) {
        this.f181093d = activityC13457xf0c8f0d1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1 = this.f181093d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t tVar = activityC13457xf0c8f0d1.f180697e;
        java.util.List list = activityC13457xf0c8f0d1.f180698f;
        java.util.LinkedList linkedList = (java.util.LinkedList) tVar.f181195d;
        linkedList.clear();
        if (list != null && ((java.util.LinkedList) list).size() != 0) {
            linkedList.addAll(list);
        }
        activityC13457xf0c8f0d1.f180697e.notifyDataSetChanged();
    }
}
