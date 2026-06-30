package bt3;

/* loaded from: classes9.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt3.l0 f24345d;

    public m0(bt3.l0 l0Var) {
        this.f24345d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.d dVar;
        bt3.l0 l0Var = this.f24345d;
        com.tencent.mm.modelbase.v0 v0Var = l0Var.f24314f;
        if (v0Var == null || (dVar = l0Var.f24315g) == null) {
            return;
        }
        v0Var.S(dVar.field_offset, dVar.field_totalLen, l0Var);
    }
}
