package sn1;

/* loaded from: classes12.dex */
public class g0 extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.x f491541u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.y f491542v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f491543w;

    public g0(java.lang.String str, long j17, long j18, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        wn1.x xVar = new wn1.x();
        this.f491541u = xVar;
        this.f491542v = new wn1.y();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupDataTagScene", "init DataTag, BakChatName:%s, startTime:%d, endTime:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        xVar.f529037d = str;
        xVar.f529038e = j17;
        xVar.f529039f = j18;
        xVar.f529040g = str2;
        xVar.f529041h = str3;
        this.f491543w = u0Var;
    }

    @Override // sn1.i
    public boolean K() {
        boolean z17;
        try {
            byte[] mo14344x5f01b1f6 = this.f491541u.mo14344x5f01b1f6();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f491546g;
            synchronized (concurrentHashMap) {
                int i17 = sn1.i.f491555s;
                sn1.i.f491555s = i17 + 1;
                this.f491557d = i17;
                on1.f.a(mo14344x5f01b1f6, i17, (short) 15, this.f491558e, sn1.i.f491550n);
                sn1.e eVar = sn1.i.f491549m;
                if (eVar != null) {
                    ((ln1.g) eVar).d(this.f491557d, this.f491558e.f38861x6ac9171, 15);
                }
                concurrentHashMap.put(java.lang.Integer.valueOf(this.f491557d), this);
            }
            z17 = true;
        } catch (java.lang.Exception e17) {
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupBaseScene", e17, "req to buf fail: " + e17.toString(), new java.lang.Object[0]);
        }
        if (!z17) {
            wn1.y yVar = this.f491542v;
            wn1.x xVar = this.f491541u;
            yVar.f529043d = xVar.f529037d;
            yVar.f529044e = xVar.f529038e;
            yVar.f529045f = xVar.f529039f;
            yVar.f529046g = xVar.f529040g;
            this.f491543w.mo815x76e0bfae(1, -2, "doScene failed", this);
        }
        return z17;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f M() {
        return this.f491541u;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f N() {
        return this.f491542v;
    }

    @Override // sn1.i
    public void P(int i17) {
        J(0, 0, ya.b.f77504xbb80cbe3);
        this.f491543w.mo815x76e0bfae(0, 0, "", this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 15;
    }
}
