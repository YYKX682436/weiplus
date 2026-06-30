package dt2;

/* loaded from: classes3.dex */
public final class i implements fo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt2.t f324717a;

    public i(dt2.t tVar) {
        this.f324717a = tVar;
    }

    @Override // fo0.b
    public java.lang.String a() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.lang.String m76625xb5887639;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        dt2.t tVar = this.f324717a;
        gk2.e eVar = tVar.f324729e;
        java.lang.String m75945x2fec8307 = (eVar == null || (c19792x256d27252 = ((mm2.c1) eVar.a(mm2.c1.class)).f410379n) == null || (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b13.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            gk2.e eVar2 = tVar.f324729e;
            m75945x2fec8307 = (eVar2 == null || (c19792x256d2725 = ((mm2.c1) eVar2.a(mm2.c1.class)).f410379n) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || (m76625xb5887639 = c19788xd7cfd73e.m76625xb5887639()) == null) ? "" : m76625xb5887639;
        }
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // fo0.b
    public void a1() {
        dt2.a0 a0Var = ws2.k1.f530599r.a().f530616o;
        if (a0Var != null) {
            a0Var.d();
        }
    }

    @Override // fo0.b
    public android.graphics.Bitmap b() {
        dt2.a0 a0Var = ws2.k1.f530599r.a().f530616o;
        if (a0Var != null) {
            return a0Var.f324691a.mo56680x12501425();
        }
        return null;
    }

    @Override // fo0.b
    /* renamed from: isPlaying */
    public boolean mo15380xc00617a4() {
        dt2.a0 a0Var = ws2.k1.f530599r.a().f530616o;
        return a0Var != null && a0Var.f324691a.mo58787xc00617a4();
    }

    @Override // fo0.b
    public void u() {
        dt2.a0 a0Var = ws2.k1.f530599r.a().f530616o;
        if (a0Var != null) {
            a0Var.e(null);
        }
    }
}
