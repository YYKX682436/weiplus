package g04;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g04.h f348992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g04.g f348993e;

    public f(g04.g gVar, g04.h hVar) {
        this.f348993e = gVar;
        this.f348992d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g04.g gVar = this.f348993e;
        this.f348992d.k5(new g04.i(gVar.f348994d), gVar.f348995e);
    }
}
