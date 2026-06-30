package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public class l extends ye1.a {
    public volatile boolean A;
    public java.lang.String B;
    public boolean C;
    public boolean D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a E;
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener F;
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener G;
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener H;
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener I;

    /* renamed from: J */
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener f172420J;
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener K;
    public final com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener L;

    /* renamed from: q */
    public final boolean f172421q;

    /* renamed from: r */
    public final java.lang.String f172422r;

    /* renamed from: s */
    public final com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f172423s;

    /* renamed from: t */
    public long f172424t;

    /* renamed from: u */
    public final boolean f172425u;

    /* renamed from: v */
    public volatile boolean f172426v;

    /* renamed from: w */
    public java.lang.Integer f172427w;

    /* renamed from: x */
    public volatile boolean f172428x;

    /* renamed from: y */
    public boolean f172429y;

    /* renamed from: z */
    public final java.util.concurrent.atomic.AtomicBoolean f172430z;

    public /* synthetic */ l(android.content.Context context, android.os.Looper looper, boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : looper, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? true : z18, (i17 & 16) != 0 ? false : z19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar, java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDataSource");
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            i19 = lVar.f172421q;
        }
        lVar.U(str, str2, z17, i19);
    }

    @Override // ye1.a
    public void D(int i17) {
        java.lang.Integer num = this.f172427w;
        if (num == null || i17 != num.intValue()) {
            super.D(i17);
            this.f172427w = java.lang.Integer.valueOf(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateDownloadPercent downloadPercent:%d", java.lang.Integer.valueOf(i17));
            rVar.f437034k = i17;
        }
    }

    @Override // ye1.a
    public void K() {
        this.f172428x = false;
        super.K();
        if (this.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "notifyOnSeekComplete, isPassiveDownloading, pausePlayerDownload");
            S();
        }
    }

    public final boolean M() {
        switch (this.f172423s.mo100916xb7d72d0e()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final void N() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B) || !this.C) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "checkSubtitleDone showSubtitleDone:%b", java.lang.Boolean.valueOf(this.D));
        j(true);
    }

    public final void O(java.lang.Exception e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        if (e17 instanceof java.lang.IllegalStateException) {
            G(-10001, -1);
        } else if ((e17 instanceof java.lang.IllegalArgumentException) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("drm asset url is null or drm property is null", e17.getMessage())) {
            G(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29002x44229856, 10000);
        } else {
            G(-10999, -1);
        }
    }

    public final java.lang.String P() {
        java.lang.String Q = Q();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getApplicationId(...)");
        if (r26.n0.D(Q, str, false, 2, null)) {
            return Q;
        }
        return Q + ' ' + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
    }

    public java.lang.String Q() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getApplicationId(...)");
        return str;
    }

    public void R(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, int i17, long j17, long j18, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
    }

    public final void S() {
        if (this.f172430z.getAndSet(false)) {
            this.f172423s.mo100931xe51afc9e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "pausePlayerDownload, not downloading");
        }
    }

    public final void T(boolean z17) {
        if (!this.f172430z.getAndSet(true)) {
            this.f172423s.mo100935xb0277d5();
            this.A = z17;
        } else {
            if (this.f172428x && !z17) {
                this.A = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "resumePlayerDownload, already downloading");
        }
    }

    public final void U(java.lang.String path, java.lang.String str, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setDataSource, player is not available");
            return;
        }
        try {
            if (r26.i0.y(path, "file://", false)) {
                path = path.substring(7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "substring(...)");
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("User-Agent", P());
            if (!(str == null || str.length() == 0)) {
                hashMap.put("Referrer", str);
            }
            if (this.f172425u) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "play mMinBufferDuration:" + this.f172424t);
                interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(102, this.f172424t));
                interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(304, 131072L));
            } else {
                interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(102, 1000L));
            }
            interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(504, 1L));
            interfaceC26164x73fc6bc6.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101058xb88ec5da(206, z17));
            byte[] bytes = path.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "setDataSource, fileId: " + g17);
            com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder m101226xb4088fb7 = new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder().m101226xb4088fb7(g17);
            com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13 = new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(i17);
            try {
                c26231xafaedb13.m101448xb7d81b82(kz5.b0.c(hashMap));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "setDataSource, use custom api fail since " + th6);
            }
            m101226xb4088fb7.m101224x10a74e5(c26231xafaedb13);
            interfaceC26164x73fc6bc6.mo100974xab2f6987(m101226xb4088fb7.m101222x59bc66e());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.m.c(interfaceC26164x73fc6bc6, path, hashMap);
            this.f542695a = 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setDataSource, fail since " + e17);
            O(e17);
        }
    }

    public final void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            long mo1852x51e8b0a = mo1852x51e8b0a();
            pk1.r rVar = (pk1.r) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateDurationMs duration:%d", java.lang.Long.valueOf(mo1852x51e8b0a));
            rVar.f437029f = mo1852x51e8b0a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar2 = this.E;
        if (aVar2 != null) {
            long mo1851x9746038c = mo1851x9746038c();
            pk1.r rVar2 = (pk1.r) aVar2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar2.f437019a, "updateCurrentPlayPositionMs currentPlayPositionMs:%d", java.lang.Long.valueOf(mo1851x9746038c));
            rVar2.f437027e = mo1851x9746038c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar3 = this.E;
        if (aVar3 != null) {
            int mo1855x8d5c7601 = mo1855x8d5c7601();
            int mo1854x463504c = mo1854x463504c();
            pk1.r rVar3 = (pk1.r) aVar3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar3.f437019a, "setResolution width:%d, height:%d", java.lang.Integer.valueOf(mo1855x8d5c7601), java.lang.Integer.valueOf(mo1854x463504c));
            rVar3.F = mo1855x8d5c7601;
            rVar3.G = mo1854x463504c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar4 = this.E;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (aVar4 != null) {
            long mo100924x2d67b867 = interfaceC26164x73fc6bc6.mo100924x2d67b867(100);
            pk1.r rVar4 = (pk1.r) aVar4;
            rVar4.C = mo100924x2d67b867;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar4.f437019a, "updateAudioCodecId codecId:%d", java.lang.Long.valueOf(mo100924x2d67b867));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar5 = this.E;
        if (aVar5 != null) {
            long mo100924x2d67b8672 = interfaceC26164x73fc6bc6.mo100924x2d67b867(201);
            pk1.r rVar5 = (pk1.r) aVar5;
            rVar5.D = mo100924x2d67b8672;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar5.f437019a, "updateVideoCodecId codecId:%d", java.lang.Long.valueOf(mo100924x2d67b8672));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar6 = this.E;
        if (aVar6 != null) {
            long mo100924x2d67b8673 = interfaceC26164x73fc6bc6.mo100924x2d67b867(101);
            pk1.r rVar6 = (pk1.r) aVar6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar6.f437019a, "updatePlayAudioBitrate playAudioBitrate:%d", java.lang.Long.valueOf(mo100924x2d67b8673));
            rVar6.f437048y = mo100924x2d67b8673;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar7 = this.E;
        if (aVar7 != null) {
            long mo100924x2d67b8674 = interfaceC26164x73fc6bc6.mo100924x2d67b867(202);
            pk1.r rVar7 = (pk1.r) aVar7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar7.f437019a, "updatePlayVideoBitrate playVideoBitrate:%d", java.lang.Long.valueOf(mo100924x2d67b8674));
            rVar7.f437047x = mo100924x2d67b8674;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar8 = this.E;
        if (aVar8 != null) {
            long mo100924x2d67b8675 = interfaceC26164x73fc6bc6.mo100924x2d67b867(206);
            pk1.r rVar8 = (pk1.r) aVar8;
            rVar8.E = mo100924x2d67b8675;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar8.f437019a, "updateVideoFrameRate frameRate:%d", java.lang.Long.valueOf(mo100924x2d67b8675));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar9 = this.E;
        if (aVar9 != null) {
            long mo100919xac6a8d7e = interfaceC26164x73fc6bc6.mo100919xac6a8d7e();
            pk1.r rVar9 = (pk1.r) aVar9;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar9.f437019a, "updatePlayableDurationMs playableDurationMs:%d", java.lang.Long.valueOf(mo100919xac6a8d7e));
            rVar9.f437030g = mo100919xac6a8d7e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar10 = this.E;
        if (aVar10 != null) {
            long mo100920x21a0b6d0 = interfaceC26164x73fc6bc6.mo100920x21a0b6d0();
            pk1.r rVar10 = (pk1.r) aVar10;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar10.f437019a, "updatePlayerBufferedDurationMs playerBufferedDurationMs:%d", java.lang.Long.valueOf(mo100920x21a0b6d0));
            rVar10.f437031h = mo100920x21a0b6d0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar11 = this.E;
        if (aVar11 != null) {
            pk1.r rVar11 = (pk1.r) aVar11;
            int m37745x9208c81b = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2);
            rVar11.X = m37745x9208c81b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar11.f437019a, "updateRecentDownloadAverageSpeed recentDownloadAverageSpeed:%d", java.lang.Integer.valueOf(m37745x9208c81b));
        }
    }

    @Override // ye1.e
    public void b(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setLooping, player is not available");
            return;
        }
        try {
            interfaceC26164x73fc6bc6.mo100947xfd27780d(z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setLooping, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setVolume, player is not available");
            return;
        }
        try {
            interfaceC26164x73fc6bc6.mo100940x3aa51598(f17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setVolume, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public boolean f(float f17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        boolean z17 = true;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setSpeed, player is not available");
            return false;
        }
        try {
            interfaceC26164x73fc6bc6.mo100967xd079f5a(f17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setSpeed, fail since " + e17);
            O(e17);
            z17 = false;
        }
        return z17;
    }

    @Override // ye1.e
    /* renamed from: getCurrentPosition */
    public int mo1851x9746038c() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "getCurrentPosition, player is not available");
            return 0;
        }
        try {
            return (int) interfaceC26164x73fc6bc6.mo100915xddd35a52();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "getCurrentPosition, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: getDuration */
    public int mo1852x51e8b0a() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "getDuration, player is not available");
            return 0;
        }
        try {
            return (int) interfaceC26164x73fc6bc6.mo100917x37a7fa50();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "getDuration, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: getPlayerType */
    public int mo1853x6b2cfdb1() {
        return 3;
    }

    @Override // ye1.e
    /* renamed from: getVideoHeight */
    public int mo1854x463504c() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "getVideoHeight, player is not available");
            return 0;
        }
        try {
            return interfaceC26164x73fc6bc6.mo100928x463504c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "getVideoHeight, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: getVideoWidth */
    public int mo1855x8d5c7601() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "getVideoWidth, player is not available");
            return 0;
        }
        try {
            return interfaceC26164x73fc6bc6.mo100929x8d5c7601();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "getVideoWidth, fail since " + e17);
            O(e17);
            return 0;
        }
    }

    @Override // ye1.e
    /* renamed from: isPlaying */
    public boolean mo1856xc00617a4() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "isPlaying, player is not available");
            return false;
        }
        try {
            return 5 == interfaceC26164x73fc6bc6.mo100916xb7d72d0e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "isPlaying, fail since " + e17);
            O(e17);
            return false;
        }
    }

    @Override // ye1.a, ye1.e
    public void j(boolean z17) {
        java.lang.String str = this.f172422r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showSubtitle, show: " + z17);
        this.C = z17;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100927x2ae89de3 = interfaceC26164x73fc6bc6.mo100927x2ae89de3();
        if (mo100927x2ae89de3 != null) {
            if (mo100927x2ae89de3.length == 0) {
                return;
            }
            int length = mo100927x2ae89de3.length;
            for (int i17 = 0; i17 < length; i17++) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo100927x2ae89de3[i17].f51065x337a8b) && mo100927x2ae89de3[i17].f51065x337a8b.equals("thumb_media_player_subtitle")) {
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "selectTrack, i: " + i17);
                        interfaceC26164x73fc6bc6.mo100939xc3b89af(i17, 0L);
                        this.D = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "deselectTrack, i: " + i17);
                        interfaceC26164x73fc6bc6.mo100904x4080528e(i17, 0L);
                    }
                }
            }
        }
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class playerClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playerClass, "playerClass");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l.class.isAssignableFrom(playerClass) ? this : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "castTo, playerClass: " + playerClass + ", playerImpl: " + lVar);
        return lVar;
    }

    @Override // ye1.e
    public void m(java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        V(this, path, str, true, 0, 8, null);
    }

    @Override // ye1.a, ye1.e
    public void n(double d17) {
    }

    @Override // ye1.e
    /* renamed from: pause */
    public void mo1857x65825f6() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        boolean z17 = true;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "pause, player is not available");
            return;
        }
        try {
            if (3 != this.f172423s.mo100916xb7d72d0e()) {
                z17 = false;
            }
            if (z17 || mo1856xc00617a4()) {
                interfaceC26164x73fc6bc6.mo100930x65825f6();
                S();
                this.f542695a = 4;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "pause, is not preparing and not playing");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "pause, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: prepareAsync */
    public void mo1858x857611b5() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        boolean z17 = true;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "prepareAsync, player is not available");
            return;
        }
        try {
            java.lang.String str = this.f172422r;
            if (this.f542695a == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "prepareAsync, idle");
            } else {
                if (3 == this.f172423s.mo100916xb7d72d0e()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "prepareAsync, isPreparing");
                } else {
                    int mo100916xb7d72d0e = this.f172423s.mo100916xb7d72d0e();
                    if (mo100916xb7d72d0e != 4 && mo100916xb7d72d0e != 5 && mo100916xb7d72d0e != 6 && mo100916xb7d72d0e != 7) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "prepareAsync, isPrepared");
                    } else {
                        interfaceC26164x73fc6bc6.mo100932x857611b5();
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "prepareAsync, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: release */
    public void mo1859x41012807() {
        if (!this.f172426v) {
            try {
                this.f172423s.mo100957x5dd7c812(null);
                this.f172423s.mo100958xe1a2e326(null);
                this.f172423s.mo100951xa4560c71(null);
                this.f172423s.mo100964x2d6d87cd(null);
                this.f172423s.mo100954x6954c27b(null);
                this.f172423s.mo100956xa23b7bf3(null);
                this.f172423s.mo100955x40f8c003(null);
                this.f172423s.mo100933x41012807();
                this.f542695a = -2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "release, fail since " + e17);
                O(e17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "release, player is not available");
        }
        this.f542696b = true;
        this.f172426v = true;
    }

    @Override // ye1.e
    /* renamed from: reset */
    public void mo1860x6761d4f() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "reset, player is not available");
            return;
        }
        try {
            interfaceC26164x73fc6bc6.mo100934x6761d4f();
            this.f542695a = 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "reset, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: seekTo */
    public void mo1861xc9fc1b13(long j17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "seekTo, player is not available");
            return;
        }
        try {
            T(true);
            interfaceC26164x73fc6bc6.mo100937xc9fc1b13((int) j17, 3);
            this.f172428x = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "seekTo, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: setDataSource */
    public void mo1862x683d6267(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        m(path, null);
    }

    @Override // ye1.e
    /* renamed from: setMinBufferDuration */
    public void mo53286x3dc294a4(long j17) {
        this.f172424t = j17;
    }

    @Override // ye1.e
    /* renamed from: setMute */
    public void mo1863x764d819b(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setMute, player is not available");
            return;
        }
        try {
            interfaceC26164x73fc6bc6.mo100965xd0747cbc(z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setMute, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: setSurface */
    public void mo1864x42c875eb(android.view.Surface surface) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "setSurface, player is not available");
            return;
        }
        try {
            interfaceC26164x73fc6bc6.mo100970x42c875eb(surface);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "setSurface, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: start */
    public void mo1865x68ac462() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        boolean z17 = true;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "start, player is not available");
            return;
        }
        try {
            if (!M()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "start, can not start");
                return;
            }
            if (mo1856xc00617a4()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "start, isPlaying");
                return;
            }
            int mo100916xb7d72d0e = this.f172423s.mo100916xb7d72d0e();
            if (mo100916xb7d72d0e != 4 && mo100916xb7d72d0e != 5 && mo100916xb7d72d0e != 6 && mo100916xb7d72d0e != 7) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "start, is not prepared");
                return;
            }
            if (7 == interfaceC26164x73fc6bc6.mo100916xb7d72d0e()) {
                mo1861xc9fc1b13(0L);
            }
            interfaceC26164x73fc6bc6.mo100975x68ac462();
            T(false);
            N();
            this.f542695a = 3;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "start, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    /* renamed from: stop */
    public void mo1866x360802() {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "stop, player is not available");
            return;
        }
        try {
            if (M()) {
                W();
                interfaceC26164x73fc6bc6.mo100976x360802();
                S();
                this.f542695a = 5;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "stop, can not start");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "stop, fail since " + e17);
            O(e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0159 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0170 A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c A[Catch: Exception -> 0x018a, TryCatch #0 {Exception -> 0x018a, blocks: (B:27:0x0066, B:29:0x0097, B:30:0x00a5, B:32:0x00ab, B:33:0x00ec, B:36:0x013a, B:38:0x014d, B:43:0x0159, B:45:0x0160, B:48:0x0169, B:50:0x0170, B:51:0x01af, B:54:0x018c, B:58:0x00de), top: B:26:0x0066 }] */
    @Override // ye1.a, ye1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l.t(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // ye1.a, ye1.e
    public void w(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172422r, "setSubtitleDataSource, src: " + str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.B = str;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f172423s;
        if (!(!this.f172426v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f172422r, "addSubtitleSource, player is not available");
            return;
        }
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            interfaceC26164x73fc6bc6.mo100900x14654554(str, "text/vtt", "thumb_media_player_subtitle");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f172422r, "addSubtitleSource, fail since " + e17);
            O(e17);
        }
    }

    @Override // ye1.e
    public void y(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        mo1862x683d6267(str);
    }

    public l(android.content.Context context, android.os.Looper looper, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f172421q = z17;
        java.lang.String str = "MicroMsg.AppBrand.ThumbMediaPlayer#" + hashCode();
        this.f172422r = str;
        this.f172424t = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        this.f172430z = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.A = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.i(this);
        this.F = iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.j(this);
        this.G = jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.f(this);
        this.H = fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.k(this);
        this.I = kVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.g(this);
        this.f172420J = gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.h(this);
        this.K = hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        this.f172425u = z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.p.f172433a.d(context, z18, z19);
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101083x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101083x5f9ba979(context, looper);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m101083x5f9ba979, "createTPPlayer(...)");
        this.f172423s = m101083x5f9ba979;
        m101083x5f9ba979.mo100957x5dd7c812(iVar);
        m101083x5f9ba979.mo100958xe1a2e326(jVar);
        m101083x5f9ba979.mo100951xa4560c71(fVar);
        m101083x5f9ba979.mo100964x2d6d87cd(kVar);
        m101083x5f9ba979.mo100954x6954c27b(gVar);
        m101083x5f9ba979.mo100956xa23b7bf3(hVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.d(this);
        this.L = dVar;
        m101083x5f9ba979.mo100955x40f8c003(dVar);
        b(false);
        m101083x5f9ba979.mo100960x8796ba37(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.e(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init finish");
    }
}
