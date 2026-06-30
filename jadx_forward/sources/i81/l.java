package i81;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f371130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f371131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yc f371132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i81.q f371133g;

    public l(i81.q qVar, boolean z17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.yc ycVar) {
        this.f371133g = qVar;
        this.f371130d = z17;
        this.f371131e = str;
        this.f371132f = ycVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f371133g.a(this.f371130d, this.f371131e, this.f371132f);
    }
}
