package db5;

/* loaded from: classes5.dex */
public class h2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f309894d;

    public h2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905) {
        this.f309894d = c21493x36e72905;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f309894d.f278916r;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
