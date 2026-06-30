package jk5;

/* loaded from: classes13.dex */
public class m implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.n f381711d;

    public m(jk5.n nVar) {
        this.f381711d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        jk5.o oVar;
        jk5.n nVar = this.f381711d;
        if (!nVar.f381712a || (oVar = nVar.f381713b) == null) {
            return;
        }
        ((jk5.j) oVar.f381716e).c();
        nVar.f381713b.dismiss();
    }
}
