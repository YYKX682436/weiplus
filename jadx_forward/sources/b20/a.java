package b20;

/* loaded from: classes8.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f98856d;

    public a(java.util.LinkedList linkedList) {
        this.f98856d = linkedList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.util.Iterator it = this.f98856d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = i17 + 1;
            bw5.x5 x5Var = (bw5.x5) it.next();
            g4Var.f(i17, x5Var.f116495f[1] ? x5Var.f116493d : "");
            i17 = i18;
        }
    }
}
