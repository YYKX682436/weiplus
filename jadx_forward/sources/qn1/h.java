package qn1;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f446521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn1.d f446522f;

    public h(qn1.d dVar, int i17, int i18) {
        this.f446522f = dVar;
        this.f446520d = i17;
        this.f446521e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        qn1.c.i().k().e();
        this.f446522f.f(this.f446520d, this.f446521e);
    }
}
