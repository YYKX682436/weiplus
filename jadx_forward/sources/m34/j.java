package m34;

/* loaded from: classes4.dex */
public class j implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m34.n f404888d;

    public j(m34.n nVar) {
        this.f404888d = nVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        m34.n nVar = this.f404888d;
        nVar.f404893e.post(new m34.i(this));
        nVar.f404892d.mo69317x764cf626(true);
        if (nVar.f404892d.mo69330x68ac462()) {
            nVar.f404899n.c(nVar);
        } else {
            nVar.c();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoPopupHelper", "on play video error, what %d extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        m34.n nVar = this.f404888d;
        nVar.f404892d.mo69303x360802();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.b());
        sb6.append("[SightPopupHelper] on play video error, what ");
        sb6.append(i17);
        sb6.append(" extra ");
        sb6.append(i18);
        sb6.append(", path=");
        java.lang.String str = nVar.f404895g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new m34.h(this, null, nVar.f404895g));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        fp.k.b();
        m34.n nVar = this.f404888d;
        if (nVar.f404892d.mo69330x68ac462()) {
            nVar.f404899n.c(nVar);
        } else {
            nVar.c();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
