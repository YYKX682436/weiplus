package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorFinderDetailWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget */
/* loaded from: classes2.dex */
public final class C14412x91d09c17 extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f199231p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199232d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f199233e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f199234f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f199235g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f199236h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f199237i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f199238m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f199239n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f199240o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14412x91d09c17(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199232d = "FinderLiveVisitorFinderDetailWidget";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ea9, this);
        this.f199233e = inflate;
        this.f199234f = inflate.findViewById(com.p314xaae8f345.mm.R.id.ucf);
        this.f199235g = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.vps);
        this.f199236h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fuv);
        this.f199237i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565966qj3);
        this.f199238m = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.e_c);
        this.f199239n = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564423qy);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f199240o = linkedList;
        linkedList.clear();
        linkedList.add(inflate.findViewById(com.p314xaae8f345.mm.R.id.h9p));
        linkedList.add(inflate.findViewById(com.p314xaae8f345.mm.R.id.h9q));
        linkedList.add(inflate.findViewById(com.p314xaae8f345.mm.R.id.h9r));
        linkedList.add(inflate.findViewById(com.p314xaae8f345.mm.R.id.h9s));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 c14412x91d09c17, r45.nw6 nw6Var, yz5.l lVar, yz5.a aVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec;
        c14412x91d09c17.getClass();
        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0)) == null) {
            c14412x91d09c17.setVisibility(8);
            aVar.mo152xb9724478();
            return;
        }
        android.view.View view = c14412x91d09c17.f199234f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorFinderDetailWidget", "showItemWidget", "(Lcom/tencent/mm/protocal/protobuf/UserPreviewInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorFinderDetailWidget", "showItemWidget", "(Lcom/tencent/mm/protocal/protobuf/UserPreviewInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c14412x91d09c17.f199235g.setVisibility(0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0);
        c14412x91d09c17.f199236h.setText(c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0);
        c14412x91d09c17.f199237i.setText((c19782x23db1cfa2 == null || (m76160xd133dfec = c19782x23db1cfa2.m76160xd133dfec()) == null) ? null : m76160xd133dfec.m76029xad9975ba());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        android.widget.ImageView finderAuthIcon = c14412x91d09c17.f199238m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderAuthIcon, "finderAuthIcon");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0);
        m1Var.c(finderAuthIcon, c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76160xd133dfec() : null, 1);
        java.util.List<android.widget.ImageView> list = c14412x91d09c17.f199240o;
        for (android.widget.ImageView imageView : list) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        int size = nw6Var.m75941xfb821914(2).size();
        android.widget.LinearLayout linearLayout = c14412x91d09c17.f199239n;
        if (size > 0) {
            linearLayout.setVisibility(0);
            for (int i17 = 0; i17 < size; i17++) {
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                if (i17 >= linkedList.size()) {
                    break;
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) linkedList.get(i17);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a.d(nw6Var.m75941xfb821914(2).get(i17), imageView2);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var.m75936x14adae67(0);
        lVar.mo146xb9724478(c19782x23db1cfa4 != null ? c19782x23db1cfa4.m76197x6c03c64c() : null);
    }
}
