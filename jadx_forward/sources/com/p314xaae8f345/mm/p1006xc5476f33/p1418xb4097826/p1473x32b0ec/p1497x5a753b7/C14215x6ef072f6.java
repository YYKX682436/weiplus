package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView;", "Landroid/widget/FrameLayout;", "", "checked", "Ljz5/f0;", "setChecked", "visible", "setRedDotVisible", "Lkotlin/Function1;", "g", "Lyz5/l;", "getOnCheckedChangeListener", "()Lyz5/l;", "setOnCheckedChangeListener", "(Lyz5/l;)V", "onCheckedChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView */
/* loaded from: classes3.dex */
public final class C14215x6ef072f6 extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f193179h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.CheckBox f193180d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f193181e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f193182f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l onCheckedChangeListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14215x6ef072f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final yz5.l getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    /* renamed from: setChecked */
    public final void m56824xdd7d58e5(boolean z17) {
        this.f193182f = true;
        this.f193180d.setChecked(z17);
        this.f193182f = false;
    }

    /* renamed from: setOnCheckedChangeListener */
    public final void m56825x405278aa(yz5.l lVar) {
        this.onCheckedChangeListener = lVar;
    }

    /* renamed from: setRedDotVisible */
    public final void m56826x773c2518(boolean z17) {
        android.view.View view = this.f193181e;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView", "setRedDotVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/cover/FinderLiveHDCheckboxView", "setRedDotVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public /* synthetic */ C14215x6ef072f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14215x6ef072f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.e_r, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tiw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById;
        this.f193180d = checkBox;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.tiz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.tiy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f193181e = findViewById3;
        checkBox.setOnCheckedChangeListener(new eg2.j0(this));
        setOnClickListener(new eg2.k0(this));
    }
}
