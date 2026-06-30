package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/location/ui/impl/LocationCrossHairView;", "Landroid/widget/FrameLayout;", "", "selected", "Ljz5/f0;", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-map_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView */
/* loaded from: classes3.dex */
public final class C16295x2743832 extends android.widget.FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16295x2743832(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.view.View childAt = getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) childAt).m82040x7541828(getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77722x6246bcdd : com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
    }
}
