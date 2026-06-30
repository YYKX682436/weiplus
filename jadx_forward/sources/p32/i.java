package p32;

/* loaded from: classes12.dex */
public class i extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f433002f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f433003g;

    public i(java.lang.String str, h32.b bVar) {
        this.f433002f = str;
        this.f433003g = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f I() {
        return new r45.dc0();
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f J() {
        return new r45.ec0();
    }

    @Override // h32.a
    public void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        ((r45.dc0) fVar).f453831d = this.f433002f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1792;
    }

    @Override // h32.a
    /* renamed from: getUri */
    public java.lang.String mo132826xb5887636() {
        return "/cgi-bin/mmoc-bin/hardware/delfollow";
    }

    @Override // h32.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri().z0(this.f433002f);
        }
        h32.b bVar = (h32.b) this.f433003g.get();
        if (bVar != null) {
            bVar.a(i18, i19, str, this);
        }
    }
}
