package qn1;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn1.t f446536e;

    public r(qn1.t tVar, int i17) {
        this.f446536e = tVar;
        this.f446535d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn1.b bVar = this.f446536e.f446548i;
        if (bVar != null) {
            ((un1.c) bVar).a(this.f446535d);
        }
    }
}
