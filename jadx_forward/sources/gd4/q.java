package gd4;

/* loaded from: classes4.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f352340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 f352341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f352342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f352343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gd4.r f352344h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f352345i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f352346m;

    public q(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 b0Var, int i17, android.graphics.Rect rect, gd4.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18) {
        this.f352340d = h0Var;
        this.f352341e = b0Var;
        this.f352342f = i17;
        this.f352343g = rect;
        this.f352344h = rVar;
        this.f352345i = c17933xe8d1b226;
        this.f352346m = i18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        w64.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f352340d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) h0Var.f391656d;
        android.graphics.Rect rect = this.f352343g;
        int i17 = this.f352342f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 b0Var = this.f352341e;
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BreakFrameCardAdController.adClickArea", "clickView-onClick, clickActionInfo==null, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
            return;
        }
        b0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForbidClick", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForbidClick", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo");
        if (b0Var.f247470g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BreakFrameCardAdController.adClickArea", "clickView-onClick, forbidClick, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
            return;
        }
        gd4.r rVar = this.f352344h;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        yz5.a aVar = rVar.f352355g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (aVar == null || (nVar = (w64.n) aVar.mo152xb9724478()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BreakFrameCardAdController.adClickArea", "clickView-onClick, handler==null, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BreakFrameCardAdController.adClickArea", "clickView-onClick, idx=" + i17 + ", info=" + b0Var + ", rect=" + rect);
        java.lang.Object obj = h0Var.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) obj;
        if (c17702x544f64e92 != null) {
            c17702x544f64e92.f244102a = 9;
        }
        nVar.o((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) obj, this.f352345i, this.f352346m);
        nVar.k(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$3");
    }
}
