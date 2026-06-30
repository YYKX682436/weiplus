package dk5;

/* loaded from: classes.dex */
public final class x implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n13.t f316515a;

    public x(n13.t tVar) {
        this.f316515a = tVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String str;
        if (intent == null || (str = intent.getStringExtra("Retr_ForwardExtraText")) == null) {
            str = "";
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_group_to_do", intent != null ? intent.getBooleanExtra("KSendGroupToDo", false) : false);
        n13.t tVar = this.f316515a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = tVar.f415666a;
        if (jVar != null) {
            jVar.a(i17 == -1, str, 0);
        }
        n13.x xVar = tVar.f415667b;
        if (xVar != null) {
            xVar.a(i17 == -1, str, bundle);
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = tVar.f415669d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
