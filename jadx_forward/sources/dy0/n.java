package dy0;

/* loaded from: classes5.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f326092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dy0.m f326093e;

    public n(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, dy0.m mVar) {
        this.f326092d = c1163xf1deaba4;
        this.f326093e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f326092d.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).m8099x6305639d(this.f326093e);
    }
}
