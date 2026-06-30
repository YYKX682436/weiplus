package ch0;

/* loaded from: classes8.dex */
public final class y implements tg0.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch0.z f122791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 f122792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p769x48fb3bf9.p770x7998cae9.C10695xc5d83ecc f122793c;

    public y(ch0.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 abstractActivityC19400xd202f864, com.p314xaae8f345.mm.p689xc5a27af6.p769x48fb3bf9.p770x7998cae9.C10695xc5d83ecc c10695xc5d83ecc) {
        this.f122791a = zVar;
        this.f122792b = abstractActivityC19400xd202f864;
        this.f122793c = c10695xc5d83ecc;
    }

    public void a() {
        java.lang.String content = "removing lifecycle observer for activity: " + this.f122791a.f122798e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        this.f122792b.mo273xed6858b4().c(this.f122793c);
    }
}
