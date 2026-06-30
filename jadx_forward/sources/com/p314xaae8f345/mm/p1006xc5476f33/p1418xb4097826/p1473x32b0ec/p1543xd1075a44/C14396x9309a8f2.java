package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView;", "Landroid/widget/LinearLayout;", "", "d", "Z", "getIntecerptKeyBoardEvent", "()Z", "setIntecerptKeyBoardEvent", "(Z)V", "intecerptKeyBoardEvent", "", "e", "I", "getFromScene", "()I", "setFromScene", "(I)V", "fromScene", "isAssistant", "setAssistant", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView */
/* loaded from: classes3.dex */
public final class C14396x9309a8f2 extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f199136p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean intecerptKeyBoardEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int fromScene;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f199139f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f199140g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.q f199141h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199142i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f199143m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f199144n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f199145o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14396x9309a8f2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199141h = fg2.q.a(android.view.LayoutInflater.from(getContext()), this, true);
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        if (!r4Var.Y1(context2)) {
            setPadding(getPaddingLeft(), com.p314xaae8f345.mm.ui.bk.p(getContext()), getPaddingRight(), getPaddingBottom());
        }
        b();
        this.f199143m = "";
        this.f199144n = "";
        this.f199145o = "";
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(this.f199141h.f343783d.getWindowToken(), 0);
        setVisibility(8);
    }

    public final void b() {
        fg2.q qVar = this.f199141h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = qVar.f343785f;
        c22621x7603e017.setFocusable(true);
        c22621x7603e017.setFocusableInTouchMode(true);
        c22621x7603e017.setCursorVisible(true);
        c22621x7603e017.setRawInputType(1);
        com.p314xaae8f345.mm.ui.bk.r0(c22621x7603e017.getPaint(), 0.8f);
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kd(this, c22621x7603e017));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = qVar.f343783d;
        c22621x7603e0172.setFocusable(true);
        c22621x7603e0172.setFocusableInTouchMode(true);
        c22621x7603e0172.setCursorVisible(true);
        c22621x7603e0172.setRawInputType(1);
        com.p314xaae8f345.mm.ui.bk.r0(c22621x7603e0172.getPaint(), 0.8f);
        c22621x7603e0172.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ld(this, c22621x7603e0172));
    }

    public final void c(boolean z17, java.lang.String str, java.lang.String str2, boolean z18, yz5.l lVar, yz5.a aVar, boolean z19, java.lang.String str3) {
        java.lang.String str4;
        this.f199142i = z17;
        this.f199143m = str3 == null ? "" : str3;
        this.f199139f = lVar;
        this.f199140g = aVar;
        fg2.q qVar = this.f199141h;
        qVar.f343782c.setText(getContext().getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.npa : com.p314xaae8f345.mm.R.C30867xcad56011.dcc));
        qVar.f343781b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.md(this));
        qVar.f343786g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nd(this));
        if (z17) {
            qVar.f343785f.setVisibility(0);
            android.view.View view = qVar.f343784e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f343785f.requestFocus();
            qVar.f343785f.setHint(zl2.q4.f555466a.n());
            qVar.f343783d.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        } else {
            qVar.f343785f.setVisibility(8);
            android.view.View view2 = qVar.f343784e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView", "show", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            qVar.f343783d.requestFocus();
            qVar.f343783d.setSingleLine();
            qVar.f343783d.setHint(zl2.q4.f555466a.n());
        }
        if (z17) {
            if (str != null) {
                java.lang.String str5 = str.length() > 0 ? str : null;
                if (str5 != null) {
                    qVar.f343785f.setText(str5);
                    qVar.f343785f.mo81549xf579a34a(str5.length());
                }
            }
            if (str2 != null) {
                str4 = str2.length() > 0 ? str2 : null;
                if (str4 != null) {
                    qVar.f343783d.setText(str4);
                }
            }
            this.f199144n = str == null ? "" : str;
            this.f199145o = str2 != null ? str2 : "";
        } else {
            if (str != null) {
                str4 = str.length() > 0 ? str : null;
                if (str4 != null) {
                    qVar.f343783d.setText(str4);
                    qVar.f343783d.mo81549xf579a34a(str4.length());
                }
            }
            this.f199145o = str != null ? str : "";
        }
        setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f199142i ? qVar.f343785f : qVar.f343783d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22621x7603e017);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pd pdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pd(this, c22621x7603e017);
        if (z19) {
            c22621x7603e017.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.od(pdVar), 300L);
        } else {
            pdVar.mo152xb9724478();
        }
    }

    public final int getFromScene() {
        return this.fromScene;
    }

    public final boolean getIntecerptKeyBoardEvent() {
        return this.intecerptKeyBoardEvent;
    }

    /* renamed from: setAssistant */
    public final void m57890xb0faa49c(boolean z17) {
    }

    /* renamed from: setFromScene */
    public final void m57891x5fdf7cc0(int i17) {
        this.fromScene = i17;
    }

    /* renamed from: setIntecerptKeyBoardEvent */
    public final void m57892x66c1f0f7(boolean z17) {
        this.intecerptKeyBoardEvent = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14396x9309a8f2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199141h = fg2.q.a(android.view.LayoutInflater.from(getContext()), this, true);
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        if (!r4Var.Y1(context2)) {
            setPadding(getPaddingLeft(), com.p314xaae8f345.mm.ui.bk.p(getContext()), getPaddingRight(), getPaddingBottom());
        }
        b();
        this.f199143m = "";
        this.f199144n = "";
        this.f199145o = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14396x9309a8f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199141h = fg2.q.a(android.view.LayoutInflater.from(getContext()), this, true);
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        if (!r4Var.Y1(context2)) {
            setPadding(getPaddingLeft(), com.p314xaae8f345.mm.ui.bk.p(getContext()), getPaddingRight(), getPaddingBottom());
        }
        b();
        this.f199143m = "";
        this.f199144n = "";
        this.f199145o = "";
    }
}
