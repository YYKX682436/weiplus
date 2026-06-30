package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class a50 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 f199260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f199261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.re2 f199262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f199263d;

    public a50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var, boolean z17, r45.re2 re2Var, boolean z18) {
        this.f199260a = q50Var;
        this.f199261b = z17;
        this.f199262c = re2Var;
        this.f199263d = z18;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("label_id")) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q50 q50Var = this.f199260a;
        r45.re2 re2Var = q50Var.f201037z1;
        re2Var.m75941xfb821914(4).clear();
        re2Var.m75941xfb821914(4).addAll(stringArrayListExtra);
        java.util.List V0 = kz5.n0.V0(stringArrayListExtra);
        boolean z17 = this.f199261b;
        r45.re2 re2Var2 = this.f199262c;
        if (z17) {
            if (re2Var2 != null) {
                pm0.v.c0(V0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z40(re2Var2));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", "select more labels result: " + kz5.n0.g0(V0, "|", null, null, 0, null, null, 62, null) + " resultCode: " + i17);
        } else if (this.f199263d) {
            if (re2Var2 != null) {
                java.util.LinkedList m75941xfb8219143 = re2Var2.m75941xfb821914(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getLabel_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : m75941xfb8219143) {
                    if (!stringArrayListExtra.contains((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
                V0 = kz5.n0.V0(arrayList);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivingWhiteListPanel", "unselect more labels result: " + kz5.n0.g0(V0, "|", null, null, 0, null, null, 62, null) + " resultCode: " + i17);
        }
        if (q50Var.f201036y1 == null) {
            q50Var.f201036y1 = new r45.re2();
        }
        r45.re2 re2Var3 = q50Var.f201036y1;
        if (re2Var3 != null && (m75941xfb8219142 = re2Var3.m75941xfb821914(4)) != null) {
            m75941xfb8219142.clear();
        }
        r45.re2 re2Var4 = q50Var.f201036y1;
        if (re2Var4 != null && (m75941xfb821914 = re2Var4.m75941xfb821914(4)) != null) {
            m75941xfb821914.addAll(V0);
        }
        q50Var.i0();
    }
}
