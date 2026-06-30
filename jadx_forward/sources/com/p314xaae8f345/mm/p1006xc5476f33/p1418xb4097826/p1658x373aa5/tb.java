package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class tb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234 f214654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f214655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f214656f;

    public tb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234 c15299xde732234, int i17, boolean z17) {
        this.f214654d = c15299xde732234;
        this.f214655e = i17;
        this.f214656f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sb sbVar = this.f214654d.pageChangeListener;
        if (sbVar != null) {
            sbVar.a(this.f214655e, true, this.f214656f);
        }
    }
}
