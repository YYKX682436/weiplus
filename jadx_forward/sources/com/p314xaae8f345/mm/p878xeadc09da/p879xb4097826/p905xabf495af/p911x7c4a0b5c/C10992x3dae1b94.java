package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SideBarItemView;", "Landroid/widget/FrameLayout;", "", "resId", "Ljz5/f0;", "setImageResource", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "setText", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "d", "Ljz5/g;", "getImageView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "imageView", "Landroid/widget/TextView;", "e", "getTextView", "()Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView */
/* loaded from: classes4.dex */
public final class C10992x3dae1b94 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g imageView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g textView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10992x3dae1b94(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getImageView */
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m47406xcb16a3ea() {
        java.lang.Object mo141623x754a37bb = this.imageView.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    /* renamed from: getTextView */
    private final android.widget.TextView m47407x4008d2e8() {
        java.lang.Object mo141623x754a37bb = this.textView.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.fk.a(m47407x4008d2e8());
    }

    /* renamed from: setImageResource */
    public final void m47408x8d516947(int i17) {
        m47406xcb16a3ea().setImageResource(i17);
    }

    /* renamed from: setText */
    public final void m47409x765074af(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        m47407x4008d2e8().setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10992x3dae1b94(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jz5.i iVar = jz5.i.f384364f;
        this.imageView = jz5.h.a(iVar, new wx0.e1(this));
        this.textView = jz5.h.a(iVar, new wx0.f1(this));
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eo6, this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mo4.a.f411956a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            m47406xcb16a3ea().setImageResource(resourceId);
        } else {
            m47406xcb16a3ea().setBackgroundColor(obtainStyledAttributes.getColor(1, 0));
        }
        m47406xcb16a3ea().m82037xa10c26f6(false);
        int dimension = (int) obtainStyledAttributes.getDimension(2, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        android.view.ViewGroup.LayoutParams layoutParams = m47406xcb16a3ea().getLayoutParams();
        if (dimension > 0) {
            layoutParams.width = dimension;
        }
        if (dimension2 > 0) {
            layoutParams.height = dimension2;
        }
        m47406xcb16a3ea().setLayoutParams(layoutParams);
        m47407x4008d2e8().setText(obtainStyledAttributes.getString(3));
        obtainStyledAttributes.recycle();
    }
}
