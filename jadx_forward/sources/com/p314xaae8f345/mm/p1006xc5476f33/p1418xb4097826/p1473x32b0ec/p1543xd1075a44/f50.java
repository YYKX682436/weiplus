package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class f50 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f199846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f199847b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f199848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199849d;

    public f50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var, boolean z17, java.util.LinkedList linkedList, boolean z18) {
        this.f199846a = q50Var;
        this.f199847b = z17;
        this.f199848c = linkedList;
        this.f199849d = z18;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.Object obj;
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            java.util.LinkedList G2 = zl2.r4.f555483a.G2(list, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f199846a;
            r45.re2 re2Var = q50Var.f201037z1;
            re2Var.m75941xfb821914(3).clear();
            re2Var.m75941xfb821914(3).addAll(G2);
            boolean z17 = this.f199847b;
            java.util.LinkedList linkedList = this.f199848c;
            if (z17) {
                if (linkedList != null) {
                    pm0.v.d0(G2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c50(linkedList));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", "add file list = ".concat(kz5.n0.g0(G2, "|", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d50.f199591d, 30, null)));
            } else if (this.f199849d) {
                if (linkedList != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList) {
                        r45.il1 il1Var = (r45.il1) obj2;
                        java.util.Iterator it = G2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.il1) obj).m75945x2fec8307(0), il1Var.m75945x2fec8307(0))) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (!(obj != null)) {
                            arrayList.add(obj2);
                        }
                    }
                    G2 = new java.util.LinkedList(arrayList);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", "remove file list = ".concat(kz5.n0.g0(G2, "|", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e50.f199761d, 30, null)));
            }
            r45.re2 re2Var2 = q50Var.f201036y1;
            if (re2Var2 == null) {
                r45.re2 re2Var3 = new r45.re2();
                re2Var3.set(3, G2);
                q50Var.f201036y1 = re2Var3;
            } else if (re2Var2 != null) {
                re2Var2.set(3, G2);
            }
            q50Var.i0();
        }
    }
}
