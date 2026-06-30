package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ph implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qa0 f200916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce2.i f200917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh f200918c;

    public ph(r45.qa0 qa0Var, ce2.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar) {
        this.f200916a = qa0Var;
        this.f200917b = iVar;
        this.f200918c = xhVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar = this.f200918c;
        if (i17 == 0 && fVar.f152149b == 0) {
            mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
            if (n2Var != null) {
                r45.qa0 customItem = this.f200916a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customItem, "customItem");
                r45.gg1 gg1Var = n2Var.f410817o;
                if (gg1Var != null && (m75941xfb8219142 = gg1Var.m75941xfb821914(0)) != null) {
                    pm0.v.d0(m75941xfb8219142, new mm2.m2(customItem));
                }
                r45.gg1 gg1Var2 = n2Var.f410817o;
                if (gg1Var2 != null && (m75941xfb821914 = gg1Var2.m75941xfb821914(0)) != null) {
                    m75941xfb821914.add(customItem);
                }
            }
            ce2.i iVar = this.f200917b;
            if (iVar != null) {
                dk2.u7 u7Var = dk2.u7.f315714a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", "addOrReplaceGift " + iVar);
                java.lang.String str = iVar.f67814x2c488eb6;
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    java.util.Map map = dk2.u7.f315718e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
                    map.put(str, iVar);
                    u7Var.l(iVar, str);
                }
            }
            xhVar.e();
            xhVar.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hh(xhVar), 300L);
            yz5.a aVar = xhVar.f201858h;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            xhVar.i();
        } else {
            int i18 = fVar.f152149b;
            if (i18 == -200189) {
                java.lang.String str2 = fVar.f152150c;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                db5.t7.g(xhVar.getContext(), z17 ? xhVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.de7) : fVar.f152150c);
            } else if (i18 == -200190) {
                java.lang.String str3 = fVar.f152150c;
                if (str3 != null && str3.length() != 0) {
                    z17 = false;
                }
                db5.t7.g(xhVar.getContext(), z17 ? xhVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.de6) : fVar.f152150c);
            } else {
                java.lang.String string = xhVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.de6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                db5.t7.g(xhVar.getContext(), string);
            }
        }
        return jz5.f0.f384359a;
    }
}
