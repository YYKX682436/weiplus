package bt1;

@j95.b
/* loaded from: classes4.dex */
public final class d extends i95.w implements ct1.u, ct1.t {

    /* renamed from: d, reason: collision with root package name */
    public bt1.l f105680d;

    public void Ai(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.BypService", "paybyp selector enable is : " + z17);
        if (!z17) {
            java.util.List list = bt1.a.f105676a;
            java.util.ArrayList arrayList = bt1.a.f105677b;
            if (arrayList.contains(11)) {
                arrayList.remove((java.lang.Object) 11);
                return;
            }
            return;
        }
        java.util.List list2 = bt1.a.f105676a;
        java.util.ArrayList arrayList2 = bt1.a.f105677b;
        if (!arrayList2.contains(11)) {
            arrayList2.add(11);
        }
        bt1.l lVar = this.f105680d;
        if (lVar != null) {
            bt1.l.b(lVar, kz5.b0.c(11), bt1.g.f105690m, false, 0, 12, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncExtension");
            throw null;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        synchronized (et1.o.f338106a) {
            for (et1.m config : et1.o.f338107b) {
                synchronized (et1.o.f338106a) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
                }
            }
            java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(et1.n.class)).all()).iterator();
            while (it.hasNext()) {
                et1.l lVar = (et1.n) ((fs.q) it.next()).get();
                if (lVar != null) {
                    ((et1.a) lVar).n();
                }
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f105680d = new bt1.l();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.BypService", "[configure]");
            en1.k kVar = (en1.k) i95.n0.c(en1.k.class);
            ((dn1.i) kVar).f323407d.v(new bt1.c(this));
        }
    }

    public void wi(int i17) {
        bt1.l lVar = this.f105680d;
        if (lVar != null) {
            lVar.f105704a.remove(java.lang.Integer.valueOf(i17));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncExtension");
            throw null;
        }
    }
}
