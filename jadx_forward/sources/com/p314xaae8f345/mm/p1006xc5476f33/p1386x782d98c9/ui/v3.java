package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p32.j f181236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h4 f181237e;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h4 h4Var, p32.j jVar) {
        this.f181237e = h4Var;
        this.f181236d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.h4 h4Var = this.f181237e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = h4Var.f181008a.f180855z;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = h4Var.f181008a;
        java.util.ArrayList<java.lang.String> arrayList = this.f181236d.f433012q;
        activityC13474xf9906714.f180841i = arrayList;
        activityC13474xf9906714.f180843n.m55084x5a92862f(arrayList);
    }
}
