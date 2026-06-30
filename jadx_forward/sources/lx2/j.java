package lx2;

/* loaded from: classes2.dex */
public final class j extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final r45.f03 f403602k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f403603l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f403604m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f403605n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f403606o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f403607p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 tipsLayout, r45.f03 f03Var) {
        super(tipsLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsLayout, "tipsLayout");
        this.f403602k = f03Var;
        this.f403603l = "personal_center_bubble";
        this.f403604m = "TLPersonalCenter";
        this.f403605n = "PersonalTipsBubbleViewHelper";
        this.f403606o = jz5.h.b(new lx2.h(this));
        this.f403607p = jz5.h.b(lx2.i.f403601d);
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((jz5.n) this.f403587e).mo141623x754a37bb()).V6();
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f403604m;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f403603l;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f403605n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    @Override // lx2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.j.h():void");
    }

    @Override // lx2.d
    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrow, "arrow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrowParams, "arrowParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsParams, "tipsParams");
        arrowParams.rightMargin = (int) this.f403585c.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.afe);
        arrowParams.gravity = 8388613;
        tipsParams.gravity = 8388661;
        tipsParams.rightMargin = (int) this.f403584b.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561162b4);
        super.i(arrow, arrowParams, tipsParams);
    }

    @Override // lx2.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jb j(r45.px2 px2Var, java.lang.ref.WeakReference weakReference) {
        java.lang.String str;
        r45.f03 f03Var;
        r45.f03 f03Var2;
        r45.ya0 ya0Var;
        r45.fz2 fz2Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209418pg).mo141623x754a37bb()).r()).booleanValue();
        if (booleanValue && px2Var != null && (f03Var2 = (r45.f03) px2Var.m75936x14adae67(1)) != null && (ya0Var = f03Var2.B) != null && (fz2Var = ya0Var.f472451d) != null && (linkedList = fz2Var.f456274d) != null) {
            java.util.ArrayList<r45.cp5> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                int i17 = ((r45.cp5) obj).f453301d;
                if (i17 == 1 || i17 == 2) {
                    arrayList.add(obj);
                }
            }
            for (r45.cp5 cp5Var : arrayList) {
                r45.yo5 yo5Var = cp5Var.f453303f;
                if (yo5Var == null) {
                    yo5Var = new r45.yo5();
                    cp5Var.f453303f = yo5Var;
                }
                r45.t60 t60Var = yo5Var.f472794d;
                if (t60Var == null) {
                    t60Var = new r45.t60();
                    yo5Var.f472794d = t60Var;
                }
                r45.zo5 zo5Var = new r45.zo5();
                zo5Var.f473786d = "#FFFFFFFF";
                t60Var.f467700e = zo5Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jb j17 = super.j(px2Var, weakReference);
        if (!booleanValue) {
            return j17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1 = this.f403583a;
        android.view.View findViewById = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.oa8);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.f565669d52);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.ovk);
        java.util.Iterator it = kz5.c0.i(findViewById, frameLayout).iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d4r);
        }
        c22699x3dcdb352.m82040x7541828(this.f403584b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560026e));
        if (j17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jb.f213966e) {
            frameLayout.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return j17;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/helper/PersonalTipsBubbleViewHelper", "renderBubble", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Ljava/lang/ref/WeakReference;)Lcom/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView$RenderType;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        frameLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.geh);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.oag);
        android.widget.ImageView imageView = (android.widget.ImageView) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.gex);
        android.widget.ImageView imageView2 = (android.widget.ImageView) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.gey);
        android.widget.ImageView imageView3 = (android.widget.ImageView) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.gez);
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        c22699x3dcdb3522.setVisibility(8);
        linearLayout.setBackground(null);
        android.widget.TextView textView = (android.widget.TextView) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5);
        if (px2Var == null || (f03Var = (r45.f03) px2Var.m75936x14adae67(1)) == null || (str = f03Var.f455422f) == null) {
            str = "";
        }
        textView.setText(str);
        textView.setTextColor(-1);
        return j17;
    }
}
