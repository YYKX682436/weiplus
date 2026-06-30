package com.p314xaae8f345.mm.p679x5c28046.p684x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/emoji/view/RoundEmojiView;", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Landroid/graphics/Path;", "p", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Landroid/graphics/RectF;", "q", "Landroid/graphics/RectF;", "getRect", "()Landroid/graphics/RectF;", "rect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emojisdk-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.emoji.view.RoundEmojiView */
/* loaded from: classes3.dex */
public final class C10451x8af7b63d extends com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Path path;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.RectF rect;

    public C10451x8af7b63d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.path = new android.graphics.Path();
        this.rect = new android.graphics.RectF();
    }

    public final android.graphics.Path getPath() {
        return this.path;
    }

    public final android.graphics.RectF getRect() {
        return this.rect;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (getDrawable() == null) {
            super.onDraw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i17 = getDrawable().getBounds().right;
        android.graphics.RectF rectF = this.rect;
        if (measuredWidth >= i17 && getMeasuredHeight() >= getDrawable().getBounds().bottom) {
            float f17 = 2;
            rectF.set((getMeasuredWidth() - getDrawable().getBounds().right) / f17, (getMeasuredHeight() - getDrawable().getBounds().bottom) / f17, ((getMeasuredWidth() - getDrawable().getBounds().right) / f17) + getDrawable().getBounds().right, ((getMeasuredHeight() - getDrawable().getBounds().bottom) / f17) + getDrawable().getBounds().bottom);
        } else if (getMeasuredWidth() >= getDrawable().getBounds().right) {
            float f18 = 2;
            rectF.set((getMeasuredWidth() - getDrawable().getBounds().right) / f18, 0.0f, ((getMeasuredWidth() - getDrawable().getBounds().right) / f18) + getDrawable().getBounds().right, getMeasuredHeight());
        } else if (getMeasuredHeight() >= getDrawable().getBounds().bottom) {
            float f19 = 2;
            rectF.set(0.0f, (getMeasuredHeight() - getDrawable().getBounds().bottom) / f19, getMeasuredWidth(), ((getMeasuredHeight() - getDrawable().getBounds().bottom) / f19) + getDrawable().getBounds().bottom);
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        android.graphics.Path path = this.path;
        path.addRoundRect(rectF, getMeasuredWidth() / 10.0f, getMeasuredHeight() / 10.0f, android.graphics.Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.restore();
    }

    public C10451x8af7b63d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
