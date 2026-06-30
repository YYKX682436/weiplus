package zu3;

/* loaded from: classes10.dex */
public final class a0 extends zu3.a implements zu3.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f557297g;

    /* renamed from: h, reason: collision with root package name */
    public int f557298h;

    /* renamed from: i, reason: collision with root package name */
    public int f557299i;

    /* renamed from: j, reason: collision with root package name */
    public int f557300j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f557301k;

    /* renamed from: l, reason: collision with root package name */
    public final bv3.b f557302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.CharSequence charSequence, int i17, int i18, int i19, android.graphics.Matrix matrix) {
        super(zu3.e.f557329e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f557301k = "";
        this.f557302l = new bv3.b(null, 0L, 3, null);
        this.f557297g = charSequence;
        this.f557298h = i17;
        this.f557299i = i18;
        this.f557300j = i19;
        this.f557296f.set(matrix);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextItem", m179489x9616526c());
    }

    @Override // zu3.p
    public bv3.b b() {
        return this.f557302l;
    }

    @Override // zu3.p
    public void c(java.lang.String path, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        bv3.b bVar = this.f557302l;
        bVar.getClass();
        bVar.f106257a = path;
        bVar.f106258b = j17;
    }

    @Override // zu3.o
    /* renamed from: toProtoBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo179488xc3d7db06() {
        r45.ll6 ll6Var = new r45.ll6();
        ll6Var.f461112d = java.lang.String.valueOf(this.f557297g);
        ll6Var.f461115g = f(this.f557296f);
        ll6Var.f461114f = this.f557299i;
        ll6Var.f461113e = this.f557298h;
        ll6Var.f461118m = this.f557301k;
        ll6Var.f461117i = e();
        return ll6Var;
    }

    /* renamed from: toString */
    public java.lang.String m179489x9616526c() {
        return "[" + hashCode() + "]text:" + ((java.lang.Object) this.f557297g) + " color:" + this.f557298h + " bgColor:" + this.f557299i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font, int i19, android.graphics.Matrix matrix, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(zu3.e.f557329e);
        i19 = (i27 & 16) != 0 ? 0 : i19;
        matrix = (i27 & 32) != 0 ? new android.graphics.Matrix() : matrix;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f557301k = "";
        this.f557302l = new bv3.b(null, 0L, 3, null);
        this.f557297g = charSequence;
        this.f557298h = i17;
        this.f557299i = i18;
        this.f557301k = font;
        this.f557300j = i19;
        this.f557296f.set(matrix);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextItem", m179489x9616526c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[Catch: IOException -> 0x007a, TryCatch #1 {IOException -> 0x007a, blocks: (B:3:0x001d, B:7:0x003c, B:9:0x0069, B:10:0x0072, B:19:0x0030, B:16:0x002b), top: B:2:0x001d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(r45.de r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.TextItem"
            java.lang.String r1 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r1)
            zu3.e r1 = zu3.e.f557329e
            r9.<init>(r1)
            java.lang.String r1 = ""
            r9.f557301k = r1
            bv3.b r8 = new bv3.b
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r6, r7)
            r9.f557302l = r8
            r45.ll6 r2 = new r45.ll6     // Catch: java.io.IOException -> L7a
            r2.<init>()     // Catch: java.io.IOException -> L7a
            r45.cu5 r10 = r10.f453872e     // Catch: java.io.IOException -> L7a
            com.tencent.mm.protobuf.g r10 = r10.f453374f     // Catch: java.io.IOException -> L7a
            byte[] r10 = r10.f273689a     // Catch: java.io.IOException -> L7a
            if (r10 != 0) goto L2b
            goto L39
        L2b:
            r2.mo11468x92b714fd(r10)     // Catch: java.lang.Exception -> L2f
            goto L3a
        L2f:
            r10 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.io.IOException -> L7a
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r1, r10)     // Catch: java.io.IOException -> L7a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L83
            java.lang.String r10 = r2.f461112d     // Catch: java.io.IOException -> L7a
            r9.f557297g = r10     // Catch: java.io.IOException -> L7a
            int r10 = r2.f461113e     // Catch: java.io.IOException -> L7a
            r9.f557298h = r10     // Catch: java.io.IOException -> L7a
            int r10 = r2.f461114f     // Catch: java.io.IOException -> L7a
            r9.f557299i = r10     // Catch: java.io.IOException -> L7a
            int r10 = r2.f461116h     // Catch: java.io.IOException -> L7a
            r9.f557300j = r10     // Catch: java.io.IOException -> L7a
            android.graphics.Matrix r10 = r9.f557296f     // Catch: java.io.IOException -> L7a
            r45.zz6 r1 = r2.f461115g     // Catch: java.io.IOException -> L7a
            java.lang.String r3 = "matrix"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)     // Catch: java.io.IOException -> L7a
            float[] r1 = r9.g(r1)     // Catch: java.io.IOException -> L7a
            r10.setValues(r1)     // Catch: java.io.IOException -> L7a
            java.lang.String r10 = r2.f461118m     // Catch: java.io.IOException -> L7a
            java.lang.String r1 = "font"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r1)     // Catch: java.io.IOException -> L7a
            r9.f557301k = r10     // Catch: java.io.IOException -> L7a
            r45.bi0 r10 = r2.f461117i     // Catch: java.io.IOException -> L7a
            if (r10 == 0) goto L72
            long r1 = r10.f452305d     // Catch: java.io.IOException -> L7a
            long r3 = r10.f452306e     // Catch: java.io.IOException -> L7a
            bv3.d r10 = r9.f557293c     // Catch: java.io.IOException -> L7a
            r10.d(r1, r3)     // Catch: java.io.IOException -> L7a
        L72:
            java.lang.String r10 = r9.m179489x9616526c()     // Catch: java.io.IOException -> L7a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10)     // Catch: java.io.IOException -> L7a
            goto L83
        L7a:
            r10 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "LocationItem parse error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r10, r2, r1)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.a0.<init>(r45.de):void");
    }
}
