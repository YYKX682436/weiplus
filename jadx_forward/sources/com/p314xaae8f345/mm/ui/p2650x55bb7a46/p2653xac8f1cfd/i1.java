package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c
/* loaded from: classes9.dex */
public final class i1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f280740e = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h1.f280669d);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f280741f;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f280741f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("floatBallClickListener");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f280741f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("floatBallClickListener");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f280741f;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("floatBallClickListener");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        final com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f280113d.f542250l;
        this.f280741f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10512x81402a24>(abstractC21611x7536149b) { // from class: com.tencent.mm.ui.chatting.component.ChatRecordsTtsFloatBallComponent$onChattingInit$1
            {
                this.f39173x3fe91575 = -729024933;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10512x81402a24 c10512x81402a24) {
                com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.api.C10512x81402a24 event = c10512x81402a24;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.i1 i1Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.i1.this;
                java.lang.String x17 = i1Var.f280113d.x();
                java.lang.String str = event.f146876g;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x17, str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatRecordsTtsFloatBallComponent", "floatBallClick ignored, different talker current=" + x17 + " event=" + str);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatRecordsTtsFloatBallComponent", "floatBallClick locating to msgId=" + event.f146877h + " talker=" + str);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.gb gbVar = i1Var.f280113d.f542252n;
                if (gbVar == null || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) gbVar).B == null) {
                    return false;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1) ((oy.i) ((jz5.n) i1Var.f280740e).mo141623x754a37bb())).nj();
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g1(i1Var, null), 1, null);
                }
                sb5.z zVar = (sb5.z) i1Var.f280113d.f542241c.a(sb5.z.class);
                java.lang.String str2 = event.f146876g;
                long j17 = event.f146877h;
                hd5.n nVar = hd5.n.ACTION_POSITION;
                sb5.y yVar = new sb5.y();
                yVar.f487130b = true;
                yVar.f487132d = true;
                yVar.f487131c = true;
                yVar.f487134f = true;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).T0(str2, j17, nVar, yVar);
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
    }
}
