package gx0;

/* loaded from: classes4.dex */
public final class x implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.p81 f358677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.i f358678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f358679c;

    public x(int i17, r45.p81 p81Var, com.p314xaae8f345.mm.p944x882e457a.i iVar, yz5.l lVar) {
        this.f358677a = p81Var;
        this.f358678b = iVar;
        this.f358679c = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.util.Objects.toString(fVar);
        if (fVar.f152151d == null) {
            fVar.f152151d = this.f358677a;
        }
        this.f358678b.mo10668x2efc64();
        if (fVar.b() && fVar.f152148a == 0 && fVar.f152149b == 0 && ((r45.p81) fVar.f152151d).m75933x41a8a7f2(1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiaoJianUtils", "getMiaojianCgi success");
            r45.p81 p81Var = (r45.p81) fVar.f152151d;
            if (p81Var != null) {
                str = p81Var.m75945x2fec8307(2);
                this.f358679c.mo146xb9724478(str);
                return jz5.f0.f384359a;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiaoJianUtils", "getMiaojianCgi failed, errType:" + fVar.f152148a + ", errCode:" + fVar.f152149b + ", exist:" + ((r45.p81) fVar.f152151d).m75933x41a8a7f2(1));
        }
        str = null;
        this.f358679c.mo146xb9724478(str);
        return jz5.f0.f384359a;
    }
}
