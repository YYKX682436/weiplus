package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public class q2 implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157841b;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r2 r2Var, java.lang.String str, java.util.List list) {
        this.f157840a = str;
        this.f157841b = list;
    }

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        boolean z17 = !r6Var.m82467xfb82e301().endsWith(".nomedia");
        if (z17 && !r6Var.y()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.h2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.h(r6Var.o().replaceFirst(this.f157840a, "")));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11699xd802b610.m49606x16a9a8b7(r6Var.o(), h2Var);
            this.f157841b.add(h2Var);
        }
        return z17;
    }
}
