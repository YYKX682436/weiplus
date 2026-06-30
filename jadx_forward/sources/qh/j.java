package qh;

/* loaded from: classes12.dex */
public class j implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh.u f444892a;

    public j(qh.t tVar, qh.u uVar) {
        this.f444892a = uVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.v k17 = ((rh.w) obj).k(0L);
        qh.u uVar = this.f444892a;
        uVar.c("run_time");
        uVar.h("time", (((java.lang.Long) k17.f477051d.f477085a).longValue() / 60000) + "(min)");
        uVar.h("fg", java.lang.String.valueOf(k17.f477052e.f477085a));
        uVar.h("bg", java.lang.String.valueOf(k17.f477053f.f477085a));
        uVar.h("fgSrv", java.lang.String.valueOf(k17.f477054g.f477085a));
        uVar.h("float", java.lang.String.valueOf(k17.f477055h.f477085a));
    }
}
