package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public class d0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f272731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f272732e;

    public d0(android.text.Spannable spannable, android.widget.TextView textView) {
        this.f272731d = spannable;
        this.f272732e = textView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.text.style.ClickableSpan[] clickableSpanArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/MMSpanManager$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.widget.TextView textView2 = this.f272732e;
        android.text.Spannable spannable = this.f272731d;
        boolean z17 = false;
        if ((action == 1 || action == 3) && (clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ClickableSpan.class)) != null && clickableSpanArr.length > 0) {
            for (android.text.style.ClickableSpan clickableSpan : clickableSpanArr) {
                if (clickableSpan instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) clickableSpan).mo2167x263a2556(false);
                    textView2.invalidate();
                }
            }
        }
        if (action == 1 || action == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int paddingLeft = x17 - textView.getPaddingLeft();
            int paddingTop = y17 - textView.getPaddingTop();
            int scrollX = paddingLeft + textView.getScrollX();
            int scrollY = paddingTop + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            android.text.style.ClickableSpan[] clickableSpanArr2 = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
            if (clickableSpanArr2.length != 0) {
                android.text.style.ClickableSpan clickableSpan2 = clickableSpanArr2[0];
                if (action == 1) {
                    clickableSpan2.onClick(textView);
                } else {
                    if (clickableSpan2 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) {
                        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) clickableSpan2).mo2167x263a2556(true);
                        textView2.invalidate();
                    }
                    android.text.Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpan2));
                }
                z17 = true;
            } else {
                android.text.Selection.removeSelection(spannable);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSpanManager", "touch ${event.x}, ${event.y}, ret:${ret}");
        yj0.a.i(z17, this, "com/tencent/mm/pluginsdk/ui/span/MMSpanManager$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
