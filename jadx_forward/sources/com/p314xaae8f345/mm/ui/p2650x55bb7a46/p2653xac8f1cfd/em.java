package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class em extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f280518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm f280519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f280520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f280521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f280522h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280523i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar, yb5.d dVar, long j17, long j18, java.lang.String str) {
        super(1);
        this.f280518d = c0Var;
        this.f280519e = fmVar;
        this.f280520f = dVar;
        this.f280521g = j17;
        this.f280522h = j18;
        this.f280523i = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pn4.u0 newState = (pn4.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "trans state to " + newState);
        if (newState == pn4.u0.f438765g) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f280518d;
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                y21.h.e(this.f280519e.f280595h, false, false, 3, null);
                pm0.v.X(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dm(this.f280519e, this.f280520f, this.f280521g, this.f280522h, this.f280523i));
            }
        }
        return jz5.f0.f384359a;
    }
}
