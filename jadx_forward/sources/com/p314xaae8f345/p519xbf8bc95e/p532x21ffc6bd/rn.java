package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class rn implements com.tencent.mapsdk.internal.rp.a, com.tencent.mapsdk.internal.v.a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f132769a = "rastermap/handdraw";

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f132771c;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c f132773e;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.Object f132770b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 f132772d = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f132774f = false;

    public rn(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        this.f132771c = trVar;
        if (trVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a(trVar.I());
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp rpVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rp(trVar.I(), this);
            new com.tencent.mapsdk.internal.rp.b(rpVar, (byte) 0).execute(rpVar.f132779a);
            trVar.f133806as.f132053t.a(this);
        }
    }

    private void g() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = this.f132773e;
        if (c26089x9c7ff29c != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro roVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro) c26089x9c7ff29c.m100003x4638c135();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro.f132775a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c2 = roVar.f132777b;
            if (c26089x9c7ff29c2 != null) {
                c26089x9c7ff29c2.m100014x290dc9a6(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro.a());
            }
        }
        synchronized (this.f132770b) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 interfaceC26088xb80c71a2 = this.f132772d;
            if (interfaceC26088xb80c71a2 != null) {
                interfaceC26088xb80c71a2.mo36520x77a619a7();
                this.f132772d.mo36523xc84a8199();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a(float f17, float f18) {
        if (this.f132774f) {
            int i17 = this.f132771c.f133806as.N()[0];
            if (f18 <= com.tencent.mapsdk.internal.v.b.a(i17)) {
                this.f132774f = false;
                this.f132771c.f133806as.d(i17);
            }
            if (f17 > f18) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean b() {
        int i17 = this.f132771c.f133806as.N()[0];
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132771c.f133806as;
        if (neVar.f132053t.f133942b.f133977m < i17 && this.f132774f) {
            this.f132774f = false;
            neVar.d(i17);
        }
        return false;
    }

    public final void c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        if (this.f132772d != null || (trVar = this.f132771c) == null || trVar.f133806as == null) {
            return;
        }
        if (this.f132773e == null) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c();
            this.f132773e = c26089x9c7ff29c;
            this.f132773e.m100012xe5462ebf(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro(c26089x9c7ff29c)).m99994xb2cd9a68(f132769a).m100011xf97d9342(true).m100016xd4677478(2).m99993x3d8ff63(3, 19);
        }
        this.f132772d = this.f132771c.f133806as.H.b(this.f132773e);
        int i17 = this.f132771c.f133806as.N()[0];
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f132771c;
        if (trVar2.f133806as.f132053t.f133942b.f133977m >= i17) {
            this.f132774f = true;
        } else {
            ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne) trVar2.d_).d(i17);
        }
    }

    public final void d() {
        synchronized (this.f132770b) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 interfaceC26088xb80c71a2 = this.f132772d;
            if (interfaceC26088xb80c71a2 != null && this.f132771c != null) {
                interfaceC26088xb80c71a2.mo36524xc84af884();
                this.f132772d = null;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132771c.f133806as;
                neVar.d(neVar.N()[0]);
                this.f132774f = false;
            }
        }
    }

    public final boolean e() {
        return this.f132772d != null;
    }

    @Override // com.tencent.mapsdk.internal.rp.a
    public final void f() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = this.f132773e;
        if (c26089x9c7ff29c != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro roVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro) c26089x9c7ff29c.m100003x4638c135();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro.f132775a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rm.a();
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c2 = roVar.f132777b;
            if (c26089x9c7ff29c2 != null) {
                c26089x9c7ff29c2.m100014x290dc9a6(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro.a());
            }
        }
        synchronized (this.f132770b) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 interfaceC26088xb80c71a2 = this.f132772d;
            if (interfaceC26088xb80c71a2 != null) {
                interfaceC26088xb80c71a2.mo36520x77a619a7();
                this.f132772d.mo36523xc84a8199();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a() {
        return this.f132774f;
    }
}
