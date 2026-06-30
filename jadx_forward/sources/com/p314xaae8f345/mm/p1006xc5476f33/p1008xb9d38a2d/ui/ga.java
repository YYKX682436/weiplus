package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes8.dex */
public class ga implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155415d;

    public ga(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar, java.util.List list) {
        this.f155415d = list;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            java.util.Iterator it = this.f155415d.iterator();
            while (it.hasNext()) {
                g4Var.v((db5.h4) it.next());
            }
        }
    }
}
