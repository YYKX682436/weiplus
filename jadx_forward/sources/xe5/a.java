package xe5;

/* loaded from: classes3.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f535508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.f f535509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f535510f;

    public a(boolean z17, xe5.f fVar, java.util.Map map, java.lang.String str) {
        this.f535508d = z17;
        this.f535509e = fVar;
        this.f535510f = map;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        boolean z17 = this.f535508d;
        java.util.Map map = this.f535510f;
        xe5.f fVar = this.f535509e;
        if (z17) {
            fVar.getClass();
            g4Var.add(0, 3, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.axa, map.get(".msg.appmsg.extinfo.notifymsg.title.nickname")));
        } else {
            fVar.getClass();
            g4Var.d(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ax_, map.get(".msg.appmsg.extinfo.notifymsg.title.nickname")));
        }
        fVar.getClass();
        g4Var.add(0, 1, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hcr));
    }
}
