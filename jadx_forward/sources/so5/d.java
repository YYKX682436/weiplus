package so5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f492335a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f492336b;

    /* renamed from: c, reason: collision with root package name */
    public final uo5.q f492337c;

    /* renamed from: d, reason: collision with root package name */
    public final u26.w f492338d;

    /* renamed from: e, reason: collision with root package name */
    public final vo5.c f492339e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f492340f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f492341g;

    /* renamed from: h, reason: collision with root package name */
    public final int f492342h;

    public d(int i17, boolean z17, uo5.q codec, u26.w dataChannel, vo5.c dataCallbackProxy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codec, "codec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataChannel, "dataChannel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataCallbackProxy, "dataCallbackProxy");
        this.f492335a = i17;
        this.f492336b = z17;
        this.f492337c = codec;
        this.f492338d = dataChannel;
        this.f492339e = dataCallbackProxy;
        this.f492340f = "MicroMsg.DecoderInfo(" + i17 + ',' + z17 + ')';
        this.f492342h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_ilink_voipmp_hwdec_lock, 0);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f492340f, "closed " + this.f492341g);
        if (this.f492341g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f492340f, "already closed");
            return;
        }
        this.f492341g = true;
        this.f492338d.b(new java.util.concurrent.CancellationException("codec for (" + this.f492335a + ",hevc:" + this.f492336b + ") is closed"));
        vo5.c cVar = this.f492339e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close ");
        sb6.append(cVar.f520248a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HW.ILinkVoIPDecodeDataCallbackProxy", sb6.toString());
        cVar.f520253f = true;
        if (this.f492342h != 1) {
            uo5.l lVar = (uo5.l) this.f492337c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f511259c, "stopWorking");
            lVar.a();
        } else {
            synchronized (this.f492339e) {
                uo5.l lVar2 = (uo5.l) this.f492337c;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar2.f511259c, "stopWorking");
                lVar2.a();
            }
        }
    }

    /* renamed from: equals */
    public boolean m165005xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.d)) {
            return false;
        }
        so5.d dVar = (so5.d) obj;
        return this.f492335a == dVar.f492335a && this.f492336b == dVar.f492336b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492337c, dVar.f492337c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492338d, dVar.f492338d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492339e, dVar.f492339e);
    }

    /* renamed from: hashCode */
    public int m165006x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f492335a) * 31) + java.lang.Boolean.hashCode(this.f492336b)) * 31) + this.f492337c.hashCode()) * 31) + this.f492338d.hashCode()) * 31) + this.f492339e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165007x9616526c() {
        return "DecoderInfo(mid=" + this.f492335a + ", hevc=" + this.f492336b + ", codec=" + this.f492337c + ", dataChannel=" + this.f492338d + ", dataCallbackProxy=" + this.f492339e + ')';
    }
}
