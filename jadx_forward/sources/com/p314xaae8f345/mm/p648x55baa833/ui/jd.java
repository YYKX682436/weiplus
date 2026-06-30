package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes12.dex */
public class jd implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.kd f145793d;

    public jd(com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar) {
        this.f145793d = kdVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((com.p314xaae8f345.mm.p648x55baa833.ui.bd) obj).f145592a;
        com.p314xaae8f345.mm.p648x55baa833.ui.kd kdVar = this.f145793d;
        return x51.k.a(kdVar.a(z3Var)).compareToIgnoreCase(x51.k.a(kdVar.a(((com.p314xaae8f345.mm.p648x55baa833.ui.bd) obj2).f145592a)));
    }
}
