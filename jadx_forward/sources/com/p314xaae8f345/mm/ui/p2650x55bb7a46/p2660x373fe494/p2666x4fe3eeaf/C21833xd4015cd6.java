package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTypeFilterView;", "Landroid/widget/LinearLayout;", "", "value", "d", "Z", "isExpanded", "()Z", "setExpanded", "(Z)V", "", "e", "Ljava/lang/CharSequence;", "getTypeFilterDesc", "()Ljava/lang/CharSequence;", "setTypeFilterDesc", "(Ljava/lang/CharSequence;)V", "typeFilterDesc", "", "f", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Led5/y;", "g", "Led5/y;", "getOnFilterClickListener", "()Led5/y;", "setOnFilterClickListener", "(Led5/y;)V", "onFilterClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryTypeFilterView */
/* loaded from: classes10.dex */
public final class C21833xd4015cd6 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isExpanded;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.lang.CharSequence typeFilterDesc;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ed5.y onFilterClickListener;

    /* renamed from: h, reason: collision with root package name */
    public final em.h2 f283354h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f283355i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21833xd4015cd6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final ed5.y getOnFilterClickListener() {
        return this.onFilterClickListener;
    }

    public final java.lang.CharSequence getTypeFilterDesc() {
        return this.typeFilterDesc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f283354h.a().animate().cancel();
        this.f283355i = false;
    }

    /* renamed from: setAnimationDuration */
    public final void m79749xce929cf6(long j17) {
        this.animationDuration = j17;
    }

    /* renamed from: setExpanded */
    public final void m79750x2fe4b3b(boolean z17) {
        if (this.isExpanded == z17) {
            return;
        }
        this.isExpanded = z17;
        em.h2 h2Var = this.f283354h;
        if (h2Var.a().isAttachedToWindow()) {
            h2Var.a().animate().rotation(this.isExpanded ? 90.0f : 270.0f).setDuration(this.animationDuration).setListener(new ed5.z(this)).start();
        }
    }

    /* renamed from: setOnFilterClickListener */
    public final void m79751x7e408a23(ed5.y yVar) {
        this.onFilterClickListener = yVar;
    }

    /* renamed from: setTypeFilterDesc */
    public final void m79752x1272205(java.lang.CharSequence value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.typeFilterDesc = value;
        em.h2 h2Var = this.f283354h;
        if (h2Var.f335915b == null) {
            h2Var.f335915b = (android.widget.TextView) h2Var.f335914a.findViewById(com.p314xaae8f345.mm.R.id.vjz);
        }
        h2Var.f335915b.setText(this.typeFilterDesc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21833xd4015cd6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575393pe2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.typeFilterDesc = string;
        java.lang.Object d17 = bm5.o1.f104252a.d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20472xcc146331());
        java.lang.Long l17 = d17 instanceof java.lang.Long ? (java.lang.Long) d17 : null;
        this.animationDuration = l17 != null ? l17.longValue() : 200L;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekv, (android.view.ViewGroup) this, true);
        em.h2 h2Var = new em.h2(inflate);
        this.f283354h = h2Var;
        if (h2Var.f335917d == null) {
            h2Var.f335917d = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.uhy);
        }
        h2Var.f335917d.setOnClickListener(new ed5.x(this));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561191bv));
        gradientDrawable.setColor(context.getResources().getColor(!com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : com.p314xaae8f345.mm.R.C30859x5a72f63.abz, null));
        if (h2Var.f335917d == null) {
            h2Var.f335917d = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.uhy);
        }
        h2Var.f335917d.setBackground(gradientDrawable);
    }
}
