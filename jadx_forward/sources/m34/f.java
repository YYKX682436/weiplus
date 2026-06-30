package m34;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f f404883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f404884e;

    public f(m34.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f404883d = c17689x58a87b4f;
        this.f404884e = layoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f404883d.setLayoutParams(this.f404884e);
    }
}
