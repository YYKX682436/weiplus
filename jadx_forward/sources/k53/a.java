package k53;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k53.g f385863g;

    public a(k53.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f385863g = gVar;
        this.f385860d = str;
        this.f385861e = str2;
        this.f385862f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.p314xaae8f345.mm.p947xba6de98f.l3 Di = t21.o2.Di();
        k53.f fVar = this.f385863g.f385894g;
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_GameOnlineVideoProxy";
        oVar.f69601xaca5bdda = this.f385860d;
        oVar.M1 = this.f385861e;
        oVar.H1 = 1;
        oVar.Z = 3;
        oVar.f323342y0 = 4;
        oVar.f69595x6d25b0d9 = this.f385862f;
        oVar.f323348c2 = fVar;
        Di.e(oVar, false);
    }
}
