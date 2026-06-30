package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView */
/* loaded from: classes3.dex */
public final class C12996x177746f9 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f175613d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f175614e;

    /* renamed from: f, reason: collision with root package name */
    public final int f175615f;

    /* renamed from: g, reason: collision with root package name */
    public final int f175616g;

    /* renamed from: h, reason: collision with root package name */
    public final int f175617h;

    public C12996x177746f9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175613d = new android.graphics.Path();
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f175614e = rectF;
        this.f175615f = a(8);
        int a17 = a(40);
        this.f175616g = a17;
        int a18 = a(4);
        this.f175617h = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = a17;
        rectF.bottom = a18;
    }

    public final int a(int i17) {
        return i65.a.b(getContext(), i17);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.f175613d;
        path.reset();
        int i17 = this.f175615f;
        path.addRoundRect(this.f175614e, i17, i17, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.f175617h);
    }

    public C12996x177746f9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175613d = new android.graphics.Path();
        android.graphics.RectF rectF = new android.graphics.RectF();
        this.f175614e = rectF;
        this.f175615f = a(8);
        int a17 = a(40);
        this.f175616g = a17;
        int a18 = a(4);
        this.f175617h = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = a17;
        rectF.bottom = a18;
    }
}
