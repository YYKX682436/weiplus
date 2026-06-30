package jn3;

/* loaded from: classes8.dex */
public final class a implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.g f382309d;

    public a(jn3.g gVar) {
        this.f382309d = gVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var;
        r45.xs2 xs2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
        jn3.g gVar = this.f382309d;
        if (jbVar != null) {
            r45.fv4 fv4Var = new r45.fv4();
            fv4Var.set(3, java.lang.Boolean.valueOf(z9Var.f186860a));
            fv4Var.set(4, z9Var.f186864e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = z9Var.f186862c;
            if (jbVar2 == null || (str = jbVar2.f65882x5364c75d) == null) {
                str = "";
            }
            fv4Var.set(5, str);
            r45.qv4 qv4Var = new r45.qv4();
            qv4Var.set(0, java.lang.Long.valueOf((jbVar2 == null || (c19795xce8b809e2 = jbVar2.f65881x115e537f) == null) ? 0L : c19795xce8b809e2.m75942xfb822ef2(0)));
            qv4Var.set(1, (jbVar2 == null || (c19795xce8b809e = jbVar2.f65881x115e537f) == null) ? null : c19795xce8b809e.m75934xbce7f2f(6));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[newLifeEntrance] reddot, uuid:");
            sb6.append(fv4Var.m75945x2fec8307(5));
            sb6.append(" result: ");
            sb6.append(z9Var);
            sb6.append(" updateTime:");
            sb6.append(k35.m1.e(((jbVar2 == null || (xs2Var = jbVar2.N) == null) ? 0 : xs2Var.m75939xb282bd08(5)) * 1000));
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotCtrlInfoFSC", sb7, null);
            j75.f Ai = gVar.f381800d.Ai();
            if (Ai != null) {
                Ai.B3(new sa0.i(fv4Var, jbVar.Q0(false) == 4, qv4Var, "RedDotNotifier.Entrance"));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return;
            }
        }
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotCtrlInfoFSC", "[newLifeEntrance] reddot ctrl change to null", null);
        j75.f Ai2 = gVar.f381800d.Ai();
        if (Ai2 != null) {
            Ai2.B3(new sa0.i(null, false, null, "ctrlInfo is null", 7, null));
        }
    }
}
