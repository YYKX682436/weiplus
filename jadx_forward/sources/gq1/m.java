package gq1;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gq1.d f356045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq1.o f356046g;

    public m(gq1.o oVar, int i17, java.lang.String str, gq1.d dVar) {
        this.f356046g = oVar;
        this.f356043d = i17;
        this.f356044e = str;
        this.f356045f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f356046g.f356053d.a(null, this.f356043d, this.f356044e, this.f356045f);
    }
}
