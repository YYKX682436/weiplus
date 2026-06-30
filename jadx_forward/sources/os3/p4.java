package os3;

/* loaded from: classes8.dex */
public class p4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f429707d;

    public p4(os3.u4 u4Var, java.lang.String[] strArr) {
        this.f429707d = strArr;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        for (java.lang.String str : this.f429707d) {
            g4Var.add(str);
        }
    }
}
