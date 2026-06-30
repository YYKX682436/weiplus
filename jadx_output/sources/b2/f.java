package b2;

/* loaded from: classes13.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f17285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.TextPaint f17286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        super(0);
        this.f17285d = charSequence;
        this.f17286e = textPaint;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.CharSequence text = this.f17285d;
        kotlin.jvm.internal.o.g(text, "text");
        android.text.TextPaint paint = this.f17286e;
        kotlin.jvm.internal.o.g(paint, "paint");
        java.text.BreakIterator lineInstance = java.text.BreakIterator.getLineInstance(paint.getTextLocale());
        int i17 = 0;
        lineInstance.setText(new b2.a(text, 0, text.length()));
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(10, new b2.h$$a());
        int next = lineInstance.next();
        while (true) {
            int i18 = i17;
            i17 = next;
            if (i17 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)));
            } else {
                jz5.l lVar = (jz5.l) priorityQueue.peek();
                if (lVar != null && ((java.lang.Number) lVar.f302834e).intValue() - ((java.lang.Number) lVar.f302833d).intValue() < i17 - i18) {
                    priorityQueue.poll();
                    priorityQueue.add(new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17)));
                }
            }
            next = lineInstance.next();
        }
        java.util.Iterator it = priorityQueue.iterator();
        float f17 = 0.0f;
        while (it.hasNext()) {
            jz5.l lVar2 = (jz5.l) it.next();
            f17 = java.lang.Math.max(f17, android.text.Layout.getDesiredWidth(text, ((java.lang.Number) lVar2.f302833d).intValue(), ((java.lang.Number) lVar2.f302834e).intValue(), paint));
        }
        return java.lang.Float.valueOf(f17);
    }
}
