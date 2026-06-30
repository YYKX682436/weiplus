package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205265d;

    public g8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar) {
        this.f205265d = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205265d;
        obVar.c7().setVisibility(8);
        if (!obVar.A7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.E2).mo141623x754a37bb()).r()).intValue() != 1) {
                if (obVar.m58704xd2e07a89()) {
                    obVar.c7().setVisibility(0);
                    obVar.c7().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f8(obVar));
                }
                android.widget.TableLayout finderProfileNameContainer = obVar.h7().T;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileNameContainer, "finderProfileNameContainer");
            }
        }
        obVar.c7().setVisibility(8);
        android.widget.TableLayout finderProfileNameContainer2 = obVar.h7().T;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderProfileNameContainer2, "finderProfileNameContainer");
    }
}
