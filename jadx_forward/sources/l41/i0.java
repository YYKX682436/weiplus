package l41;

/* loaded from: classes4.dex */
public class i0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397367d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397368e;

    public i0(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.h15();
        lVar.f152198b = new r45.i15();
        lVar.f152199c = "/cgi-bin/micromsg-bin/openimsync";
        lVar.f152200d = 810;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397368e = a17;
        ((r45.h15) a17.f152243a.f152217a).f457294d = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "opim sync init:%d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        byte[] a17 = w11.c2.f523524a.a();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(a17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f397368e;
        ((r45.h15) oVar.f152243a.f152217a).f457295e = cu5Var;
        this.f397367d = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 810;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(hashCode()));
        if (i18 != 0 || i19 != 0) {
            this.f397367d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f397368e;
        r45.h15 h15Var = (r45.h15) oVar.f152243a.f152217a;
        r45.i15 i15Var = (r45.i15) oVar.f152244b.f152233a;
        r45.c50 c50Var = i15Var.f458198d;
        if (c50Var != null && c50Var.f452828e.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd, cmd size:%d", java.lang.Integer.valueOf(i15Var.f458198d.f452828e.size()));
            java.util.Iterator it = i15Var.f458198d.f452828e.iterator();
            while (it.hasNext()) {
                ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Bi((r45.b50) it.next());
            }
        }
        r45.cu5 cu5Var = i15Var.f458200f;
        if (cu5Var != null) {
            byte[] g17 = cu5Var.f453374f.g();
            w11.b2 b2Var = w11.c2.f523524a;
            byte[] c17 = o45.qi.c(b2Var.a(), g17);
            if (c17 != null && c17.length > 0) {
                b2Var.d(c17, true);
            }
        }
        if ((i15Var.f458199e & h15Var.f457294d) != 0) {
            mo807x6c193ac1(m47995xb7ba1aa7(), this.f397367d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetsceneOpenIMSync", "onGYNetEnd end");
            this.f397367d.mo815x76e0bfae(0, 0, "", this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 20;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }
}
