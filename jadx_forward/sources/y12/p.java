package y12;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final y12.p f540410a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f540411b;

    static {
        y12.p pVar = new y12.p();
        f540410a = pVar;
        f540411b = new java.util.LinkedHashMap();
        java.lang.String a17 = pVar.a();
        if (com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            try {
                cl0.g gVar = new cl0.g(com.p314xaae8f345.mm.vfs.w6.M(a17));
                java.util.Iterator mo15076x322df4 = gVar.mo15076x322df4();
                while (mo15076x322df4.hasNext()) {
                    java.lang.String str = (java.lang.String) mo15076x322df4.next();
                    java.lang.Object obj = gVar.get(str);
                    if (obj instanceof java.lang.Integer) {
                        java.util.Map map = f540411b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        map.put(str, obj);
                    }
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StoreEmotionDesignerInfoMgr", "unable to parse saved designer id to uin map");
                com.p314xaae8f345.mm.vfs.w6.h(a17);
            }
        }
    }

    public final java.lang.String a() {
        java.lang.String str = rr.s.f480682a.a() + "designerInfo/";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        return str + "designerMap";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r16, boolean r17, yz5.l r18) {
        /*
            r15 = this;
            r0 = r18
            java.lang.String r1 = "StoreEmotionDesignerInfoMgr"
            java.lang.String r2 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r2)
            java.lang.String r2 = r15.c(r16)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            r5 = 0
            if (r4 == 0) goto L85
            r4 = -1
            r6 = 0
            byte[] r4 = com.p314xaae8f345.mm.vfs.w6.N(r2, r6, r4)
            r7 = 1
            r45.xd0 r8 = new r45.xd0     // Catch: java.lang.Throwable -> L63
            r8.<init>()     // Catch: java.lang.Throwable -> L63
            com.tencent.mm.protobuf.f r4 = r8.mo11468x92b714fd(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.DesignerInfoObj"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r4, r8)     // Catch: java.lang.Throwable -> L63
            r45.xd0 r4 = (r45.xd0) r4     // Catch: java.lang.Throwable -> L63
            r45.v75 r8 = r4.f471526d     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = "designer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)     // Catch: java.lang.Throwable -> L61
            r9 = r15
            boolean r8 = r15.d(r8)     // Catch: java.lang.Throwable -> L65
            if (r8 != 0) goto L4a
            java.lang.String r8 = "local designerInfo is invalid, delete it."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r8)     // Catch: java.lang.Throwable -> L65
            com.p314xaae8f345.mm.vfs.w6.h(r2)     // Catch: java.lang.Throwable -> L65
            r10 = r6
            r8 = r7
            goto L4c
        L4a:
            r8 = r6
            r10 = r7
        L4c:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65
            long r13 = r4.f471527e     // Catch: java.lang.Throwable -> L65
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch: java.lang.Throwable -> L65
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 <= 0) goto L5f
            goto L6f
        L5f:
            r7 = r8
            goto L6f
        L61:
            r9 = r15
            goto L65
        L63:
            r9 = r15
            r4 = r5
        L65:
            java.lang.String r8 = "unable to parse DesignerInfoObj"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
            com.p314xaae8f345.mm.vfs.w6.h(r2)
            r10 = r6
        L6f:
            if (r3 != 0) goto L78
            java.lang.String r2 = "current thread is not main process, ignore need fetch"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r3 = r6
            goto L79
        L78:
            r3 = r7
        L79:
            if (r3 != 0) goto L86
            if (r10 == 0) goto L86
            if (r4 == 0) goto L81
            r45.v75 r5 = r4.f471526d
        L81:
            r0.mo146xb9724478(r5)
            return
        L85:
            r9 = r15
        L86:
            if (r3 == 0) goto L9a
            if (r17 != 0) goto L9a
            z12.b0 r1 = new z12.b0
            r2 = r16
            r1.<init>(r5, r2)
            y12.o r2 = new y12.o
            r2.<init>(r0)
            r1.a(r2)
            goto L9d
        L9a:
            r0.mo146xb9724478(r5)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.p.b(int, boolean, yz5.l):void");
    }

    public final java.lang.String c(int i17) {
        java.lang.String str = rr.s.f480682a.a() + "designerInfo/";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        return str + i17 + ".designer";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(r45.v75 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f469498e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = r0.length()
            if (r0 <= 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != r1) goto L13
            r0 = r1
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L2c
            java.lang.String r0 = r7.f469499f
            if (r0 == 0) goto L27
            int r0 = r0.length()
            if (r0 <= 0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != r1) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2d
        L2c:
            r0 = r2
        L2d:
            java.lang.String r3 = r7.f469503m
            if (r3 == 0) goto L3e
            int r3 = r3.length()
            if (r3 <= 0) goto L39
            r3 = r1
            goto L3a
        L39:
            r3 = r2
        L3a:
            if (r3 != r1) goto L3e
            r3 = r1
            goto L3f
        L3e:
            r3 = r2
        L3f:
            if (r3 == 0) goto L6b
            java.lang.String r3 = r7.f469500g
            if (r3 == 0) goto L52
            int r3 = r3.length()
            if (r3 <= 0) goto L4d
            r3 = r1
            goto L4e
        L4d:
            r3 = r2
        L4e:
            if (r3 != r1) goto L52
            r3 = r1
            goto L53
        L52:
            r3 = r2
        L53:
            if (r3 == 0) goto L6b
            java.lang.String r3 = r7.f469502i
            if (r3 == 0) goto L66
            int r3 = r3.length()
            if (r3 <= 0) goto L61
            r3 = r1
            goto L62
        L61:
            r3 = r2
        L62:
            if (r3 != r1) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L6b
            r3 = r1
            goto L6c
        L6b:
            r3 = r2
        L6c:
            java.lang.String r4 = "StoreEmotionDesignerInfoMgr"
            if (r0 != 0) goto L77
            java.lang.String r5 = "name or headUrl isNullOrEmpty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r5)
            goto L88
        L77:
            if (r3 != 0) goto L7f
            java.lang.String r5 = "finderNickname or finderUserName or HeadImage isNullOrEmpty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r5)
            goto L88
        L7f:
            int r5 = r7.f469497d
            if (r5 != 0) goto L88
            java.lang.String r5 = "designerUin is 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r5)
        L88:
            int r7 = r7.f469497d
            if (r7 == 0) goto L91
            if (r0 != 0) goto L92
            if (r3 == 0) goto L91
            goto L92
        L91:
            r1 = r2
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.p.d(r45.v75):boolean");
    }

    public final void e(r45.v75 designerInfo, java.lang.String designerId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(designerInfo, "designerInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(designerId, "designerId");
        int i17 = designerInfo.f469497d;
        if (designerId.length() > 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.util.Map map = f540411b;
            map.put(designerId, valueOf);
            try {
                java.lang.String gVar = new cl0.g(map).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
                byte[] bytes = gVar.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                com.p314xaae8f345.mm.vfs.w6.S(a(), bytes, 0, bytes.length);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StoreEmotionDesignerInfoMgr", "unable to save designer id to uin map");
            }
        }
        if (!d(designerInfo)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("StoreEmotionDesignerInfoMgr", "designerInfo is not valid!");
            return;
        }
        java.lang.String c17 = c(i17);
        if (com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            com.p314xaae8f345.mm.vfs.w6.h(c17);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.xd0 xd0Var = new r45.xd0();
        xd0Var.f471526d = designerInfo;
        xd0Var.f471527e = currentTimeMillis;
        com.p314xaae8f345.mm.vfs.w6.R(c17, xd0Var.mo14344x5f01b1f6());
    }
}
