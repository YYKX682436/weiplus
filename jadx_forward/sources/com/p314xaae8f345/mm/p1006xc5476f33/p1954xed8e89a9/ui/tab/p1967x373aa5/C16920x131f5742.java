package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/GradientBackgroundRecyclerView;", "Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileRecyclerView;", "", "j2", "Z", "getHasTopic", "()Z", "setHasTopic", "(Z)V", "hasTopic", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView */
/* loaded from: classes5.dex */
public final class C16920x131f5742 extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16915x1471bfda {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public boolean hasTopic;

    /* renamed from: k2, reason: collision with root package name */
    public final android.graphics.Paint f236197k2;

    /* renamed from: l2, reason: collision with root package name */
    public final int f236198l2;

    /* renamed from: m2, reason: collision with root package name */
    public final int f236199m2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16920x131f5742(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f236197k2 = paint;
        this.f236198l2 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        this.f236199m2 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
    }

    public final boolean getHasTopic() {
        return this.hasTopic;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = this.hasTopic ? this.f236198l2 : 0;
        int color = getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        int color2 = getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        boolean z17 = this.hasTopic;
        android.graphics.Paint paint = this.f236197k2;
        if (z17 && i17 > 0) {
            paint.setShader(null);
            paint.setColor(color);
            canvas.drawRect(0.0f, 0.0f, getWidth(), i17, paint);
        }
        float f17 = i17;
        int i18 = this.f236199m2;
        paint.setShader(new android.graphics.LinearGradient(0.0f, f17, 0.0f, i17 + i18, color, color2, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, f17, getWidth(), i17 + i18, paint);
    }

    /* renamed from: setHasTopic */
    public final void m67723x7e5a7937(boolean z17) {
        this.hasTopic = z17;
    }
}
