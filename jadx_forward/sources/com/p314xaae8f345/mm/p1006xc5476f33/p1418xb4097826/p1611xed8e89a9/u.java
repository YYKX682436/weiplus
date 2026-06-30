package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w f204944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f204945b;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar, boolean z17) {
        this.f204944a = wVar;
        this.f204945b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        boolean z17 = this.f204945b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w wVar = this.f204944a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[requestUserPoi] " + ((r45.e23) fVar.f152151d).m75941xfb821914(1).size());
            wVar.f205985i = ((r45.e23) fVar.f152151d).m75939xb282bd08(2);
            wVar.f205984h = ((r45.e23) fVar.f152151d).m75934xbce7f2f(3);
            if (z17) {
                java.util.LinkedList m75941xfb821914 = ((r45.e23) fVar.f152151d).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPoi_list(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.b0 b0Var2 = wVar.f205982f;
                if (b0Var2 != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = b0Var2.f204849g;
                    if (c22627xa933f8e4 != null) {
                        c22627xa933f8e4.e();
                    }
                    if (!m75941xfb821914.isEmpty()) {
                        java.util.LinkedList linkedList = b0Var2.f204850h;
                        linkedList.addAll(m75941xfb821914);
                        b0Var2.c(linkedList.size());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.z zVar = b0Var2.f204852m;
                        if (zVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                            throw null;
                        }
                        zVar.m8146xced61ae5();
                    }
                }
                wVar.f(wVar.f205985i != 0);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.w.h(this.f204944a, ((r45.e23) fVar.f152151d).m75941xfb821914(1), wVar.f205985i != 0, false, 4, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[requestUserPoi] errType=" + fVar.f152148a + " errCode=" + fVar.f152149b + " errMsg=" + fVar.f152150c);
        }
        if (z17 && (b0Var = wVar.f205982f) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = b0Var.f204847e;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.N(((r45.e23) fVar.f152151d).m75941xfb821914(1).size());
        }
        return jz5.f0.f384359a;
    }
}
