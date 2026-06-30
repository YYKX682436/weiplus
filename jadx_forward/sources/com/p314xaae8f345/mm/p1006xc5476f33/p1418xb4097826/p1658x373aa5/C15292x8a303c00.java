package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHalfContactFinderItem;", "Landroid/widget/FrameLayout;", "", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "Ljz5/f0;", "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHalfContactFinderItem */
/* loaded from: classes2.dex */
public final class C15292x8a303c00 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f212650d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f212651e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nw6 f212652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15292x8a303c00(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212650d = "";
        this.f212651e = new java.util.LinkedList();
        a();
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((android.view.LayoutInflater) systemService).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570696bj0, (android.view.ViewGroup) this, true);
        java.util.List list = this.f212651e;
        list.clear();
        list.add(findViewById(com.p314xaae8f345.mm.R.id.h9p));
        list.add(findViewById(com.p314xaae8f345.mm.R.id.h9q));
        list.add(findViewById(com.p314xaae8f345.mm.R.id.h9r));
        list.add(findViewById(com.p314xaae8f345.mm.R.id.h9s));
    }

    public final void b(r45.nw6 nw6Var) {
        java.lang.String str;
        r45.so2 so2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        this.f212652f = nw6Var;
        c();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.e_c);
        r45.nw6 nw6Var2 = this.f212652f;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = null;
        textView.setText((nw6Var2 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76184x8010e5e4());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        r45.nw6 nw6Var3 = this.f212652f;
        if (nw6Var3 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) nw6Var3.m75936x14adae67(0)) != null) {
            c19780xceb4c4dc = c19782x23db1cfa.m76160xd133dfec();
        }
        m1Var.c(imageView, c19780xceb4c4dc, 1);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.rgl);
        r45.nw6 nw6Var4 = this.f212652f;
        if (nw6Var4 == null || (so2Var = (r45.so2) nw6Var4.m75936x14adae67(8)) == null || (str = so2Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (textView2 != null) {
            textView2.setVisibility(str.length() == 0 ? 8 : 0);
            textView2.setText(str);
        }
    }

    public final void c() {
        java.util.List<android.widget.ImageView> list = this.f212651e;
        for (android.widget.ImageView imageView : list) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        r45.nw6 nw6Var = this.f212652f;
        if (nw6Var != null) {
            int size = nw6Var.m75941xfb821914(2).size();
            for (int i17 = 0; i17 < size && i17 < ((java.util.LinkedList) list).size(); i17++) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.util.LinkedList) list).get(i17);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a.d(nw6Var.m75941xfb821914(2).get(i17), imageView2);
            }
        }
    }

    /* renamed from: setTitle */
    public final void m62093x53bfe316(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f212650d = title;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564453rt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f212650d)) {
            textView.setText("");
        } else {
            textView.setText(this.f212650d);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
            textView.setLayoutParams(layoutParams);
        }
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15292x8a303c00(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212650d = "";
        this.f212651e = new java.util.LinkedList();
        a();
    }
}
