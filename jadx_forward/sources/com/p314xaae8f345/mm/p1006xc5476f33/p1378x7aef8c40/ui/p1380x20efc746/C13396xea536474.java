package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame;", "Landroid/widget/FrameLayout;", "", "selected", "Ljz5/f0;", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame */
/* loaded from: classes10.dex */
public final class C13396xea536474 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f180220d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180221e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f180222f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f180223g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f180224h;

    /* renamed from: i, reason: collision with root package name */
    public final a32.r0 f180225i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13396xea536474(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180220d = com.p314xaae8f345.mm.R.C30861xcebc809e.f78054xf2a17582;
        this.f180221e = com.p314xaae8f345.mm.R.C30861xcebc809e.f78053x4ad54285;
        this.f180225i = new a32.r0(this);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a7i, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ddz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f180222f = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565740de0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f180223g = findViewById2;
    }

    public final void a(java.lang.String lensId) {
        this.f180224h = lensId;
        boolean z17 = lensId == null || lensId.length() == 0;
        int i17 = this.f180221e;
        android.view.View view = this.f180222f;
        if (z17) {
            view.setBackgroundResource(i17);
            android.view.View view2 = this.f180223g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        u85.i iVar = u85.i.f507240a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensId, "lensId");
        if (t85.j.f498006l.a(iVar.b(lensId))) {
            view.setBackgroundResource(i17);
            android.view.View view3 = this.f180223g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        view.setBackgroundResource(this.f180220d);
        android.view.View view4 = this.f180223g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u85.i.f507240a.f(this.f180225i);
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        a32.r0 r0Var = this.f180225i;
        if (z17) {
            u85.i.f507240a.e(r0Var);
            setVisibility(0);
        } else {
            u85.i.f507240a.f(r0Var);
            setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13396xea536474(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
