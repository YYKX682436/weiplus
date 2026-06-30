package in4;

/* loaded from: classes8.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 f374485e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2311xd1075a44.C18766xb71d9084 c18766xb71d9084, android.view.View view) {
        this.f374485e = c18766xb71d9084;
        this.f374484d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f374484d.postDelayed(new in4.b0(this), 175L);
    }
}
