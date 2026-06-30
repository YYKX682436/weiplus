package os3;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f429654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed f429655e;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed, android.widget.Button button) {
        this.f429655e = c16936x21d2caed;
        this.f429654d = button;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.Button button = this.f429654d;
        button.invalidate();
        button.setOnTouchListener(new os3.i2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16936x21d2caed c16936x21d2caed = this.f429655e;
        c16936x21d2caed.a();
        c16936x21d2caed.invalidate();
    }
}
