package s61;

/* loaded from: classes.dex */
public class g1 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s61.m1 f484886d;

    public g1(s61.m1 m1Var) {
        this.f484886d = m1Var;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        z61.c cVar = (z61.c) obj;
        if (cVar.f551857a == z61.b.f551855e) {
            int i17 = cVar.f551858b;
            s61.m1 m1Var = this.f484886d;
            if (i17 != 1) {
                m1Var.f484911o = null;
            } else {
                m1Var.f484911o = cVar.f551860d;
                m1Var.c();
            }
        }
    }
}
