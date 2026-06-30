package sf2;

/* loaded from: classes3.dex */
public final class e0 extends if2.b implements if2.e, te2.l0 {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 f488644m;

    /* renamed from: n, reason: collision with root package name */
    public bm2.a0 f488645n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f488646o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f488647p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f488648q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f488646o = kz5.c1.l(new jz5.l(r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic, null), new jz5.l(r45.xg7.emFinderLiveGetMusicTabListType_Recommend, null), new jz5.l(r45.xg7.emFinderLiveGetMusicTabListType_Like, null));
        this.f488648q = "";
    }

    @Override // te2.l0
    public boolean D2(int i17, r45.xg7 xg7Var) {
        dk2.p Z6 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6();
        if (xg7Var != null) {
            java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) Z6.f315415k).get(xg7Var);
            int intValue = num != null ? num.intValue() : 0;
            java.util.List list = (java.util.List) Z6.f315417m.get(xg7Var);
            int size = list != null ? list.size() : 0;
            if (i17 > size - 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "load more type " + xg7Var + ", music list size " + size);
                if (intValue > 0) {
                    return true;
                }
            }
        } else if (Z6.f315414j > 0 && i17 >= Z6.f315411g.size() - 1) {
            return true;
        }
        return false;
    }

    public final void Z6() {
        java.util.List list;
        dk2.p Z6 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6();
        Z6.f315411g.clear();
        Z6.f315412h = "";
        bm2.a0 a0Var = this.f488645n;
        if (a0Var != null && (list = a0Var.f103282f) != null) {
            ((java.util.ArrayList) list).clear();
        }
        bm2.a0 a0Var2 = this.f488645n;
        if (a0Var2 != null) {
            a0Var2.m8146xced61ae5();
        }
    }

    public final void a7(r45.xg7 type, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        new ek2.f1(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410518o, xy2.c.e(O6()), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m, type, (com.p314xaae8f345.mm.p2495xc50a8b8b.g) ((java.util.LinkedHashMap) ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6().f315416l).get(type), new sf2.z(this, type, lVar)).l().f(N6());
    }

    public final void b7() {
        android.widget.TextView textView;
        java.util.ArrayList searchData = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6().f315411g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var = this.f488644m;
        if (i8Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchData, "searchData");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var = i8Var.N;
            if (r7Var != null && (textView = r7Var.f201118f) != null) {
                int i17 = searchData.isEmpty() ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "showSearchEmptyResultView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "showSearchEmptyResultView", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(textView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqo));
            }
        }
        if (searchData.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "updateSearchView, searchData:" + searchData);
        }
        bm2.a0 a0Var = this.f488645n;
        if (a0Var != null) {
            a0Var.B(searchData, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6().f315414j != 0);
            a0Var.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        Z6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Y4) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
            android.view.View findViewById = N6 != null ? N6.findViewById(com.p314xaae8f345.mm.R.id.emb) : null;
            if (findViewById != null) {
                findViewById.setElevation(O6().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562079a43));
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = N6();
        this.f488644m = N62 != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8(O6(), N62, this) : null;
        java.util.Map map = this.f488646o;
        r45.xg7 xg7Var = r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic;
        map.put(xg7Var, new bm2.a0(O6(), this, xg7Var));
        r45.xg7 xg7Var2 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend;
        map.put(xg7Var2, new bm2.a0(O6(), this, xg7Var2));
        r45.xg7 xg7Var3 = r45.xg7.emFinderLiveGetMusicTabListType_Like;
        map.put(xg7Var3, new bm2.a0(O6(), this, xg7Var3));
        this.f488645n = new bm2.a0(O6(), this, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSearchMusicController", "onViewUnmount");
        java.util.Iterator it = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6().f315417m.entrySet().iterator();
        while (it.hasNext()) {
            ((java.util.List) ((java.util.Map.Entry) it.next()).getValue()).clear();
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f488646o).entrySet()) {
            bm2.a0 a0Var = (bm2.a0) entry.getValue();
            if (a0Var != null && (list = a0Var.f103282f) != null) {
                ((java.util.ArrayList) list).clear();
            }
            bm2.a0 a0Var2 = (bm2.a0) entry.getValue();
            if (a0Var2 != null) {
                a0Var2.m8146xced61ae5();
            }
        }
        this.f488644m = null;
    }

    @Override // te2.l0
    public void u5(boolean z17, r45.xg7 xg7Var, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        dk2.p Z6 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).Z6();
        if (xg7Var != null) {
            Z6.f315415k.put(xg7Var, 0);
            a7(xg7Var, callback);
            return;
        }
        if (Z6.f315412h.length() == 0) {
            callback.mo146xb9724478(0);
        } else {
            Z6.f315414j = 0;
            new ek2.k2(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410518o, xy2.c.e(O6()), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m, Z6.f315412h, Z6.f315413i, new sf2.b0(Z6, callback)).l().f(N6());
        }
    }
}
