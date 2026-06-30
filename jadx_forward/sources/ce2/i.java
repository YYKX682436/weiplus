package ce2;

/* loaded from: classes3.dex */
public final class i extends dm.o4 {
    public static final ce2.g U1 = new ce2.g(null);
    public static final l75.e0 V1 = dm.o4.m125361x3593deb(dm.o4.class);

    public final java.lang.String A0() {
        java.lang.String str;
        r45.pa0 pa0Var;
        r45.na0 D0 = D0();
        if (D0 == null || (pa0Var = (r45.pa0) D0.m75936x14adae67(1)) == null) {
            str = null;
        } else if (!pa0Var.m75933x41a8a7f2(0) || !pa0Var.m75933x41a8a7f2(4) || (str = pa0Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public final r45.na0 D0() {
        if (U0()) {
            return this.f67794x3a829274;
        }
        return null;
    }

    public final r45.oa0 F0(java.lang.String resourceKey) {
        r45.na0 D0;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resourceKey, "resourceKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftInfo", "getCustomGiftResource resourceKey:".concat(resourceKey));
        java.lang.Object obj = null;
        if ((resourceKey.length() == 0) || (D0 = D0()) == null || (m75941xfb821914 = D0.m75941xfb821914(2)) == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.oa0) next).m75945x2fec8307(0), resourceKey)) {
                obj = next;
                break;
            }
        }
        return (r45.oa0) obj;
    }

    public final java.lang.String G0() {
        r45.na0 D0 = D0();
        if (D0 == null) {
            return "";
        }
        r45.pa0 pa0Var = (r45.pa0) D0.m75936x14adae67(1);
        if (pa0Var == null || !pa0Var.m75933x41a8a7f2(0) || !pa0Var.m75933x41a8a7f2(4)) {
            return "";
        }
        java.lang.String m75945x2fec8307 = pa0Var.m75945x2fec8307(5);
        if (m75945x2fec8307 != null) {
            if (!(m75945x2fec8307.length() > 0)) {
                m75945x2fec8307 = null;
            }
            if (m75945x2fec8307 != null) {
                return m75945x2fec8307;
            }
        }
        java.lang.String m75945x2fec83072 = pa0Var.m75945x2fec8307(3);
        return m75945x2fec83072 == null ? "" : m75945x2fec83072;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String I0() {
        /*
            r4 = this;
            r45.rv1 r0 = new r45.rv1
            r0.<init>()
            byte[] r1 = r4.f67795x5adb7824
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto Le
        Lc:
            r0 = r3
            goto L1d
        Le:
            r0.mo11468x92b714fd(r1)     // Catch: java.lang.Exception -> L12
            goto L1d
        L12:
            r0 = move-exception
            java.lang.String r1 = "safeParser"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r0)
            goto Lc
        L1d:
            if (r0 == 0) goto L24
            r1 = 2
            java.lang.String r3 = r0.m75945x2fec8307(r1)
        L24:
            if (r3 != 0) goto L27
            goto L28
        L27:
            r2 = r3
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.I0():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J0() {
        /*
            r7 = this;
            dk2.ef r0 = dk2.ef.f314905a
            boolean r0 = dk2.ef.f314937s
            r1 = 4
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L69
            boolean r0 = r7.U0()
            if (r0 == 0) goto L69
            java.lang.String r0 = r7.y0()
            r45.oa0 r0 = r7.F0(r0)
            r5 = 6
            java.lang.String r6 = ""
            if (r0 == 0) goto L53
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.m75945x2fec8307(r4)
            if (r0 == 0) goto L3d
            int r1 = r0.length()
            if (r1 <= 0) goto L32
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L36
            goto L37
        L36:
            r0 = r2
        L37:
            if (r0 != 0) goto L3a
            goto L3d
        L3a:
            r6 = r0
            goto Lc5
        L3d:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto L4f
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r5)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L4f
            java.lang.String r2 = r0.m75945x2fec8307(r4)
        L4f:
            if (r2 != 0) goto Lc4
            goto Lc5
        L53:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto Lc5
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r5)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lc5
            java.lang.String r0 = r0.m75945x2fec8307(r4)
            if (r0 != 0) goto L3a
            goto Lc5
        L69:
            r45.yi6 r0 = r7.Q0()
            if (r0 == 0) goto La3
            r5 = 17
            com.tencent.mm.protobuf.f r5 = r0.m75936x14adae67(r5)
            r45.gs5 r5 = (r45.gs5) r5
            if (r5 == 0) goto La3
            java.lang.String r5 = r5.m75945x2fec8307(r4)
            if (r5 == 0) goto La3
            r45.xi6 r6 = r7.f67816xdcd1d904
            if (r6 == 0) goto L8b
            boolean r1 = r6.m75933x41a8a7f2(r1)
            if (r1 != r3) goto L8b
            r1 = r3
            goto L8c
        L8b:
            r1 = r4
        L8c:
            if (r1 == 0) goto L9b
            int r1 = r5.length()
            if (r1 <= 0) goto L96
            r1 = r3
            goto L97
        L96:
            r1 = r4
        L97:
            if (r1 == 0) goto L9b
            r1 = r3
            goto L9c
        L9b:
            r1 = r4
        L9c:
            if (r1 == 0) goto La0
            r6 = r5
            goto La1
        La0:
            r6 = r2
        La1:
            if (r6 != 0) goto Lc5
        La3:
            if (r0 == 0) goto Lbf
            r1 = 2
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.m75945x2fec8307(r4)
            if (r0 == 0) goto Lbf
            int r1 = r0.length()
            if (r1 <= 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = r4
        Lbc:
            if (r3 == 0) goto Lbf
            r2 = r0
        Lbf:
            if (r2 != 0) goto Lc4
            java.lang.String r6 = r7.f67807xb353364f
            goto Lc5
        Lc4:
            r6 = r2
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.J0():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009a, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String L0() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.L0():java.lang.String");
    }

    public final float P0() {
        dk2.ef efVar = dk2.ef.f314905a;
        if (dk2.ef.f314937s && U0()) {
            r45.na0 D0 = D0();
            if (D0 != null) {
                return U1.a("", D0.m75941xfb821914(0), (r45.pa0) D0.m75936x14adae67(1)) + this.f67813x29a891c4;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveGiftInfo", "getCustomGiftPrice but customGiftInfo is null!");
            return this.f67813x29a891c4;
        }
        r45.yi6 Q0 = Q0();
        if (Q0 != null) {
            java.lang.Float valueOf = java.lang.Float.valueOf(Q0.m75938x746dc8a6(5));
            float floatValue = valueOf.floatValue();
            r45.xi6 xi6Var = this.f67816xdcd1d904;
            if (!((xi6Var != null && xi6Var.m75933x41a8a7f2(4)) && floatValue > this.f67813x29a891c4)) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.floatValue();
            }
        }
        return this.f67813x29a891c4;
    }

    public final r45.yi6 Q0() {
        r45.xi6 xi6Var;
        java.lang.Object obj = null;
        if (!a1() || (xi6Var = this.f67816xdcd1d904) == null) {
            return null;
        }
        java.lang.String m75945x2fec8307 = xi6Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = xi6Var.m75945x2fec8307(1);
        }
        java.util.LinkedList m75941xfb821914 = xi6Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSwitch_skin_info_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yi6) next).m75945x2fec8307(0), m75945x2fec8307)) {
                obj = next;
                break;
            }
        }
        return (r45.yi6) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String R0() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.R0():java.lang.String");
    }

    public final boolean T0() {
        return pm0.v.z(this.f67799x225ba391, 262144);
    }

    public final boolean U0() {
        return pm0.v.z(this.f67799x225ba391, 2048);
    }

    public final boolean W0() {
        return pm0.v.z(this.f67799x225ba391, 1);
    }

    public final boolean Y0() {
        return pm0.v.z(this.f67799x225ba391, 4096);
    }

    public final boolean Z0() {
        return pm0.v.z(this.f67799x225ba391, 512);
    }

    public final boolean a1() {
        return pm0.v.z(this.f67799x225ba391, 1024);
    }

    public final r45.kv1 c1() {
        r45.kv1 kv1Var = new r45.kv1();
        kv1Var.set(0, this.f67814x2c488eb6);
        kv1Var.set(1, java.lang.Integer.valueOf(this.f67793xe412923f));
        kv1Var.set(2, this.f67819x7194d06c);
        kv1Var.set(3, this.f67812x88c5dc5c);
        kv1Var.set(4, this.f67790xc2fee458);
        kv1Var.set(5, this.f67820xf6e7d417);
        kv1Var.set(6, this.f67811x88c5bc6b);
        kv1Var.set(7, this.f67789xc2fec467);
        kv1Var.set(10, java.lang.Integer.valueOf(this.f67803x50635e2f));
        kv1Var.set(8, this.f67809x225f1eb0);
        kv1Var.set(9, java.lang.Float.valueOf(this.f67813x29a891c4));
        kv1Var.set(12, java.lang.Integer.valueOf(this.f67799x225ba391));
        kv1Var.set(11, java.lang.Integer.valueOf(this.f67821x227a87d7));
        kv1Var.set(13, this.f67807xb353364f);
        kv1Var.set(14, this.f67806xb353165e);
        byte[] bArr = this.f67795x5adb7824;
        kv1Var.set(15, bArr != null ? pm0.b0.h(bArr) : null);
        kv1Var.set(16, java.lang.Integer.valueOf(this.f67804x8e6dc6f8));
        kv1Var.set(17, this.f67817xeeaf398e);
        kv1Var.set(18, this.f67818x183ec9a2);
        kv1Var.set(23, this.f67792x7cf36ce3);
        kv1Var.set(24, this.f67796x4f4dc37);
        kv1Var.set(25, this.f67805xe860fa1);
        kv1Var.set(26, java.lang.Boolean.valueOf(this.f67810x6cc83fdf == 1));
        kv1Var.set(27, java.lang.Boolean.valueOf(this.f67798xcfdb5eab));
        java.util.LinkedList m75941xfb821914 = kv1Var.m75941xfb821914(28);
        r45.zq4 zq4Var = this.f67808xc50d3cee;
        java.util.List m75941xfb8219142 = zq4Var != null ? zq4Var.m75941xfb821914(0) : null;
        if (m75941xfb8219142 == null) {
            m75941xfb8219142 = kz5.p0.f395529d;
        }
        m75941xfb821914.addAll(m75941xfb8219142);
        kv1Var.set(29, this.f67816xdcd1d904);
        kv1Var.set(30, this.f67794x3a829274);
        kv1Var.set(31, java.lang.Integer.valueOf(this.f67801x6744153e));
        kv1Var.set(32, this.f67800x8dbb6276);
        kv1Var.set(33, java.lang.Boolean.valueOf(this.f67822x842ee41e));
        kv1Var.set(34, this.f67791x539c50a0);
        kv1Var.set(35, this.f67797x9223715e);
        return kv1Var;
    }

    @Override // dm.o4, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = V1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    public final java.lang.String t0() {
        java.util.LinkedList<r45.ma0> m75941xfb821914;
        java.lang.Object obj;
        r45.na0 D0 = D0();
        if (D0 != null && (m75941xfb821914 = D0.m75941xfb821914(0)) != null) {
            for (r45.ma0 ma0Var : m75941xfb821914) {
                boolean z17 = true;
                java.util.LinkedList m75941xfb8219142 = ma0Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getComponent_value_list(...)");
                java.util.Iterator it = m75941xfb8219142.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f70) obj).m75945x2fec8307(0), ma0Var.m75945x2fec8307(2))) {
                        break;
                    }
                }
                r45.f70 f70Var = (r45.f70) obj;
                if (f70Var == null || !f70Var.m75933x41a8a7f2(3)) {
                    z17 = false;
                }
                if (z17) {
                    return ma0Var.m75945x2fec8307(0);
                }
            }
        }
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m14711x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id: ");
        sb6.append(this.f67814x2c488eb6);
        sb6.append(", name:");
        sb6.append(this.f67809x225f1eb0);
        sb6.append(", giftIndex:");
        sb6.append(this.f67802xbb68387d);
        sb6.append(", flag:");
        sb6.append(this.f67799x225ba391);
        sb6.append(",url: ");
        sb6.append(this.f67819x7194d06c);
        sb6.append(", isFansGift: ");
        sb6.append(W0());
        sb6.append(", previewUrl:");
        sb6.append(this.f67812x88c5dc5c);
        sb6.append(", animationUrl:");
        sb6.append(this.f67790xc2fee458);
        sb6.append(", landUrl:");
        sb6.append(this.f67807xb353364f);
        sb6.append(", isSwitchSkinGift:");
        sb6.append(a1());
        sb6.append(", hasCustomText:");
        r45.xi6 xi6Var = this.f67816xdcd1d904;
        sb6.append(xi6Var != null ? java.lang.Boolean.valueOf(xi6Var.m75933x41a8a7f2(4)) : null);
        sb6.append(", skinColor:");
        r45.yi6 Q0 = Q0();
        sb6.append(Q0 != null ? Q0.m75945x2fec8307(6) : null);
        sb6.append(",customGiftInfo.key:");
        r45.na0 na0Var = this.f67794x3a829274;
        sb6.append(na0Var != null ? na0Var.m75945x2fec8307(7) : null);
        return sb6.toString();
    }

    public final java.util.Map u0() {
        java.util.HashMap hashMap;
        r45.pa0 pa0Var;
        java.util.LinkedList<r45.ma0> m75941xfb821914;
        java.lang.Object obj;
        r45.na0 D0 = D0();
        java.lang.String str = "";
        if (D0 == null || (m75941xfb821914 = D0.m75941xfb821914(0)) == null) {
            hashMap = null;
        } else {
            hashMap = null;
            for (r45.ma0 ma0Var : m75941xfb821914) {
                java.util.LinkedList m75941xfb8219142 = ma0Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getComponent_value_list(...)");
                java.util.Iterator it = m75941xfb8219142.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f70) obj).m75945x2fec8307(0), ma0Var.m75945x2fec8307(2))) {
                        break;
                    }
                }
                r45.f70 f70Var = (r45.f70) obj;
                if (f70Var != null && f70Var.m75933x41a8a7f2(5)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveGiftInfo", "generateCustomGiftPlayParams but " + ma0Var.m75945x2fec8307(0) + " with select key:" + ma0Var.m75945x2fec8307(2) + " use pag!");
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new java.util.HashMap();
                }
                java.lang.String m75945x2fec8307 = ma0Var.m75945x2fec8307(4);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    java.lang.String m75945x2fec83072 = ma0Var.m75945x2fec8307(4);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    java.lang.String m75945x2fec83073 = ma0Var.m75945x2fec8307(2);
                    if (m75945x2fec83073 == null) {
                        m75945x2fec83073 = "";
                    }
                }
            }
        }
        r45.na0 na0Var = this.f67794x3a829274;
        if (na0Var != null && (pa0Var = (r45.pa0) na0Var.m75936x14adae67(1)) != null) {
            if (hashMap == null) {
                hashMap = new java.util.HashMap();
            }
            if (pa0Var.m75933x41a8a7f2(0)) {
                java.lang.String m75945x2fec83074 = pa0Var.m75945x2fec8307(7);
                if (!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0)) {
                    if (pa0Var.m75933x41a8a7f2(4)) {
                        java.lang.String m75945x2fec83075 = pa0Var.m75945x2fec8307(7);
                        if (m75945x2fec83075 == null) {
                            m75945x2fec83075 = "";
                        }
                        java.lang.String m75945x2fec83076 = pa0Var.m75945x2fec8307(5);
                        if (m75945x2fec83076 != null) {
                            java.lang.String str2 = m75945x2fec83076.length() > 0 ? m75945x2fec83076 : null;
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                        java.lang.String m75945x2fec83077 = pa0Var.m75945x2fec8307(3);
                        if (m75945x2fec83077 != null) {
                            str = m75945x2fec83077;
                        }
                    } else {
                        java.lang.String m75945x2fec83078 = pa0Var.m75945x2fec8307(7);
                        if (m75945x2fec83078 == null) {
                            m75945x2fec83078 = "";
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public final r45.mb v0() {
        if (T0()) {
            return this.f67791x539c50a0;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String w0() {
        /*
            r7 = this;
            dk2.ef r0 = dk2.ef.f314905a
            boolean r0 = dk2.ef.f314937s
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L69
            boolean r0 = r7.U0()
            if (r0 == 0) goto L69
            java.lang.String r0 = r7.y0()
            r45.oa0 r0 = r7.F0(r0)
            r4 = 5
            java.lang.String r5 = ""
            if (r0 == 0) goto L53
            r6 = 3
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r6)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.m75945x2fec8307(r3)
            if (r0 == 0) goto L3d
            int r6 = r0.length()
            if (r6 <= 0) goto L32
            goto L33
        L32:
            r2 = r3
        L33:
            if (r2 == 0) goto L36
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
            goto L3d
        L3a:
            r5 = r0
            goto Lc5
        L3d:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto L4f
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r4)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.m75945x2fec8307(r3)
        L4f:
            if (r1 != 0) goto Lc4
            goto Lc5
        L53:
            r45.na0 r0 = r7.D0()
            if (r0 == 0) goto Lc5
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r4)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lc5
            java.lang.String r0 = r0.m75945x2fec8307(r3)
            if (r0 != 0) goto L3a
            goto Lc5
        L69:
            r45.yi6 r0 = r7.Q0()
            if (r0 == 0) goto La4
            r4 = 16
            com.tencent.mm.protobuf.f r4 = r0.m75936x14adae67(r4)
            r45.gs5 r4 = (r45.gs5) r4
            if (r4 == 0) goto La4
            java.lang.String r4 = r4.m75945x2fec8307(r3)
            if (r4 == 0) goto La4
            r45.xi6 r5 = r7.f67816xdcd1d904
            if (r5 == 0) goto L8c
            r6 = 4
            boolean r5 = r5.m75933x41a8a7f2(r6)
            if (r5 != r2) goto L8c
            r5 = r2
            goto L8d
        L8c:
            r5 = r3
        L8d:
            if (r5 == 0) goto L9c
            int r5 = r4.length()
            if (r5 <= 0) goto L97
            r5 = r2
            goto L98
        L97:
            r5 = r3
        L98:
            if (r5 == 0) goto L9c
            r5 = r2
            goto L9d
        L9c:
            r5 = r3
        L9d:
            if (r5 == 0) goto La1
            r5 = r4
            goto La2
        La1:
            r5 = r1
        La2:
            if (r5 != 0) goto Lc5
        La4:
            if (r0 == 0) goto Lbf
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r2)
            r45.gs5 r0 = (r45.gs5) r0
            if (r0 == 0) goto Lbf
            java.lang.String r0 = r0.m75945x2fec8307(r3)
            if (r0 == 0) goto Lbf
            int r4 = r0.length()
            if (r4 <= 0) goto Lbb
            goto Lbc
        Lbb:
            r2 = r3
        Lbc:
            if (r2 == 0) goto Lbf
            r1 = r0
        Lbf:
            if (r1 != 0) goto Lc4
            java.lang.String r5 = r7.f67790xc2fee458
            goto Lc5
        Lc4:
            r5 = r1
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.i.w0():java.lang.String");
    }

    public final java.lang.String y0() {
        java.util.LinkedList<r45.ma0> linkedList;
        java.lang.StringBuilder sb6;
        java.lang.String str;
        r45.na0 D0 = D0();
        if (D0 != null) {
            linkedList = new java.util.LinkedList(D0.m75941xfb821914(0));
            kz5.g0.t(linkedList, ce2.h.f122315d);
        } else {
            linkedList = null;
        }
        if (linkedList != null) {
            sb6 = null;
            for (r45.ma0 ma0Var : linkedList) {
                if (sb6 == null) {
                    r45.na0 D02 = D0();
                    if (D02 == null || (str = D02.m75945x2fec8307(7)) == null) {
                        str = "";
                    }
                    sb6 = new java.lang.StringBuilder(str);
                }
                sb6.append("_" + ma0Var.m75945x2fec8307(2));
            }
        } else {
            sb6 = null;
        }
        java.lang.String sb7 = sb6 != null ? sb6.toString() : null;
        return sb7 == null ? "" : sb7;
    }

    public final java.util.LinkedList z0() {
        r45.qv1 qv1Var = this.f67792x7cf36ce3;
        java.util.LinkedList m75941xfb821914 = qv1Var != null ? qv1Var.m75941xfb821914(0) : null;
        return m75941xfb821914 == null ? new java.util.LinkedList() : m75941xfb821914;
    }
}
