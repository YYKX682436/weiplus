package com.tencent.mm.plugin.emojicapture.ui.capture;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame;", "Landroid/widget/FrameLayout;", "", "selected", "Ljz5/f0;", "setSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class StickerSelectFrame extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f98687d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98688e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f98689f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f98690g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f98691h;

    /* renamed from: i, reason: collision with root package name */
    public final a32.r0 f98692i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerSelectFrame(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98687d = com.tencent.mm.R.drawable.emoji_sticker_select_frame_loading;
        this.f98688e = com.tencent.mm.R.drawable.emoji_sticker_select_frame;
        this.f98692i = new a32.r0(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.a7i, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ddz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98689f = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484207de0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f98690g = findViewById2;
    }

    public final void a(java.lang.String lensId) {
        this.f98691h = lensId;
        boolean z17 = lensId == null || lensId.length() == 0;
        int i17 = this.f98688e;
        android.view.View view = this.f98689f;
        if (z17) {
            view.setBackgroundResource(i17);
            android.view.View view2 = this.f98690g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        u85.i iVar = u85.i.f425707a;
        kotlin.jvm.internal.o.g(lensId, "lensId");
        if (t85.j.f416473l.a(iVar.b(lensId))) {
            view.setBackgroundResource(i17);
            android.view.View view3 = this.f98690g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        view.setBackgroundResource(this.f98687d);
        android.view.View view4 = this.f98690g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/emojicapture/ui/capture/StickerSelectFrame", "bindLensId", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u85.i.f425707a.f(this.f98692i);
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        a32.r0 r0Var = this.f98692i;
        if (z17) {
            u85.i.f425707a.e(r0Var);
            setVisibility(0);
        } else {
            u85.i.f425707a.f(r0Var);
            setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerSelectFrame(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
