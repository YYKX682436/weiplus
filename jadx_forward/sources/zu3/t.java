package zu3;

/* loaded from: classes10.dex */
public final class t extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f557363g;

    /* renamed from: h, reason: collision with root package name */
    public final long f557364h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.List lyricsInfo, android.graphics.Matrix matrix) {
        super(zu3.e.f557333i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfo, "lyricsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f557363g = arrayList;
        arrayList.clear();
        arrayList.addAll(lyricsInfo);
        this.f557296f.set(matrix);
    }

    public final void i(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = this.f557363g;
        for (java.lang.Object obj : arrayList3) {
            if (((r45.ge4) obj).f456701e < j17) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }

    @Override // zu3.o
    /* renamed from: toProtoBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo179488xc3d7db06() {
        r45.fe4 fe4Var = new r45.fe4();
        float[] fArr = new float[9];
        r45.zz6 zz6Var = new r45.zz6();
        this.f557296f.getValues(fArr);
        for (int i17 = 0; i17 < 9; i17++) {
            zz6Var.f474027d.add(java.lang.Float.valueOf(fArr[i17]));
        }
        fe4Var.f455786d.addAll(this.f557363g);
        fe4Var.f455787e = zz6Var;
        fe4Var.f455788f = this.f557364h;
        return fe4Var;
    }

    /* renamed from: toString */
    public java.lang.String m179541x9616526c() {
        return "[" + hashCode() + "]lyrics size:" + this.f557363g.size();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(java.util.List lyricsInfo, long j17) {
        this(lyricsInfo, new android.graphics.Matrix());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfo, "lyricsInfo");
        this.f557364h = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036 A[Catch: IOException -> 0x005e, TRY_LEAVE, TryCatch #1 {IOException -> 0x005e, blocks: (B:3:0x0013, B:8:0x0036, B:17:0x0028, B:14:0x0023), top: B:2:0x0013, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(r45.de r5) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.LyricsItem"
            java.lang.String r1 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r1)
            zu3.e r1 = zu3.e.f557333i
            r4.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f557363g = r1
            r45.fe4 r1 = new r45.fe4     // Catch: java.io.IOException -> L5e
            r1.<init>()     // Catch: java.io.IOException -> L5e
            r45.cu5 r5 = r5.f453872e     // Catch: java.io.IOException -> L5e
            com.tencent.mm.protobuf.g r5 = r5.f453374f     // Catch: java.io.IOException -> L5e
            byte[] r5 = r5.f273689a     // Catch: java.io.IOException -> L5e
            r2 = 0
            if (r5 != 0) goto L23
        L21:
            r1 = r2
            goto L34
        L23:
            r1.mo11468x92b714fd(r5)     // Catch: java.lang.Exception -> L27
            goto L34
        L27:
            r5 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.String r3 = ""
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.io.IOException -> L5e
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r3, r5)     // Catch: java.io.IOException -> L5e
            goto L21
        L34:
            if (r1 == 0) goto L67
            java.util.ArrayList r5 = r4.f557363g     // Catch: java.io.IOException -> L5e
            r5.clear()     // Catch: java.io.IOException -> L5e
            java.util.ArrayList r5 = r4.f557363g     // Catch: java.io.IOException -> L5e
            java.util.LinkedList r2 = r1.f455786d     // Catch: java.io.IOException -> L5e
            r5.addAll(r2)     // Catch: java.io.IOException -> L5e
            android.graphics.Matrix r5 = r4.f557296f     // Catch: java.io.IOException -> L5e
            r45.zz6 r2 = r1.f455787e     // Catch: java.io.IOException -> L5e
            java.lang.String r3 = "matrix"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)     // Catch: java.io.IOException -> L5e
            float[] r2 = r4.g(r2)     // Catch: java.io.IOException -> L5e
            r5.setValues(r2)     // Catch: java.io.IOException -> L5e
            long r1 = r1.f455788f     // Catch: java.io.IOException -> L5e
            r4.f557364h = r1     // Catch: java.io.IOException -> L5e
            java.lang.String r5 = r4.m179541x9616526c()     // Catch: java.io.IOException -> L5e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)     // Catch: java.io.IOException -> L5e
            goto L67
        L5e:
            r5 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "LocationItem parse error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r5, r2, r1)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.t.<init>(r45.de):void");
    }
}
