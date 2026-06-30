package kp1;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c f392476d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12880x474fa32c c12880x474fa32c) {
        this.f392476d = c12880x474fa32c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f392476d.f174532s;
        if (textView != null) {
            textView.setSelected(true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendDesc");
            throw null;
        }
    }
}
