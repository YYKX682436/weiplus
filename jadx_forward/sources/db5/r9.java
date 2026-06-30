package db5;

/* loaded from: classes8.dex */
public class r9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 f310033d;

    public r9(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1) {
        this.f310033d = c21535xbb7029d1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1 = this.f310033d;
        boolean z18 = c21535xbb7029d1.f279263m;
        if (z17 || !c21535xbb7029d1.f279263m) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1.a(c21535xbb7029d1);
        c21535xbb7029d1.f279263m = false;
    }
}
