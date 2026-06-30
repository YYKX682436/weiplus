package re2;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.g f475962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475964g;

    public i(yz5.l lVar, re2.g gVar, int i17, java.lang.String str) {
        this.f475961d = lVar;
        this.f475962e = gVar;
        this.f475963f = i17;
        this.f475964g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f475961d.mo146xb9724478(new re2.h(this.f475962e, this.f475963f, this.f475964g));
    }
}
