package db5;

/* loaded from: classes11.dex */
public class k6 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f309954d;

    public k6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f309954d = c21516xe823d84a;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        db5.t6 t6Var;
        if (!z17 || (t6Var = this.f309954d.C) == null) {
            return;
        }
        t6Var.c();
    }
}
