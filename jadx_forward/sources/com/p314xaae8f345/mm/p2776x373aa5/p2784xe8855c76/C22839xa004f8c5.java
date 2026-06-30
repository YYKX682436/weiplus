package com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/view/popview/SmileyPopView;", "Lcom/tencent/mm/view/popview/AbstractPopView;", "Lgr/c0;", "item", "Ljz5/f0;", "setSmileyItem", "Landroid/view/WindowManager$LayoutParams;", "getWindowLayoutParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.popview.SmileyPopView */
/* loaded from: classes12.dex */
public final class C22839xa004f8c5 extends com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f295224f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f295225g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f295226h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.u f295227i;

    /* renamed from: m, reason: collision with root package name */
    public final int f295228m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f295229n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22839xa004f8c5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4
    public void d(android.view.View anchor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        c(anchor.getContext());
        anchor.setPressed(false);
        anchor.setSelected(false);
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        int i17 = getResources().getDisplayMetrics().widthPixels;
        int measuredWidth = iArr[0] + (anchor.getMeasuredWidth() / 2);
        android.view.WindowManager.LayoutParams layoutParams = this.f295229n;
        int i18 = (layoutParams.width - this.f295228m) / 2;
        layoutParams.y = ((iArr[1] - layoutParams.height) + anchor.getMeasuredHeight()) - this.f295205e;
        int i19 = layoutParams.width;
        int i27 = i19 / 2;
        android.view.View view = this.f295224f;
        if (measuredWidth < i27) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            view.setBackground(com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559798f5));
            layoutParams.x = (measuredWidth + i18) - (i17 / 2);
        } else if ((i19 / 2) + measuredWidth > i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            view.setBackground(com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559799f6));
            layoutParams.x = (measuredWidth - i18) - (i17 / 2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            view.setBackground(com.p314xaae8f345.mm.ui.zk.d(getContext(), com.p314xaae8f345.mm.R.C30857x2dd9f1.f559797f4));
            layoutParams.x = measuredWidth - (i17 / 2);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.AbstractC22836x7ad225f4
    /* renamed from: getWindowLayoutParams, reason: from getter */
    public android.view.WindowManager.LayoutParams getF295229n() {
        return this.f295229n;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            return;
        }
        a();
    }

    /* renamed from: setSmileyItem */
    public final void m82880x9a280326(gr.c0 item) {
        java.lang.Object obj;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2614xca6eae71.e1 b17 = com.p314xaae8f345.mm.p2614xca6eae71.e1.b();
        java.lang.String str2 = item.f356196a;
        java.lang.String d17 = b17.d(str2);
        java.lang.String d18 = com.p314xaae8f345.mm.p2614xca6eae71.g.b().d(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmileyPopView", "pop smiley %s, %s, %s", str2, d17, d18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d18);
        int L = r26.n0.L(d18, "[", 0, false, 6, null);
        int L2 = r26.n0.L(d18, "]", 0, false, 6, null);
        if (L2 == -1) {
            L2 = d18.length();
        }
        java.lang.String substring = d18.substring(L + 1, L2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        android.widget.TextView textView = this.f295226h;
        if (textView != null) {
            textView.setText(substring);
        }
        xq.r rVar = xq.s.f537548a;
        java.util.Iterator it = xq.s.f537552e.f537510c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xq.c) obj).f537504b, str2)) {
                    break;
                }
            }
        }
        xq.c cVar = (xq.c) obj;
        if (cVar == null) {
            str = null;
        } else {
            str = rr.s.f480682a.b() + cVar.f537505c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = this.f295227i;
        if (uVar != null) {
            uVar.b();
        }
        this.f295227i = null;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        android.widget.ImageView imageView = this.f295225g;
        if (j17) {
            try {
                this.f295227i = new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1));
            } catch (java.lang.Exception e17) {
                if (e17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(711, 22);
                }
            }
            if (imageView != null) {
                imageView.setImageDrawable(this.f295227i);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar2 = this.f295227i;
            if (uVar2 != null) {
                uVar2.d();
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.p2614xca6eae71.e1.b().c(str2));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSmileyItem: ");
        sb6.append(str2);
        sb6.append(", ");
        xq.r rVar2 = xq.s.f537548a;
        sb6.append(xq.s.f537552e.f537510c.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmileyPopView", sb6.toString());
        if (cVar != null) {
            rVar2.a();
        }
    }

    public /* synthetic */ C22839xa004f8c5(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22839xa004f8c5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a79, this);
        this.f295224f = findViewById(com.p314xaae8f345.mm.R.id.f568495n11);
        this.f295225g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f565739dd5);
        this.f295226h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565738dd4);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(2, 264, 1);
        this.f295229n = layoutParams;
        this.f295228m = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a_9);
        layoutParams.width = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a_8);
        layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a_6);
        layoutParams.gravity = 49;
    }
}
