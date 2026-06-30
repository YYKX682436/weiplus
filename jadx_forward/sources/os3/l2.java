package os3;

/* loaded from: classes8.dex */
public class l2 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f429675d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed) {
        this.f429675d = c16936x21d2caed;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 5) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this.f429675d;
        java.lang.String obj = c16936x21d2caed.f236417f.getEditableText().toString();
        if (obj == null || obj.length() <= 0) {
            return true;
        }
        c16936x21d2caed.e(obj, false);
        c16936x21d2caed.a();
        return true;
    }
}
