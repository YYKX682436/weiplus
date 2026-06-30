package com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b;

/* renamed from: com.tencent.mm.storage.emotion.EmojiInfo */
/* loaded from: classes12.dex */
public class C21053xdbf1e5f4 extends dm.v2 implements com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb, android.os.Parcelable {
    public final java.lang.String C2;
    public java.lang.String D2;
    public java.lang.String E2;
    public int F2;
    public int G2;
    public java.lang.String H2;
    public java.lang.String I2;
    public com.p314xaae8f345.mm.api.C4986x2b88169c J2;
    public qk.z6 K2;
    public static final l75.e0 L2 = dm.v2.m125555x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4> f39214x681a0c0c = new z85.i();

    public C21053xdbf1e5f4() {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = rr.s.f480682a.c();
        m77995x6761d4f();
    }

    public static boolean y0(int i17) {
        return i17 == 50 || i17 == 49;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String A() {
        return this.f68656xc887dd14;
    }

    public boolean A0() {
        return (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68643xf1b7e6de) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68663x861009b5) || this.f68663x861009b5.equals(java.lang.String.valueOf(18)) || this.f68663x861009b5.equals(java.lang.String.valueOf(17)) || this.f68663x861009b5.equals(java.lang.String.valueOf(81)) || this.f68663x861009b5.equals(java.lang.String.valueOf(65)) || this.f68663x861009b5.equals("capture")) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int B0() {
        return this.F2;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public boolean B1() {
        int i17 = this.f68689x2262335f;
        return i17 == 2 || i17 == 10;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String C0() {
        return this.f68672xe33e17bb;
    }

    public byte[] D0(int i17, int i18) {
        java.io.InputStream inputStream = null;
        if (i17 < 0 || i18 < 0) {
            return null;
        }
        int i19 = this.f68653x95b20dd4;
        if (i19 == 17 || i19 == 50 || i19 == 49) {
            try {
                try {
                    inputStream = h12.e.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, mo42934xfb82e301());
                    inputStream.skip(i17);
                    byte[] bArr = new byte[i18];
                    inputStream.read(bArr, 0, i18);
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                    return bArr;
                } catch (java.io.IOException e18) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e27) {
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e27));
                    }
                }
                throw th6;
            }
        }
        return com.p314xaae8f345.mm.vfs.w6.N(N0(), this.f68681x29d3a4dd, i18);
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public boolean E0() {
        int i17;
        if (n22.m.n(this.f68671x4b6e68b9) || (i17 = this.f68653x95b20dd4) == 18 || i17 == 50 || i17 == 49) {
            return true;
        }
        java.lang.String N0 = N0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N0)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(N0);
        boolean z17 = r6Var.m() && r6Var.C() > 0;
        if (z17) {
            return z17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.C2;
        sb6.append(str);
        sb6.append(this.f68671x4b6e68b9);
        if (com.p314xaae8f345.mm.vfs.w6.k(sb6.toString()) <= 0) {
            return z17;
        }
        com.p314xaae8f345.mm.vfs.w6.c(str + this.f68671x4b6e68b9, N0);
        return r6Var.m() && r6Var.C() > 0;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String E1() {
        return this.H2;
    }

    public void F0(java.lang.String str) {
        this.f68641x3342accf = str;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public void F1(qk.x6 x6Var) {
        this.f68650xee2fac53 = x6Var.ordinal();
    }

    public void G0(int i17) {
        this.f68678x13320507 = i17;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String G1() {
        return this.I2;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String H0() {
        return this.f68671x4b6e68b9;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String H1() {
        return this.f68669x3e1919e;
    }

    public void I0(int i17) {
        this.f68653x95b20dd4 = i17;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public boolean I1() {
        int i17 = this.f68653x95b20dd4;
        return i17 == 50 || i17 == 49 || i17 == 18;
    }

    public void J0(java.lang.String str) {
        this.f68663x861009b5 = str;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String J1() {
        return this.f68659x5efe714f;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public void K0(java.lang.String str, java.lang.String str2) {
        this.J2 = new com.p314xaae8f345.mm.api.C4986x2b88169c(str, str2);
    }

    public void L0(int i17) {
        this.f68665x4b6e59f8 = i17;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String N0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68663x861009b5) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68671x4b6e68b9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68671x4b6e68b9)) {
            return null;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68663x861009b5);
        java.lang.String str = this.C2;
        if (!K0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f68663x861009b5, "capture")) {
            str = str + this.f68663x861009b5 + "/";
        }
        com.p314xaae8f345.mm.vfs.w6.u(str);
        return str + this.f68671x4b6e68b9;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String N1() {
        return this.f68670x419d19a;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public void O0(int i17) {
        this.f68681x29d3a4dd = i17;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int O1() {
        return this.f68678x13320507;
    }

    public void P0(java.lang.String str) {
        this.f68671x4b6e68b9 = str;
    }

    public void Q0(java.lang.String str) {
        this.f68673x225f1eb0 = str;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public boolean Q1() {
        int i17 = this.f68653x95b20dd4;
        if (i17 == 50 || i17 == 49) {
            return true;
        }
        java.lang.String N0 = N0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N0)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(N0);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public void R0(int i17) {
        this.f68679x22618426 = i17;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String S() {
        return this.f68643xf1b7e6de;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String S0() {
        return this.f68641x3342accf;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String T() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68671x4b6e68b9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
            return null;
        }
        java.lang.String str = this.C2 + "decrypt/";
        java.lang.String str2 = str + this.f68671x4b6e68b9;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2) && com.p314xaae8f345.mm.vfs.w6.j(N0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "getDecryptPath decrypt %s", this.f68671x4b6e68b9);
            byte[] c17 = wq.a.f().c(this);
            if (c17 != null) {
                com.p314xaae8f345.mm.vfs.w6.u(str);
                com.p314xaae8f345.mm.vfs.w6.S(str2, c17, 0, c17.length);
            }
        }
        return str2;
    }

    public void T0(int i17) {
        this.f68685x2261e7f9 = i17;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int V() {
        return this.f68683x1d5dc4d;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public synchronized android.graphics.Bitmap W(android.content.Context context) {
        return t0(context, true);
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String X0() {
        return this.f68657xb76d85ab;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String Z() {
        return this.f68661x765114aa;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public synchronized android.graphics.Bitmap a0(android.content.Context context, int i17) {
        int i18;
        int i19 = this.f68653x95b20dd4;
        int i27 = 0;
        if (i19 != 18 && i19 != 50 && i19 != 49) {
            if (i19 == 17) {
                java.lang.String mo42934xfb82e301 = mo42934xfb82e301();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo42934xfb82e301)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "name is null");
                } else {
                    mo42934xfb82e301 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j()) ? mo42934xfb82e301() : j()).replaceAll(".png", "");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] drawable name:%s", mo42934xfb82e301);
                android.graphics.Bitmap K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(context.getResources().getDrawable(context.getResources().getIdentifier(mo42934xfb82e301, "drawable", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", java.lang.Integer.valueOf(this.f68653x95b20dd4), java.lang.Integer.valueOf(K0.getWidth()), java.lang.Integer.valueOf(K0.getHeight()));
                return K0;
            }
            java.lang.String h07 = h0();
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(h07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] thumbPath:%s isExist:%s", h07, java.lang.Boolean.valueOf(j17));
            if (j17) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.p314xaae8f345.mm.p786x600aa8b.e.d(h07, options);
                int i28 = options.outHeight;
                android.graphics.Bitmap t17 = (i28 >= i17 || (i18 = options.outWidth) >= i17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(h07, i17, i17, true, false) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(h07, i28, i18, true, false);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(this.f68653x95b20dd4);
                objArr[1] = java.lang.Integer.valueOf(t17 == null ? 0 : t17.getWidth());
                if (t17 != null) {
                    i27 = t17.getHeight();
                }
                objArr[2] = java.lang.Integer.valueOf(i27);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", objArr);
                return t17;
            }
            java.lang.String N0 = N0();
            boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(N0);
            if (!j18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiInfo", "[addEmoji] Path:%s isExist:%s", N0, java.lang.Boolean.valueOf(j18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", this);
                return null;
            }
            byte[] z17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z(this);
            if (z17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiInfo", "bytes is null!");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "bytes size:%s", java.lang.Integer.valueOf(z17.length));
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.h(z17) ? com.p314xaae8f345.mm.p1006xc5476f33.gif.v.a(z17) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.I(z17, i17, i17, null);
            if (a17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "emoji:%s width:%s height:%s", this, java.lang.Integer.valueOf(a17.getWidth()), java.lang.Integer.valueOf(a17.getHeight()));
            }
            return a17;
        }
        java.lang.String mo42934xfb82e3012 = mo42934xfb82e301();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo42934xfb82e3012)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "name is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", this);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "#getBitmap, name = " + mo42934xfb82e3012);
        java.lang.String replaceAll = mo42934xfb82e3012.startsWith("jsb") ? "jsb" : mo42934xfb82e3012.startsWith("dice") ? "dice" : mo42934xfb82e3012.replaceAll(".png", "");
        try {
            int identifier = context.getResources().getIdentifier(replaceAll, "drawable", context.getPackageName());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "#getBitmap, get res identifier, name = " + replaceAll + ", resId = " + identifier);
            android.graphics.Bitmap K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(context.getResources().getDrawable(identifier));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", java.lang.Integer.valueOf(this.f68653x95b20dd4), java.lang.Integer.valueOf(K02.getWidth()), java.lang.Integer.valueOf(K02.getHeight()));
            return K02;
        } catch (android.content.res.Resources.NotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiInfo", e17, "get res fail, name = " + replaceAll, new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int b0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68647x22597e16)) {
            return 0;
        }
        try {
            byte[] decode = android.util.Base64.decode(this.f68647x22597e16, 0);
            r45.qi0 qi0Var = new r45.qi0();
            qi0Var.mo11468x92b714fd(decode);
            return qi0Var.f465545e;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public long b1() {
        return this.f68648x46085dc4;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public qk.z6 c0() {
        return this.K2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m77994xb2c87fbf(java.lang.Object obj) {
        return obj != null && (obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) && ((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) obj).mo42933xb5885648().equalsIgnoreCase(this.f68671x4b6e68b9);
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String g1() {
        return this.f68660x7650f4b9;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getAesKey */
    public java.lang.String mo42927x1061ea06() {
        return this.f68642xf11e6e15;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getAuthKey */
    public java.lang.String mo42928x1743c361() {
        return this.f68687x159b18b6;
    }

    @Override // dm.v2, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return L2;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getGroup */
    public int mo42929x747e9cc9() {
        return this.f68653x95b20dd4;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getGroupId */
    public java.lang.String mo42930x4f4a97c4() {
        return this.f68663x861009b5;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getHeight */
    public int mo42931x1c4fb41d() {
        return this.f68664xfd0bc00c;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getIndex */
    public int mo42932x7498cf1c() {
        return this.f68665x4b6e59f8;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getMd5 */
    public java.lang.String mo42933xb5885648() {
        java.lang.String str = this.f68671x4b6e68b9;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getName */
    public java.lang.String mo42934xfb82e301() {
        java.lang.String str = this.f68673x225f1eb0;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getSize */
    public int mo42935xfb854877() {
        return this.f68679x22618426;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getType */
    public int mo42936xfb85f7b0() {
        return this.f68689x2262335f;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: getWidth */
    public int mo42937x755bd410() {
        return this.f68690x2a070e41;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String h0() {
        java.lang.String N0 = N0();
        java.lang.String concat = N0 == null ? null : N0.concat("_cover");
        if (!n22.m.k(this)) {
            return concat;
        }
        return lp0.b.e() + "emoji/cover/" + mo42933xb5885648() + "_cover";
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String j() {
        java.lang.String str = this.f68655xad49e234;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public boolean k() {
        int i17 = this.f68653x95b20dd4;
        return i17 == 50 || i17 == 49;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String k0() {
        return this.f68644xbc38602c;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String l() {
        return this.f68686x7b284d5e;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String l0() {
        return this.f68654xf47770e7;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public qk.x6 m1() {
        int i17 = this.f68650xee2fac53;
        qk.x6 x6Var = qk.x6.STATUS_SUCCESS;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? x6Var : qk.x6.STATUS_UPLOAD_FAIL : qk.x6.STATUS_UPLOADING : qk.x6.STATUS_MIX_FAIL : qk.x6.STATUS_MIXING : x6Var;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public com.p314xaae8f345.mm.api.C4986x2b88169c o0() {
        return this.J2;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String p() {
        return this.E2;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int p0() {
        return this.f68650xee2fac53;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String q0() {
        return this.f68646xa8f07416;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String r0() {
        return this.f68647x22597e16;
    }

    /* renamed from: reset */
    public void m77995x6761d4f() {
        this.f68671x4b6e68b9 = "";
        this.f68684x29d4cc45 = "";
        this.f68653x95b20dd4 = 65;
        this.f68689x2262335f = 1;
        this.f68679x22618426 = 0;
        this.f68681x29d3a4dd = 0;
        this.f68682x29d3a50c = 0;
        this.f68673x225f1eb0 = "";
        this.f68655xad49e234 = "";
        this.f68675x13320504 = "";
        this.f68676x13320505 = "";
        this.f68677x13320506 = 0;
        this.f68678x13320507 = 0;
        this.f68643xf1b7e6de = "";
        this.f68685x2261e7f9 = 0;
        this.f68650xee2fac53 = 0;
        this.f68652x452f0c30 = 0;
        this.f68651xd681f13a = 0;
        this.f68666x4c2ff000 = "";
        this.f68645x96150de1 = new byte[0];
        this.H2 = "";
        this.J2 = null;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int s1() {
        return this.f68677x13320506;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    /* renamed from: setType */
    public void mo42938x7650bebc(int i17) {
        this.f68689x2262335f = i17;
    }

    public synchronized android.graphics.Bitmap t0(android.content.Context context, boolean z17) {
        android.graphics.Bitmap J2;
        if (com.p314xaae8f345.mm.vfs.w6.j(h0()) && (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(h0(), null)) != null) {
            return J2;
        }
        android.graphics.Bitmap m43678x46823488 = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43678x46823488(this);
        if (m43678x46823488 != null) {
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(m43678x46823488, 100, android.graphics.Bitmap.CompressFormat.PNG, h0(), false);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiInfo", e17, "save emoji thumb error", new java.lang.Object[0]);
            }
        }
        return m43678x46823488;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int t1() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f68647x22597e16)) {
            return 0;
        }
        try {
            byte[] decode = android.util.Base64.decode(this.f68647x22597e16, 0);
            r45.qi0 qi0Var = new r45.qi0();
            qi0Var.mo11468x92b714fd(decode);
            return qi0Var.f465546f;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    /* renamed from: toString */
    public java.lang.String m77996x9616526c() {
        return "field_md5:" + this.f68671x4b6e68b9 + "\nfield_svrid:" + this.f68684x29d4cc45 + "\nfield_catalog:" + this.f68653x95b20dd4 + "\nfield_type:" + this.f68689x2262335f + "\nfield_size:" + this.f68679x22618426 + "\nfield_start:" + this.f68681x29d3a4dd + "\nfield_state:" + this.f68682x29d3a50c + "\nfield_name:" + this.f68673x225f1eb0 + "\nfield_content:" + this.f68655xad49e234 + "\nfield_reserved1:" + this.f68675x13320504 + "\nfield_reserved2:" + this.f68676x13320505 + "\nfield_reserved3:" + this.f68677x13320506 + "\nfield_reserved4:" + this.f68678x13320507 + "\nfield_app_id:" + this.f68643xf1b7e6de + "\nfield_groupId:" + this.f68663x861009b5 + "\nfield_lastUseTime:" + this.f68668xd33ad9b9 + "\nfield_framesInfo:" + this.f68662xaa0dced9 + "\nfield_idx:" + this.f68665x4b6e59f8 + "\nfield_temp:" + this.f68685x2261e7f9 + "\nfield_source:" + this.f68680x10639700 + "\nfield_needupload:" + this.f68674xa37f827c + "\nfield_designerID:" + this.f68657xb76d85ab + "\nfield_thumbUrl:" + this.f68686x7b284d5e + "\nfield_captureStatus:" + this.f68650xee2fac53 + "\nfield_captureUploadErrCode" + this.f68652x452f0c30 + "\nfield_captureUploadCounter" + this.f68651xd681f13a + "\n";
    }

    public java.lang.String u0() {
        java.lang.String str = this.f68684x29d4cc45;
        return str == null ? "" : str;
    }

    public boolean v0() {
        return this.f68663x861009b5.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2");
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public void v1(qk.z6 z6Var) {
        this.K2 = z6Var;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public void w() {
        int i17 = this.f68653x95b20dd4;
        if (i17 == 50 || i17 == 49) {
            return;
        }
        java.lang.String N0 = N0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N0)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(N0);
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    public boolean w0() {
        if (n22.m.n(this.f68671x4b6e68b9)) {
            return true;
        }
        java.lang.String h07 = h0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h07)) {
            return false;
        }
        return com.p314xaae8f345.mm.vfs.w6.j(h07);
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public void w1(int i17) {
        this.f68682x29d3a50c = i17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.C2);
        parcel.writeString(this.f68671x4b6e68b9);
        parcel.writeString(this.f68684x29d4cc45);
        parcel.writeInt(this.f68653x95b20dd4);
        parcel.writeInt(this.f68689x2262335f);
        parcel.writeInt(this.f68679x22618426);
        parcel.writeInt(this.f68681x29d3a4dd);
        parcel.writeInt(this.f68682x29d3a50c);
        parcel.writeString(this.f68673x225f1eb0);
        parcel.writeString(this.f68655xad49e234);
        parcel.writeString(this.f68675x13320504);
        parcel.writeString(this.f68676x13320505);
        parcel.writeInt(this.f68677x13320506);
        parcel.writeInt(this.f68678x13320507);
        parcel.writeString(this.f68643xf1b7e6de);
        parcel.writeString(this.f68663x861009b5);
        parcel.writeLong(this.f68668xd33ad9b9);
        parcel.writeString(this.f68662xaa0dced9);
        parcel.writeInt(this.f68665x4b6e59f8);
        parcel.writeInt(this.f68685x2261e7f9);
        parcel.writeInt(this.f68680x10639700);
        parcel.writeInt(this.f68674xa37f827c);
        parcel.writeString(this.f68657xb76d85ab);
        parcel.writeString(this.f68686x7b284d5e);
        parcel.writeString(this.f68654xf47770e7);
        parcel.writeString(this.f68659x5efe714f);
        parcel.writeString(this.f68642xf11e6e15);
        parcel.writeInt(this.f68690x2a070e41);
        parcel.writeInt(this.f68664xfd0bc00c);
        parcel.writeString(this.f68641x3342accf);
        parcel.writeLong(this.f72763xa3c65b86);
        parcel.writeString(this.f68691xdde7652c);
        parcel.writeString(this.f68646xa8f07416);
        parcel.writeInt(this.f68650xee2fac53);
        byte[] bArr = this.f68645x96150de1;
        if (bArr == null || bArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f68645x96150de1);
        }
        parcel.writeString(this.f68666x4c2ff000);
        parcel.writeInt(this.f68652x452f0c30);
        parcel.writeInt(this.f68651xd681f13a);
        parcel.writeLong(this.f68648x46085dc4);
        parcel.writeString(this.f68669x3e1919e);
        parcel.writeString(this.f68644xbc38602c);
        parcel.writeInt(this.f68649x3933ac0b);
        parcel.writeString(this.f68660x7650f4b9);
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public java.lang.String x0() {
        return this.f68688x29e035ee;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public int x1() {
        return this.G2;
    }

    @Override // com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb
    public qk.y6 y1() {
        int i17 = this.f68652x452f0c30;
        qk.y6 y6Var = qk.y6.ERR_OTHERS;
        switch (i17) {
            case 0:
                return qk.y6.ERR_SUCCESS;
            case 1:
                return qk.y6.ERR_NON_NETWORK;
            case 2:
                return qk.y6.ERR_WIFI_NETWORK;
            case 3:
                return qk.y6.ERR_MOBILE_NETWORK;
            case 4:
                return qk.y6.ERR_NOT_COMPLETED;
            case 5:
                return qk.y6.ERR_OVER_LIMIT;
            case 6:
            default:
                return y6Var;
            case 7:
                return qk.y6.ERR_LOCAL_FILE;
            case 8:
                return qk.y6.ERR_OVER_SIZE;
            case 9:
                return qk.y6.ERR_SPAM;
            case 10:
                return qk.y6.ERR_OVER_UPLOAD_TIME;
        }
    }

    public boolean z0() {
        return mo42933xb5885648().length() == 32;
    }

    public C21053xdbf1e5f4(java.lang.String str) {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = str;
        m77995x6761d4f();
    }

    public C21053xdbf1e5f4(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = rr.s.f480682a.c();
        this.f68671x4b6e68b9 = interfaceC4987x84e327cb.mo42933xb5885648();
        this.f68663x861009b5 = interfaceC4987x84e327cb.mo42930x4f4a97c4();
        this.f68673x225f1eb0 = interfaceC4987x84e327cb.mo42934xfb82e301();
        this.f68643xf1b7e6de = interfaceC4987x84e327cb.S();
        this.f68655xad49e234 = interfaceC4987x84e327cb.j();
        this.f68689x2262335f = interfaceC4987x84e327cb.mo42936xfb85f7b0();
        this.f68679x22618426 = interfaceC4987x84e327cb.mo42935xfb854877();
        this.f68690x2a070e41 = interfaceC4987x84e327cb.mo42937x755bd410();
        this.f68664xfd0bc00c = interfaceC4987x84e327cb.mo42931x1c4fb41d();
        this.f68653x95b20dd4 = interfaceC4987x84e327cb.mo42929x747e9cc9();
        this.f68654xf47770e7 = interfaceC4987x84e327cb.l0();
        this.f68642xf11e6e15 = interfaceC4987x84e327cb.mo42927x1061ea06();
        this.f68660x7650f4b9 = interfaceC4987x84e327cb.g1();
        this.f68661x765114aa = interfaceC4987x84e327cb.Z();
        this.f68659x5efe714f = interfaceC4987x84e327cb.J1();
        this.f68657xb76d85ab = interfaceC4987x84e327cb.X0();
        this.f68686x7b284d5e = interfaceC4987x84e327cb.l();
        this.f68641x3342accf = interfaceC4987x84e327cb.S0();
        this.f68646xa8f07416 = interfaceC4987x84e327cb.q0();
        this.f68644xbc38602c = interfaceC4987x84e327cb.k0();
        this.f68669x3e1919e = interfaceC4987x84e327cb.H1();
        this.f68688x29e035ee = interfaceC4987x84e327cb.x0();
        this.f68687x159b18b6 = interfaceC4987x84e327cb.mo42928x1743c361();
    }

    public C21053xdbf1e5f4(android.os.Parcel parcel) {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = parcel.readString();
        this.f68671x4b6e68b9 = parcel.readString();
        this.f68684x29d4cc45 = parcel.readString();
        this.f68653x95b20dd4 = parcel.readInt();
        this.f68689x2262335f = parcel.readInt();
        this.f68679x22618426 = parcel.readInt();
        this.f68681x29d3a4dd = parcel.readInt();
        this.f68682x29d3a50c = parcel.readInt();
        this.f68673x225f1eb0 = parcel.readString();
        this.f68655xad49e234 = parcel.readString();
        this.f68675x13320504 = parcel.readString();
        this.f68676x13320505 = parcel.readString();
        this.f68677x13320506 = parcel.readInt();
        this.f68678x13320507 = parcel.readInt();
        this.f68643xf1b7e6de = parcel.readString();
        this.f68663x861009b5 = parcel.readString();
        this.f68668xd33ad9b9 = parcel.readLong();
        this.f68662xaa0dced9 = parcel.readString();
        this.f68665x4b6e59f8 = parcel.readInt();
        this.f68685x2261e7f9 = parcel.readInt();
        this.f68680x10639700 = parcel.readInt();
        this.f68674xa37f827c = parcel.readInt();
        this.f68657xb76d85ab = parcel.readString();
        this.f68686x7b284d5e = parcel.readString();
        this.f68654xf47770e7 = parcel.readString();
        this.f68659x5efe714f = parcel.readString();
        this.f68642xf11e6e15 = parcel.readString();
        this.f68690x2a070e41 = parcel.readInt();
        this.f68664xfd0bc00c = parcel.readInt();
        this.f68641x3342accf = parcel.readString();
        this.f72763xa3c65b86 = parcel.readLong();
        this.f68691xdde7652c = parcel.readString();
        this.f68646xa8f07416 = parcel.readString();
        this.f68650xee2fac53 = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f68645x96150de1 = bArr;
            parcel.readByteArray(bArr);
        }
        this.f68666x4c2ff000 = parcel.readString();
        this.f68652x452f0c30 = parcel.readInt();
        this.f68651xd681f13a = parcel.readInt();
        this.f68648x46085dc4 = parcel.readLong();
        this.f68669x3e1919e = parcel.readString();
        this.f68644xbc38602c = parcel.readString();
        this.f68649x3933ac0b = parcel.readInt();
        this.f68660x7650f4b9 = parcel.readString();
    }
}
