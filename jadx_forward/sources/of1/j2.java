package of1;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426481f;

    public j2(of1.m2 m2Var, java.lang.String str, int i17) {
        this.f426481f = m2Var;
        this.f426479d = str;
        this.f426480e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f426481f.f426508e;
        if (nVar != null) {
            nVar.s0(this.f426479d, this.f426480e);
        }
    }
}
