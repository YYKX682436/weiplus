package ha3;

/* loaded from: classes15.dex */
public final class z extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361494d;

    /* renamed from: e, reason: collision with root package name */
    public long f361495e;

    /* renamed from: f, reason: collision with root package name */
    public long f361496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f361497g;

    public z(ha3.d0 d0Var, java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f361497g = d0Var;
        this.f361494d = mediaId;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54280xf59ed10d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.h0 h0Var = ha3.j0.f361420b;
        ha3.d0 d0Var = this.f361497g;
        ha3.e0 b17 = h0Var.b(d0Var.f361349f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "getDataFilePath textureId: " + d0Var.f361357n + ", mediaId: " + this.f361494d + " fileId: " + i17 + ", fileName: " + fileName + ", fileKey: " + str + ", taskInfo: " + b17 + ", state: " + d0Var.f361347d);
        return (b17 == null || (str2 = b17.f361370e) == null) ? "" : str2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.h0 h0Var = ha3.j0.f361420b;
        ha3.d0 d0Var = this.f361497g;
        ha3.e0 b17 = h0Var.b(d0Var.f361349f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "getDataTotalSize textureId: " + d0Var.f361357n + ", mediaId: " + this.f361494d + " fileId: " + i17 + ", fileName: " + fileName + ", fileKey: " + str + ", taskInfo: " + b17 + ", state: " + d0Var.f361347d);
        if (b17 != null) {
            return b17.f361368c;
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getM3U8Content */
    public java.lang.String mo103114x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
        return super.mo103114x79c2649a(i17, str, str2);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        ha3.e0 e0Var;
        ha3.h0 h0Var;
        int i18;
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReadData textureId: ");
        ha3.d0 d0Var = this.f361497g;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        java.lang.String str4 = this.f361494d;
        sb6.append(str4);
        sb6.append(" fileId: ");
        sb6.append(i17);
        sb6.append(", fileName: ");
        sb6.append(fileName);
        sb6.append(", fileKey: ");
        sb6.append(str);
        sb6.append(", offset: ");
        sb6.append(j17);
        sb6.append(", length: ");
        sb6.append(j18);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        if (j18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", "onReadData length <= 0");
            return 0;
        }
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.h0 h0Var2 = ha3.j0.f361420b;
        ha3.e0 b17 = h0Var2.b(d0Var.f361349f);
        if (b17 != null && b17.f361369d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData is completed");
            return (int) j18;
        }
        if (d0Var.f361347d != 6) {
            boolean m37796x95bf072 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(str4);
            if (m37796x95bf072) {
                e0Var = b17;
                h0Var = h0Var2;
                i18 = 0;
                if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37752x9b94c84e(this.f361494d, j17, j18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData isVideoDataAvailable mediaId: " + str4 + ", offset: " + j17 + ", length: " + j18);
                    return (int) j18;
                }
            } else {
                e0Var = b17;
                h0Var = h0Var2;
                i18 = 0;
            }
            z17 = m37796x95bf072;
        } else {
            e0Var = b17;
            h0Var = h0Var2;
            i18 = 0;
            z17 = false;
        }
        int i27 = d0Var.f361347d;
        if (i27 != 3 && i27 != 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData not in need data state, ignore, media:" + str4 + ", state:" + d0Var.f361347d);
            return i18;
        }
        if (i27 != 3) {
            ha3.h0 h0Var3 = h0Var;
            int i28 = i18;
            if (i27 != 5) {
                return i28;
            }
            if (this.f361495e == j17 && this.f361496f == j18) {
                return i28;
            }
            ha3.e0 e0Var2 = e0Var;
            int c17 = ha3.j0.f361419a.c(this.f361494d, j17, j18, 0);
            if (c17 == 0) {
                this.f361495e = j17;
                this.f361496f = j18;
                return 0;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onReadData request video data error ");
            sb7.append(str4);
            sb7.append(", ret:");
            sb7.append(c17);
            sb7.append(" state:");
            sb7.append(d0Var.f361347d);
            sb7.append(", offset:");
            sb7.append(j17);
            sb7.append(", length:");
            sb7.append(j18);
            sb7.append(", cache:");
            sb7.append(e0Var2 != null ? java.lang.Long.valueOf(e0Var2.f361366a) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayer", sb7.toString());
            h0Var3.e(d0Var.f361349f, false, java.lang.Long.valueOf(j18 + j17));
            this.f361496f = 0L;
            return 0;
        }
        ha3.e0 e0Var3 = e0Var;
        if (e0Var != null) {
            str2 = ", offset:";
            r16 = java.lang.Long.valueOf(e0Var3.f361367b);
        } else {
            str2 = ", offset:";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r16);
        long j19 = j17 + j18;
        if (r16.longValue() >= j19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData preload enough, mediaId: " + str4);
            return (int) j18;
        }
        if (!z17 || !e0Var3.f361374i) {
            str3 = "MicroMsg.LiteAppVideoPlayer";
            ha3.h0 h0Var4 = h0Var;
            if (!e0Var3.f361372g) {
                i19 = 0;
                h0Var4.e(d0Var.f361349f, false, java.lang.Long.valueOf(j19));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onReadData need more data, mediaId: " + str4);
                return i19;
            }
        } else {
            if (this.f361495e == j17 && this.f361496f == j18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", "onReadData, range(" + j17 + ", " + j18 + ") is already requesting, mediaId: " + str4);
                return i18;
            }
            java.lang.String str5 = str2;
            int c18 = ha3.j0.f361419a.c(this.f361494d, j17, j18, 0);
            if (c18 != 0) {
                str3 = "MicroMsg.LiteAppVideoPlayer";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "onReadData request video data error " + str4 + ", ret:" + c18 + " state:" + d0Var.f361347d + str5 + j17 + ", length:" + j18 + ", cache:" + e0Var3.f361366a);
                h0Var.e(d0Var.f361349f, false, java.lang.Long.valueOf(j19));
                this.f361496f = 0L;
            } else {
                str3 = "MicroMsg.LiteAppVideoPlayer";
                this.f361495e = j17;
                this.f361496f = j18;
            }
        }
        i19 = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onReadData need more data, mediaId: " + str4);
        return i19;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartReadData textureId: ");
        sb6.append(this.f361497g.f361357n);
        sb6.append(", mediaId: ");
        java.lang.String str2 = this.f361494d;
        sb6.append(str2);
        sb6.append(", fileId: ");
        sb6.append(i17);
        sb6.append(", fileName: ");
        sb6.append(fileName);
        sb6.append(", fileKey: ");
        sb6.append(str);
        sb6.append(", requestStart: ");
        sb6.append(j17);
        sb6.append(", requestEnd: ");
        sb6.append(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        return str2.hashCode();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStopReadData textureId: ");
        ha3.d0 d0Var = this.f361497g;
        sb6.append(d0Var.f361357n);
        sb6.append(", mediaId: ");
        sb6.append(this.f361494d);
        sb6.append(" fileId: ");
        sb6.append(i17);
        sb6.append(", fileName: ");
        sb6.append(fileName);
        sb6.append(", fileKey: ");
        sb6.append(str);
        sb6.append(", requestId: ");
        sb6.append(i18);
        sb6.append(", state: ");
        sb6.append(d0Var.f361347d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayer", sb6.toString());
        return 0;
    }
}
