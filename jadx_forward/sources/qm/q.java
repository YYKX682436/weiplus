package qm;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f446184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f446185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm.x f446186g;

    public q(qm.x xVar, java.lang.String str, boolean z17, boolean z18) {
        this.f446186g = xVar;
        this.f446183d = str;
        this.f446184e = z17;
        this.f446185f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        qm.x.c(this.f446186g, this.f446183d, this.f446184e, this.f446185f);
    }
}
