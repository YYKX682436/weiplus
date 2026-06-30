package zh0;

/* loaded from: classes4.dex */
public final class d extends android.text.method.LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public zh0.c f554388a;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if ((!(r3.length == 0)) == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zh0.c a(android.widget.TextView r3, android.text.Spannable r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            float r0 = r5.getX()
            int r0 = (int) r0
            int r1 = r3.getTotalPaddingLeft()
            int r0 = r0 - r1
            int r1 = r3.getScrollX()
            int r0 = r0 + r1
            float r5 = r5.getY()
            int r5 = (int) r5
            int r1 = r3.getTotalPaddingTop()
            int r5 = r5 - r1
            int r1 = r3.getScrollY()
            int r5 = r5 + r1
            android.text.Layout r3 = r3.getLayout()
            int r5 = r3.getLineForVertical(r5)
            float r0 = (float) r0
            int r3 = r3.getOffsetForHorizontal(r5, r0)
            java.lang.Class<zh0.c> r5 = zh0.c.class
            java.lang.Object[] r3 = r4.getSpans(r3, r3, r5)
            zh0.c[] r3 = (zh0.c[]) r3
            r4 = 0
            if (r3 == 0) goto L41
            int r5 = r3.length
            r0 = 1
            if (r5 != 0) goto L3c
            r5 = r0
            goto L3d
        L3c:
            r5 = r4
        L3d:
            r5 = r5 ^ r0
            if (r5 != r0) goto L41
            goto L42
        L41:
            r0 = r4
        L42:
            if (r0 == 0) goto L47
            r3 = r3[r4]
            goto L48
        L47:
            r3 = 0
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zh0.d.a(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):zh0.c");
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView widget, android.text.Spannable buffer, android.view.MotionEvent event) {
        zh0.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int action = event.getAction();
        if (action == 0) {
            zh0.c a17 = a(widget, buffer, event);
            if (a17 != null) {
                this.f554388a = a17;
                ((ai0.a) a17).f86576h = true;
                android.text.Selection.setSelection(buffer, buffer.getSpanStart(a17), buffer.getSpanEnd(a17));
            }
        } else if (action != 2) {
            zh0.c cVar2 = this.f554388a;
            if (cVar2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
                ((ai0.a) cVar2).f86576h = false;
                super.onTouchEvent(widget, buffer, event);
                this.f554388a = null;
            }
            android.text.Selection.removeSelection(buffer);
        } else {
            zh0.c a18 = a(widget, buffer, event);
            if (a18 != null && (cVar = this.f554388a) != null && a18 != cVar) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                ((ai0.a) cVar).f86576h = false;
                this.f554388a = null;
                android.text.Selection.removeSelection(buffer);
            }
        }
        return true;
    }
}
