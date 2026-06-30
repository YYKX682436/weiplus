package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019¨\u0006'"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseChromeView;", "", "", "words", "Ljz5/f0;", "setSuggestWords", "Leh5/a;", "f", "Leh5/a;", "getImmersiveType", "()Leh5/a;", "immersiveType", "", "g", "I", "getDefaultVisibility", "()I", "defaultVisibility", "Lkotlin/Function1;", "p", "Lyz5/l;", "getOnSuggestWordClickListener", "()Lyz5/l;", "setOnSuggestWordClickListener", "(Lyz5/l;)V", "onSuggestWordClickListener", "Lvc5/j;", "q", "getOnFilterSelectedListener", "setOnFilterSelectedListener", "onFilterSelectedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView */
/* loaded from: classes5.dex */
public final class C21817xf8653721 extends com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final eh5.a immersiveType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int defaultVisibility;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.HorizontalScrollView f283257h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f283258i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f283259m;

    /* renamed from: n, reason: collision with root package name */
    public int f283260n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f283261o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public yz5.l onSuggestWordClickListener;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public yz5.l onFilterSelectedListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21817xf8653721(android.content.Context context) {
        this(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public android.view.View a() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekg, (android.view.ViewGroup) this, false);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.tao);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f283257h = (android.widget.HorizontalScrollView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tan);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f283258i = (android.widget.LinearLayout) findViewById2;
        if ((!this.f283261o.isEmpty()) && !this.f283259m) {
            b();
        }
        return inflate;
    }

    public final void b() {
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout = this.f283258i;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        linearLayout.removeAllViews();
        android.widget.HorizontalScrollView horizontalScrollView = this.f283257h;
        if (horizontalScrollView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollView");
            throw null;
        }
        horizontalScrollView.scrollTo(0, 0);
        if (this.f283261o.isEmpty()) {
            return;
        }
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int i17 = 0;
        for (java.lang.Object obj : this.f283261o) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
            android.widget.LinearLayout linearLayout2 = this.f283258i;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekh, (android.view.ViewGroup) linearLayout2, false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.sry);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.srz);
            if (c22699x3dcdb352 == null) {
                textView = textView2;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView", "inflateSuggestChip", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c22699x3dcdb352, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView", "inflateSuggestChip", "(Ljava/lang/String;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView = textView2;
            }
            if (textView != null) {
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(0);
                    textView.setLayoutParams(layoutParams2);
                }
            }
            if (textView != null) {
                textView.setText(str);
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            if (i17 > 0) {
                layoutParams3.setMarginStart(h17);
            }
            inflate.setOnClickListener(new vc5.l(str, this));
            android.widget.LinearLayout linearLayout3 = this.f283258i;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            linearLayout3.addView(inflate, layoutParams3);
            i17 = i18;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public int getDefaultVisibility() {
        return this.defaultVisibility;
    }

    @Override // com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b
    public eh5.a getImmersiveType() {
        return this.immersiveType;
    }

    public final yz5.l getOnFilterSelectedListener() {
        return this.onFilterSelectedListener;
    }

    public final yz5.l getOnSuggestWordClickListener() {
        return this.onSuggestWordClickListener;
    }

    /* renamed from: setOnFilterSelectedListener */
    public final void m79672x66104348(yz5.l lVar) {
        this.onFilterSelectedListener = lVar;
    }

    /* renamed from: setOnSuggestWordClickListener */
    public final void m79673x885fdf4f(yz5.l lVar) {
        this.onSuggestWordClickListener = lVar;
    }

    /* renamed from: setSuggestWords */
    public final void m79674x93d75b07(java.util.List<java.lang.String> words) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(words, "words");
        this.f283261o = words;
        if (this.f283259m || this.f283258i == null) {
            return;
        }
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21817xf8653721(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public /* synthetic */ C21817xf8653721(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21817xf8653721(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.immersiveType = eh5.a.f334484d;
        this.defaultVisibility = 8;
        this.f283261o = kz5.p0.f395529d;
    }
}
