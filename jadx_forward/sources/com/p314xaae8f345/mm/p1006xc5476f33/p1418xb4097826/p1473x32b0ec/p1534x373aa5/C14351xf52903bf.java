package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveTaskStageItemView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/live/view/wb;", "Lcom/tencent/mm/plugin/finder/live/view/vb;", "value", "m", "Lcom/tencent/mm/plugin/finder/live/view/vb;", "getStatus", "()Lcom/tencent/mm/plugin/finder/live/view/vb;", "setStatus", "(Lcom/tencent/mm/plugin/finder/live/view/vb;)V", "status", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveTaskStageItemView */
/* loaded from: classes3.dex */
public final class C14351xf52903bf extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f197637d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f197638e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f197639f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f197640g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f197641h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f197642i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14351xf52903bf(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.status = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb.f198287e;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dth, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f197637d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567167rv2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f197638e = textView;
        com.p314xaae8f345.mm.ui.bk.q0(textView.getPaint());
        android.view.View view = this.f197637d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ruy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f197639f = findViewById2;
        android.view.View view2 = this.f197637d;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.ruz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f197640g = findViewById3;
        android.view.View view3 = this.f197637d;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.f567165rv0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f197641h = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.f197637d;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.f567166rv1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f197642i = (android.widget.LinearLayout) findViewById5;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb getStatus() {
        return this.status;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb
    /* renamed from: setStatus */
    public void mo57445x231a26f4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.status = value;
        android.widget.LinearLayout linearLayout = this.f197642i;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("taskGroup");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.widget.LinearLayout linearLayout2 = this.f197642i;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("taskGroup");
                throw null;
            }
            android.view.KeyEvent.Callback a17 = n3.u1.a(linearLayout2, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb wbVar = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb) a17 : null;
            if (wbVar != null) {
                wbVar.mo57445x231a26f4(getStatus());
            }
        }
        int ordinal = getStatus().ordinal();
        if (ordinal == 0) {
            android.widget.TextView textView = this.f197638e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageTitle");
                throw null;
            }
            textView.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
            android.widget.TextView textView2 = this.f197641h;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageStatus");
                throw null;
            }
            textView2.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
            android.view.View view = this.f197639f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dot");
                throw null;
            }
            view.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
            android.view.View view2 = this.f197640g;
            if (view2 != null) {
                view2.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("line");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.widget.TextView textView3 = this.f197641h;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageStatus");
                throw null;
            }
            textView3.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpc));
            android.widget.TextView textView4 = this.f197638e;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageTitle");
                throw null;
            }
            textView4.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            android.widget.TextView textView5 = this.f197641h;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageStatus");
                throw null;
            }
            textView5.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
            android.view.View view3 = this.f197639f;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dot");
                throw null;
            }
            view3.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
            android.view.View view4 = this.f197640g;
            if (view4 != null) {
                view4.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("line");
                throw null;
            }
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            android.widget.TextView textView6 = this.f197641h;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageStatus");
                throw null;
            }
            textView6.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpd));
            android.widget.TextView textView7 = this.f197638e;
            if (textView7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageTitle");
                throw null;
            }
            textView7.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            android.widget.TextView textView8 = this.f197641h;
            if (textView8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageStatus");
                throw null;
            }
            textView8.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
            android.view.View view5 = this.f197639f;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dot");
                throw null;
            }
            view5.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
            android.view.View view6 = this.f197640g;
            if (view6 != null) {
                view6.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("line");
                throw null;
            }
        }
        android.widget.TextView textView9 = this.f197638e;
        if (textView9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageTitle");
            throw null;
        }
        textView9.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        android.widget.TextView textView10 = this.f197641h;
        if (textView10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stageStatus");
            throw null;
        }
        textView10.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        android.view.View view7 = this.f197639f;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dot");
            throw null;
        }
        view7.setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e));
        android.view.View view8 = this.f197640g;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("line");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view8, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskStageItemView", "refreshOnStatusChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/view/FinderLiveTaskStageItemView", "refreshOnStatusChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout3 = this.f197642i;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("taskGroup");
            throw null;
        }
        int childCount2 = linearLayout3.getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            android.widget.LinearLayout linearLayout4 = this.f197642i;
            if (linearLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("taskGroup");
                throw null;
            }
            android.view.KeyEvent.Callback a18 = n3.u1.a(linearLayout4, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb wbVar2 = a18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.wb) a18 : null;
            if (wbVar2 != null) {
                wbVar2.mo57445x231a26f4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb.f198286d);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14351xf52903bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.status = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb.f198287e;
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14351xf52903bf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.status = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.vb.f198287e;
        a(context);
    }
}
