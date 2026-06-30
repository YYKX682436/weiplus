package jn3;

/* loaded from: classes8.dex */
public final class d implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.g f382312d;

    public d(jn3.g gVar) {
        this.f382312d = gVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        r45.fv4 fv4Var = new r45.fv4();
        fv4Var.set(4, z9Var.f186864e);
        fv4Var.set(3, java.lang.Boolean.valueOf(z9Var.f186860a));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
        if (jbVar == null || (str = jbVar.f65882x5364c75d) == null) {
            str = "";
        }
        fv4Var.set(5, str);
        java.lang.String str2 = "[newLifeMentionEntranceObserver] reddot, uuid:" + fv4Var.m75945x2fec8307(5) + " result: " + z9Var;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeRedDotCtrlInfoFSC", str2, null);
        j75.f Ai = this.f382312d.f381800d.Ai();
        if (Ai != null) {
            Ai.B3(new sa0.i(fv4Var, false, null, "RedDotNotifier." + z9Var.f186864e, 6, null));
        }
    }
}
