package wq2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f530062a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f530063b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f530064c;

    /* renamed from: d, reason: collision with root package name */
    public r45.yz2 f530065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f530066e;

    /* renamed from: f, reason: collision with root package name */
    public final dk2.of f530067f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f530068g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f530069h;

    /* renamed from: i, reason: collision with root package name */
    public final xq2.b f530070i;

    /* renamed from: j, reason: collision with root package name */
    public final wq2.e f530071j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f530072k;

    /* renamed from: l, reason: collision with root package name */
    public final gr2.t0 f530073l;

    public h(android.app.Activity context) {
        int i17;
        r45.vz2 vz2Var;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f530062a = context;
        this.f530063b = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f530064c = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c);
        java.lang.String str2 = "";
        this.f530068g = "";
        new java.util.ArrayList();
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(xq2.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f530070i = (xq2.b) a17;
        this.f530071j = new wq2.e(this);
        this.f530072k = jz5.h.b(new wq2.g(this));
        this.f530073l = new gr2.t0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, 0.0f, 2, null);
        dk2.of a18 = dk2.of.f315392j.a(context.getIntent());
        this.f530067f = a18;
        if (a18 != null && (str = a18.f315394a) != null) {
            str2 = str;
        }
        this.f530068g = str2;
        if (a18 != null && a18.f315401h == 2) {
            i17 = 329;
        } else {
            i17 = (a18 == null || (vz2Var = a18.f315396c) == null || vz2Var.f470231p != 10) ? false : true ? 260 : 261;
        }
        this.f530066e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveSpecialFragmentViewCallback", "#init themeSpecialBundle: " + a18);
    }

    public final void a(r45.yz2 yz2Var, boolean z17) {
        r45.ha2 ha2Var;
        zq2.c cVar;
        java.util.LinkedList<r45.fa2> linkedList;
        r45.uz2 uz2Var;
        java.util.LinkedList linkedList2;
        java.lang.Object obj;
        java.util.LinkedList<r45.ea2> linkedList3;
        r45.id2 id2Var;
        r45.zz2 zz2Var;
        r45.vz2 vz2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveSpecialFragmentViewCallback", "#transResponseToListData cleanCurrent=" + z17);
        r45.yz2 yz2Var2 = this.f530065d;
        boolean z18 = yz2Var2 != null ? yz2Var2.f473057n : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveSpecialFragmentViewCallback", "#transResponseToListData skipAsyncLoadLiveInfo=" + z18);
        if (yz2Var != null && (vz2Var = yz2Var.f473064u) != null) {
            pm0.v.X(new wq2.d(this, vz2Var));
        }
        android.app.Activity context = this.f530062a;
        if (yz2Var != null && (zz2Var = yz2Var.f473065v) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fr2.x xVar = (fr2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(fr2.x.class);
            if (xVar != null) {
                xVar.Q6(zz2Var);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (yz2Var != null && (linkedList2 = yz2Var.f473050d) != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.fa2) obj).f455659e == 9) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.fa2 fa2Var = (r45.fa2) obj;
            if (fa2Var != null && (linkedList3 = fa2Var.f455662h) != null) {
                for (r45.ea2 ea2Var : linkedList3) {
                    if (ea2Var.m75939xb282bd08(1) == 12 && (id2Var = (r45.id2) ea2Var.m75936x14adae67(13)) != null) {
                        arrayList.add(new zq2.e(id2Var, fa2Var, false, 4, null));
                    }
                }
            }
        }
        this.f530073l.a(context, arrayList);
        if (yz2Var == null || (linkedList = yz2Var.f473050d) == null) {
            ha2Var = null;
            cVar = null;
        } else {
            cVar = null;
            for (r45.fa2 fa2Var2 : linkedList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveSpecialFragmentViewCallback", "#transResponseToListData container.type=" + fa2Var2.f455659e + " container.container_id=" + fa2Var2.f455658d + " container.card_list.size=" + fa2Var2.f455662h.size());
                int i17 = fa2Var2.f455659e;
                if ((i17 == 4 || i17 == 10 || i17 == 11) && (uz2Var = fa2Var2.f455668q) != null) {
                    wq2.f fVar = new wq2.f(fa2Var2, uz2Var, this, yz2Var, z18);
                    cVar = new zq2.c(this.f530068g, fa2Var2);
                    fVar.mo146xb9724478(cVar);
                    cVar.f556563f = arrayList;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f530069h;
                if (c22627xa933f8e4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                    throw null;
                }
                c22627xa933f8e4.setVisibility(8);
            }
            ha2Var = null;
        }
        if (cVar != null) {
            ((gr2.p0) ((jz5.n) this.f530072k).mo141623x754a37bb()).a(context, cVar);
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sp2.x3 x3Var = (sp2.x3) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sp2.x3.class);
            x3Var.Z6(yz2Var != null ? yz2Var.f473063t : ha2Var);
            x3Var.X6();
        }
        pf5.z zVar3 = pf5.z.f435481a;
        boolean z19 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        fr2.p pVar = (fr2.p) zVar3.a(activityC0065xcd7aa112).e(fr2.p.class);
        if (pVar != null) {
            pVar.W6();
        }
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fr2.p pVar2 = (fr2.p) zVar3.a(activityC0065xcd7aa112).e(fr2.p.class);
        if (pVar2 != null) {
            pVar2.V6(yz2Var != null ? yz2Var.f473067x : false);
        }
    }
}
