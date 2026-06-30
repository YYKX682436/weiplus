package bw4;

/* loaded from: classes3.dex */
public class e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb f106472d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb c19229x611ccebb) {
        this.f106472d = c19229x611ccebb;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i19 - i17 != i37 - i28) {
            this.f106472d.m();
        }
    }
}
