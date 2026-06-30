package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class oa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb f214310a;

    public oa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb c15291x1a6f20cb) {
        this.f214310a = c15291x1a6f20cb;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb c15291x1a6f20cb = this.f214310a;
        c15291x1a6f20cb.f212647q = z17 ? c15291x1a6f20cb.f212649s : 1;
        e33.j2 j2Var = c15291x1a6f20cb.f212643m;
        if (j2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
        if (((e33.b0) j2Var).J() > c15291x1a6f20cb.f212647q) {
            e33.j2 j2Var2 = c15291x1a6f20cb.f212643m;
            if (j2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
                throw null;
            }
            ((e33.b0) j2Var2).f328664g.clear();
            java.lang.Object obj = c15291x1a6f20cb.f212643m;
            if (obj == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
                throw null;
            }
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) obj).m8146xced61ae5();
        }
        e33.j2 j2Var3 = c15291x1a6f20cb.f212643m;
        if (j2Var3 != null) {
            ((e33.b0) j2Var3).f328661d = c15291x1a6f20cb.f212647q;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
    }
}
