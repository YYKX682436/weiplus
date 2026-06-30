package dh4;

/* loaded from: classes8.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p21.a f314110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314113g;

    public s(dh4.t tVar, p21.a aVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f314110d = aVar;
        this.f314111e = str;
        this.f314112f = str2;
        this.f314113g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f314110d.Z1(this.f314111e, this.f314112f, this.f314113g);
    }
}
