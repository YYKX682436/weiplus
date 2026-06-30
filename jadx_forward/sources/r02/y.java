package r02;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 f449876d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 c13244xeb3e7387) {
        this.f449876d = c13244xeb3e7387;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 c13244xeb3e7387 = this.f449876d;
        int lineCount = c13244xeb3e7387.f178918d.getLineCount();
        if (lineCount > 2) {
            return;
        }
        android.text.Layout layout = c13244xeb3e7387.f178918d.getLayout();
        android.text.TextPaint paint = c13244xeb3e7387.f178918d.getPaint();
        if (layout == null || lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        int lineEnd = layout.getLineEnd(0);
        java.lang.String charSequence = c13244xeb3e7387.f178918d.getText().toString();
        java.lang.String substring = charSequence.substring(lineEnd, lineEnd * 2);
        int measureText = (int) paint.measureText(substring);
        int measureText2 = (int) paint.measureText(".");
        int measureText3 = (int) paint.measureText(c13244xeb3e7387.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5v));
        while (measureText + (measureText2 * 3) + measureText3 > layout.getEllipsizedWidth() && substring.length() > 0) {
            substring = substring.substring(0, substring.length() - 1);
            measureText = (int) paint.measureText(substring);
        }
        c13244xeb3e7387.f178918d.setText(charSequence.substring(0, lineEnd) + substring + "...");
        c13244xeb3e7387.f178919e.setVisibility(0);
    }
}
