package x91;

/* loaded from: classes16.dex */
public class h implements z91.b {

    /* renamed from: a, reason: collision with root package name */
    public final x91.c f534180a;

    /* renamed from: b, reason: collision with root package name */
    public final y91.i0 f534181b;

    /* renamed from: c, reason: collision with root package name */
    public x91.l f534182c;

    /* renamed from: d, reason: collision with root package name */
    public x91.l f534183d;

    /* renamed from: e, reason: collision with root package name */
    public final x91.k f534184e;

    /* renamed from: f, reason: collision with root package name */
    public aa1.c f534185f;

    /* renamed from: g, reason: collision with root package name */
    public aa1.c f534186g;

    /* renamed from: h, reason: collision with root package name */
    public x91.i f534187h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f534188i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f534189j;

    public h(x91.c cVar) {
        int i17 = y91.i0.f541814h;
        this.f534181b = y91.h0.f541810a;
        this.f534184e = new x91.k();
        this.f534188i = false;
        this.f534189j = false;
        this.f534180a = cVar;
        if (cVar == null) {
            return;
        }
        java.util.ArrayList arrayList = cVar.f534175j;
        if (arrayList.size() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x91.l lVar = (x91.l) it.next();
            if (!android.text.TextUtils.isEmpty(lVar.f534197a)) {
                if (lVar.f534197a.startsWith("urn:schemas-upnp-org:service:AVTransport")) {
                    this.f534182c = lVar;
                } else if (lVar.f534197a.startsWith("urn:schemas-upnp-org:service:RenderingControl")) {
                    this.f534183d = lVar;
                } else {
                    lVar.f534197a.startsWith("urn:schemas-upnp-org:service:ConnectionManager");
                }
            }
        }
    }

    public final java.lang.String a(x91.l lVar) {
        x91.c cVar = this.f534180a;
        return cVar != null ? y91.z.a(cVar.f534167b, cVar.f534168c, lVar.f534200d) : "";
    }

    public boolean b(aa1.d dVar) {
        java.lang.String str;
        if (this.f534187h == null) {
            return true;
        }
        java.util.Map map = dVar.f84022b;
        if (map != null && !((java.util.HashMap) map).containsKey("LastChange")) {
            return false;
        }
        java.util.Map map2 = dVar.f84022b;
        if (map2 != null) {
            aa1.a aVar = (aa1.a) ((java.util.HashMap) map2).get("LastChange");
            java.util.Objects.requireNonNull(aVar);
            str = aVar.f84014a;
        } else {
            str = null;
        }
        java.util.HashMap a17 = str != null ? new y91.l0().a(str) : null;
        if (a17 == null) {
            return false;
        }
        if ("avtEvent".equals(dVar.f84019c)) {
            aa1.a aVar2 = (aa1.a) a17.get("TransportState");
            if (aVar2 != null) {
                java.lang.String a18 = aVar2.f84015b.a(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa);
                if ("PLAYING".equalsIgnoreCase(a18)) {
                    this.f534187h.e(this);
                } else if ("PAUSED_PLAYBACK".equalsIgnoreCase(a18)) {
                    this.f534187h.b(this);
                } else if ("STOPPED".equalsIgnoreCase(a18)) {
                    this.f534187h.a(this);
                }
            }
            aa1.a aVar3 = (aa1.a) a17.get("CurrentTrackDuration");
            if (aVar3 != null) {
                java.lang.String[] split = aVar3.f84015b.a(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa).split(":");
                if (split.length == 3) {
                    this.f534187h.c(this, (java.lang.Integer.parseInt(split[0]) * 3600) + (java.lang.Integer.parseInt(split[1]) * 60) + java.lang.Integer.parseInt(split[2]));
                }
            }
        } else if ("rdcEvent".equals(dVar.f84019c)) {
            aa1.a aVar4 = (aa1.a) a17.get("Volume");
            if (aVar4 != null) {
                this.f534187h.d(this, java.lang.Integer.parseInt(aVar4.f84015b.a(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa)));
            }
            if (((aa1.a) a17.get("Mute")) != null) {
                this.f534187h.f(this, !"0".equals(r6.f84015b.a(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa)));
            }
        }
        return true;
    }

