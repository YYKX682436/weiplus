package db5;

/* loaded from: classes5.dex */
public class s1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f310035d;

    public s1(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04) {
        this.f310035d = c21486x59d05a04;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = this.f310035d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = c21486x59d05a04.f278861g;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        c21486x59d05a04.b();
    }
}
