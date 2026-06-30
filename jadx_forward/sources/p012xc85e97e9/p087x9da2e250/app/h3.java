package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.i3 f92869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.n3 f92870e;

    public h3(p012xc85e97e9.p087x9da2e250.app.n3 n3Var, p012xc85e97e9.p087x9da2e250.app.i3 i3Var) {
        this.f92870e = n3Var;
        this.f92869d = i3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.n3 n3Var = this.f92870e;
        java.util.ArrayList arrayList = n3Var.f92954b;
        p012xc85e97e9.p087x9da2e250.app.i3 i3Var = this.f92869d;
        arrayList.remove(i3Var);
        n3Var.f92955c.remove(i3Var);
    }
}
