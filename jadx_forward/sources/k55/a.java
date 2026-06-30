package k55;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f385993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k55.b f385995f;

    public a(k55.b bVar, java.lang.Object[] objArr, java.lang.String str) {
        this.f385995f = bVar;
        this.f385993d = objArr;
        this.f385994e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object[] objArr = this.f385993d;
        k55.b bVar = this.f385995f;
        bVar.f385996d.b(bVar, this.f385994e, bVar.d(objArr));
    }
}
