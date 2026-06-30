package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveLevelProgressView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveLevelProgressView */
/* loaded from: classes3.dex */
public final class C14280x3e20d3e4 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f196296d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f196297e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f196298f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f196299g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f196300h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f196301i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f196302m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f196303n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f196304o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f196305p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14280x3e20d3e4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f196296d = "FinderLiveLevelProgressView";
        b(context);
    }

    public final void a(android.widget.TextView textView) {
        java.util.LinkedList linkedList;
        java.lang.String string;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        jz5.f0 f0Var = null;
        if (c1Var != null && (linkedList = c1Var.f410345h) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.yl1 yl1Var = (r45.yl1) next;
                if (yl1Var.m75939xb282bd08(0) == 8 || yl1Var.m75939xb282bd08(0) == 10) {
                    arrayList.add(next);
                }
            }
            r45.yl1 yl1Var2 = (r45.yl1) kz5.n0.k0(arrayList);
            if (yl1Var2 != null) {
                textView.setVisibility(0);
                int m75939xb282bd08 = yl1Var2.m75939xb282bd08(0);
                if (m75939xb282bd08 == 8) {
                    android.content.Context context = this.f196297e;
                    if (context == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                        throw null;
                    }
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573354ec0);
                } else if (m75939xb282bd08 != 10) {
                    textView.setVisibility(8);
                    string = "";
                } else {
                    android.content.Context context2 = this.f196297e;
                    if (context2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                        throw null;
                    }
                    string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573355ec1);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                textView.setText(string);
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            textView.setVisibility(8);
        }
    }

    public final void b(android.content.Context context) {
        this.f196297e = context;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.arn, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f196298f = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f0x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f196299g = findViewById;
        android.view.View view = this.f196298f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f566195f31);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f196300h = (android.widget.ProgressBar) findViewById2;
        android.view.View view2 = this.f196298f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566197f33);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f196301i = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f196298f;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.f0y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f196302m = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.f196298f;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.f3f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f196303n = (android.widget.TextView) findViewById5;
        android.view.View view5 = this.f196298f;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById6 = view5.findViewById(com.p314xaae8f345.mm.R.id.f566201f40);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f196304o = (android.widget.TextView) findViewById6;
        android.view.View view6 = this.f196298f;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById7 = view6.findViewById(com.p314xaae8f345.mm.R.id.f0z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f196305p = findViewById7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14280x3e20d3e4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f196296d = "FinderLiveLevelProgressView";
        b(context);
    }
}
