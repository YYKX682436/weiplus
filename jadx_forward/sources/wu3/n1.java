package wu3;

/* loaded from: classes15.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f531316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 f531317e;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17047xc20d96b0 c17047xc20d96b0, int i17) {
        this.f531317e = c17047xc20d96b0;
        this.f531316d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.view.View*/.setVisibility(this.f531316d);
    }
}
