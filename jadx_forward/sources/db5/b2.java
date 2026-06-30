package db5;

/* loaded from: classes5.dex */
public class b2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b f309824d;

    public b2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b c21490xb2dd0b6b) {
        this.f309824d = c21490xb2dd0b6b;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f309824d.f278894h;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
