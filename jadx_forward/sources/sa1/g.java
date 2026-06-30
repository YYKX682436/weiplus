package sa1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa1.i f486816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 f486817e;

    public g(sa1.i iVar, com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2) {
        this.f486816d = iVar;
        this.f486817e = c4216x654bedf2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa1.i iVar = this.f486816d;
        hh.g gVar = iVar.f486826f;
        gVar.getClass();
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 view = this.f486817e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        gVar.f362974a.remove(view);
        android.widget.FrameLayout frameLayout = iVar.f486825e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        frameLayout.removeView(view);
    }
}
