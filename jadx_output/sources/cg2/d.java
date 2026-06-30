package cg2;

/* loaded from: classes3.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f41096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f41097e;

    public d(android.widget.PopupWindow.OnDismissListener onDismissListener, in5.s0 s0Var) {
        this.f41096d = onDismissListener;
        this.f41097e = s0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        this.f41096d.onDismiss();
        cg2.i.a(cg2.i.f41106a, this.f41097e, ml2.t1.f327958j3);
    }
}
