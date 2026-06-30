package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class cm implements y21.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f280430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm f280431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f280432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f280433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f280434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f280436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f280437h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f280438i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f280439j;

    public cm(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar, yb5.d dVar, long j17, long j18, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, pn4.e1 e1Var) {
        this.f280430a = c0Var;
        this.f280431b = fmVar;
        this.f280432c = dVar;
        this.f280433d = j17;
        this.f280434e = j18;
        this.f280435f = str;
        this.f280436g = f0Var;
        this.f280437h = arrayList;
        this.f280438i = c0Var2;
        this.f280439j = e1Var;
    }

    @Override // y21.a
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "onPlayInterrupt");
        this.f280431b.t0(this.f280432c);
        this.f280439j.f438622h = null;
    }

    @Override // y21.a
    /* renamed from: onComplete */
    public void mo79464x815f5438() {
        if (this.f280437h.size() > 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f280438i;
            if (!c0Var.f391645d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify end");
                c0Var.f391645d = true;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f280431b;
                fmVar.m0(2);
                fmVar.t0(this.f280432c);
            }
        }
        this.f280439j.f438622h = null;
    }

    @Override // y21.a
    /* renamed from: onProgress */
    public void mo79465x696ee52c(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "onProgress " + f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f280430a;
        boolean z17 = c0Var.f391645d;
        long j17 = this.f280433d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f280431b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextToSpeechComponent", "notify start");
            yb5.d dVar = this.f280432c;
            fmVar.n0(dVar);
            fmVar.o0(dVar);
            fmVar.f280592e = j17;
            fmVar.f280599o.f468759d = this.f280434e;
            fmVar.f280593f = 0L;
            c0Var.f391645d = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bm(dVar));
        }
        int ceil = (int) java.lang.Math.ceil((this.f280435f != null ? r0.length() : 0) * f17);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f280436g;
        if (ceil != f0Var.f391649d) {
            sb5.h2 h2Var = fmVar.f280596i;
            if (h2Var != null) {
                h2Var.a(ceil, java.lang.Long.valueOf(j17));
            }
            f0Var.f391649d = ceil;
        }
    }
}
