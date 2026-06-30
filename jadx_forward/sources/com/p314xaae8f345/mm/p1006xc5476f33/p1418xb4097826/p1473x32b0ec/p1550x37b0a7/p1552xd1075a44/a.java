package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public abstract class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f202214h;

    /* renamed from: i, reason: collision with root package name */
    public final zg2.d f202215i;

    /* renamed from: m, reason: collision with root package name */
    public qs5.s f202216m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, p012xc85e97e9.p093xedfae76a.y owner, boolean z17, boolean z18) {
        super(context, z18, null, z17, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        this.f202214h = owner;
        zg2.d dVar = new zg2.d(null, 1, null);
        this.f202215i = dVar;
        dVar.mo7806x9d92d11c(owner, this);
        this.f202216m = qs5.s.f447997d;
    }

    public zg2.d y() {
        zg2.d dVar = this.f202215i;
        if (!dVar.m7805x4365e2e3()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getViewData reobserve: ");
            p012xc85e97e9.p093xedfae76a.y yVar = this.f202214h;
            sb6.append(yVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseWishPanelWidget", sb6.toString());
            dVar.mo7806x9d92d11c(yVar, this);
        }
        return dVar;
    }

    public void z(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 giftPanelLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftPanelLayout, "giftPanelLayout");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar.d(giftPanelLayout);
        int childCount = giftPanelLayout.getChildCount();
        if (childCount == 1) {
            android.view.View childAt = giftPanelLayout.getChildAt(0);
            cVar.f(childAt.getId(), 1, 0, 1, 0);
            cVar.e(childAt.getId(), 2, 0, 2);
            cVar.l(childAt.getId(), 0);
        } else if (childCount == 2) {
            android.view.View childAt2 = giftPanelLayout.getChildAt(0);
            cVar.f(childAt2.getId(), 1, 0, 1, 0);
            cVar.e(childAt2.getId(), 2, giftPanelLayout.getChildAt(1).getId(), 1);
            cVar.l(childAt2.getId(), 2);
            android.view.View childAt3 = giftPanelLayout.getChildAt(1);
            cVar.f(childAt3.getId(), 1, giftPanelLayout.getChildAt(0).getId(), 2, (int) childAt3.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
            cVar.e(childAt3.getId(), 2, 0, 2);
            cVar.l(childAt3.getId(), 0);
        } else if (childCount == 3) {
            android.view.View childAt4 = giftPanelLayout.getChildAt(0);
            cVar.f(childAt4.getId(), 1, 0, 1, 0);
            cVar.e(childAt4.getId(), 2, giftPanelLayout.getChildAt(1).getId(), 1);
            cVar.l(childAt4.getId(), 1);
            android.view.View childAt5 = giftPanelLayout.getChildAt(1);
            cVar.f(childAt5.getId(), 1, giftPanelLayout.getChildAt(0).getId(), 2, 0);
            cVar.e(childAt5.getId(), 2, giftPanelLayout.getChildAt(2).getId(), 1);
            cVar.l(childAt5.getId(), 0);
            android.view.View childAt6 = giftPanelLayout.getChildAt(2);
            cVar.f(childAt6.getId(), 1, giftPanelLayout.getChildAt(1).getId(), 2, 0);
            cVar.e(childAt6.getId(), 2, 0, 2);
            cVar.l(childAt6.getId(), 0);
        }
        cVar.b(giftPanelLayout);
        giftPanelLayout.m7179xd020a803(null);
    }

    public /* synthetic */ a(android.content.Context context, p012xc85e97e9.p093xedfae76a.y yVar, boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, yVar, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18);
    }
}
