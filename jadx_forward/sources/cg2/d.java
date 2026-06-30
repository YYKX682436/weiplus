package cg2;

/* loaded from: classes3.dex */
public final class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f122629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122630e;

    public d(android.widget.PopupWindow.OnDismissListener onDismissListener, in5.s0 s0Var) {
        this.f122629d = onDismissListener;
        this.f122630e = s0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        this.f122629d.onDismiss();
        cg2.i.a(cg2.i.f122639a, this.f122630e, ml2.t1.f409491j3);
    }
}
