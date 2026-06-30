package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168411e;

    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        this.f168411e = v5Var;
        this.f168410d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        al1.l lVar = this.f168411e.G;
        if (lVar == null) {
            return;
        }
        lVar.m2243xf1b0d7af(al1.j0.a(this.f168410d) == al1.j0.BLACK);
    }
}
