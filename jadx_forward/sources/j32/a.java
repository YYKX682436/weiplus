package j32;

/* loaded from: classes4.dex */
public class a extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f378929f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f378930g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f378931h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f378932i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f378933m;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, h32.b bVar) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f378929f = str == null ? "" : str;
        this.f378930g = str2 == null ? "" : str2;
        this.f378931h = str3 == null ? "" : str3;
        this.f378932i = str4 == null ? "" : str4;
        this.f378933m = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f I() {
        return new r45.i80();
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f J() {
        return new r45.j80();
    }

    @Override // h32.a
    public void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.i80 i80Var = (r45.i80) fVar;
        i80Var.f458338d = this.f378929f;
        i80Var.f458339e = this.f378930g;
        i80Var.f458340f = this.f378931h;
        i80Var.f458341g = this.f378932i;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1799;
    }

    @Override // h32.a
    /* renamed from: getUri */
    public java.lang.String mo132826xb5887636() {
        return "/cgi-bin/mmoc-bin/hardware/mydevice/connectedrouter";
    }

    @Override // h32.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        v0Var.toString();
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        h32.b bVar = (h32.b) this.f378933m.get();
        if (bVar != null) {
            bVar.a(i18, i19, str, this);
        }
    }
}
