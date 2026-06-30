package co0;

/* loaded from: classes3.dex */
public final class j implements fo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co0.s f125253a;

    public j(co0.s sVar) {
        this.f125253a = sVar;
    }

    @Override // fo0.b
    public java.lang.String a() {
        mm2.c1 c1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        fn0.g gVar = fn0.g.f345728a;
        if (fn0.g.f345729b == null) {
            return "";
        }
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        java.lang.String m75945x2fec8307 = (c1Var2 == null || (c19792x256d27252 = c1Var2.f410379n) == null || (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b13.m75945x2fec8307(0);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && ((c1Var = (mm2.c1) efVar.i(mm2.c1.class)) == null || (c19792x256d2725 = c1Var.f410379n) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || (m75945x2fec8307 = c19788xd7cfd73e.m76625xb5887639()) == null)) {
            m75945x2fec8307 = "";
        }
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // fo0.b
    public void a1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "getCurWindowPlayer.pausePlay");
        mn0.b0 b0Var = this.f125253a.R1.f363942a;
        if (b0Var != null) {
            mn0.b0.M(b0Var, false, 1, null);
        }
    }

    @Override // fo0.b
    public android.graphics.Bitmap b() {
        mn0.b0 b0Var;
        co0.s sVar = this.f125253a;
        if (sVar.D.e() || (b0Var = sVar.R1.f363942a) == null) {
            return null;
        }
        return ((mn0.y) b0Var).i(android.graphics.Bitmap.Config.ARGB_4444, false, 1.0d);
    }

    @Override // fo0.b
    /* renamed from: isPlaying */
    public boolean mo15380xc00617a4() {
        mn0.b0 b0Var = this.f125253a.R1.f363942a;
        return b0Var != null && ((mn0.y) b0Var).b(false);
    }

    @Override // fo0.b
    public void u() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "getCurWindowPlayer.resumePlay");
        mn0.b0 b0Var = this.f125253a.R1.f363942a;
        if (b0Var != null) {
            ((mn0.y) b0Var).y();
        }
    }
}
