package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5 f163885a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5 c12185x86bd78c5) {
        this.f163885a = c12185x86bd78c5;
    }

    public void a(java.lang.String username, java.util.List items, com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e c11157x9b46987e) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5 c12185x86bd78c5 = this.f163885a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea c12186x79c39fea = c12185x86bd78c5.f163843o;
        if (c12186x79c39fea != null) {
            java.util.List V0 = kz5.n0.V0(items);
            java.util.ArrayList arrayList = (java.util.ArrayList) c12186x79c39fea.f163849h;
            arrayList.clear();
            arrayList.addAll(V0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea c12186x79c39fea2 = c12185x86bd78c5.f163843o;
        if (c12186x79c39fea2 != null) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = c12185x86bd78c5.f163838g;
            c12186x79c39fea2.f163848g = c11158xe7d16ed5 != null ? c11158xe7d16ed5.f153325r : null;
        }
        if (c12186x79c39fea2 != null) {
            c12186x79c39fea2.f163846e = c11157x9b46987e;
        }
        c12185x86bd78c5.f163837f = 1;
        c12185x86bd78c5.b();
    }

    public void b(fl1.b2 dialog) {
        ze.n t37;
        fl1.g2 m48800x14ed3266;
        xi1.g mo50261xee5260a9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5 c12185x86bd78c5 = this.f163885a;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = c12185x86bd78c5.f163839h;
        boolean z17 = false;
        if (yVar != null && (mo50261xee5260a9 = yVar.mo50261xee5260a9()) != null && mo50261xee5260a9.mo51618xbcb3824d()) {
            z17 = true;
        }
        if (z17) {
            m31.p1 p1Var = dialog instanceof m31.p1 ? (m31.p1) dialog : null;
            if (p1Var != null) {
                p1Var.i(1);
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar2 = c12185x86bd78c5.f163839h;
        if (yVar2 == null || (t37 = yVar2.t3()) == null || (m48800x14ed3266 = t37.m48800x14ed3266()) == null) {
            return;
        }
        ((fl1.c0) m48800x14ed3266).c(dialog);
    }
}
