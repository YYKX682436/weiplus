package kl3;

/* loaded from: classes10.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nl3.b f390383h;

    public v(kl3.z zVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, nl3.b bVar) {
        this.f390379d = str;
        this.f390380e = str2;
        this.f390381f = str3;
        this.f390382g = str4;
        this.f390383h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ql3.b Ai = ll3.o2.Ai();
        java.lang.String str = this.f390379d;
        java.lang.String str2 = this.f390380e;
        java.lang.String str3 = this.f390381f;
        java.lang.String str4 = this.f390382g;
        nl3.b bVar = this.f390383h;
        Ai.P0(str, str2, str3, str4, bVar.f419718h, bVar.f419719i);
    }
}
