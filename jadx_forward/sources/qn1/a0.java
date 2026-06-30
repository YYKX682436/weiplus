package qn1;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn1.b0 f446468e;

    public a0(qn1.b0 b0Var, int i17) {
        this.f446468e = b0Var;
        this.f446467d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn1.b bVar = this.f446468e.f446470a.f446483b;
        if (bVar != null) {
            ((un1.c) bVar).a(this.f446467d);
        }
    }
}
