package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;", "Landroid/widget/RelativeLayout;", "", "curGiftId", "Ljz5/f0;", "setNormalContent", "setBatchContent", "desc", "setUnLockContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView */
/* loaded from: classes3.dex */
public final class C14321x140d228b extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f197471d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f197472e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f197473f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f197474g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f197475h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f197476i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f197477m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f197478n;

    /* renamed from: o, reason: collision with root package name */
    public int f197479o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f197480p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14321x140d228b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197471d = "FinderLiveGiftPreviewView@" + hashCode();
        this.f197480p = "";
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.asc, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f197472e = inflate;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f3p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        this.f197473f = c22789xd23e9a9b;
        c22789xd23e9a9b.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o5(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f197475h = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f3q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f197474g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f0m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f197476i = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.kye);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f197477m = (android.widget.TextView) findViewById5;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b c14321x140d228b, ce2.i iVar) {
        r45.na0 D0;
        r45.xi6 xi6Var;
        c14321x140d228b.f197472e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a3s);
        java.lang.String string = c14321x140d228b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.djc);
        android.widget.TextView textView = c14321x140d228b.f197474g;
        textView.setText(string);
        textView.setTextSize(1, 14.0f);
        boolean z17 = iVar != null && iVar.a1();
        android.widget.TextView textView2 = c14321x140d228b.f197477m;
        if (z17) {
            if ((iVar == null || (xi6Var = iVar.f67816xdcd1d904) == null || !xi6Var.m75933x41a8a7f2(4)) ? false : true) {
                c14321x140d228b.b(40, 40, 8);
                android.view.View view = c14321x140d228b.f197476i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.yi6 Q0 = iVar.Q0();
                textView2.setText(java.lang.String.valueOf((int) (Q0 != null ? Q0.m75938x746dc8a6(5) : 0.0f)));
                return;
            }
        }
        if (!((iVar == null || (D0 = iVar.D0()) == null || !D0.m75933x41a8a7f2(10)) ? false : true)) {
            android.view.View view2 = c14321x140d228b.f197476i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        c14321x140d228b.b(40, 40, 8);
        android.view.View view3 = c14321x140d228b.f197476i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView", "setNormalContent$setStandardGiftContent", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftPreviewView;Lcom/tencent/mm/plugin/finder/live/api/storage/model/FinderLiveGiftInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setText(java.lang.String.valueOf((int) iVar.P0()));
    }

    /* renamed from: setBatchContent */
    private final void m57341xcb0ccd61(java.lang.String str) {
        b(64, 64, 0);
        this.f197475h.setVisibility(8);
        ce2.i e17 = dk2.u7.f315714a.e(str);
        if (e17 != null) {
            this.f197472e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a3r);
            java.lang.String string = e17.z0().size() == 0 ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dj_) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.djb);
            android.widget.TextView textView = this.f197474g;
            textView.setText(string);
            textView.setTextSize(1, 10.0f);
            setClickable(false);
            setEnabled(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r1 != 2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* renamed from: setNormalContent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m57342x10833050(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 64
            r1 = 0
            r9.b(r0, r0, r1)
            android.widget.TextView r0 = r9.f197475h
            r2 = 8
            r0.setVisibility(r2)
            dk2.u7 r0 = dk2.u7.f315714a
            ce2.i r10 = r0.e(r10)
            r0 = 1
            r9.setClickable(r0)
            r9.setEnabled(r0)
            if (r10 != 0) goto L20
            a(r9, r10)
            return
        L20:
            int r2 = r10.f67799x225ba391
            r3 = 8192(0x2000, float:1.148E-41)
            boolean r2 = pm0.v.z(r2, r3)
            java.lang.Class<mm2.n2> r3 = mm2.n2.class
            if (r2 == 0) goto L41
            dk2.ef r2 = dk2.ef.f314905a
            androidx.lifecycle.c1 r2 = r2.i(r3)
            mm2.n2 r2 = (mm2.n2) r2
            if (r2 == 0) goto L3c
            boolean r2 = r2.f410814i
            if (r2 != 0) goto L3c
            r2 = r0
            goto L3d
        L3c:
            r2 = r1
        L3d:
            if (r2 == 0) goto L41
            r2 = r0
            goto L42
        L41:
            r2 = r1
        L42:
            r4 = 1094713344(0x41400000, float:12.0)
            r5 = 2131763559(0x7f102167, float:1.9158227E38)
            r6 = 2131233164(0x7f08098c, float:1.8082458E38)
            android.view.View r7 = r9.f197472e
            android.widget.TextView r8 = r9.f197474g
            if (r2 == 0) goto L62
            r7.setBackgroundResource(r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r10 = r10.getString(r5)
            r8.setText(r10)
            r8.setTextSize(r0, r4)
            return
        L62:
            boolean r2 = r10.W0()
            if (r2 == 0) goto L7d
            dk2.ef r2 = dk2.ef.f314905a
            androidx.lifecycle.c1 r2 = r2.i(r3)
            mm2.n2 r2 = (mm2.n2) r2
            if (r2 == 0) goto L78
            boolean r2 = r2.f410811f
            if (r2 != 0) goto L78
            r2 = r0
            goto L79
        L78:
            r2 = r1
        L79:
            if (r2 == 0) goto L7d
            r2 = r0
            goto L7e
        L7d:
            r2 = r1
        L7e:
            if (r2 == 0) goto L92
            r7.setBackgroundResource(r6)
            android.content.Context r10 = r9.getContext()
            java.lang.String r10 = r10.getString(r5)
            r8.setText(r10)
            r8.setTextSize(r0, r4)
            return
        L92:
            boolean r2 = r10.T0()
            if (r2 == 0) goto Ld9
            r45.mb r2 = r10.v0()
            if (r2 == 0) goto La2
            int r1 = r2.m75939xb282bd08(r1)
        La2:
            r2 = 1096810496(0x41600000, float:14.0)
            r3 = 2131233216(0x7f0809c0, float:1.8082563E38)
            if (r1 == 0) goto Lc4
            if (r1 == r0) goto Laf
            r4 = 2
            if (r1 == r4) goto Lc4
            goto Ld9
        Laf:
            r7.setBackgroundResource(r3)
            android.content.Context r10 = r9.getContext()
            r1 = 2131780897(0x7f106521, float:1.9193392E38)
            java.lang.String r10 = r10.getString(r1)
            r8.setText(r10)
            r8.setTextSize(r0, r2)
            return
        Lc4:
            r7.setBackgroundResource(r3)
            android.content.Context r10 = r9.getContext()
            r1 = 2131780902(0x7f106526, float:1.9193402E38)
            java.lang.String r10 = r10.getString(r1)
            r8.setText(r10)
            r8.setTextSize(r0, r2)
            return
        Ld9:
            a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b.m57342x10833050(java.lang.String):void");
    }

    public final void b(int i17, int i18, int i19) {
        android.view.ViewGroup.LayoutParams layoutParams = this.f197473f.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = i65.a.b(getContext(), i17);
            marginLayoutParams.height = i65.a.b(getContext(), i18);
            marginLayoutParams.topMargin = i65.a.b(getContext(), i19);
        }
    }

    public final void c(java.lang.String curGiftId, int i17) {
        java.lang.String L0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curGiftId, "curGiftId");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f197478n;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f197473f;
        c22789xd23e9a9b.setAlpha(1.0f);
        this.f197479o = i17;
        this.f197480p = curGiftId;
        ce2.i e17 = dk2.u7.f315714a.e(curGiftId);
        boolean z17 = e17 != null ? e17.f67822x842ee41e : false;
        int i18 = this.f197479o;
        if (i18 == 1) {
            m57341xcb0ccd61(curGiftId);
        } else {
            if (i18 == 2) {
                java.lang.String str = e17 != null ? e17.f67796x4f4dc37 : null;
                if (!(str == null || str.length() == 0)) {
                    java.lang.String str2 = e17 != null ? e17.f67796x4f4dc37 : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    m57343x1daec333(str2);
                }
            }
            m57342x10833050(curGiftId);
        }
        c22789xd23e9a9b.m82583xcde73672(-1);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(z17);
        rj.j.a(nn2.d.f420204a.c(), (e17 == null || (L0 = e17.L0()) == null) ? "" : L0, this.f197473f, null, 4, null);
    }

    /* renamed from: setUnLockContent */
    public final void m57343x1daec333(java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        b(32, 32, 4);
        android.widget.TextView textView = this.f197475h;
        textView.setVisibility(0);
        textView.setText(desc);
        this.f197472e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a3s);
        textView.setTextSize(1, 12.0f);
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.djc);
        android.widget.TextView textView2 = this.f197474g;
        textView2.setText(string);
        textView2.setTextSize(1, 14.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14321x140d228b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
