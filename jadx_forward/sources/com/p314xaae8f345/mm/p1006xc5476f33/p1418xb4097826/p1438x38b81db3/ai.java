package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ai implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.a f184420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184421e;

    public ai(fc2.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar) {
        this.f184420d = aVar;
        this.f184421e = ojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = ((fc2.v) this.f184420d).f342531e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184421e;
        if (i17 == ojVar.f185729u || ojVar.f185731w) {
            return;
        }
        ojVar.C();
        ojVar.f185731w = true;
    }
}
