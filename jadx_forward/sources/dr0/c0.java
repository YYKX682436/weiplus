package dr0;

/* loaded from: classes12.dex */
public final class c0 implements a25.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f323947a;

    public c0(dr0.t0 t0Var) {
        this.f323947a = t0Var;
    }

    public void a(r45.j4 j4Var) {
        if (j4Var != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            dr0.t0 t0Var = this.f323947a;
            t0Var.i().m46666x8a2b2cea(j4Var);
            t0Var.f324079f.m46666x8a2b2cea(j4Var);
            if (t0Var.f324079f.m46707x9e267bcb().keySet().size() >= (mm.k.j(mm.k.N, null, 1, null) ? 5 : 3)) {
                com.p314xaae8f345.mm.p642xad8b531f.n.b("light_push_too_many_msg_group");
            }
            t0Var.h();
        }
    }

    public void b(int i17, byte[] bArr) {
        dr0.t0 t0Var = this.f323947a;
        if (i17 == 120) {
            t0Var.i().m46736xdf6f7d0d(t0Var.i().getAccAllVoipCount() + 1);
            com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = t0Var.f324079f;
            c10875xc0cf956c.m46736xdf6f7d0d(c10875xc0cf956c.getAccAllVoipCount() + 1);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            if (i17 == 120) {
                t0Var.i().m46755x1685e1b0(t0Var.i().getAccMainProcStandByVoipCount() + 1);
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c2 = t0Var.f324079f;
                c10875xc0cf956c2.m46755x1685e1b0(c10875xc0cf956c2.getAccMainProcStandByVoipCount() + 1);
            } else {
                if (i17 != 268369921) {
                    return;
                }
                t0Var.i().m46754xabb9a38d(t0Var.i().getAccMainProcStandByMsgCount() + 1);
                com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c3 = t0Var.f324079f;
                c10875xc0cf956c3.m46754xabb9a38d(c10875xc0cf956c3.getAccMainProcStandByMsgCount() + 1);
                if (t0Var.f324079f.getAccMainProcStandByMsgCount() >= 3) {
                    com.p314xaae8f345.mm.p642xad8b531f.n.b("light_push_too_many_push");
                }
            }
        }
    }
}
