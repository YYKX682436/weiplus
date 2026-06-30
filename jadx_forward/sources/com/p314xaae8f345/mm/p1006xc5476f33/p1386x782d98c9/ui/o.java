package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class o implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q f181127d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q qVar) {
        this.f181127d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.q qVar = this.f181127d;
        ((java.util.LinkedList) qVar.f181157e.f180698f).remove(qVar.f181156d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13457xf0c8f0d1 activityC13457xf0c8f0d1 = qVar.f181157e;
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
