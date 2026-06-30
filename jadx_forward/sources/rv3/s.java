package rv3;

/* loaded from: classes5.dex */
public class s extends rv3.e {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f481945m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f481946n;

    public s(yz5.p pVar) {
        super(pVar, null, false, false);
        this.f481945m = jz5.h.b(rv3.q.f481943d);
        this.f481946n = jz5.h.b(rv3.r.f481944d);
    }

    public static void x(rv3.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d, rv3.h hVar, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkScrollText");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            lVar = null;
        }
        sVar.getClass();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar.f481929e, rv3.y.f481952a);
        c17048x9295f61d.m68259x87ffe747(i17);
        if (b17) {
            c17048x9295f61d.post(new rv3.o(c17048x9295f61d, lVar, i17, sVar));
            return;
        }
        c17048x9295f61d.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        c17048x9295f61d.setMarqueeRepeatLimit(-1);
        c17048x9295f61d.d(false, -1);
    }

    @Override // rv3.e, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dhl;
    }

    @Override // rv3.e, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        holder.f3639x46306858.setBackground(com.p314xaae8f345.mm.ui.vk.f292702a.b(((java.lang.Number) ((jz5.n) this.f481945m).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) this.f481946n).mo141623x754a37bb()).intValue(), 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override // rv3.e, in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, rv3.h item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        cw3.i iVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567986q05);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.qg9);
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jyc);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567581k01);
        c22789xd23e9a9b.o(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20318xe9ce900a()) == 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567584k04);
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567570qg5);
        android.content.res.AssetManager assets = c22789xd23e9a9b.getContext().getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        c22789xd23e9a9b.k(assets, "ting_music_play_icon.pag");
        c22789xd23e9a9b.m82583xcde73672(-1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = item.f481928d;
        int i19 = c16997xb0aa383a.f237244e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        t(i19, findViewById, c22789xd23e9a9b, item.f481929e);
        rv3.n nVar = item instanceof rv3.n ? (rv3.n) item : null;
        if (nVar != null && (iVar = nVar.f481936i) != null) {
            if (iVar instanceof cw3.f) {
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerV2RecommendItemConvert", "setBehaviorStatusView", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2014x373aa5.C17091x497841c9 c17091x497841c9 = findViewById2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2014x373aa5.C17091x497841c9) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f567569qg4) : null;
            if (c17091x497841c9 != null) {
                c17091x497841c9.a(iVar);
            }
        }
        java.lang.String str3 = c16997xb0aa383a.f237258v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        s(str3, imageView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17048x9295f61d);
        java.util.ArrayList arrayList3 = c16997xb0aa383a.f237246g;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            if (c16997xb0aa383a.f237247h.isEmpty()) {
                str2 = c16997xb0aa383a.f237256t;
            } else {
                str2 = c16997xb0aa383a.f237256t + " - " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c16997xb0aa383a.f237247h, ",");
            }
            c17048x9295f61d.setText(str2);
        } else {
            java.util.ArrayList arrayList4 = c16997xb0aa383a.f237246g;
            wu3.w1 w1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d.f237589o;
            c17048x9295f61d.b(arrayList4, null);
        }
        x(this, c17048x9295f61d, item, 0, null, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17048x9295f61d2);
        if (c16997xb0aa383a.f237247h.isEmpty()) {
            str = c16997xb0aa383a.f237256t;
        } else {
            str = c16997xb0aa383a.f237256t + " - " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(c16997xb0aa383a.f237247h, ",");
        }
        u(c17048x9295f61d2, str);
        v(c17048x9295f61d2, c16997xb0aa383a.B);
        x(this, c17048x9295f61d2, item, 0, new rv3.p(c17048x9295f61d, c17048x9295f61d2), 4, null);
        rv3.e.n(this, findViewById, item.f481929e, null, 4, null);
        yz5.p pVar = this.f481917e;
        if (pVar != null) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            pVar.mo149xb9724478(itemView, item);
        }
    }
}
