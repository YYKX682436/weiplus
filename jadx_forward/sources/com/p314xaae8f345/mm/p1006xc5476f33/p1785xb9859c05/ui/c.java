package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s83.c f224297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e f224298e;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e eVar, s83.c cVar) {
        this.f224298e = eVar;
        this.f224297d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e eVar = this.f224298e;
        s83.c cVar = this.f224297d;
        if (cVar == null || cVar.f72763xa3c65b86 == -1) {
            eVar.f224320d.f224486e.setText("");
        } else {
            eVar.f224320d.f224486e.setText(cVar.f67829x5c31173f);
        }
    }
}
