package c61;

/* loaded from: classes10.dex */
public final class f9 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.h9 f120513d;

    public f9(c61.h9 h9Var) {
        this.f120513d = h9Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.xs2 xs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[observeForeverWithNotify] isShow=");
        sb6.append(z9Var != null ? java.lang.Boolean.valueOf(z9Var.f186860a) : null);
        sb6.append(' ');
        sb6.append(z9Var.f186862c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", sb6.toString());
        if (z9Var.f186860a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
            long m75942xfb822ef2 = (jbVar == null || (xs2Var = jbVar.N) == null) ? 0L : xs2Var.m75942xfb822ef2(3);
            c61.h9 h9Var = this.f120513d;
            c61.e9 e9Var = new c61.e9(z9Var, h9Var);
            if (!h9Var.Ni() || bu2.j.f106067a.h(m75942xfb822ef2) != null) {
                e9Var.mo152xb9724478();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jbVar);
                new db2.g4(m75942xfb822ef2, "", 0, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, h9Var.Ai(jbVar), null, null, null, null, 0, 0, null, null, false, null, null, 536731584, null).l().q(new c61.d9(e9Var));
            }
        }
    }
}
