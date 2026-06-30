package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class b3 implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157681b;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c3 c3Var, java.lang.String str, java.util.List list) {
        this.f157680a = str;
        this.f157681b = list;
    }

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        boolean z17 = !r6Var.m82467xfb82e301().endsWith(".nomedia");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h1();
            h1Var.f157726a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.h(r6Var.o().replaceFirst(this.f157680a, ""));
            this.f157681b.add(h1Var);
        }
        return z17;
    }
}
