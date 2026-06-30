package dk5;

/* loaded from: classes9.dex */
public class s4 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316411d;

    public s4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.lang.String str) {
        this.f316411d = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str = this.f316411d;
        if (str.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str);
    }
}
