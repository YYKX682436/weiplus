package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class a6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 f210383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078, java.lang.String str) {
        super(0);
        this.f210383d = activityC15029x292078;
        this.f210384e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = this.f210383d;
        java.util.Iterator it = activityC15029x292078.f210102w.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r26.i0.q(((r45.q21) obj).m75945x2fec8307(2), this.f210384e, false, 2, null)) {
                break;
            }
        }
        r45.q21 q21Var = (r45.q21) obj;
        if (q21Var != null) {
            java.util.ArrayList arrayList = activityC15029x292078.f210102w;
            arrayList.remove(q21Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = activityC15029x292078.f210101v;
            eVar.c(arrayList);
            eVar.notifyDataSetChanged();
            g92.b bVar = g92.b.f351302e;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15029x292078.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            m92.b j37 = g92.a.j3(bVar, xy2.c.e(mo55332x76847179), false, 2, null);
            int m75939xb282bd08 = j37 != null ? j37.u0().m75939xb282bd08(20) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFansListUI", "oldFansCnt %d", java.lang.Integer.valueOf(m75939xb282bd08));
            if (m75939xb282bd08 > 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC15029x292078.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                m92.c cVar = new m92.c(xy2.c.e(mo55332x768471792));
                cVar.u0().set(20, java.lang.Integer.valueOf(r3.m75939xb282bd08(20) - 1));
                bVar.C(cVar, m92.j.f406525g);
            }
            activityC15029x292078.e7();
        }
        return jz5.f0.f384359a;
    }
}
