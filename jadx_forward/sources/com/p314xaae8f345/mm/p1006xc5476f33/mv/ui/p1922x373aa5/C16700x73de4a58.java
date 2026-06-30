package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabMyFavFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lcom/tencent/mm/modelbase/u0;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment */
/* loaded from: classes10.dex */
public final class C16700x73de4a58 extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 {

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f233261w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16700x73de4a58(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997
    public void c(dm.i8 i8Var, java.lang.String str) {
        this.music = i8Var;
        this.keyword = str;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gm0.j1.d().g(new hm3.l(xy2.c.e(context), this.f233261w));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997
    /* renamed from: getFeedFrom */
    public int mo67347x7063afde() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997
    /* renamed from: getType */
    public int mo67358xfb85f7b0() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        if (m1Var instanceof hm3.l) {
            boolean z17 = true;
            if (i17 == 0 && i18 == 0) {
                hm3.l lVar = (hm3.l) m1Var;
                r45.x51 x51Var = lVar.f363795n;
                this.f233261w = x51Var != null ? x51Var.m75934xbce7f2f(2) : null;
                r45.x51 x51Var2 = lVar.f363795n;
                if (x51Var2 != null) {
                    x51Var2.m75939xb282bd08(4);
                    java.util.Iterator it = x51Var2.m75941xfb821914(1).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
                        if (c19792x256d2725 != null) {
                            jm3.h1.f381855a.a(c19792x256d2725);
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                            if ((m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || c19788xd7cfd73e.m76613x7f025288() != 2) ? z17 : false) {
                                long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                                java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
                                if (!m67348x9c35b48d().contains(java.lang.Long.valueOf(m76784x5db1b11))) {
                                    m67345xe6796cde().add(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3(m76784x5db1b11, m76803x6c285d75, c19792x256d2725, false, 8, null)));
                                }
                            }
                            z17 = true;
                        }
                    }
                    m67343xf939df19().m8146xced61ae5();
                    r45.x51 x51Var3 = lVar.f363795n;
                    java.lang.Integer valueOf = x51Var3 != null ? java.lang.Integer.valueOf(x51Var3.m75939xb282bd08(3)) : null;
                    m67361xdac5ee4d(valueOf == null || valueOf.intValue() != 0);
                    yz5.a onSceneEndListener = getOnSceneEndListener();
                    if (onSceneEndListener != null) {
                        onSceneEndListener.mo152xb9724478();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvTabFragment", "onSceneEnd GetFinderFavFeed " + m67345xe6796cde().size() + ", hasMore:" + getHasMore());
                }
            }
            m67356x96811f7a().N(0);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p3 resultListener = getResultListener();
            if (resultListener != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h0) resultListener).a(2, m67343xf939df19().mo1894x7e414b06());
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf<com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3> m67343xf939df19 = m67343xf939df19();
            if (m67343xf939df19 != null && m67343xf939df19.mo1894x7e414b06() == 0) {
                android.widget.LinearLayout emptyLL = getEmptyLL();
                if (emptyLL != null) {
                    emptyLL.setVisibility(0);
                }
            } else {
                android.widget.LinearLayout emptyLL2 = getEmptyLL();
                if (emptyLL2 != null) {
                    emptyLL2.setVisibility(8);
                }
            }
            android.widget.TextView loadingTv = getLoadingTv();
            if (loadingTv == null) {
                return;
            }
            loadingTv.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16700x73de4a58(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        gm0.j1.d().a(3966, this);
    }
}
