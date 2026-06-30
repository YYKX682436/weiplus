package m41;

/* loaded from: classes8.dex */
public final class d extends com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c {

    /* renamed from: d, reason: collision with root package name */
    public final j41.h0 f404975d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f404976e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f404977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f404978g;

    /* renamed from: h, reason: collision with root package name */
    public k41.g0 f404979h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f404980i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j41.h0 getRequest, j41.j0 opRequest, r45.s4 addContactContext) {
        super(new r45.hq6(), new r45.iq6());
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getRequest, "getRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(opRequest, "opRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addContactContext, "addContactContext");
        this.f404975d = getRequest;
        this.f404976e = "MicroMsg.CgiTryAddOpenIMKefuContact";
        this.f404977f = "/cgi-bin/micromsg-bin/tryaddopenimkefucontact";
        this.f404978g = 17290;
        r45.gq6 gq6Var = new r45.gq6();
        java.lang.String str = addContactContext.f467021f;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
        } else {
            gVar = null;
        }
        gq6Var.f457019d = gVar;
        gq6Var.f457020e = addContactContext.f467022g;
        byte[] bArr = opRequest.f379184e;
        gq6Var.f457021f = bArr != null ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr) : null;
        java.lang.String str2 = opRequest.f379185f;
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            gVar2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes2);
        } else {
            gVar2 = null;
        }
        gq6Var.f457022g = gVar2;
        gq6Var.f457023h = getRequest.f379169f;
        r45.hq6 hq6Var = (r45.hq6) this.f149953a;
        hq6Var.f457926g = gq6Var;
        java.lang.String str3 = getRequest.f379165b;
        hq6Var.f457923d = str3;
        java.lang.String str4 = opRequest.f379180a;
        hq6Var.f457924e = str4;
        int i17 = getRequest.f379164a;
        hq6Var.f457925f = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initRequest url: ");
        sb6.append(str3);
        sb6.append(", username: ");
        sb6.append(str4);
        sb6.append(", scene: ");
        sb6.append(i17);
        sb6.append(", ticketSize: ");
        java.lang.String str5 = addContactContext.f467021f;
        sb6.append(str5 != null ? java.lang.Integer.valueOf(str5.length()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiTryAddOpenIMKefuContact", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    public int a() {
        return this.f404978g;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    public java.lang.String b() {
        return this.f404976e;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    public java.lang.String c() {
        return this.f404977f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m41.d.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
