package i53;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f370096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f370097e;

    public e1(i53.i1 i1Var, java.util.ArrayList arrayList) {
        this.f370097e = i1Var;
        this.f370096d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.i1 i1Var = this.f370097e;
        i1Var.f370127d.clear();
        java.util.ArrayList arrayList = this.f370096d;
        if (arrayList != null) {
            i1Var.f370127d.addAll(arrayList);
        }
        i1Var.m8146xced61ae5();
    }
}
