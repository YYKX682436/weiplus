package bt3;

/* loaded from: classes9.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt3.l0 f24355d;

    public n0(bt3.l0 l0Var) {
        this.f24355d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.l0 l0Var = this.f24355d;
        com.tencent.mm.modelbase.v0 v0Var = l0Var.f24314f;
        if (v0Var != null) {
            com.tencent.mm.pluginsdk.model.app.d dVar = l0Var.f24315g;
            v0Var.S(dVar.field_offset, dVar.field_totalLen, l0Var);
        }
    }
}
