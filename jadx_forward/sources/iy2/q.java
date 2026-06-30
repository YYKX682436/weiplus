package iy2;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 f377439d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15488x2a0085b4 c15488x2a0085b4) {
        this.f377439d = c15488x2a0085b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f377439d.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setVisibility(0);
    }
}
