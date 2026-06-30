package p32;

/* loaded from: classes12.dex */
public class j extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f433004f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f433005g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f433006h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f433007i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433008m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f433009n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f433010o;

    /* renamed from: p, reason: collision with root package name */
    public r45.hh7 f433011p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f433012q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f433013r;

    /* renamed from: s, reason: collision with root package name */
    public int f433014s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f433015t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.ref.WeakReference f433016u;

    public j(android.content.Context context, java.lang.String str, java.lang.String str2, h32.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetProfileDetail", "NetSceneGetProfileDetail, username: %s, appName: %s", str, str2);
        this.f433004f = context;
        this.f433005g = str;
        this.f433006h = str2;
        this.f433016u = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f I() {
        return new r45.qq3();
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f J() {
        return new r45.rq3();
    }

    @Override // h32.a
    public void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.qq3 qq3Var = (r45.qq3) fVar;
        qq3Var.f465736e = this.f433006h;
        qq3Var.f465735d = this.f433005g;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1043;
    }

    @Override // h32.a
    /* renamed from: getUri */
    public java.lang.String mo132826xb5887636() {
        return "/cgi-bin/mmbiz-bin/rank/getuserrankdetail";
    }

    @Override // h32.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        h32.b bVar;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        boolean z17;
        java.util.LinkedList<r45.ed6> linkedList3;
        if (i18 == 0 && i19 == 0) {
            r45.rq3 rq3Var = (r45.rq3) H();
            android.content.Context context = this.f433004f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            z32.s sVar = (z32.s) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z32.s.class);
            sVar.f551470f = rq3Var;
            java.util.LinkedList linkedList4 = sVar.f551471g;
            boolean z18 = true;
            if (rq3Var == null || (linkedList3 = rq3Var.f466647w) == null) {
                linkedList = null;
                linkedList2 = null;
                z17 = false;
            } else {
                linkedList = null;
                linkedList2 = null;
                java.lang.String str2 = null;
                java.lang.String str3 = null;
                z17 = false;
                for (r45.ed6 ed6Var : linkedList3) {
                    int i27 = ed6Var.f454868o;
                    if (i27 == 0) {
                        if (str2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, ed6Var.f454860d)) {
                            if ((linkedList == null || (linkedList.isEmpty() ^ z18) != z18) ? false : z18) {
                                if (linkedList != null) {
                                    linkedList4.add(linkedList);
                                }
                                linkedList = new java.util.LinkedList();
                            }
                            if ((linkedList2 == null || (linkedList2.isEmpty() ^ z18) != z18) ? false : z18) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                                linkedList4.add(linkedList2);
                            }
                            java.util.LinkedList linkedList5 = new java.util.LinkedList();
                            str2 = ed6Var.f454860d;
                            linkedList2 = linkedList5;
                        }
                        if (linkedList2 != null) {
                            linkedList2.add(ed6Var);
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ed6Var.f454860d, "21f9d636b41b25be")) {
                            z17 = z18;
                        }
                    } else if (i27 == z18) {
                        if (str3 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, ed6Var.f454861e)) {
                            if ((linkedList2 == null || (linkedList2.isEmpty() ^ z18) != z18) ? false : z18) {
                                if (linkedList2 != null) {
                                    linkedList4.add(linkedList2);
                                }
                                linkedList2 = new java.util.LinkedList();
                            }
                            if ((linkedList == null || (linkedList.isEmpty() ^ z18) != z18) ? false : z18) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
                                linkedList4.add(linkedList);
                            }
                            java.util.LinkedList linkedList6 = new java.util.LinkedList();
                            str3 = ed6Var.f454861e;
                            linkedList = linkedList6;
                        }
                        if (linkedList != null) {
                            linkedList.add(ed6Var);
                        }
                    } else {
                        if (i27 == 3) {
                            sVar.f551472h = ed6Var;
                        }
                        z18 = true;
                    }
                }
            }
            if (linkedList != null && (linkedList.isEmpty() ^ true)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
                linkedList4.add(linkedList);
            }
            if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                linkedList4.add(linkedList2);
            }
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            if (!z17) {
                java.util.LinkedList linkedList8 = rq3Var != null ? rq3Var.A : null;
                if (!(linkedList8 == null || linkedList8.isEmpty())) {
                    r45.ed6 ed6Var2 = new r45.ed6();
                    ed6Var2.f454860d = "21f9d636b41b25be";
                    ed6Var2.f454868o = 0;
                    ed6Var2.f454863g = null;
                    linkedList7.add(ed6Var2);
                    linkedList4.add(linkedList7);
                }
            }
            this.f433008m = rq3Var.f466631d;
            this.f433009n = rq3Var.f466632e;
            this.f433011p = rq3Var.f466633f;
            this.f433010o = rq3Var.f466639o;
            java.util.LinkedList linkedList9 = rq3Var.f466640p;
            this.f433013r = rq3Var.f466642r;
            java.util.LinkedList linkedList10 = rq3Var.f466643s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f433012q = arrayList;
            this.f433014s = rq3Var.f466645u;
            this.f433015t = rq3Var.f466644t;
            this.f433007i = rq3Var.f466646v;
            java.util.LinkedList linkedList11 = rq3Var.f466637m;
            if (linkedList11 != null) {
                arrayList.addAll(linkedList11);
            }
            java.util.LinkedList linkedList12 = new java.util.LinkedList();
            if (linkedList9 != null) {
                linkedList12.addAll(linkedList9);
            }
            java.lang.String str4 = this.f433005g;
            if (str4 != null && !str4.equalsIgnoreCase(c01.z1.r())) {
                if (this.f433013r) {
                    s32.a Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri();
                    Ri.getClass();
                    if (Ri.D0(new q32.b("hardcode_rank_id", "hardcode_app_name", str4)) == null) {
                        r32.c cVar = new r32.c();
                        cVar.f67115xde6292c = "hardcode_rank_id";
                        cVar.f67114x84a2aa32 = "hardcode_app_name";
                        cVar.f67118xdec927b = str4;
                        cVar.f67117x2261aaf1 = 0;
                        Ri.mo880xb970c2b9(cVar);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri().z0(str4);
                }
            }
            java.util.LinkedList linkedList13 = rq3Var.f466641q;
            if (linkedList13 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = linkedList13.iterator();
                while (it.hasNext()) {
                    r45.e43 e43Var = (r45.e43) it.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(e43Var.f454538e)) {
                        r32.c cVar2 = new r32.c();
                        cVar2.f67118xdec927b = e43Var.f454538e;
                        cVar2.f67117x2261aaf1 = e43Var.f454539f;
                        arrayList2.add(cVar2);
                    } else {
                        gm0.j1.n().f354821b.g(new p32.i(e43Var.f454538e, null));
                    }
                }
                arrayList2.size();
                arrayList2.toString();
                if (c01.z1.r().equalsIgnoreCase(str4)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri().P0(arrayList2);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (linkedList10 != null) {
                arrayList3.addAll(linkedList10);
            }
            this.f433013r = rq3Var.f466642r;
            r32.a aVar = new r32.a();
            aVar.f66504x6d53d39f = this.f433009n;
            aVar.f66505x850adc81 = this.f433008m;
            aVar.f66506xdec927b = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.wi().z0(aVar, true);
        }
        java.lang.ref.WeakReference weakReference = this.f433016u;
        if (weakReference != null && (bVar = (h32.b) weakReference.get()) != null) {
            bVar.a(i18, i19, str, this);
        }
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
    }
}
