package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u001a\u0010\r\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/media/view/download/MediaDownloadText;", "Lcom/tencent/mm/plugin/media/view/ShrinkBox;", "Llg3/a;", "Lkg3/o;", "", "visible", "Ljz5/f0;", "setInnerVisible", "Lkotlinx/coroutines/y0;", "s", "Lkotlinx/coroutines/y0;", "getScope", "()Lkotlinx/coroutines/y0;", "scope", "Lvf3/b;", "t", "Lvf3/b;", "getLiveInfo", "()Lvf3/b;", "setLiveInfo", "(Lvf3/b;)V", "liveInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.download.MediaDownloadText */
/* loaded from: classes12.dex */
public class C16500xaadd4bb9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 implements lg3.a, kg3.o {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashSet f230114u = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f230115h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f230116i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f230117m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f230118n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f230119o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f230120p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f230121q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f230122r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final p3325xe03a0797.p3326xc267989b.y0 scope;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public vf3.b liveInfo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16500xaadd4bb9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setInnerVisible */
    public final void m66613xf13c1abe(boolean z17) {
        android.view.View view = this.f230120p;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "setInnerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "setInnerVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // kg3.o
    public void b(boolean z17) {
        e();
    }

    public final void d(android.widget.TextView textView) {
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(getContext())));
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
    }

    public final void e() {
        java.lang.String sb6;
        java.lang.String str;
        vf3.b bVar = this.liveInfo;
        if (bVar != null) {
            long j17 = bVar.f517899b + bVar.f517901d;
            if (j17 < 0) {
                sb6 = "";
            } else {
                java.math.BigDecimal bigDecimal = new java.math.BigDecimal(j17);
                float floatValue = bigDecimal.divide(new java.math.BigDecimal(1048576), 2, 0).floatValue();
                if (floatValue > 1.0f) {
                    sb6 = ((int) floatValue) + "MB";
                } else {
                    float floatValue2 = bigDecimal.divide(new java.math.BigDecimal(1024), 2, 0).floatValue();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append((int) floatValue2);
                    sb7.append('K');
                    sb6 = sb7.toString();
                }
            }
            if (this.f230108f) {
                str = this.f230122r;
                if (str == null) {
                    str = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f573730o53);
                }
            } else {
                str = this.f230121q;
                if (str == null) {
                    str = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f573729o52);
                }
            }
            android.widget.TextView textView = this.f230115h;
            textView.setText(str);
            android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adi)), 0, sb6.length(), 33);
            textView.append(" ");
            textView.append(spannableString);
            getLayoutParams().width = ((int) textView.getPaint().measureText(textView.getText().toString())) + ((int) (i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) * 2));
        }
    }

    public void f() {
        setVisibility(0);
    }

    public void g(vf3.b bVar) {
        this.liveInfo = bVar;
        e();
    }

    public final vf3.b getLiveInfo() {
        return this.liveInfo;
    }

    public final p3325xe03a0797.p3326xc267989b.y0 getScope() {
        return this.scope;
    }

    public void h(mf3.k info, vf3.f stateInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateInfo, "stateInfo");
        clearAnimation();
        vf3.e eVar = stateInfo.f517922a;
        if (info.mo147256x74bf41ce() == mf3.w.f407661d) {
            f();
            eVar = vf3.e.f517910d;
        }
        info.mo2110x5db1b11();
        java.util.Objects.toString(eVar);
        int ordinal = eVar.ordinal();
        android.view.ViewGroup viewGroup = this.f230116i;
        android.widget.TextView textView = this.f230115h;
        switch (ordinal) {
            case 0:
            case 6:
                m66613xf13c1abe(true);
                textView.setVisibility(0);
                e();
                viewGroup.setVisibility(8);
                android.view.View view = this.f230118n;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f230119o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 1:
                m66613xf13c1abe(false);
                textView.setVisibility(4);
                viewGroup.setVisibility(8);
                android.view.View view3 = this.f230119o;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 2:
            case 3:
                m66613xf13c1abe(true);
                textView.setVisibility(4);
                info.mo2110x5db1b11();
                eVar.toString();
                viewGroup.setVisibility(0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((int) (stateInfo.f517925d * 100.0f));
                sb6.append('%');
                this.f230117m.setText(sb6.toString());
                android.view.View view4 = this.f230118n;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = this.f230119o;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 4:
                m66613xf13c1abe(true);
                textView.setVisibility(4);
                viewGroup.setVisibility(8);
                android.view.View view6 = this.f230118n;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f230119o;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f230114u.add(info.mo2110x5db1b11());
                p3325xe03a0797.p3326xc267989b.l.d(this.scope, null, null, new lg3.c(this, null), 3, null);
                return;
            case 5:
                m66613xf13c1abe(false);
                textView.setVisibility(4);
                viewGroup.setVisibility(8);
                android.view.View view8 = this.f230119o;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/media/view/download/MediaDownloadText", "updateState", "(Lcom/tencent/mm/plugin/media/adapter/IMediaInfo;Lcom/tencent/mm/plugin/media/live/state/LiveStateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            default:
                return;
        }
    }

    /* renamed from: setLiveInfo */
    public final void m66616xcb0dd23c(vf3.b bVar) {
        this.liveInfo = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16500xaadd4bb9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.scope = p3325xe03a0797.p3326xc267989b.z0.b();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o23.o.f423987b, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f230121q = obtainStyledAttributes.getString(0);
        this.f230122r = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eje, (android.view.ViewGroup) this, true);
        m66606xd5938adf(this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.viw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f230115h = textView;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.u1m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f230116i = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.u1n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f230117m = textView2;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.u1l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f230118n = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.u1j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f230119o = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.u4s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f230120p = findViewById6;
        d(textView);
        d(textView2);
    }
}
