package df2;

/* loaded from: classes10.dex */
public final class kb implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312100d;

    public kb(df2.zb zbVar) {
        this.f312100d = zbVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        df2.zb zbVar = this.f312100d;
        android.widget.TextView g76 = zbVar.g7();
        if (g76 != null && (viewTreeObserver = g76.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        android.widget.TextView g77 = zbVar.g7();
        android.text.Layout layout = g77 != null ? g77.getLayout() : null;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            android.widget.TextView g78 = zbVar.g7();
            int maxLines = g78 != null ? g78.getMaxLines() : 0;
            boolean z17 = true;
            boolean z18 = lineCount > maxLines || (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0);
            zbVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int lineCount2 = layout.getLineCount();
            if (maxLines <= lineCount2) {
                lineCount2 = maxLines;
            }
            for (int i17 = 0; i17 < lineCount2; i17++) {
                sb6.append(layout.getText().subSequence(layout.getLineStart(i17), layout.getEllipsisCount(i17) > 0 ? layout.getLineStart(i17) + layout.getEllipsisStart(i17) : layout.getLineEnd(i17)));
            }
            if (layout.getLineCount() <= maxLines && (layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0)) {
                z17 = false;
            }
            if (z17) {
                sb6.append("...");
            }
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zbVar.f313472m, "[aiAssistant DetailDesc] isTruncated:" + z18 + ", displayedText:" + sb7);
            if (!z18 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zbVar.f313483x, sb7)) {
                return;
            }
            zbVar.f313483x = sb7;
            zbVar.s7(r45.n72.kActionType_AiassistantTextOutOfLimit, 0, sb7);
        }
    }
}
