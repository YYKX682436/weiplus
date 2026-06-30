package ew0;

/* loaded from: classes5.dex */
public abstract class l extends ov0.c {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f338558t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f338559u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f338560v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 f338561w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 f338562x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f338563y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f338558t = jz5.h.b(new ew0.b(this));
        this.f338559u = jz5.h.b(new ew0.g(this));
        this.f338560v = jz5.h.b(new ew0.k(this));
        this.f338563y = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m80379x76847179(), j65.q.b(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.lli), false, 0, null);
    }

    public void A7(ew0.a panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        u7().f539185p.mo7806x9d92d11c(W6(), new ew0.c(panel, this));
        u7().f539187r.mo7806x9d92d11c(W6(), new ew0.d(panel, this));
        u7().f539183n.mo7806x9d92d11c(W6(), new ew0.f(panel, this));
    }

    public abstract du0.o B7();

    public cw0.l0 C7() {
        return null;
    }

    public abstract gx0.hf D7();

    public void E7(ex0.q narrationVM, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 narrationSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationVM, "narrationVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegment, "narrationSegment");
    }

    public void F7(java.lang.String text) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = this.f338561w;
        if (c4189xeb0c3951 == null || (c3971x241f78 = c4189xeb0c3951.f130065a) == null || (c4179xedb0cdf9 = this.f338562x) == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf92 = new com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9(text, c4179xedb0cdf9.m34367xdd1fba());
        ex0.q z76 = z7(c3971x241f78);
        if (z76 == null) {
            return;
        }
        java.util.List V0 = kz5.n0.V0(z76.I());
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9) it.next()).m34367xdd1fba(), c4179xedb0cdf9.m34367xdd1fba())) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            arrayList.remove(i17);
        }
        arrayList.add(c4179xedb0cdf92);
        z76.N(V0);
        this.f338562x = c4179xedb0cdf92;
        sw0.b bVar = this.f430651q;
        this.f430651q = bVar != null ? sw0.b.a(bVar, text, null, null, null, null, 30, null) : null;
    }

    @Override // vw0.d0
    public void K3(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        u7().v(data);
    }

    @Override // vw0.d0
    public void L6(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        u7().u(data);
    }

    @Override // vw0.d0
    public void P5(sw0.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new ew0.a(m158354x19263085());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0077  */
    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 r13) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ew0.l.a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel):void");
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430650p, this.f430651q) && (c4189xeb0c3951 = this.f338561w) != null) {
            java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574043lm4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            x7(c4189xeb0c3951, string);
        }
        sw0.b bVar = this.f430651q;
        java.lang.String str = bVar != null ? bVar.f494947a : null;
        sw0.b bVar2 = this.f430650p;
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, bVar2 != null ? bVar2.f494947a : null);
        ew0.a aVar = (ew0.a) this.f150773i;
        if (aVar != null) {
            aVar.m47074x209a1f1f(java.lang.Boolean.valueOf(z17));
        }
        u7().t();
        this.f430650p = null;
        this.f430651q = null;
        this.f338561w = null;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        gx0.hf hfVar = (gx0.hf) ((jz5.n) this.f338560v).mo141623x754a37bb();
        ew0.a aVar = (ew0.a) this.f150773i;
        if (aVar == null || (dVar = aVar.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(hfVar, dVar, null, 2, null);
    }

    @Override // vw0.d0
    public void l5() {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new ew0.j(this, null), 3, null);
    }

    @Override // ov0.i0
    public java.lang.String m7() {
        java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574094lx0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        u7().s();
    }

    @Override // vw0.d0
    public void p0() {
    }

    @Override // ov0.i0
    public void p7(java.lang.CharSequence charSequence) {
        java.lang.String str;
        if (this.f338561w == null) {
            return;
        }
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        F7(str);
        if (str.length() == 0) {
            ew0.a aVar = (ew0.a) this.f150773i;
            if (aVar != null) {
                aVar.J();
                return;
            }
            return;
        }
        ew0.a aVar2 = (ew0.a) this.f150773i;
        if (aVar2 != null) {
            aVar2.Q();
        }
    }

    @Override // ov0.c
    public ug.m t7() {
        return ug.m.Narration;
    }

    @Override // vw0.d0
    public void w1() {
        sw0.e eVar = (sw0.e) u7().f539183n.mo3195x754a37bb();
        if (eVar == null) {
            return;
        }
        sw0.d dVar = (sw0.d) kz5.n0.a0(eVar.f494959a, eVar.f494960b.f494968b);
        if (dVar == null) {
            return;
        }
        xw0.r u76 = u7();
        sw0.b bVar = this.f430651q;
        u76.l(dVar, bVar != null ? bVar.f494949c : null, true);
    }

    public void x7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 narrationSegment, java.lang.String snapshotDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(narrationSegment, "narrationSegment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotDesc, "snapshotDesc");
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a y7() {
        return null;
    }

    public ex0.q z7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }
}
