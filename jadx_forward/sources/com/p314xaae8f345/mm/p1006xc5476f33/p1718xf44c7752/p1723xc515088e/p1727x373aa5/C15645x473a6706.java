package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/FolderItemView;", "Landroid/widget/FrameLayout;", "", "getLayoutId", "Leb5/e;", "d", "Leb5/e;", "getHolder", "()Leb5/e;", "setHolder", "(Leb5/e;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.FolderItemView */
/* loaded from: classes.dex */
public final class C15645x473a6706 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public eb5.e holder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15645x473a6706(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(m63670x2ee31f5b(), this).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    /* renamed from: getHolder */
    public final eb5.e m63669x1cddf0a2() {
        eb5.e eVar = this.holder;
        if (eVar != null) {
            return eVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
        throw null;
    }

    /* renamed from: getLayoutId */
    public final int m63670x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cif;
    }

    /* renamed from: setHolder */
    public final void m63671x101324ae(eb5.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.holder = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15645x473a6706(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(m63670x2ee31f5b(), this).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
    }
}
