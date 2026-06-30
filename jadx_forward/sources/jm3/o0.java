package jm3;

/* loaded from: classes10.dex */
public final class o0 implements gm3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381873a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a) {
        this.f381873a = activityC16653xffd2636a;
    }

    @Override // gm3.f
    public void a(int i17, gm3.c item) {
        long j17;
        java.lang.Long l17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnDelBtnClicked, pos:");
        sb6.append(i17);
        sb6.append(", type:");
        int i18 = item.f355077e;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerUI", sb6.toString());
        if (i18 == 1 || i18 == 3) {
            gm3.a aVar = item.f355080h;
            if (aVar != null) {
                j17 = aVar.f355068a;
                l17 = java.lang.Long.valueOf(j17);
            }
            l17 = null;
        } else {
            gm3.b bVar = item.f355081i;
            if (bVar != null && (c19792x256d2725 = bVar.f355075b) != null) {
                j17 = c19792x256d2725.m76784x5db1b11();
                l17 = java.lang.Long.valueOf(j17);
            }
            l17 = null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = fm3.g0.f345603a.c();
        c17.f141015k = 13L;
        c17.H = 1;
        int i19 = fm3.g0.f345605c;
        c17.f141029y = i19;
        if (i19 != 1 && i19 != 2) {
            c17.f141026v = i17;
        }
        c17.k();
        c17.o();
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a Z6 = this.f381873a.Z6();
        if (Z6 != null) {
            if (l17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "invalid parameters, type:" + i18 + ", uniqueId:" + l17);
                return;
            }
            if (i18 != 1) {
                if (i18 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16699x54869e90 c16699x54869e90 = Z6.f233171w;
                    if (c16699x54869e90 != null) {
                        c16699x54869e90.d(l17.longValue());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3 = Z6.f233172x;
                    if (c16702xded4f4e3 != null) {
                        c16702xded4f4e3.d(l17.longValue());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16700x73de4a58 c16700x73de4a58 = Z6.f233175y;
                    if (c16700x73de4a58 != null) {
                        c16700x73de4a58.d(l17.longValue());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16701xf06424da c16701xf06424da = Z6.f233178z;
                    if (c16701xf06424da != null) {
                        c16701xf06424da.d(l17.longValue());
                        return;
                    }
                    return;
                }
                if (i18 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "error logic.type:" + i18 + ", uniqueId:" + l17);
                    return;
                }
            }
            km3.t tVar = Z6.f233154f;
            if (tVar != null) {
                long longValue = l17.longValue();
                java.util.Iterator it = tVar.f390794e.iterator();
                int i28 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) next;
                    if (abstractC15633xee433078.f219967i == longValue) {
                        abstractC15633xee433078.f219975t = false;
                        tVar.m8147xed6e4d18(i28 + tVar.f390798i.size());
                    }
                    i28 = i29;
                }
            }
        }
    }
}
