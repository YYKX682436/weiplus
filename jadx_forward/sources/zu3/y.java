package zu3;

/* loaded from: classes10.dex */
public final class y extends zu3.a implements zu3.p {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f557398g;

    /* renamed from: h, reason: collision with root package name */
    public long f557399h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f557400i;

    /* renamed from: j, reason: collision with root package name */
    public int f557401j;

    /* renamed from: k, reason: collision with root package name */
    public int f557402k;

    /* renamed from: l, reason: collision with root package name */
    public float f557403l;

    /* renamed from: m, reason: collision with root package name */
    public float f557404m;

    /* renamed from: n, reason: collision with root package name */
    public float f557405n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f557406o;

    /* renamed from: p, reason: collision with root package name */
    public final bv3.b f557407p;

    /* renamed from: q, reason: collision with root package name */
    public zu3.r f557408q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String pagPath, android.graphics.Matrix matrix, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(zu3.e.f557336o);
        matrix = (i17 & 2) != 0 ? new android.graphics.Matrix() : matrix;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagPath, "pagPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f557400i = "";
        this.f557401j = 160;
        this.f557402k = 160;
        this.f557405n = 1.0f;
        this.f557406o = new android.graphics.RectF();
        this.f557407p = new bv3.b(null, 0L, 3, null);
        this.f557398g = pagPath;
        this.f557296f.set(matrix);
    }

    @Override // zu3.p
    public bv3.b b() {
        return this.f557407p;
    }

    @Override // zu3.p
    public void c(java.lang.String path, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        bv3.b bVar = this.f557407p;
        bVar.getClass();
        bVar.f106257a = path;
        bVar.f106258b = j17;
    }

    public final android.graphics.RectF i() {
        return this.f557406o;
    }

    public final void j(zu3.r rVar) {
        this.f557408q = rVar;
    }

    public final void k(long j17) {
        this.f557399h = j17;
    }

    public final void l(int i17) {
        this.f557402k = i17;
    }

    public final void m(float f17) {
        this.f557405n = f17;
    }

    public final void n(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f557400i = str;
    }

    public final void o(int i17) {
        this.f557401j = i17;
    }

    public final void p(android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr, new float[]{this.f557401j / 2.0f, this.f557402k / 2.0f});
        this.f557403l = fArr[0];
        this.f557404m = fArr[1] - this.f557406o.top;
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        double d17 = fArr2[0];
        double d18 = fArr2[3];
        double d19 = fArr2[4];
        this.f557405n = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
        float atan2 = (float) java.lang.Math.atan2(d18, d19);
        zu3.r rVar = this.f557408q;
        if (rVar != null) {
            rVar.c(this.f557403l, this.f557404m, this.f557405n, atan2);
        }
    }

    @Override // zu3.o
    /* renamed from: toProtoBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo179488xc3d7db06() {
        r45.u35 u35Var = new r45.u35();
        u35Var.f468520d = this.f557398g;
        u35Var.f468521e = this.f557400i;
        u35Var.f468522f = f(this.f557296f);
        u35Var.f468523g = e();
        return u35Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(r45.de r9) {
        /*
            r8 = this;
            java.lang.String r0 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            zu3.e r0 = zu3.e.f557336o
            r8.<init>(r0)
            java.lang.String r0 = ""
            r8.f557400i = r0
            r1 = 160(0xa0, float:2.24E-43)
            r8.f557401j = r1
            r8.f557402k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.f557405n = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r8.f557406o = r1
            bv3.b r1 = new bv3.b
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r6, r7)
            r8.f557407p = r1
            r45.u35 r1 = new r45.u35
            r1.<init>()
            r45.cu5 r9 = r9.f453872e
            com.tencent.mm.protobuf.g r9 = r9.f453374f
            byte[] r9 = r9.f273689a
            if (r9 != 0) goto L3a
            goto L48
        L3a:
            r1.mo11468x92b714fd(r9)     // Catch: java.lang.Exception -> L3e
            goto L49
        L3e:
            r9 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r0, r9)
        L48:
            r1 = 0
        L49:
            if (r1 == 0) goto L7e
            java.lang.String r0 = r1.f468520d
            java.lang.String r9 = "pagPath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r9)
            java.lang.String r9 = r1.f468521e
            java.lang.String r2 = "text"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r2)
            r8.f557400i = r9
            android.graphics.Matrix r9 = r8.f557296f
            r45.zz6 r2 = r1.f468522f
            java.lang.String r3 = "matrix"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            float[] r2 = r8.g(r2)
            r9.setValues(r2)
            android.graphics.Matrix r9 = r8.f557296f
            r8.p(r9)
            r45.bi0 r9 = r1.f468523g
            if (r9 == 0) goto L7e
            long r1 = r9.f452305d
            long r3 = r9.f452306e
            bv3.d r9 = r8.f557293c
            r9.d(r1, r3)
        L7e:
            r8.f557398g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.y.<init>(r45.de):void");
    }
}
