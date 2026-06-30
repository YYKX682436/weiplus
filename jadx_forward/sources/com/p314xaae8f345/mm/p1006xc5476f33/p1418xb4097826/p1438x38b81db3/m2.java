package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class m2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f185496e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s f185497f;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Parcelable f185499h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f185500i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f185498g = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f185501m = new java.util.LinkedHashSet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f185502n = new java.util.LinkedHashSet();

    public m2(int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar) {
        this.f185496e = i17;
        this.f185497f = sVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570329dc1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.s sVar;
        java.util.ArrayList arrayList;
        so2.l0 item = (so2.l0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.ArrayList arrayList2 = this.f185498g;
        if (arrayList2.isEmpty() && (sVar = this.f185497f) != null && (arrayList = sVar.f298200e) != null) {
            arrayList2.addAll(arrayList);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.lqa);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(holder.f374654e, 0, false));
        if (this.f185499h != null && (mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d()) != null) {
            mo7951xfd37656d.mo7939xb949e58d(this.f185499h);
        }
        c1163xf1deaba4.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.h2(this));
        c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l2(this));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.lqa)).mo7951xfd37656d();
        this.f185499h = mo7951xfd37656d != null ? mo7951xfd37656d.mo7940xa71a2260() : null;
    }

    public final void n() {
        java.util.ArrayList arrayList;
        java.util.Set set;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        int w17;
        int y17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f185500i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7951xfd37656d() : null;
        if (mo7951xfd37656d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderEmojiDesignerIPSetListConvert", "report 31502 fail, layoutManager is null");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if ((mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && (w17 = (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d).w()) <= (y17 = c1162x665295de.y())) {
            while (true) {
                arrayList2.add(java.lang.Integer.valueOf(w17));
                if (w17 == y17) {
                    break;
                } else {
                    w17++;
                }
            }
        }
        java.util.Set set2 = this.f185502n;
        set2.clear();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        int i17 = 0;
        while (true) {
            arrayList = this.f185498g;
            set = this.f185501m;
            if (i17 >= size) {
                break;
            }
            int intValue = ((java.lang.Number) arrayList2.get(i17)).intValue();
            if (intValue < arrayList.size() && intValue >= 0) {
                set2.add(java.lang.Integer.valueOf(intValue));
                if (!set.contains(java.lang.Integer.valueOf(intValue))) {
                    arrayList3.add(java.lang.Integer.valueOf(intValue));
                }
            }
            i17++;
        }
        set.clear();
        set.addAll(set2);
        if (arrayList3.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = arrayList.get(((java.lang.Number) it.next()).intValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            o((r45.vd0) obj, -1, "view_exp");
        }
    }

    public final void o(r45.vd0 ipSet, int i17, java.lang.String eventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ipSet, "ipSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "finder_homepage_emoji_image");
        hashMap.put("designer_uin", java.lang.Long.valueOf(this.f185496e & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
        java.lang.String str = ipSet.f469667d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getKey(...)");
        hashMap.put("emoji_image_id", str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eventId, "view_clk")) {
            hashMap.put("clk_index", java.lang.Integer.valueOf(i17));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj(eventId, this, hashMap, 10, false);
    }
}
