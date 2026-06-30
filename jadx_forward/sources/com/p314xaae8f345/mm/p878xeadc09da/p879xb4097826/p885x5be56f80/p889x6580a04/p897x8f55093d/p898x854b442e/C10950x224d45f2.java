package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/sticker/subviews/WhenWhereView;", "Landroid/widget/FrameLayout;", "Liw0/c;", "d", "Ljz5/g;", "getWhenWhereAdapter", "()Liw0/c;", "whenWhereAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.WhenWhereView */
/* loaded from: classes5.dex */
public final class C10950x224d45f2 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g whenWhereAdapter;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f150851e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10950x224d45f2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getWhenWhereAdapter */
    private final iw0.c m47163x38cddc38() {
        return (iw0.c) ((jz5.n) this.whenWhereAdapter).mo141623x754a37bb();
    }

    public final void a(java.util.List whenWhereDataList, yz5.l selectedCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(whenWhereDataList, "whenWhereDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedCallback, "selectedCallback");
        this.f150851e = selectedCallback;
        m47163x38cddc38().y(whenWhereDataList);
    }

    public final void b(int i17, kw0.a stickerData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
        iw0.c m47163x38cddc38 = m47163x38cddc38();
        m47163x38cddc38.getClass();
        m47163x38cddc38.x(i17, stickerData);
    }

    public /* synthetic */ C10950x224d45f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10950x224d45f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        this.whenWhereAdapter = jz5.h.b(new mw0.n(this));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        addView(c1163xf1deaba4, layoutParams);
        lv0.a aVar = new lv0.a();
        int dimensionPixelSize = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int dimensionPixelSize2 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        aVar.f403010c = dimensionPixelSize;
        aVar.f403011d = dimensionPixelSize2;
        aVar.f403008a = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        aVar.f403009b = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        c1163xf1deaba4.N(new lv0.b(aVar));
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(this);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        if (a18 != null) {
            c17 = a18.f328580d - a18.f328578b;
        } else {
            c17 = com.p314xaae8f345.mm.ui.bl.c(getContext());
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c17);
        java.lang.Integer num = valueOf.intValue() != 0 ? valueOf : null;
        c1163xf1deaba4.N(new mw0.l(4, num != null ? num.intValue() : j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajd)));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 4));
        c1163xf1deaba4.mo7960x6cab2c8d(m47163x38cddc38());
    }
}
