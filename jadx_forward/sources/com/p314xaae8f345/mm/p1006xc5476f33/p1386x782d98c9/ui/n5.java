package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes13.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f181122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e f181123e;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e activityC13476xfb15ef0e, java.util.List list) {
        this.f181123e = activityC13476xfb15ef0e;
        this.f181122d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e activityC13476xfb15ef0e = this.f181123e;
        java.util.LinkedList linkedList = (java.util.LinkedList) activityC13476xfb15ef0e.f180864e.f181164d;
        linkedList.clear();
        java.util.List<r45.rw6> list = this.f181122d;
        if (list != null && list.size() != 0) {
            for (r45.rw6 rw6Var : list) {
                if (rw6Var != null) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13476xfb15ef0e.f180862f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5 o5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o5(null);
                    o5Var.f181141b = null;
                    o5Var.f181140a = rw6Var;
                    linkedList.add(o5Var);
                }
            }
        }
        activityC13476xfb15ef0e.f180864e.notifyDataSetChanged();
    }
}
