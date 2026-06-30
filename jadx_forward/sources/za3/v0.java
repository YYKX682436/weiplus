package za3;

/* loaded from: classes15.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.b1 f552575d;

    public v0(za3.b1 b1Var) {
        this.f552575d = b1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        za3.a1 a1Var = this.f552575d.f552426b;
        if (a1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0) a1Var;
            p0Var.Y.f515901z = p0Var.f226266i.f226337f.mo1008xfb888c49();
            p0Var.f226261d.finish();
        }
    }
}
