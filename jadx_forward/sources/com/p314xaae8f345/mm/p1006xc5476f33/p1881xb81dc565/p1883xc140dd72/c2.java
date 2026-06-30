package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class c2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231064a;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var) {
        this.f231064a = i4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        int i18;
        zi3.f fVar;
        android.media.AudioTrack audioTrack;
        zi3.f fVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar;
        this.f231064a.T();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231064a;
        i4Var.getClass();
        i4Var.f231153d2 = ym1.f.wi().f();
        i4Var.f231155e2 = ym1.f.wi().f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "seenli, ilinkservice  mILinkSpeakerMode=%d, mILinkPhoneMode=%d", java.lang.Integer.valueOf(i4Var.f231153d2), java.lang.Integer.valueOf(i4Var.f231155e2));
        i4Var.f231157f2 = 0;
        i4Var.f231159g2 = 0;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J != null) {
            i4Var.f231157f2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J.E();
            i4Var.f231159g2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J.E();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "seenli, ilinkservice mILinkSpeakerStreamType=%d", java.lang.Integer.valueOf(i4Var.f231157f2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = this.f231064a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231235d = i4Var2.Y1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231236e = i4Var2.Z1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231237f = i4Var2.f231149a2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231238g = i4Var2.f231150b2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231239h = i4Var2.f231151c2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231240i = i4Var2.f231153d2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231241j = i4Var2.f231155e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231243l = i4Var2.f231157f2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231244m = i4Var2.f231159g2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s sVar = i4Var2.f231158g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231242k = sVar.f231293b == null ? 0 : sVar.f231293b.f501685e;
        this.f231064a.f231158g.f231292a.getClass();
        zi3.f fVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231245n = fVar3 != null ? fVar3.f554704l : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s sVar2 = this.f231064a.f231158g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231246o = sVar2.f231293b == null ? 0 : sVar2.f231293b.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231247p = (this.f231064a.f231158g.f231292a == null || (fVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J) == null || (eVar = fVar2.f554703k) == null) ? 0 : eVar.L;
        if (this.f231064a.f231158g.f231292a != null && (fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231693J) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = fVar.f554703k;
            if (eVar2 != null) {
                android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
                if (audioManager != null && (audioTrack = eVar2.f257985o) != null) {
                    i18 = audioManager.getStreamVolume(audioTrack.getStreamType());
                }
            } else {
                i18 = -1;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231248q = i18;
            this.f231064a.f231158g.getClass();
            this.f231064a.f231158g.getClass();
            this.f231064a.f231158g.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231249r = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231250s = 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231251t = 0;
            r45.t70 t70Var = new r45.t70();
            t70Var.f467708d = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231232a;
            t70Var.f467710f = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231233b;
            t70Var.f467711g = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231234c;
            t70Var.f467719r = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231246o;
            t70Var.f467724w = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231247p;
            t70Var.f467718q = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231245n;
            t70Var.D = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231235d;
            t70Var.E = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231236e;
            t70Var.F = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231237f;
            t70Var.G = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231238g;
            t70Var.H = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231239h;
            t70Var.f467714m = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231242k;
            t70Var.f467712h = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231240i;
            t70Var.f467713i = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231241j;
            t70Var.f467715n = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231243l;
            t70Var.f467716o = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231244m;
            t70Var.f467720s = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231248q;
            t70Var.f467721t = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231249r;
            t70Var.f467722u = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231250s;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231251t;
            t70Var.f467723v = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkReporter", "amyfwang,interrupt_cnt:%d", java.lang.Integer.valueOf(i19));
            this.f231064a.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b2(this, i17));
            return t70Var;
        }
        i18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231248q = i18;
        this.f231064a.f231158g.getClass();
        this.f231064a.f231158g.getClass();
        this.f231064a.f231158g.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231249r = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231250s = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231251t = 0;
        r45.t70 t70Var2 = new r45.t70();
        t70Var2.f467708d = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231232a;
        t70Var2.f467710f = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231233b;
        t70Var2.f467711g = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231234c;
        t70Var2.f467719r = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231246o;
        t70Var2.f467724w = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231247p;
        t70Var2.f467718q = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231245n;
        t70Var2.D = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231235d;
        t70Var2.E = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231236e;
        t70Var2.F = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231237f;
        t70Var2.G = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231238g;
        t70Var2.H = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231239h;
        t70Var2.f467714m = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231242k;
        t70Var2.f467712h = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231240i;
        t70Var2.f467713i = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231241j;
        t70Var2.f467715n = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231243l;
        t70Var2.f467716o = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231244m;
        t70Var2.f467720s = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231248q;
        t70Var2.f467721t = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231249r;
        t70Var2.f467722u = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231250s;
        int i192 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m0.f231251t;
        t70Var2.f467723v = i192;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkReporter", "amyfwang,interrupt_cnt:%d", java.lang.Integer.valueOf(i192));
        this.f231064a.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b2(this, i17));
        return t70Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public /* bridge */ /* synthetic */ java.lang.Object b(byte[] bArr) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public byte[] c(java.lang.Object obj) {
        r45.t70 t70Var = (r45.t70) obj;
        if (t70Var != null) {
            try {
                return t70Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkService", e17, "hy: error when convert to byte array", new java.lang.Object[0]);
            }
        }
        return new byte[0];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public boolean d() {
        return true;
    }
}
