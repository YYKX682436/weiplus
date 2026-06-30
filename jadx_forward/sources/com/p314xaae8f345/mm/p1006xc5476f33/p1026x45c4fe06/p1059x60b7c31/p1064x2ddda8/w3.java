package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class w3 implements fl1.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.z f161302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p f161303b;

    public w3(ui1.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p pVar) {
        this.f161302a = zVar;
        this.f161303b = pVar;
    }

    @Override // fl1.j1
    public void a(android.view.View v17, fl1.h1 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.MotionEvent mo2022x28e740ce = this.f161302a.mo2022x28e740ce();
        int b17 = mo2022x28e740ce != null ? a06.d.b(mo2022x28e740ce.getRawX()) : 0;
        int b18 = mo2022x28e740ce != null ? a06.d.b(mo2022x28e740ce.getRawY()) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.p pVar = this.f161303b;
        if (pVar != null) {
            pVar.b(v17, i17, b17, b18);
        }
    }
}
