package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        super(1);
        this.f202217d = t0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.kv1 kv1Var;
        java.lang.String m75945x2fec8307;
        r45.kv1 kv1Var2;
        java.lang.String str2;
        java.lang.String str3;
        r45.kv1 kv1Var3;
        r45.kv1 kv1Var4;
        ln2.f fVar = (ln2.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202217d;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = t0Var.A;
        if (c1073x7e08a787 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        int childCount = c1073x7e08a787.getChildCount();
        java.util.LinkedHashMap linkedHashMap = t0Var.f202318v;
        java.util.LinkedHashMap linkedHashMap2 = t0Var.f202319w;
        java.lang.String str4 = "NULL_ITEM";
        if (childCount != 3 || linkedHashMap2.containsKey("NULL_ITEM")) {
            if (fVar == null || (kv1Var2 = fVar.f401423a) == null || (str = kv1Var2.m75945x2fec8307(0)) == null) {
                str = "NULL_ITEM";
            }
            ln2.f fVar2 = (ln2.f) linkedHashMap.remove(str);
            if (fVar2 != null && (kv1Var = fVar2.f401423a) != null && (m75945x2fec8307 = kv1Var.m75945x2fec8307(0)) != null) {
                str4 = m75945x2fec8307;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y) linkedHashMap2.remove(str4);
            if (yVar != null) {
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = t0Var.A;
                if (c1073x7e08a7872 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                    throw null;
                }
                android.view.View rootView = yVar.f202346e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "rootView");
                c1073x7e08a7872.removeView(rootView);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add view size = MAX: ");
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = t0Var.A;
            if (c1073x7e08a7873 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw null;
            }
            sb6.append(c1073x7e08a7873.getChildCount());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", sb6.toString());
            if (fVar == null || (kv1Var4 = fVar.f401423a) == null || (str2 = kv1Var4.m75945x2fec8307(0)) == null) {
                str2 = "NULL_ITEM";
            }
            linkedHashMap.remove(str2);
            if (fVar == null || (kv1Var3 = fVar.f401423a) == null || (str3 = kv1Var3.m75945x2fec8307(0)) == null) {
                str3 = "NULL_ITEM";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y yVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y) linkedHashMap2.remove(str3);
            if (yVar2 != null) {
                linkedHashMap.put("NULL_ITEM", null);
                yVar2.a(null);
                linkedHashMap2.put("NULL_ITEM", yVar2);
            }
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = t0Var.A;
        if (c1073x7e08a7874 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
            throw null;
        }
        c1073x7e08a7874.removeAllViews();
        for (java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = t0Var.A;
            if (c1073x7e08a7875 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftPanelLayout");
                throw null;
            }
            android.view.View rootView2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.y) entry.getValue()).f202346e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView2, "rootView");
            c1073x7e08a7875.addView(rootView2);
        }
        t0Var.I();
        t0Var.B();
        return jz5.f0.f384359a;
    }
}
