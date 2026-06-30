package s61;

/* loaded from: classes8.dex */
public class e0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f484875d;

    public e0(s61.i0 i0Var, java.util.HashMap hashMap) {
        this.f484875d = hashMap;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.util.Iterator it = this.f484875d.keySet().iterator();
        while (it.hasNext()) {
            g4Var.add((java.lang.String) it.next());
        }
    }
}
