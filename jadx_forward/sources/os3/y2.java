package os3;

/* loaded from: classes8.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.z2 f429789e;

    public y2(os3.z2 z2Var, java.lang.String str) {
        this.f429789e = z2Var;
        this.f429788d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.m125854x26a183b(this.f429789e.f429796a, this.f429788d, 0).show();
    }
}
