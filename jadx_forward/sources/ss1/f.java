package ss1;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 f493433d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547) {
        this.f493433d = c13025x6878a547;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1304xd1075a44.C13025x6878a547 c13025x6878a547 = this.f493433d;
        android.widget.TextView textView = c13025x6878a547.f176124m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = c13025x6878a547.f176124m;
        if (textView2 == null) {
            return;
        }
        textView2.setText(c13025x6878a547.f176118d);
    }
}
