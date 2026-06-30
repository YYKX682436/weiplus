package df2;

/* loaded from: classes3.dex */
public final class tw implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.xw f313013d;

    public tw(df2.xw xwVar) {
        this.f313013d = xwVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (((mm2.c1) this.f313013d.m56788xbba4bfc0(mm2.c1.class)).T) {
            return;
        }
        mm2.n0 n0Var = (mm2.n0) this.f313013d.m56788xbba4bfc0(mm2.n0.class);
        boolean z17 = false;
        if ((n0Var != null && n0Var.f410806r) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.valueOf(this.f313013d.f313347r), bool)) {
            return;
        }
        df2.xw xwVar = this.f313013d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        xwVar.f313347r = bool.booleanValue();
        if (!bool.booleanValue()) {
            this.f313013d.f313345p = false;
            return;
        }
        fe2.q qVar = (fe2.q) this.f313013d.R6(fe2.q.class);
        if (qVar != null) {
            java.util.Iterator it = qVar.f343064v.f362431e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((ee2.a) obj2).f333116g instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                z17 = true;
            }
        }
        if (z17 && (!this.f313013d.f313342m.isEmpty())) {
            fe2.q qVar2 = (fe2.q) this.f313013d.R6(fe2.q.class);
            if (qVar2 != null) {
                qVar2.H1(null);
                return;
            }
            return;
        }
        df2.xw xwVar2 = this.f313013d;
        if (xwVar2.f313345p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveShopMsgDataController", "already done");
        } else {
            xwVar2.f313345p = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(xwVar2, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.sw(xwVar2, null), 2, null);
        }
    }
}
