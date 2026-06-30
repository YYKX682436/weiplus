package pr;

/* loaded from: classes12.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f439317a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439318b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f439319c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f439320d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f439321e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f439322f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f439323g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f439324h;

    public t0(int i17, java.lang.String str, boolean z17, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f439317a = i17;
        this.f439318b = str;
        this.f439319c = z17;
        this.f439320d = callback;
        this.f439321e = new java.util.LinkedList();
        this.f439322f = new java.util.LinkedList();
        this.f439324h = kz5.r0.f395535d;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_LAST_DOWNLOAD_REQ_BUFF_STRING, null);
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str2 != null) {
            this.f439323g = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(android.util.Base64.decode(str2, 2));
        }
        java.util.ArrayList a17 = gr.t.g().a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next()).mo42933xb5885648());
        }
        this.f439324h = kz5.n0.Q0(arrayList);
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        int i17 = this.f439317a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f439323g;
        java.lang.String str = this.f439318b;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        } else {
            gVar = null;
        }
        new hr.a(2, i17, null, gVar2, gVar, 4, null).l().K(new pr.s0(this));
    }
}