    public void c(z91.a aVar) {
        x91.l lVar = this.f534182c;
        if (lVar != null) {
            this.f534181b.g(new w91.h(a(lVar), this.f534182c.f534197a), aVar);
        }
    }

    public void d(java.lang.String str, z91.a aVar) {
        x91.l lVar = this.f534182c;
        if (lVar != null) {
            this.f534181b.g(new w91.k(a(lVar), this.f534182c.f534197a, str), aVar);
        }
    }

    public void e(z91.a aVar) {
        x91.l lVar = this.f534182c;
        if (lVar != null) {
            this.f534181b.g(new w91.m(a(lVar), this.f534182c.f534197a), aVar);
        }
    }

    /* renamed from: equals */
    public boolean m175198xb2c87fbf(java.lang.Object obj) {
        x91.c cVar = this.f534180a;
        if (cVar == null && obj == null) {
            return true;
        }
        if (cVar == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof x91.h) {
            return cVar.m175196xb2c87fbf(((x91.h) obj).f534180a);
        }
        return false;
    }

    public void f() {
        if (this.f534188i) {
            return;
        }
        y91.o oVar = y91.n.f541835a;
        x91.d dVar = new x91.d(this);
        oVar.getClass();
        x91.l lVar = this.f534182c;
        if (lVar != null) {
            java.lang.String c17 = oVar.c("/upnp/cb/AVTransport");
            x91.c cVar = this.f534180a;
            w91.n nVar = new w91.n(y91.z.a(cVar.f534167b, cVar.f534168c, lVar.f534201e), c17);
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.g(nVar, new y91.h(oVar, this, dVar));
        }
    }

    public void g() {
        if (this.f534189j) {
            return;
        }
        y91.o oVar = y91.n.f541835a;
        x91.e eVar = new x91.e(this);
        oVar.getClass();
        x91.l lVar = this.f534183d;
        if (lVar != null) {
            java.lang.String c17 = oVar.c("/upnp/cb/RenderControl");
            x91.c cVar = this.f534180a;
            w91.n nVar = new w91.n(y91.z.a(cVar.f534167b, cVar.f534168c, lVar.f534201e), c17);
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.g(nVar, new y91.i(oVar, this, eVar));
        }
    }

    public void h() {
        if (this.f534188i) {
            y91.o oVar = y91.n.f541835a;
            x91.f fVar = new x91.f(this);
            oVar.getClass();
            x91.l lVar = this.f534182c;
            aa1.c cVar = this.f534185f;
            if (lVar == null || cVar == null || cVar.f84017a == null) {
                return;
            }
            x91.c cVar2 = this.f534180a;
            w91.o oVar2 = new w91.o(y91.z.a(cVar2.f534167b, cVar2.f534168c, lVar.f534201e), cVar.f84017a);
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.g(oVar2, new y91.j(oVar, cVar, fVar));
        }
    }

    public void i() {
        if (this.f534189j) {
            y91.o oVar = y91.n.f541835a;
            x91.g gVar = new x91.g(this);
            oVar.getClass();
            x91.l lVar = this.f534183d;
            aa1.c cVar = this.f534186g;
            if (lVar == null || cVar == null || cVar.f84017a == null) {
                return;
            }
            x91.c cVar2 = this.f534180a;
            w91.o oVar2 = new w91.o(y91.z.a(cVar2.f534167b, cVar2.f534168c, lVar.f534201e), cVar.f84017a);
            int i17 = y91.i0.f541814h;
            y91.h0.f541810a.g(oVar2, new y91.k(oVar, cVar, gVar));
        }
    }

    /* renamed from: toString */
    public java.lang.String m175199x9616526c() {
        return "MRDevice{mDevice=" + this.f534180a + '}';
    }
}
