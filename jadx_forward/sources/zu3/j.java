package zu3;

/* loaded from: classes10.dex */
public final class j extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f557343g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Matrix f557344h;

    public /* synthetic */ j(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(interfaceC4987x84e327cb, (i17 & 2) != 0 ? new android.graphics.Matrix() : matrix, (i17 & 4) != 0 ? new android.graphics.Matrix() : matrix2);
    }

    @Override // zu3.o
    /* renamed from: toProtoBuf */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo179488xc3d7db06() {
        java.lang.String str;
        java.lang.String mo42934xfb82e301;
        r45.si0 si0Var = new r45.si0();
        java.lang.String str2 = "";
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f557343g;
        if (interfaceC4987x84e327cb == null || (str = interfaceC4987x84e327cb.mo42933xb5885648()) == null) {
            str = "";
        }
        si0Var.f467286d = str;
        if (interfaceC4987x84e327cb != null && (mo42934xfb82e301 = interfaceC4987x84e327cb.mo42934xfb82e301()) != null) {
            str2 = mo42934xfb82e301;
        }
        si0Var.f467287e = str2;
        si0Var.f467288f = f(this.f557296f);
        si0Var.f467289g = f(this.f557344h);
        si0Var.f467290h = e();
        return si0Var;
    }

    /* renamed from: toString */
    public java.lang.String m179531x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]md5:");
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f557343g;
        sb6.append(interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null);
        sb6.append(" name:");
        sb6.append(interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42934xfb82e301() : null);
        return sb6.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, android.graphics.Matrix showMatrix, android.graphics.Matrix editorMatrix) {
        super(zu3.e.f557330f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showMatrix, "showMatrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorMatrix, "editorMatrix");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f557344h = matrix;
        this.f557343g = interfaceC4987x84e327cb;
        matrix.set(showMatrix);
        this.f557296f.set(editorMatrix);
        java.lang.String m179531x9616526c = m179531x9616526c();
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiItem", m179531x9616526c, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035 A[Catch: IOException -> 0x0090, TryCatch #1 {IOException -> 0x0090, blocks: (B:3:0x0013, B:8:0x0035, B:10:0x007d, B:11:0x0086, B:20:0x0027, B:17:0x0022), top: B:2:0x0013, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(r45.de r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.EmojiItem"
            java.lang.String r1 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r1)
            zu3.e r1 = zu3.e.f557330f
            r7.<init>(r1)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r7.f557344h = r1
            r45.si0 r1 = new r45.si0     // Catch: java.io.IOException -> L90
            r1.<init>()     // Catch: java.io.IOException -> L90
            r45.cu5 r8 = r8.f453872e     // Catch: java.io.IOException -> L90
            com.tencent.mm.protobuf.g r8 = r8.f453374f     // Catch: java.io.IOException -> L90
            byte[] r8 = r8.f273689a     // Catch: java.io.IOException -> L90
            r2 = 0
            if (r8 != 0) goto L22
            goto L32
        L22:
            r1.mo11468x92b714fd(r8)     // Catch: java.lang.Exception -> L26
            goto L33
        L26:
            r8 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.String r3 = ""
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.io.IOException -> L90
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r3, r8)     // Catch: java.io.IOException -> L90
        L32:
            r1 = r2
        L33:
            if (r1 == 0) goto L9b
            java.lang.Class<com.tencent.mm.feature.emoji.api.f6> r8 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6.class
            i95.m r8 = i95.n0.c(r8)     // Catch: java.io.IOException -> L90
            com.tencent.mm.feature.emoji.api.f6 r8 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.f6) r8     // Catch: java.io.IOException -> L90
            java.lang.String r3 = r1.f467286d     // Catch: java.io.IOException -> L90
            com.tencent.mm.feature.emoji.p1 r8 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.p1) r8     // Catch: java.io.IOException -> L90
            r8.getClass()     // Catch: java.io.IOException -> L90
            java.lang.Class<k12.s> r8 = k12.s.class
            i95.m r8 = i95.n0.c(r8)     // Catch: java.io.IOException -> L90
            k12.s r8 = (k12.s) r8     // Catch: java.io.IOException -> L90
            g30.h r8 = (g30.h) r8     // Catch: java.io.IOException -> L90
            s25.b r8 = r8.Bi()     // Catch: java.io.IOException -> L90
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r8.y(r3)     // Catch: java.io.IOException -> L90
            r7.f557343g = r8     // Catch: java.io.IOException -> L90
            android.graphics.Matrix r8 = r7.f557344h     // Catch: java.io.IOException -> L90
            r45.zz6 r3 = r1.f467289g     // Catch: java.io.IOException -> L90
            java.lang.String r4 = "showMatrix"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)     // Catch: java.io.IOException -> L90
            float[] r3 = r7.g(r3)     // Catch: java.io.IOException -> L90
            r8.setValues(r3)     // Catch: java.io.IOException -> L90
            android.graphics.Matrix r8 = r7.f557296f     // Catch: java.io.IOException -> L90
            r45.zz6 r3 = r1.f467288f     // Catch: java.io.IOException -> L90
            java.lang.String r4 = "editorMatrix"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)     // Catch: java.io.IOException -> L90
            float[] r3 = r7.g(r3)     // Catch: java.io.IOException -> L90
            r8.setValues(r3)     // Catch: java.io.IOException -> L90
            r45.bi0 r8 = r1.f467290h     // Catch: java.io.IOException -> L90
            if (r8 == 0) goto L86
            long r3 = r8.f452305d     // Catch: java.io.IOException -> L90
            long r5 = r8.f452306e     // Catch: java.io.IOException -> L90
            bv3.d r8 = r7.f557293c     // Catch: java.io.IOException -> L90
            r8.d(r3, r5)     // Catch: java.io.IOException -> L90
        L86:
            java.lang.String r8 = r7.m179531x9616526c()     // Catch: java.io.IOException -> L90
            int r1 = rl.b.f478676a     // Catch: java.io.IOException -> L90
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8, r2)     // Catch: java.io.IOException -> L90
            goto L9b
        L90:
            r8 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = rl.b.f478676a
            java.lang.String r2 = "EmojiItem parse error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r8, r2, r1)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu3.j.<init>(r45.de):void");
    }
}
