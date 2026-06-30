package er;

/* loaded from: classes12.dex */
public abstract class f extends fp0.d implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f337463f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f337464g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f337465h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f337466i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f337467m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f337468n;

    /* renamed from: o, reason: collision with root package name */
    public er.k f337469o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f337470p;

    public f(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f337463f = emojiInfo;
        this.f337469o = er.k.f337473d;
        this.f337470p = java.util.Collections.synchronizedList(new java.util.LinkedList());
    }

    @Override // fp0.d
    public void a() {
        this.f337466i = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "call , " + this.f337463f.mo42933xb5885648());
        run();
    }

    @Override // fp0.d
    public java.lang.String d() {
        return e();
    }

    public abstract java.lang.String e();

    public void f(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult, ");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f337463f;
        sb6.append(interfaceC4987x84e327cb.mo42933xb5885648());
        sb6.append(' ');
        sb6.append(this.f337466i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", sb6.toString());
        this.f337467m = z17;
        this.f337468n = true;
        if (this.f337466i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "callback, " + interfaceC4987x84e327cb.mo42933xb5885648());
            b(fp0.u.f346823f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "removeTask, " + interfaceC4987x84e327cb.mo42933xb5885648());
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).Ai(e());
        }
        pm0.v.K(null, new er.e(this, z17));
    }

    public final void g(dr.s request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.List list = this.f337470p;
        list.remove(request);
        int size = list.size();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f337463f;
        if (size != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "cancel " + e() + ", " + this.f337465h + ", " + interfaceC4987x84e327cb.mo42933xb5885648() + ' ' + list.size());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "cancel " + e() + ", " + this.f337465h + ", " + interfaceC4987x84e327cb.mo42933xb5885648());
        if (this.f337465h) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).Ai(e());
        f(false);
    }

    public void run() {
        this.f337465h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IEmojiLoadTask", "run , " + this.f337463f.mo42933xb5885648());
    }
}
