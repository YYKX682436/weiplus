package e33;

/* loaded from: classes10.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f328832d;

    public k(e33.b0 b0Var, android.view.View view) {
        this.f328832d = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.view.View view = this.f328832d;
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(false);
        }
    }
}
