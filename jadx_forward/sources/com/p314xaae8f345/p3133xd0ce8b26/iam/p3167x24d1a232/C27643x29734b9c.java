package com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232;

/* renamed from: com.tencent.wechat.iam.finder_box.ZIDL_noC7D3fbnB */
/* loaded from: classes11.dex */
class C27643x29734b9c extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.j {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k f299359a;

    /* renamed from: ZIDL_AX */
    private native void m118482x1964d17f(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_CI */
    private native void m118483x1964d1ae(long j17, byte[] bArr);

    /* renamed from: ZIDL_DX */
    private native void m118484x1964d1dc(long j17, long j18, boolean z17, boolean z18);

    /* renamed from: ZIDL_EX */
    private native void m118485x1964d1fb(long j17, long j18, byte[] bArr);

    /* renamed from: ZIDL_FX */
    private native void m118486x1964d21a(long j17, long j18);

    /* renamed from: ZIDL_IX */
    private native void m118487x1964d277(long j17, long j18, boolean z17, boolean z18);

    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.j
    public void E(long j17, java.lang.String str) {
        m118485x1964d1fb(this.f60633xf042a733, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void Q1(long j17) {
        m118486x1964d21a(this.f60633xf042a733, j17);
    }

    public void R1(long j17, boolean z17, boolean z18) {
        m118487x1964d277(this.f60633xf042a733, j17, z17, z18);
    }

    public void S1(long j17, boolean z17, boolean z18) {
        m118484x1964d1dc(this.f60633xf042a733, j17, z17, z18);
    }

    /* renamed from: ZIDL_AV */
    public void m118488x1964d17d(long j17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = this.f299359a;
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f.f299366f, bArr);
        ((a50.g1) kVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BoxIamBizCppToNativeManagerImpl", "sendMessageAsync: " + j17 + ", " + fVar + ", no use in Android");
    }

    /* renamed from: ZIDL_B */
    public byte[] m118489x9db8edfa(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = this.f299359a;
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f fVar = (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f.f299366f, bArr);
        ((a50.g1) kVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BoxIamBizCppToNativeManagerImpl", "syncSendMessage: " + fVar + ", no use in Android");
        return new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.f().m75963xebb06ba0();
    }

    /* renamed from: ZIDL_DV */
    public void m118490x1964d1da(long j17) {
        a50.g1 g1Var = (a50.g1) this.f299359a;
        g1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxIamBizCppToNativeManagerImpl", "getMeTabOpenStateAsync: " + j17);
        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.j jVar = g1Var.f83020a;
        if (jVar != null) {
            ox.g gVar = (ox.g) oVar;
            ((com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.C27643x29734b9c) jVar).S1(j17, gVar.fj(), gVar.mj());
        }
    }

    /* renamed from: ZIDL_EV */
    public void m118491x1964d1f9(long j17, int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = this.f299359a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.g1 g1Var = (a50.g1) kVar;
        g1Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        ((ur1.s) b0Var).Vi(i17, str, 1, new a50.f1(g1Var, j17));
    }

    /* renamed from: ZIDL_FV */
    public void m118492x1964d218(long j17, int i17, byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = this.f299359a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.g1 g1Var = (a50.g1) kVar;
        g1Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        ((ur1.s) b0Var).Ai(i17, str, 1);
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.j jVar = g1Var.f83020a;
        if (jVar != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.C27643x29734b9c) jVar).Q1(j17);
        }
    }

    /* renamed from: ZIDL_G */
    public byte[] m118493x9db8edff(byte[] bArr) {
        java.lang.String str;
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = this.f299359a;
        java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((a50.g1) kVar).getClass();
        java.lang.String str3 = null;
        if (!(str2.length() == 0)) {
            try {
                ft.x3 x3Var = (ft.x3) i95.n0.c(ft.x3.class);
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
                if (r6Var.m() && r6Var.A()) {
                    java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e301, "getName(...)");
                    if (r26.n0.B(m82467xfb82e301, ".", false)) {
                        java.lang.String m82467xfb82e3012 = r6Var.m82467xfb82e301();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m82467xfb82e3012, "getName(...)");
                        str = r26.n0.p0(m82467xfb82e3012, ".", m82467xfb82e3012);
                    } else {
                        str = "";
                    }
                    java.lang.String wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b) x3Var).wi("wx0b2ec076ec39c786", r6Var, str, true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxIamBizCppToNativeManagerImpl", "getEditorWXFilePath: success, localPath: " + str2 + ", wxFilePath: " + wi6);
                    str3 = wi6;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BoxIamBizCppToNativeManagerImpl", "getEditorWXFilePath: file not exist or not file, path: ".concat(str2));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BoxIamBizCppToNativeManagerImpl", "getEditorWXFilePath: error, localPath: ".concat(str2), e17);
            }
        }
        return str3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: ZIDL_H */
    public byte[] m118494x9db8ee00(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = this.f299359a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((a50.g1) kVar).getClass();
        java.lang.String str2 = null;
        if (!(str.length() == 0)) {
            try {
                java.lang.String Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.b) ((ft.x3) i95.n0.c(ft.x3.class))).Ai("wx0b2ec076ec39c786", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxIamBizCppToNativeManagerImpl", "getEditorLocalPath: success, wxFilePath: " + str + ", localPath: " + Ai);
                str2 = Ai;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BoxIamBizCppToNativeManagerImpl", "getEditorLocalPath: error, wxFilePath: ".concat(str), e17);
            }
        }
        return str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: ZIDL_IV */
    public void m118495x1964d275(long j17) {
        a50.g1 g1Var = (a50.g1) this.f299359a;
        g1Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.j jVar = g1Var.f83020a;
        if (jVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
            tk.s[] sVarArr = tk.s.f501403d;
            ((com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.C27643x29734b9c) jVar).R1(j17, rm.b0.c3(b0Var, 1, "", 1, null, 8, null), rm.b0.c3(b0Var, 2, "", 1, null, 8, null));
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.k) obj;
        this.f299359a = kVar;
        ((a50.g1) kVar).f83020a = this;
    }
}
