package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class u1 implements ae1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final ae1.c0 f84946f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ae1.u1[] f84947g;

    /* renamed from: d, reason: collision with root package name */
    public final ae1.v1 f84948d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84949e;

    static {
        final java.lang.String str = "Sm2GenKeyPair";
        final int i17 = 0;
        ae1.u1 u1Var = new ae1.u1(str, i17) { // from class: ae1.t0
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                byte[] bArr;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                byte[][] m121943x94e577a1 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121943x94e577a1();
                if (m121943x94e577a1 == null || 2 > m121943x94e577a1.length || (bArr = m121943x94e577a1[0]) == null || m121943x94e577a1[1] == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2GenKeyPair.operate, keyPair is illegal");
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                jc1.d dVar = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("privateKey", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(bArr)), new jz5.l("publicKey", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121943x94e577a1[1])));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar, l17);
            }
        };
        final java.lang.String str2 = "Sm2GenPublicKey";
        final int i18 = 1;
        ae1.u1 u1Var2 = new ae1.u1(str2, i18) { // from class: ae1.u0
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.a0 d17 = ae1.c0.d(ae1.u1.f84946f, params, "privateKey");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121944xc454e6fe = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121944xc454e6fe((byte[]) obj);
                if (m121944xc454e6fe == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2GenPublicKey.operate, publicKey is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("publicKey", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121944xc454e6fe)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str3 = "Sm2EncryptWithMode";
        final int i19 = 2;
        ae1.u1 u1Var3 = new ae1.u1(str3, i19) { // from class: ae1.s0
            {
                ae1.v1 v1Var = ae1.v1.f84950d;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "publicKey");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 c17 = ae1.c0.c(c0Var, params, "cipherMode");
                if (!(c17 instanceof ae1.z)) {
                    return ((ae1.y) c17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) c17).f84958a;
                if (!(obj3 instanceof ae1.k)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121942xde9214d6 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121942xde9214d6(bArr, bArr2, ((ae1.k) obj3).f84926e);
                if (m121942xde9214d6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2EncryptWithMode.operate, ciphertext is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121942xde9214d6)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str4 = "Sm2DecryptWithMode";
        final int i27 = 3;
        ae1.u1 u1Var4 = new ae1.u1(str4, i27) { // from class: ae1.q0
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "privateKey");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 c17 = ae1.c0.c(c0Var, params, "cipherMode");
                if (!(c17 instanceof ae1.z)) {
                    return ((ae1.y) c17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) c17).f84958a;
                if (!(obj3 instanceof ae1.k)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121940x93ea93fe = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121940x93ea93fe(bArr, bArr2, ((ae1.k) obj3).f84926e);
                if (m121940x93ea93fe == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2DecryptWithMode.operate, plaintext is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121940x93ea93fe)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str5 = "Sm2SignWithMode";
        final int i28 = 4;
        ae1.u1 u1Var5 = new ae1.u1(str5, i28) { // from class: ae1.x0
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "uid");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "privateKey");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr3 = (byte[]) obj3;
                ae1.a0 d27 = ae1.c0.d(c0Var, params, "publicKey");
                if (!(d27 instanceof ae1.z)) {
                    return ((ae1.y) d27).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d27).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr4 = (byte[]) obj4;
                ae1.a0 e17 = ae1.c0.e(c0Var, params, "signMode");
                if (!(e17 instanceof ae1.z)) {
                    return ((ae1.y) e17).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) e17).f84958a;
                if (!(obj5 instanceof ae1.o)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121947x79b5ed9e = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121947x79b5ed9e(bArr, bArr2, bArr3, bArr4, ((ae1.o) obj5).f84935e);
                if (m121947x79b5ed9e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2SignWithMode.operate, signed is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("signed", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121947x79b5ed9e)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str6 = "Sm2VerifyWithMode";
        final int i29 = 5;
        ae1.u1 u1Var6 = new ae1.u1(str6, i29) { // from class: ae1.a1
            {
                ae1.v1 v1Var = ae1.v1.f84950d;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "uid");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "signed");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr3 = (byte[]) obj3;
                ae1.a0 d27 = ae1.c0.d(c0Var, params, "publicKey");
                if (!(d27 instanceof ae1.z)) {
                    return ((ae1.y) d27).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d27).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr4 = (byte[]) obj4;
                ae1.a0 e17 = ae1.c0.e(c0Var, params, "signMode");
                if (!(e17 instanceof ae1.z)) {
                    return ((ae1.y) e17).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) e17).f84958a;
                if (!(obj5 instanceof ae1.o)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                boolean m121950x82c1ae5a = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121950x82c1ae5a(bArr, bArr2, bArr3, bArr4, ((ae1.o) obj5).f84935e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2VerifyWithMode.operate, success: " + m121950x82c1ae5a);
                return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l(ya.b.f77504xbb80cbe3, java.lang.Boolean.valueOf(m121950x82c1ae5a))));
            }
        };
        final java.lang.String str7 = "Sm2SealEnvelope";
        final int i37 = 6;
        ae1.u1 u1Var7 = new ae1.u1(str7, i37) { // from class: ae1.v0
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                java.lang.Object yVar;
                ae1.q qVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2SealEnvelope.operate");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "cert");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                c0Var.getClass();
                jc1.d dVar2 = jc1.f.f380452h;
                try {
                    ae1.p pVar = ae1.q.f84937e;
                    int i38 = params.f84943b.getInt("sm4Mode");
                    pVar.getClass();
                    ae1.q[] m1172xcee59d22 = ae1.q.m1172xcee59d22();
                    int length = m1172xcee59d22.length;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= length) {
                            qVar = null;
                            break;
                        }
                        qVar = m1172xcee59d22[i39];
                        qVar.getClass();
                        if (i38 == 0) {
                            break;
                        }
                        i39++;
                    }
                    if (qVar != null) {
                        yVar = new ae1.z(qVar);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "parseSm4Mode, null");
                        yVar = new ae1.y(new ae1.u(dVar2, null, 2, null));
                    }
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e17, "parseSm4Mode failure", new java.lang.Object[0]);
                    yVar = new ae1.y(new ae1.u(dVar2, null, 2, null));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.SmCryptoInvoker", e18, "parseSm4Mode failure", new java.lang.Object[0]);
                    yVar = new ae1.y(new ae1.u(dVar, null, 2, null));
                }
                if (!(yVar instanceof ae1.z)) {
                    return ((ae1.y) yVar).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) yVar).f84958a;
                if (!(obj3 instanceof ae1.q)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121945x1d92225 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121945x1d92225(bArr, bArr2, ((ae1.q) obj3).f84939d);
                if (m121945x1d92225 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2SealEnvelope.operate, ciphertext is null, lastError:%d", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c()));
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar3 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121945x1d92225)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
            }
        };
        final java.lang.String str8 = "Sm2UnsealEnvelope";
        final int i38 = 7;
        ae1.u1 u1Var8 = new ae1.u1(str8, i38) { // from class: ae1.y0
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2UnsealEnvelope.operate");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "privateKey");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121948x28aca53e = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121948x28aca53e(bArr, (byte[]) obj2);
                if (m121948x28aca53e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "sm2UnsealEnvelope.operate, plaintext is null, lastError:%d", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c()));
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121948x28aca53e)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str9 = "Sm3";
        final int i39 = 8;
        ae1.u1 u1Var9 = new ae1.u1(str9, i39) { // from class: ae1.b1
            {
                ae1.v1 v1Var = ae1.v1.f84950d;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.a0 d17 = ae1.c0.d(ae1.u1.f84946f, params, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] sm32 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().sm3((byte[]) obj);
                if (sm32 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm3.operate, digest is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("digest", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(sm32)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str10 = "Sm3Hmac";
        final int i47 = 9;
        ae1.u1 u1Var10 = new ae1.u1(str10, i47) { // from class: ae1.c1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "key");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121951x805de8a0 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121951x805de8a0(bArr, (byte[]) obj2);
                if (m121951x805de8a0 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm3Hmac.operate, mac is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52914x1ed75ebb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121951x805de8a0)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str11 = "GenRandomBytes";
        final int i48 = 10;
        ae1.u1 u1Var11 = new ae1.u1(str11, i48) { // from class: ae1.j0
            {
                ae1.v1 v1Var = ae1.v1.f84950d;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                try {
                    int i49 = params.f84943b.getInt("length");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SmCryptoInvoker", "GenRandomBytes.operate, len: " + i49);
                    byte[] m121938xd4b76d68 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121938xd4b76d68(i49);
                    if (m121938xd4b76d68 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "GenRandomBytes.operate, randomBytes is null");
                        return new ae1.u(jc1.f.f380448d, null, 2, null);
                    }
                    jc1.d dVar = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("randomBytes", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121938xd4b76d68)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar, l17);
                } catch (org.json.JSONException unused) {
                    return new ae1.u(jc1.f.f380452h, null, 2, null);
                }
            }
        };
        final java.lang.String str12 = "Sm4CbcEncrypt";
        final int i49 = 11;
        ae1.u1 u1Var12 = new ae1.u1(str12, i49) { // from class: ae1.e1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "key");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "iv");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] m121953x8adee29b = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121953x8adee29b(bArr, bArr2, (byte[]) obj3, params.f84943b.getBoolean("noPadding"));
                    if (m121953x8adee29b == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CbcEncrypt.operate, ciphertext is null");
                        return new ae1.u(dVar, null, 2, null);
                    }
                    jc1.d dVar2 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121953x8adee29b)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
                } catch (org.json.JSONException unused) {
                    return new ae1.u(jc1.f.f380452h, null, 2, null);
                }
            }
        };
        final java.lang.String str13 = "Sm4CbcDecrypt";
        final int i57 = 12;
        ae1.u1 u1Var13 = new ae1.u1(str13, i57) { // from class: ae1.d1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "key");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "iv");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] m121952x469d09c3 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121952x469d09c3(bArr, bArr2, (byte[]) obj3, params.f84943b.getBoolean("noPadding"));
                    if (m121952x469d09c3 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CbcDecrypt.operate, plaintext is null");
                        return new ae1.u(dVar, null, 2, null);
                    }
                    jc1.d dVar2 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121952x469d09c3)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
                } catch (org.json.JSONException unused) {
                    return new ae1.u(jc1.f.f380452h, null, 2, null);
                }
            }
        };
        final java.lang.String str14 = "Sm4GcmEncrypt";
        final int i58 = 13;
        ae1.u1 u1Var14 = new ae1.u1(str14, i58) { // from class: ae1.k1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                byte[] bArr;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "key");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr3 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "iv");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr4 = (byte[]) obj3;
                ae1.a0 d27 = ae1.c0.d(c0Var, params, "aad");
                if (!(d27 instanceof ae1.z)) {
                    return ((ae1.y) d27).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d27).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[][] m121957xff14d6ce = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121957xff14d6ce(bArr2, bArr3, bArr4, (byte[]) obj4);
                if (m121957xff14d6ce == null || 2 > m121957xff14d6ce.length || (bArr = m121957xff14d6ce[0]) == null || m121957xff14d6ce[1] == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4GcmEncrypt.operate, encryptResult is illegal");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(bArr)), new jz5.l("tag", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121957xff14d6ce[1])));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str15 = "Sm4GcmDecrypt";
        final int i59 = 14;
        ae1.u1 u1Var15 = new ae1.u1(str15, i59) { // from class: ae1.j1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "tag");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "key");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr3 = (byte[]) obj3;
                ae1.a0 d27 = ae1.c0.d(c0Var, params, "iv");
                if (!(d27 instanceof ae1.z)) {
                    return ((ae1.y) d27).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d27).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr4 = (byte[]) obj4;
                ae1.a0 d28 = ae1.c0.d(c0Var, params, "aad");
                if (!(d28 instanceof ae1.z)) {
                    return ((ae1.y) d28).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) d28).f84958a;
                if (!(obj5 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121956xbad2fdf6 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121956xbad2fdf6(bArr, bArr2, bArr3, bArr4, (byte[]) obj5);
                if (m121956xbad2fdf6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4GcmDecrypt.operate, plaintext is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121956xbad2fdf6)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str16 = "Sm4CtrEncrypt";
        final int i66 = 15;
        ae1.u1 u1Var16 = new ae1.u1(str16, i66) { // from class: ae1.g1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "key");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "iv");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121955xde051be = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121955xde051be(bArr, bArr2, (byte[]) obj3);
                if (m121955xde051be == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CtrEncrypt.operate, ciphertext is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121955xde051be)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str17 = "Sm4CtrDecrypt";
        final int i67 = 16;
        ae1.u1 u1Var17 = new ae1.u1(str17, i67) { // from class: ae1.f1
            {
                ae1.v1 v1Var = ae1.v1.f84951e;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) d17).f84958a;
                boolean z17 = obj instanceof byte[];
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "key");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) d18).f84958a;
                if (!(obj2 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj2;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "iv");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d19).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] m121954xc99e78e6 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121954xc99e78e6(bArr, bArr2, (byte[]) obj3);
                if (m121954xc99e78e6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CtrDecrypt.operate, plaintext is null");
                    return new ae1.u(dVar, null, 2, null);
                }
                jc1.d dVar2 = jc1.f.f380445a;
                java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(m121954xc99e78e6)));
                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar2, l17);
            }
        };
        final java.lang.String str18 = "GenerateSm4Key";
        final int i68 = 17;
        ae1.u1 u1Var18 = new ae1.u1(str18, i68) { // from class: ae1.l0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122007x7ff5809a(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "GenerateSm4Key.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str19 = "ImportSm4Key";
        final int i69 = 18;
        ae1.u1 u1Var19 = new ae1.u1(str19, i69) { // from class: ae1.o0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str20 = (java.lang.String) obj2;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, "key");
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) g18).f84958a;
                if (!(obj3 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] a17 = ae1.c0.a(c0Var, (java.lang.String) obj3);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm4Key.operate, decode hexKey fail");
                    return new ae1.u(jc1.f.f380452h, null, 2, null);
                }
                try {
                    ((ae1.z1) dVar2).f(str20, a17);
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm4Key.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str20 = "ExportSm4Key";
        final int i76 = 19;
        ae1.u1 u1Var20 = new ae1.u1(str20, i76) { // from class: ae1.i0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] c17 = ((ae1.z1) dVar2).c((java.lang.String) obj2);
                    c0Var.getClass();
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l("key", kz5.z.a0(c17, "", null, null, 0, null, ae1.b0.f84915d, 30, null))));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm4Key.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str21 = "UpdateSm4Key";
        final int i77 = 20;
        ae1.u1 u1Var21 = new ae1.u1(str21, i77) { // from class: ae1.t1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str22 = (java.lang.String) obj2;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, "key");
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) g18).f84958a;
                if (!(obj3 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] a17 = ae1.c0.a(c0Var, (java.lang.String) obj3);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm4Key.operate, decode hexKey fail");
                    return new ae1.u(jc1.f.f380452h, null, 2, null);
                }
                try {
                    ((ae1.z1) dVar2).i(str22, a17);
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm4Key.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str22 = "DeleteSm4Key";
        final int i78 = 21;
        ae1.u1 u1Var22 = new ae1.u1(str22, i78) { // from class: ae1.f0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122002xd0707050(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm4Key.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str23 = "CheckSm4Key";
        final int i79 = 22;
        ae1.u1 u1Var23 = new ae1.u1(str23, i79) { // from class: ae1.x
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                boolean m121999x2b8e15ed;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        m121999x2b8e15ed = com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m121999x2b8e15ed(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l("exist", java.lang.Boolean.valueOf(m121999x2b8e15ed))));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm4Key.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str24 = "GenerateSm2KeyPair";
        final int i86 = 23;
        ae1.u1 u1Var24 = new ae1.u1(str24, i86) { // from class: ae1.k0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122006xc21320d6(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "GenerateSm2KeyPair.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str25 = "ImportSm2PublicKey";
        final int i87 = 24;
        ae1.u1 u1Var25 = new ae1.u1(str25, i87) { // from class: ae1.n0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str26 = (java.lang.String) obj2;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, "publicKey");
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) g18).f84958a;
                if (!(obj3 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str27 = (java.lang.String) obj3;
                ae1.a0 f17 = ae1.c0.f(c0Var, params, "sm2KeyFormat");
                if (!(f17 instanceof ae1.z)) {
                    return ((ae1.y) f17).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) f17).f84958a;
                if (!(obj4 instanceof ae1.m)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    ((ae1.z1) dVar2).e(str26, str27, ((ae1.m) obj4).f84931e);
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm2PublicKey.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str26 = "ExportSm2PublicKey";
        final int i88 = 25;
        ae1.u1 u1Var26 = new ae1.u1(str26, i88) { // from class: ae1.h0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str27 = (java.lang.String) obj2;
                ae1.a0 f17 = ae1.c0.f(c0Var, params, "sm2KeyFormat");
                if (!(f17 instanceof ae1.z)) {
                    return ((ae1.y) f17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) f17).f84958a;
                if (!(obj3 instanceof ae1.m)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l("publicKey", ((ae1.z1) dVar2).b(str27, ((ae1.m) obj3).f84931e))));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm2PublicKey.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str27 = "UpdateSm2PublicKey";
        final int i89 = 26;
        ae1.u1 u1Var27 = new ae1.u1(str27, i89) { // from class: ae1.s1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str28 = (java.lang.String) obj2;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, "publicKey");
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) g18).f84958a;
                if (!(obj3 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str29 = (java.lang.String) obj3;
                ae1.a0 f17 = ae1.c0.f(c0Var, params, "sm2KeyFormat");
                if (!(f17 instanceof ae1.z)) {
                    return ((ae1.y) f17).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) f17).f84958a;
                if (!(obj4 instanceof ae1.m)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    ((ae1.z1) dVar2).h(str28, str29, ((ae1.m) obj4).f84931e);
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm2PublicKey.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str28 = "DeleteSm2PublicKey";
        final int i96 = 27;
        ae1.u1 u1Var28 = new ae1.u1(str28, i96) { // from class: ae1.e0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122001xec31dc0f(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm2PublicKey.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str29 = "CheckSm2PublicKey";
        final int i97 = 28;
        ae1.u1 u1Var29 = new ae1.u1(str29, i97) { // from class: ae1.w
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                boolean m121998x2b3d7552;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        m121998x2b3d7552 = com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m121998x2b3d7552(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l("exist", java.lang.Boolean.valueOf(m121998x2b3d7552))));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm2PublicKey.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str30 = "ImportSm2PrivateKey";
        final int i98 = 29;
        ae1.u1 u1Var30 = new ae1.u1(str30, i98) { // from class: ae1.m0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str31 = (java.lang.String) obj2;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, "privateKey");
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) g18).f84958a;
                if (!(obj3 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str32 = (java.lang.String) obj3;
                ae1.a0 f17 = ae1.c0.f(c0Var, params, "sm2KeyFormat");
                if (!(f17 instanceof ae1.z)) {
                    return ((ae1.y) f17).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) f17).f84958a;
                if (!(obj4 instanceof ae1.m)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    ((ae1.z1) dVar2).d(str31, str32, ((ae1.m) obj4).f84931e);
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm2PrivateKey.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str31 = "ExportSm2PrivateKey";
        final int i99 = 30;
        ae1.u1 u1Var31 = new ae1.u1(str31, i99) { // from class: ae1.g0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str32 = (java.lang.String) obj2;
                ae1.a0 f17 = ae1.c0.f(c0Var, params, "sm2KeyFormat");
                if (!(f17 instanceof ae1.z)) {
                    return ((ae1.y) f17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) f17).f84958a;
                if (!(obj3 instanceof ae1.m)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    java.lang.String[] a17 = ((ae1.z1) dVar2).a(str32, ((ae1.m) obj3).f84931e);
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l("privateKey", (a17.length == 0) ^ true ? a17[0] : "")));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm2PrivateKey.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str32 = "UpdateSm2PrivateKey";
        final int i100 = 31;
        ae1.u1 u1Var32 = new ae1.u1(str32, i100) { // from class: ae1.r1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str33 = (java.lang.String) obj2;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, "privateKey");
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) g18).f84958a;
                if (!(obj3 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str34 = (java.lang.String) obj3;
                ae1.a0 f17 = ae1.c0.f(c0Var, params, "sm2KeyFormat");
                if (!(f17 instanceof ae1.z)) {
                    return ((ae1.y) f17).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) f17).f84958a;
                if (!(obj4 instanceof ae1.m)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    ((ae1.z1) dVar2).g(str33, str34, ((ae1.m) obj4).f84931e);
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm2PrivateKey.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str33 = "DeleteSm2PrivateKey";
        final int i101 = 32;
        ae1.u1 u1Var33 = new ae1.u1(str33, i101) { // from class: ae1.d0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122000xec0ac425(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, null, 2, null);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm2PrivateKey.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str34 = "CheckSm2PrivateKey";
        final int i102 = 33;
        ae1.u1 u1Var34 = new ae1.u1(str34, i102) { // from class: ae1.v
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                boolean m121997x2b165d68;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                if (!(obj instanceof ae1.d)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                ae1.d dVar = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(jc1.f.f380448d, null, 2, null);
                }
                java.lang.String desc = (java.lang.String) obj2;
                try {
                    ae1.z1 z1Var = (ae1.z1) dVar;
                    z1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
                    synchronized (ae1.z1.f84959i) {
                        com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m122011x316510(z1Var.f84960d, z1Var.f84961e, z1Var.f84962f);
                        m121997x2b165d68 = com.p3249xcbb51f6b.tsm.C28042x6bec74ed.m121997x2b165d68(desc);
                    }
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l("exist", java.lang.Boolean.valueOf(m121997x2b165d68))));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm2PrivateKey.operate, fail since " + e17);
                    return ae1.u1.f84946f.h(e17);
                }
            }
        };
        final java.lang.String str35 = "Sm4EcbEncrypt";
        final int i103 = 34;
        ae1.u1 u1Var35 = new ae1.u1(str35, i103) { // from class: ae1.i1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str36 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] f17 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).f(str36, (byte[]) obj3);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(f17)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4EcbEncrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str36 = "Sm4EcbDecrypt";
        final int i104 = 35;
        ae1.u1 u1Var36 = new ae1.u1(str36, i104) { // from class: ae1.h1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str37 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] e17 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).e(str37, (byte[]) obj3);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(e17)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4EcbDecrypt.operate, fail since " + e18);
                    return c0Var.h(e18);
                }
            }
        };
        final java.lang.String str37 = "SmStorageSm4CbcEncrypt";
        final int i105 = 36;
        ae1.u1 u1Var37 = new ae1.u1(str37, i105) { // from class: ae1.m1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str38 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "iv");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d18).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] b18 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).b(str38, bArr, (byte[]) obj4);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(b18)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CbcEncrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str38 = "SmStorageSm4CbcDecrypt";
        final int i106 = 37;
        ae1.u1 u1Var38 = new ae1.u1(str38, i106) { // from class: ae1.l1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str39 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "iv");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d18).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] a17 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).a(str39, bArr, (byte[]) obj4);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(a17)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CbcDecrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str39 = "SmStorageSm4CtrEncrypt";
        final int i107 = 38;
        ae1.u1 u1Var39 = new ae1.u1(str39, i107) { // from class: ae1.o1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str40 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "iv");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d18).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] d19 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).d(str40, bArr, (byte[]) obj4);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(d19)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CtrEncrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str40 = "SmStorageSm4CtrDecrypt";
        final int i108 = 39;
        ae1.u1 u1Var40 = new ae1.u1(str40, i108) { // from class: ae1.n1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str41 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "iv");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d18).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] c17 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).c(str41, bArr, (byte[]) obj4);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(c17)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CtrDecrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str41 = "SmStorageSm4GcmEncrypt";
        final int i109 = 40;
        ae1.u1 u1Var41 = new ae1.u1(str41, i109) { // from class: ae1.q1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str42 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "iv");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d18).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj4;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "aad");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) d19).f84958a;
                if (!(obj5 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[][] h17 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).h(str42, bArr, bArr2, (byte[]) obj5);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(h17[0])), new jz5.l("tag", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(h17[1])));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4GcmEncrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str42 = "SmStorageSm4GcmDecrypt";
        final int i110 = 41;
        ae1.u1 u1Var42 = new ae1.u1(str42, i110) { // from class: ae1.p1
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str43 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "tag");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) d18).f84958a;
                if (!(obj4 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj4;
                ae1.a0 d19 = ae1.c0.d(c0Var, params, "iv");
                if (!(d19 instanceof ae1.z)) {
                    return ((ae1.y) d19).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) d19).f84958a;
                if (!(obj5 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr3 = (byte[]) obj5;
                ae1.a0 d27 = ae1.c0.d(c0Var, params, "aad");
                if (!(d27 instanceof ae1.z)) {
                    return ((ae1.y) d27).f84956a;
                }
                java.lang.Object obj6 = ((ae1.z) d27).f84958a;
                if (!(obj6 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] g18 = ((ae1.y1) ((ae1.z1) dVar2).f84963g).g(str43, bArr, bArr2, bArr3, (byte[]) obj6);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(g18)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4GcmDecrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str43 = "Sm2Encrypt";
        final int i111 = 42;
        ae1.u1 u1Var43 = new ae1.u1(str43, i111) { // from class: ae1.r0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str44 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "plaintext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 c17 = ae1.c0.c(c0Var, params, "cipherMode");
                if (!(c17 instanceof ae1.z)) {
                    return ((ae1.y) c17).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) c17).f84958a;
                if (!(obj4 instanceof ae1.k)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] b18 = ((ae1.x1) ((ae1.z1) dVar2).f84964h).b(str44, bArr, ((ae1.k) obj4).f84927f);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("ciphertext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(b18)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Encrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str44 = "Sm2Decrypt";
        final int i112 = 43;
        ae1.u1 u1Var44 = new ae1.u1(str44, i112) { // from class: ae1.p0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str45 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, "ciphertext");
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 c17 = ae1.c0.c(c0Var, params, "cipherMode");
                if (!(c17 instanceof ae1.z)) {
                    return ((ae1.y) c17).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) c17).f84958a;
                if (!(obj4 instanceof ae1.k)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] a17 = ((ae1.x1) ((ae1.z1) dVar2).f84964h).a(str45, bArr, ((ae1.k) obj4).f84927f);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("plaintext", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(a17)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Decrypt.operate, fail since " + e17);
                    return c0Var.h(e17);
                }
            }
        };
        final java.lang.String str45 = "Sm2Sign";
        final int i113 = 44;
        ae1.u1 u1Var45 = new ae1.u1(str45, i113) { // from class: ae1.w0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str46 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, dm.i4.f66865x76d1ec5a);
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) g18).f84958a;
                if (!(obj4 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str47 = (java.lang.String) obj4;
                ae1.a0 e17 = ae1.c0.e(c0Var, params, "signMode");
                if (!(e17 instanceof ae1.z)) {
                    return ((ae1.y) e17).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) e17).f84958a;
                if (!(obj5 instanceof ae1.o)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    byte[] c17 = ((ae1.x1) ((ae1.z1) dVar2).f84964h).c(str46, bArr, str47, ((ae1.o) obj5).f84936f);
                    jc1.d dVar3 = jc1.f.f380445a;
                    java.util.Map l17 = kz5.c1.l(new jz5.l("signed", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.e(c17)));
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y env = params.f84942a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(env.mo50357xcd94f799(), l17, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) env.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class)) ? new ae1.u(new jc1.d(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), l17) : new ae1.u(dVar3, l17);
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Sign.operate, fail since " + e18);
                    return c0Var.h(e18);
                }
            }
        };
        final java.lang.String str46 = "Sm2Verify";
        final int i114 = 45;
        ae1.u1[] u1VarArr = {u1Var, u1Var2, u1Var3, u1Var4, u1Var5, u1Var6, u1Var7, u1Var8, u1Var9, u1Var10, u1Var11, u1Var12, u1Var13, u1Var14, u1Var15, u1Var16, u1Var17, u1Var18, u1Var19, u1Var20, u1Var21, u1Var22, u1Var23, u1Var24, u1Var25, u1Var26, u1Var27, u1Var28, u1Var29, u1Var30, u1Var31, u1Var32, u1Var33, u1Var34, u1Var35, u1Var36, u1Var37, u1Var38, u1Var39, u1Var40, u1Var41, u1Var42, u1Var43, u1Var44, u1Var45, new ae1.u1(str46, i114) { // from class: ae1.z0
            {
                ae1.v1 v1Var = ae1.v1.f84952f;
            }

            @Override // ae1.a
            public ae1.u a(ae1.t params) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
                ae1.c0 c0Var = ae1.u1.f84946f;
                ae1.a0 b17 = ae1.c0.b(c0Var, params);
                if (!(b17 instanceof ae1.z)) {
                    return ((ae1.y) b17).f84956a;
                }
                java.lang.Object obj = ((ae1.z) b17).f84958a;
                boolean z17 = obj instanceof ae1.d;
                jc1.d dVar = jc1.f.f380448d;
                if (!z17) {
                    return new ae1.u(dVar, null, 2, null);
                }
                ae1.d dVar2 = (ae1.d) obj;
                ae1.a0 g17 = ae1.c0.g(c0Var, params, "desc");
                if (!(g17 instanceof ae1.z)) {
                    return ((ae1.y) g17).f84956a;
                }
                java.lang.Object obj2 = ((ae1.z) g17).f84958a;
                if (!(obj2 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str47 = (java.lang.String) obj2;
                ae1.a0 d17 = ae1.c0.d(c0Var, params, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
                if (!(d17 instanceof ae1.z)) {
                    return ((ae1.y) d17).f84956a;
                }
                java.lang.Object obj3 = ((ae1.z) d17).f84958a;
                if (!(obj3 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr = (byte[]) obj3;
                ae1.a0 g18 = ae1.c0.g(c0Var, params, dm.i4.f66865x76d1ec5a);
                if (!(g18 instanceof ae1.z)) {
                    return ((ae1.y) g18).f84956a;
                }
                java.lang.Object obj4 = ((ae1.z) g18).f84958a;
                if (!(obj4 instanceof java.lang.String)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                java.lang.String str48 = (java.lang.String) obj4;
                ae1.a0 d18 = ae1.c0.d(c0Var, params, "signed");
                if (!(d18 instanceof ae1.z)) {
                    return ((ae1.y) d18).f84956a;
                }
                java.lang.Object obj5 = ((ae1.z) d18).f84958a;
                if (!(obj5 instanceof byte[])) {
                    return new ae1.u(dVar, null, 2, null);
                }
                byte[] bArr2 = (byte[]) obj5;
                ae1.a0 e17 = ae1.c0.e(c0Var, params, "signMode");
                if (!(e17 instanceof ae1.z)) {
                    return ((ae1.y) e17).f84956a;
                }
                java.lang.Object obj6 = ((ae1.z) e17).f84958a;
                if (!(obj6 instanceof ae1.o)) {
                    return new ae1.u(dVar, null, 2, null);
                }
                try {
                    return new ae1.u(jc1.f.f380445a, kz5.c1.l(new jz5.l(ya.b.f77504xbb80cbe3, java.lang.Boolean.valueOf(((ae1.x1) ((ae1.z1) dVar2).f84964h).d(str47, bArr, str48, bArr2, ((ae1.o) obj6).f84936f)))));
                } catch (com.p3249xcbb51f6b.tsm.C28041x16492e41 e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Verify.operate, fail since " + e18);
                    return c0Var.h(e18);
                }
            }
        }};
        f84947g = u1VarArr;
        rz5.b.a(u1VarArr);
        f84946f = new ae1.c0(null);
    }

    public u1(java.lang.String str, int i17, ae1.v1 v1Var, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f84948d = v1Var;
        this.f84949e = str2;
    }

    /* renamed from: valueOf */
    public static ae1.u1 m1179xdce0328(java.lang.String str) {
        return (ae1.u1) java.lang.Enum.valueOf(ae1.u1.class, str);
    }

    /* renamed from: values */
    public static ae1.u1[] m1180xcee59d22() {
        return (ae1.u1[]) f84947g.clone();
    }
}
