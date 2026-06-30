package sj3;

/* loaded from: classes14.dex */
public final class e5 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed f490034d;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed) {
        this.f490034d = c16587x33e31ed;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "refreshDebugInfo";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16587x33e31ed c16587x33e31ed = this.f490034d;
        android.widget.TextView textView = c16587x33e31ed.f231873f;
        if (textView != null) {
            textView.setText(r26.b0.b("\n            mid: " + c16587x33e31ed.mId + "\n            fps: " + c16587x33e31ed.f231882r + "\n            size: " + c16587x33e31ed.f231885u + 'x' + c16587x33e31ed.f231886v + "\n            isILink: " + c16587x33e31ed.f231884t + "\n            "));
        }
        c16587x33e31ed.f231882r = 0;
    }
}
