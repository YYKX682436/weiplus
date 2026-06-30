package js5;

/* loaded from: classes15.dex */
public class a extends js5.b {
    @Override // js5.b
    public void b(android.graphics.Canvas canvas, android.text.TextPaint textPaint, java.util.List list) {
        a(list);
        int color = textPaint.getColor();
        textPaint.setColor(((android.text.style.BackgroundColorSpan) this.f383104g).getBackgroundColor());
        java.util.Iterator it = this.f383101d.iterator();
        while (it.hasNext()) {
            canvas.drawRect((android.graphics.RectF) it.next(), textPaint);
        }
        textPaint.setColor(color);
    }
}
