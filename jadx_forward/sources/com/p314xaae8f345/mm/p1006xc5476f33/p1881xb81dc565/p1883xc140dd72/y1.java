package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class y1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 f231394a;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var) {
        this.f231394a = i4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "hy: on avmembers changed");
        this.f231394a.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.x1(this, (r45.p70) obj, i17));
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public java.lang.Object b(byte[] bArr) {
        r45.p70 p70Var = new r45.p70();
        try {
            p70Var.mo11468x92b714fd(bArr);
            return p70Var;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Multitalk.ILinkService", e17, "hy: unable to parse from data", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public byte[] c(java.lang.Object obj) {
        return new byte[0];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.e0
    public boolean d() {
        return true;
    }
}
