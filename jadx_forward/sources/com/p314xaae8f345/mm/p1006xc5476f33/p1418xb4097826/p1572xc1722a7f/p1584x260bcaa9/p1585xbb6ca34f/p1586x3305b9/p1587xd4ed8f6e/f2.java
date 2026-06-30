package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class f2 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203199a;

    public f2(in5.s0 s0Var) {
        this.f203199a = s0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveTabJumpersListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        sp2.j jVar = sp2.j.f492587a;
        android.content.Context context = this.f203199a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        jVar.c(context, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        sp2.j jVar = sp2.j.f492587a;
        android.content.Context context = this.f203199a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, null, null, 12, null);
    }
}
