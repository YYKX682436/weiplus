package dr0;

/* loaded from: classes12.dex */
public final class f2 extends dr0.j2 {
    public f2() {
        super(3);
    }

    @Override // dr0.j2
    public boolean a() {
        if (!dr0.j2.f323973b.a()) {
            return false;
        }
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "abort: not-deepBg");
        return false;
    }

    @Override // dr0.j2
    public dr0.t2 b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "#recyclingDeepBg");
        if (a()) {
            return dr0.a3.b(dr0.a3.f323936d.a(), this.f323982a);
        }
        return null;
    }
}
