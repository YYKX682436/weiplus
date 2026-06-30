package i53;

/* loaded from: classes8.dex */
public class b4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.d4 f370060d;

    public b4(i53.d4 d4Var) {
        this.f370060d = d4Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = 0;
        while (true) {
            i53.d4 d4Var = this.f370060d;
            if (i17 >= d4Var.f370094d.f221622m.size()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2 c15698x77f8a9c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2) d4Var.f370094d.f221622m.valueAt(i17);
            g4Var.f(c15698x77f8a9c2.f220227d, c15698x77f8a9c2.f220228e);
            i17++;
        }
    }
}
