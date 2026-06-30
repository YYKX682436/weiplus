package com.tencent.mm.plugin.emojicapture.ui.editor;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\r\u001a\u00020\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EmojiEditorItemView;", "Lcom/tencent/mm/emoji/view/EmojiStatusView;", "Lr22/f;", "", "editing", "Ljz5/f0;", "setEditing", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getItemContainer", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "Landroid/graphics/Matrix;", "getTouchMatrix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiEditorItemView extends com.tencent.mm.emoji.view.EmojiStatusView implements r22.f {

    /* renamed from: r, reason: collision with root package name */
    public final r22.e f98740r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditorItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98740r = new w22.i(this);
    }

    @Override // b32.c0
    public void b(android.graphics.RectF bounds, float f17) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        w22.i iVar = (w22.i) this.f98740r;
        iVar.getClass();
        iVar.f442546c.set(bounds);
        iVar.f442547d.addRoundRect(new android.graphics.RectF(bounds.left, bounds.top, bounds.right, bounds.bottom), f17, f17, android.graphics.Path.Direction.CW);
        iVar.a();
    }

    @Override // zu3.n
    public zu3.a g() {
        return null;
    }

    @Override // r22.f
    public com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer getItemContainer() {
        if (!(getParent().getParent() instanceof com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer)) {
            return null;
        }
        android.view.ViewParent parent = getParent().getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        return (com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer) parent;
    }

    public final android.graphics.Matrix getTouchMatrix() {
        return ((w22.i) this.f98740r).f442545b.f24917g;
    }

    @Override // b32.c0
    public boolean l() {
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        r22.e eVar = this.f98740r;
        w22.i iVar = (w22.i) eVar;
        iVar.getClass();
        if (iVar.f442551h) {
            canvas.clipPath(iVar.f442547d);
        }
        canvas.setMatrix(iVar.f442545b.f24917g);
        if (iVar.f442550g) {
            float f17 = iVar.f442548e.left;
            float f18 = iVar.f442552i;
            float f19 = iVar.f442556m / f18;
            float f27 = f17 - f19;
            float f28 = r1.top - f19;
            float f29 = r1.right + f19;
            float f37 = r1.bottom + f19;
            float f38 = (iVar.f442557n / 2) / f18;
            android.graphics.Paint paint = iVar.f442549f;
            paint.setStrokeWidth(iVar.f442555l / f18);
            float f39 = f27 - f38;
            float f47 = f28 - f38;
            float f48 = f27 + f38;
            float f49 = f28 + f38;
            canvas.drawRect(f39, f47, f48, f49, paint);
            float f57 = f29 - f38;
            float f58 = f29 + f38;
            canvas.drawRect(f57, f47, f58, f49, paint);
            float f59 = f37 - f38;
            float f66 = f38 + f37;
            canvas.drawRect(f57, f59, f58, f66, paint);
            canvas.drawRect(f39, f59, f48, f66, paint);
            canvas.drawLines(new float[]{f27, f28, f29, f28, f29, f28, f29, f37, f29, f37, f27, f37, f27, f37, f27, f28}, paint);
        }
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
        ((w22.i) eVar).getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r14 != 3) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r14, r0)
            r22.e r0 = r13.f98740r
            w22.i r0 = (w22.i) r0
            r0.getClass()
            r22.f r1 = r0.f442544a
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r2 = r1.getItemContainer()
            bw3.e r3 = r0.f442545b
            boolean r4 = r3.a(r14)
            r5 = 0
            if (r4 == 0) goto Lc3
            if (r2 == 0) goto L20
            r2.a(r1, r14)
        L20:
            int r14 = r14.getActionMasked()
            float[] r2 = r0.f442558o
            r4 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            if (r14 == 0) goto La4
            r7 = 2
            if (r14 == r6) goto L39
            if (r14 == r7) goto L35
            r8 = 3
            if (r14 == r8) goto L39
            goto Lbd
        L35:
            r0.f442551h = r5
            goto Lbd
        L39:
            r0.f442551h = r6
            bw3.b r14 = new bw3.b
            r14.<init>()
            float r8 = r0.f442554k
            r14.f24902c = r8
            float r8 = r0.f442553j
            r14.f24903d = r8
            float[] r8 = new float[r7]
            android.graphics.Rect r9 = r0.f442548e
            int r10 = r9.width()
            float r10 = (float) r10
            float r10 = r10 / r4
            r8[r5] = r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 / r4
            r8[r6] = r9
            r14.f24901b = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            android.graphics.RectF r9 = r0.f442546c
            float r10 = r9.left
            float r11 = r9.top
            float r12 = r9.right
            float r9 = r9.bottom
            r8.<init>(r10, r11, r12, r9)
            r14.f24900a = r8
            float[] r7 = new float[r7]
            int r8 = r3.f24926p
            float r8 = (float) r8
            float r8 = r8 / r4
            r7[r5] = r8
            int r8 = r3.f24925o
            float r8 = (float) r8
            float r8 = r8 / r4
            r7[r6] = r8
            android.graphics.Matrix r4 = r3.f24917g
            r4.mapPoints(r7)
            android.graphics.RectF r4 = r14.f24900a
            r8 = r7[r5]
            r7 = r7[r6]
            boolean r4 = r4.contains(r8, r7)
            if (r4 != 0) goto L99
            android.graphics.RectF r4 = new android.graphics.RectF
            r5 = r2[r5]
            r2 = r2[r6]
            r4.<init>(r5, r2, r5, r2)
            r14.f24900a = r4
        L99:
            android.graphics.Matrix r2 = r3.f24917g
            w22.h r3 = new w22.h
            r3.<init>(r0)
            r14.a(r2, r3)
            goto Lbd
        La4:
            r0.f442551h = r6
            r14 = r1
            android.view.View r14 = (android.view.View) r14
            r14.bringToFront()
            int r14 = r3.f24926p
            float r14 = (float) r14
            float r14 = r14 / r4
            r2[r5] = r14
            int r14 = r3.f24925o
            float r14 = (float) r14
            float r14 = r14 / r4
            r2[r6] = r14
            android.graphics.Matrix r14 = r3.f24917g
            r14.mapPoints(r2)
        Lbd:
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            r5 = r6
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        float f17;
        if (getEmojiInfo() == null) {
            return null;
        }
        boolean z17 = getDrawable() instanceof android.graphics.drawable.BitmapDrawable;
        r22.e eVar = this.f98740r;
        if (z17) {
            android.graphics.drawable.Drawable drawable = getDrawable();
            kotlin.jvm.internal.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.set(((w22.i) eVar).f442545b.f24917g);
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            return new av3.c(bitmap, matrix2);
        }
        if (getDrawable() instanceof com.tencent.mm.plugin.gif.k) {
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            kotlin.jvm.internal.o.e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
            f17 = ((com.tencent.mm.plugin.gif.k) drawable2).e();
        } else if (getDrawable() instanceof com.tencent.mm.plugin.gif.u) {
            android.graphics.drawable.Drawable drawable3 = getDrawable();
            kotlin.jvm.internal.o.e(drawable3, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
            f17 = ((com.tencent.mm.plugin.gif.u) drawable3).e();
        } else {
            f17 = 1.0f;
        }
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        matrix3.setScale(f17, f17);
        matrix3.postConcat(((w22.i) eVar).f442545b.f24917g);
        if (matrix != null) {
            matrix3.postConcat(matrix);
        }
        com.tencent.mm.api.IEmojiInfo emojiInfo = getEmojiInfo();
        kotlin.jvm.internal.o.d(emojiInfo);
        return new av3.e(emojiInfo, matrix3);
    }

    @Override // b32.c0
    public void setEditing(boolean z17) {
        w22.i iVar = (w22.i) this.f98740r;
        iVar.f442550g = z17;
        java.lang.Object obj = iVar.f442544a;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) obj).postInvalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            r22.e eVar = this.f98740r;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            w22.i iVar = (w22.i) eVar;
            bw3.e eVar2 = iVar.f442545b;
            eVar2.f24926p = intrinsicWidth;
            eVar2.f24925o = intrinsicHeight;
            android.graphics.Rect rect = iVar.f442548e;
            rect.right = intrinsicWidth;
            rect.bottom = intrinsicHeight;
            iVar.a();
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEditorItemView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEditorItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
