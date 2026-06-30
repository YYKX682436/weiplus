package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes3.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 f155843e;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2 activityC11399x9e1038c2, java.lang.String str) {
        this.f155843e = activityC11399x9e1038c2;
        this.f155842d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts [%b], oldPermission[%s], stack[%s]", bool, this.f155842d, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f155843e.mo43517x10010bd5();
    }

    /* renamed from: toString */
    public java.lang.String m48706x9616526c() {
        return super.toString() + "|checkContacts";
    }
}
