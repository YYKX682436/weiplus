package ni2;

/* loaded from: classes3.dex */
public final class w1 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f419033d;

    public w1(ni2.z1 z1Var) {
        this.f419033d = z1Var;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        ni2.z1 z1Var = this.f419033d;
        fg2.p1 p1Var = z1Var.K;
        if (p1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (!(p1Var.f343776w.getTranslationY() == 0.0f)) {
            z1Var.g0();
        } else if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        return true;
    }
}
