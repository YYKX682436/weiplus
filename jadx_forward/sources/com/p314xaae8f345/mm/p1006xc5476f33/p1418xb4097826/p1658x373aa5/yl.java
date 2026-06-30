package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public class yl extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f214934p = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560775tu);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f214935d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f214936e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f214937f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f214938g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f214939h;

    /* renamed from: i, reason: collision with root package name */
    public float f214940i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f214941m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f214942n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f214943o;

    public /* synthetic */ yl(java.lang.String str, int i17, int i18, boolean z17, boolean z18, yz5.l lVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? false : z18, lVar);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        if (this.f214939h) {
            this.f214938g.mo146xb9724478(this.f214935d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0
    /* renamed from: setColor */
    public void mo63036x52d2f021(int i17, int i18) {
        super.mo63036x52d2f021(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        if (this.f214936e) {
            com.p314xaae8f345.mm.ui.bk.r0(ds6, 0.8f);
        }
        float f17 = this.f214940i;
        if (f17 > 0.0f) {
            ds6.setShadowLayer(f17, 0.0f, 0.0f, f214934p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(java.lang.String text, int i17, int i18, boolean z17, boolean z18, yz5.l onClick) {
        super(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f214935d = text;
        this.f214936e = z17;
        this.f214937f = z18;
        this.f214938g = onClick;
        this.f214939h = true;
    }
}
