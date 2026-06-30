package si1;

/* loaded from: classes7.dex */
public final class n1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 f489810d;

    public n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.d9 d9Var) {
        this.f489810d = d9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f489810d.f274076g;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }
}
