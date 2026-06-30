package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f97266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f97267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.f0 f97268f;

    public e0(com.tencent.mm.plugin.downloader_app.model.f0 f0Var, android.widget.TextView textView, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f97268f = f0Var;
        this.f97266d = textView;
        this.f97267e = ballInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onBallNameTextViewSet");
        android.widget.TextView textView = this.f97266d;
        android.text.Layout layout = textView.getLayout();
        if (layout == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadFloatBallHelper", "onBallNameTextViewSet layout null");
            return;
        }
        int lineCount = layout.getLineCount();
        if (layout.getLineCount() > 0) {
            int i17 = lineCount - 1;
            if (layout.getEllipsisCount(i17) > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "ellipsis detected - lineCount: " + lineCount + ", maxLines: " + textView.getMaxLines());
                android.text.TextPaint paint = textView.getPaint();
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f97267e;
                java.lang.String str2 = ballInfo.f93063x;
                com.tencent.mm.plugin.downloader_app.model.f0 f0Var = this.f97268f;
                java.util.Iterator it = f0Var.f97269a.f97289n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "下载中";
                        break;
                    } else {
                        str = (java.lang.String) it.next();
                        if (str2.endsWith(str)) {
                            break;
                        }
                    }
                }
                java.lang.String str3 = "..." + str;
                java.lang.String str4 = ballInfo.f93063x;
                java.util.Iterator it6 = f0Var.f97269a.f97289n.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.String str5 = "..." + ((java.lang.String) it6.next());
                    if (str4.endsWith(str5)) {
                        str4 = str4.substring(0, str4.length() - str5.length());
                        break;
                    }
                }
                int measureText = (int) paint.measureText(str3);
                int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
                if (width <= 0) {
                    width = layout.getWidth();
                }
                int i18 = width - measureText;
                if (i18 > 0) {
                    if (lineCount == 1 || textView.getMaxLines() == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "handling single line ellipsis");
                        f0Var.getClass();
                        if (i18 > 0) {
                            while (paint.measureText(str4) > i18 && str4.length() > 0) {
                                str4 = str4.substring(0, str4.length() - 1);
                            }
                            int length = str4.length();
                            com.tencent.mm.plugin.downloader_app.model.l0 l0Var = f0Var.f97269a;
                            if (length <= 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "text too long, only show suffix: " + str3);
                                l0Var.Z(str3);
                                return;
                            }
                            java.lang.String str6 = str4 + str3;
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "single line final name: " + str6);
                            l0Var.Z(str6);
                            return;
                        }
                        return;
                    }
                    if (lineCount >= 2 || textView.getMaxLines() >= 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "handling multi-line ellipsis");
                        f0Var.getClass();
                        int lineStart = layout.getLineStart(i17);
                        int lineEnd = layout.getLineEnd(i17);
                        if (lineEnd > str4.length()) {
                            lineEnd = str4.length();
                        }
                        str4.substring(lineStart, lineEnd);
                        layout.getLineWidth(i17);
                        if (i18 > 0) {
                            java.lang.String substring = str4.substring(lineStart, java.lang.Math.min(layout.getEllipsisStart(i17) + lineStart, str4.length()));
                            java.lang.String substring2 = str4.substring(0, lineStart);
                            int measureText2 = (int) paint.measureText(substring);
                            com.tencent.mm.plugin.downloader_app.model.l0 l0Var2 = f0Var.f97269a;
                            if (measureText2 <= i18) {
                                java.lang.String str7 = substring2 + substring + str3;
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "multi-line final name: " + str7);
                                l0Var2.Z(str7);
                                return;
                            }
                            while (((int) paint.measureText(substring)) > i18 && substring.length() > 0) {
                                substring = substring.substring(0, substring.length() - 1);
                            }
                            if (substring.length() <= 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "multi-line too long, adjust layout");
                                return;
                            }
                            java.lang.String str8 = substring2 + substring + str3;
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "multi-line truncated final name: " + str8);
                            l0Var2.Z(str8);
                        }
                    }
                }
            }
        }
    }
}
