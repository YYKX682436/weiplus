package db5;

/* loaded from: classes5.dex */
public class c2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 f309835d;

    public c2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 c21491x5f1c5be9) {
        this.f309835d = c21491x5f1c5be9;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 c21491x5f1c5be9 = this.f309835d;
        if (view == c21491x5f1c5be9.f278895d || view == c21491x5f1c5be9.f278896e) {
            c21491x5f1c5be9.a(z17);
        }
    }
}
