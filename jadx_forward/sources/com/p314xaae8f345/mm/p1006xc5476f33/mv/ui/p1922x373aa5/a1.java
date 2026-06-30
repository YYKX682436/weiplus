package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class a1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a f233307d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a) {
        this.f233307d = c16687xe732929a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        java.util.HashSet<gm3.c> hashSet = (java.util.HashSet) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "collect selectedItemFlow " + hashSet.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (gm3.c cVar : hashSet) {
            int i17 = cVar.f355077e;
            if (i17 != 1) {
                if (i17 == 2) {
                    gm3.b bVar = cVar.f355081i;
                    if (bVar != null && (c19792x256d2725 = bVar.f355075b) != null) {
                        arrayList.add(new java.lang.Long(c19792x256d2725.m76784x5db1b11()));
                    }
                } else if (i17 != 3) {
                }
            }
            gm3.a aVar = cVar.f355080h;
            if (aVar != null) {
                arrayList.add(new java.lang.Long(aVar.f355068a));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = this.f233307d;
        km3.t tVar = c16687xe732929a.f233154f;
        if (tVar != null) {
            java.util.Iterator it = tVar.f390794e.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) next;
                boolean z17 = abstractC15633xee433078.f219975t;
                boolean contains = arrayList.contains(java.lang.Long.valueOf(abstractC15633xee433078.f219967i));
                java.util.LinkedList linkedList = tVar.f390798i;
                if (contains) {
                    if (!z17) {
                        abstractC15633xee433078.f219975t = true;
                        tVar.m8147xed6e4d18(i18 + linkedList.size());
                    }
                } else if (z17) {
                    abstractC15633xee433078.f219975t = false;
                    tVar.m8147xed6e4d18(i18 + linkedList.size());
                }
                i18 = i19;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16699x54869e90 c16699x54869e90 = c16687xe732929a.f233171w;
        if (c16699x54869e90 != null) {
            c16699x54869e90.b(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3 = c16687xe732929a.f233172x;
        if (c16702xded4f4e3 != null) {
            c16702xded4f4e3.b(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16700x73de4a58 c16700x73de4a58 = c16687xe732929a.f233175y;
        if (c16700x73de4a58 != null) {
            c16700x73de4a58.b(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16701xf06424da c16701xf06424da = c16687xe732929a.f233178z;
        if (c16701xf06424da != null) {
            c16701xf06424da.b(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
