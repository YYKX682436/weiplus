package com.p314xaae8f345.mm.ui.p2747xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/widget/InsectFrameLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "", "g", "Lyz5/l;", "getInsectCallback", "()Lyz5/l;", "setInsectCallback", "(Lyz5/l;)V", "insectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.InsectFrameLayout */
/* loaded from: classes3.dex */
public class C22609x6e7a10cf extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292805d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f292806e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f292807f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l insectCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22609x6e7a10cf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f292805d = "MicroMsg.InsectLayout";
        this.f292806e = new android.graphics.Rect();
        this.f292807f = new int[2];
    }

    public boolean g(int i17) {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18;
    }

    public final yz5.l getInsectCallback() {
        return this.insectCallback;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yz5.l lVar;
        android.graphics.Rect rect = this.f292806e;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.f292807f;
        getLocationOnScreen(iArr);
        int i28 = ((i27 - i18) + iArr[1]) - rect.bottom;
        boolean g17 = g(i28);
        if (!g17 && (lVar = this.insectCallback) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
            g17 = ((java.lang.Boolean) lVar.mo146xb9724478(java.lang.Integer.valueOf(i28))).booleanValue();
        }
        if (!g17 && getPaddingBottom() != i28) {
            post(new al5.g0(this, i28));
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* renamed from: setInsectCallback */
    public final void m81276xaada124f(yz5.l lVar) {
        this.insectCallback = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22609x6e7a10cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22609x6e7a10cf(android.content.Context context) {
        this(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
