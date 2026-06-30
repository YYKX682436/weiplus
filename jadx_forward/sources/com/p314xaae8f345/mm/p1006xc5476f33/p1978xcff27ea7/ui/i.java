package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vs3.a f236723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.j f236724e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.j jVar, vs3.a aVar) {
        this.f236724e = jVar;
        this.f236723d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.j jVar = this.f236724e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab = jVar.f236726a.f236733i;
        vs3.a aVar = this.f236723d;
        viewOnFocusChangeListenerC16958xba487cab.f236630u = aVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b)) {
            jVar.f236726a.f236733i.f236618f.setText("");
            jVar.f236726a.f236733i.f236618f.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab viewOnFocusChangeListenerC16958xba487cab2 = jVar.f236726a.f236733i;
            viewOnFocusChangeListenerC16958xba487cab2.f236618f.setText(viewOnFocusChangeListenerC16958xba487cab2.f236630u.f521409b);
            jVar.f236726a.f236733i.f236618f.setVisibility(0);
        }
        jVar.f236726a.f236733i.f236619g.dismissDropDown();
    }
}
