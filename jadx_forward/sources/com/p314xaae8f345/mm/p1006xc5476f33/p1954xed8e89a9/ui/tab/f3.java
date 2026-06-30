package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class f3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr3.b0 f235844d;

    public f3(vr3.b0 b0Var) {
        this.f235844d = b0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.mm mmVar;
        java.util.LinkedList linkedList;
        vr3.b0 b0Var = this.f235844d;
        if (b0Var == null || (mmVar = b0Var.f521156d) == null || (linkedList = mmVar.f462173i) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.f(i17, ((r45.mm) obj).f462170f);
            i17 = i18;
        }
    }
}
