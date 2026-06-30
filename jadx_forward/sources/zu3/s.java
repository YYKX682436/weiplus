package zu3;

/* loaded from: classes10.dex */
public final class s extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f557359g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f557360h;

    /* renamed from: i, reason: collision with root package name */
    public final float f557361i;

    /* renamed from: j, reason: collision with root package name */
    public final float f557362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String cityName, java.lang.String poiName, float f17, float f18, android.graphics.Matrix matrix) {
        super(zu3.e.f557331g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cityName, "cityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiName, "poiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f557359g = "";
        this.f557360h = "";
        this.f557359g = cityName;
        this.f557360h = poiName;
        this.f557362j = f18;
        this.f557361i = f17;
        this.f557296f = matrix;
        java.lang.String m179540x9616526c = m179540x9616526c();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationItem", m179540x9616526c, null);
    }

    @Override // zu3.o
    /* renamed from: toProtoBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo179488xc3d7db06() {
        r45.gd4 gd4Var = new r45.gd4();
        gd4Var.f456666d = this.f557359g;
        gd4Var.f456667e = this.f557360h;
        gd4Var.f456668f = f(this.f557296f);
        gd4Var.f456669g = this.f557361i;
        gd4Var.f456670h = this.f557362j;
        return gd4Var;
    }

    /* renamed from: toString */
    public java.lang.String m179540x9616526c() {
        return "[" + hashCode() + "]poiName:" + this.f557360h + " cityName:" + this.f557359g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[Catch: IOException -> 0x0067, TryCatch #0 {IOException -> 0x0067, blocks: (B:3:0x0012, B:8:0x0033, B:9:0x005d, B:17:0x0027, B:14:0x0022), top: B:2:0x0012, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(r45.de r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.LocationItem"
            java.lang.String r1 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r1)
            zu3.e r1 = zu3.e.f557329e
            r4.<init>(r1)
            java.lang.String r1 = ""
            r4.f557359g = r1
            r4.f557360h = r1
            r45.gd4 r2 = new r45.gd4     // Catch: java.io.IOException -> L67
            r2.<init>()     // Catch: java.io.IOException -> L67
            r45.cu5 r5 = r5.f453872e     // Catch: java.io.IOException -> L67
            com.tencent.mm.protobuf.g r5 = r5.f453374f     // Catch: java.io.IOException -> L67
            byte[] r5 = r5.f273689a     // Catch: java.io.IOException -> L67
            r3 = 0
            if (r5 != 0) goto L22
        L20:
            r2 = r3
            goto L31
        L22:
            r2.mo11468x92b714fd(r5)     // Catch: java.lang.Exception -> L26
            goto L31
        L26:
            r5 = move-exception
            java.lang.String r2 = "safeParser"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.io.IOException -> L67
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r1, r5)     // Catch: java.io.IOException -> L67
            goto L20
        L31:
            if (r2 == 0) goto L5d
            java.lang.String r5 = r2.f456666d     // Catch: java.io.IOException -> L67
            java.lang.String r1 = "cityName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)     // Catch: java.io.IOException -> L67
            r4.f557359g = r5     // Catch: java.io.IOException -> L67
            java.lang.String r5 = r2.f456667e     // Catch: java.io.IOException -> L67
            java.lang.String r1 = "poiName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)     // Catch: java.io.IOException -> L67
            r4.f557360h = r5     // Catch: java.io.IOException -> L67
            float r5 = r2.f456669g     // Catch: java.io.IOException -> L67
            r4.f557361i = r5     // Catch: java.io.IOException -> L67
            float r5 = r2.f456670h     // Catch: java.io.IOException -> L67
            r4.f557362j = r5     // Catch: java.io.IOException -> L67
            android.graphics.Matrix r5 = r4.f557296f     // Catch: java.io.IOException -> L67
            r45.zz6 r1 = r2.f456668f     // Catch: java.io.IOException -> L67
            java.lang.String r2 = "matrix"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)     // Catch: java.io.IOException -> L67
            float[] r1 = r4.g(r1)     // Catch: java.io.IOException -> L67
            r5.setValues(r1)     // Catch: java.io.IOException -> L67
        L5d:
            java.lang.String r5 = r4.m179540x9616526c()     // Catch: java.io.IOException -> L67
            int r1 = rl.b.f478676a     // Catch: java.io.IOException -> L67
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5, r3)     // Catch: java.io.IOException -> L67
            goto L72
        L67:
            r5 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = rl.b.f478676a
            java.lang.String r2 = "LocationItem parse error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r5, r2, r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.s.<init>(r45.de):void");
    }
}
