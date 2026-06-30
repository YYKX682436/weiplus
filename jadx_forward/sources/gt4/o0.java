package gt4;

/* loaded from: classes8.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f357014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f357015e;

    public o0(android.widget.TextView textView, gt4.s0 s0Var) {
        this.f357014d = textView;
        this.f357015e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f357014d;
        textView.setSelected(true);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setTextColor(this.f357015e.f357067d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }
}
