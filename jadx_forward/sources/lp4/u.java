package lp4;

/* loaded from: classes10.dex */
public final class u extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final r95.b f401960f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e f401961g;

    /* renamed from: h, reason: collision with root package name */
    public rm5.v f401962h;

    /* renamed from: i, reason: collision with root package name */
    public final int f401963i;

    /* renamed from: m, reason: collision with root package name */
    public final int f401964m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f401965n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ju3.d0 status, r95.b config) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f401960f = config;
        this.f401961g = new com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e();
        this.f401963i = 44100;
        this.f401964m = 1;
        this.f401965n = new java.util.ArrayList();
    }

    public final void A(rm5.v vVar) {
        this.f401962h = vVar;
        if (vVar != null) {
            vVar.f479116k = new sm5.b(new l55.b(this.f401963i, this.f401964m));
        }
        rm5.v vVar2 = this.f401962h;
        if (vVar2 == null) {
            return;
        }
        vVar2.f479123r = new com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947(null, new ko4.e(false, false, 3, null));
    }

    public final rm5.v B(boolean z17) {
        java.util.ArrayList arrayList;
        r95.b bVar = this.f401960f;
        s95.d0 d0Var = (s95.d0) bVar.a();
        d0Var.f486566p = !z17;
        d0Var.m20881x7bb163d5();
        com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e c21327xd176b92e = this.f401961g;
        c21327xd176b92e.getClass();
        rm5.v vVar = this.f401962h;
        if (vVar != null && (arrayList = vVar.f479117l) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rm5.j jVar = (rm5.j) it.next();
                if (jVar.f479033b != 3) {
                    jVar.f(z17 ? 0.0f : 1.0f);
                }
            }
        }
        return this.f401962h;
    }

    public final void C() {
        java.util.ArrayList arrayList;
        for (lp4.q qVar : this.f401965n) {
            rm5.v vVar = this.f401962h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18819x10328e97 c18819x10328e97 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2334x43cb00ee.p2336x683188c.C18819x10328e97) qVar;
            if (vVar != null) {
                c18819x10328e97.getClass();
                java.util.ArrayList arrayList2 = vVar.f479117l;
                if (arrayList2 != null) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        rm5.j jVar = (rm5.j) it.next();
                        java.util.ArrayList<bv3.d> arrayList3 = (java.util.ArrayList) c18819x10328e97.f257620x.get(jVar.f479032a);
                        if (arrayList3 != null) {
                            for (bv3.d dVar : arrayList3) {
                                long j17 = jVar.f479035d;
                                long j18 = jVar.f479036e;
                                dVar.f106264a.c(j17);
                                dVar.f106265b.c(j18);
                            }
                        }
                    }
                }
            }
            cp4.r rVar = (cp4.r) c18819x10328e97.j(cp4.r.class);
            if (rVar != null) {
                java.util.List list = rVar.f302600r;
                ((java.util.ArrayList) list.get(0)).clear();
                if (vVar != null && (arrayList = vVar.f479117l) != null) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        rm5.j jVar2 = (rm5.j) it6.next();
                        bv3.a aVar = new bv3.a(jVar2.f479032a, jVar2.f479037f, jVar2.f479038g, jVar2.f479039h);
                        ((java.util.ArrayList) list.get(0)).add(aVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorCaptionPlugin", "update script:" + aVar);
                    }
                }
                if (rVar.f302604v) {
                    rVar.E(0);
                    rVar.G(0);
                }
            }
        }
    }

    public final rm5.v D(java.util.List list) {
        java.util.ArrayList arrayList;
        jz5.o oVar;
        java.lang.Object obj;
        rm5.j jVar;
        java.util.ArrayList arrayList2;
        java.lang.Object obj2;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jz5.o oVar2 = (jz5.o) it.next();
                java.lang.String str = (java.lang.String) oVar2.f384374d;
                long longValue = ((java.lang.Number) oVar2.f384375e).longValue();
                long longValue2 = ((java.lang.Number) oVar2.f384376f).longValue();
                rm5.v vVar = this.f401962h;
                if (vVar == null || (arrayList2 = vVar.f479117l) == null) {
                    jVar = null;
                } else {
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((rm5.j) obj2).f479032a)) {
                            break;
                        }
                    }
                    jVar = (rm5.j) obj2;
                }
                jz5.f0 f0Var = jz5.f0.f384359a;
                if (jVar == null) {
                    r95.f o17 = this.f401961g.o(str, 2);
                    if (o17 != null) {
                        o17.f(new r95.e(longValue, longValue2));
                        o17.g(new r95.e(0L, ((s95.m0) o17.a()).f486654n));
                        s95.m0 m0Var = (s95.m0) o17.a();
                        m0Var.f486658r = 3.0f;
                        m0Var.m20881x7bb163d5();
                        A(this.f401961g.l(o17));
                    } else {
                        f0Var = null;
                    }
                } else {
                    jVar.c(longValue);
                    jVar.b(longValue2);
                    A(this.f401961g.u(r95.a.c(jVar)));
                }
                arrayList3.add(f0Var);
            }
        }
        rm5.v vVar2 = this.f401962h;
        if (vVar2 != null && (arrayList = vVar2.f479117l) != null) {
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                rm5.j jVar2 = (rm5.j) it7.next();
                if (jVar2.f479033b == 3) {
                    java.lang.String str2 = jVar2.f479032a;
                    if (r26.n0.D(str2, "tts", false, 2, null)) {
                        if (list != null) {
                            java.util.Iterator it8 = list.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it8.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.o) obj).f384374d, str2)) {
                                    break;
                                }
                            }
                            oVar = (jz5.o) obj;
                        } else {
                            oVar = null;
                        }
                        if (oVar == null) {
                            com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e c21327xd176b92e = this.f401961g;
                            r95.f c17 = r95.a.c(jVar2);
                            c21327xd176b92e.getClass();
                            A((rm5.v) c21327xd176b92e.s(new q95.k(c21327xd176b92e, c17), new q95.l(c21327xd176b92e)));
                        }
                    }
                }
            }
        }
        return this.f401962h;
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f401961g = new com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e();
    }

    public final rm5.v z() {
        com.p314xaae8f345.mm.p2629x577239cb.C21327xd176b92e c21327xd176b92e = this.f401961g;
        c21327xd176b92e.getClass();
        rm5.v vVar = (rm5.v) c21327xd176b92e.s(new q95.g(c21327xd176b92e), new q95.h(c21327xd176b92e));
        if (vVar != null) {
            vVar.f479123r = new com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947(null, new ko4.e(false, false, 3, null));
        }
        if (vVar != null) {
            vVar.f479116k = new sm5.b(new l55.b(this.f401963i, this.f401964m));
        }
        return vVar;
    }
}
