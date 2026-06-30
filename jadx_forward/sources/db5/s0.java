package db5;

/* loaded from: classes8.dex */
public class s0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f310034d;

    public s0(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f310034d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f310034d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, 0);
        }
    }
}
