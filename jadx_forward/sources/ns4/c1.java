package ns4;

/* loaded from: classes8.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421013d;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421013d = activityC19066x54c41420;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421013d;
        android.widget.TextView textView = activityC19066x54c41420.f260682d;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEncashTitleTV");
            throw null;
        }
        textView.getLocationInWindow(iArr);
        android.widget.ScrollView scrollView = activityC19066x54c41420.f260686h;
        if (scrollView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        scrollView.getLocationInWindow(iArr2);
        android.widget.ScrollView scrollView2 = activityC19066x54c41420.f260686h;
        if (scrollView2 != null) {
            scrollView2.scrollBy(0, iArr[1] - iArr2[1]);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
    }
}
