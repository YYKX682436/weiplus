package af1;

/* loaded from: classes15.dex */
public final class h implements m8.z, n8.n, u9.t, d9.h, d9.u, z8.f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.text.NumberFormat f4471h;

    /* renamed from: d, reason: collision with root package name */
    public final q9.k f4472d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.l0 f4473e = new m8.l0();

    /* renamed from: f, reason: collision with root package name */
    public final m8.k0 f4474f = new m8.k0();

    /* renamed from: g, reason: collision with root package name */
    public final long f4475g = android.os.SystemClock.elapsedRealtime();

    static {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(java.util.Locale.US);
        f4471h = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public h(q9.k kVar) {
        this.f4472d = kVar;
    }

    public static java.lang.String D(long j17) {
        if (j17 == -9223372036854775807L) {
            return "?";
        }
        return f4471h.format(((float) j17) / 1000.0f);
    }

    @Override // m8.z
    public void A() {
    }

    @Override // n8.n
    public void B(com.google.android.exoplayer2.Format format) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", "audioFormatChanged [" + C() + ", " + com.google.android.exoplayer2.Format.s(format) + "]");
    }

    public final java.lang.String C() {
        return D(android.os.SystemClock.elapsedRealtime() - this.f4475g);
    }

    public final void E(java.lang.String str, java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Video.Exo.EventLogger", exc, "internalError [" + C() + ", " + str + "]", new java.lang.Object[0]);
    }

    public final void F(com.google.android.exoplayer2.metadata.Metadata metadata, java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.google.android.exoplayer2.metadata.Metadata.Entry[] entryArr = metadata.f44104d;
            if (i17 >= entryArr.length) {
                return;
            }
            com.google.android.exoplayer2.metadata.Metadata.Entry entry = entryArr[i17];
            if (entry instanceof com.google.android.exoplayer2.metadata.id3.TextInformationFrame) {
                com.google.android.exoplayer2.metadata.id3.TextInformationFrame textInformationFrame = (com.google.android.exoplayer2.metadata.id3.TextInformationFrame) entry;
                java.lang.String.format("%s: value=%s", textInformationFrame.f44134d, textInformationFrame.f44138f);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.id3.UrlLinkFrame) {
                com.google.android.exoplayer2.metadata.id3.UrlLinkFrame urlLinkFrame = (com.google.android.exoplayer2.metadata.id3.UrlLinkFrame) entry;
                java.lang.String.format("%s: url=%s", urlLinkFrame.f44134d, urlLinkFrame.f44140f);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.id3.PrivFrame) {
                com.google.android.exoplayer2.metadata.id3.PrivFrame privFrame = (com.google.android.exoplayer2.metadata.id3.PrivFrame) entry;
                java.lang.String.format("%s: owner=%s", privFrame.f44134d, privFrame.f44135e);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.id3.GeobFrame) {
                com.google.android.exoplayer2.metadata.id3.GeobFrame geobFrame = (com.google.android.exoplayer2.metadata.id3.GeobFrame) entry;
                java.lang.String.format("%s: mimeType=%s, filename=%s, description=%s", geobFrame.f44134d, geobFrame.f44130e, geobFrame.f44131f, geobFrame.f44132g);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.id3.ApicFrame) {
                com.google.android.exoplayer2.metadata.id3.ApicFrame apicFrame = (com.google.android.exoplayer2.metadata.id3.ApicFrame) entry;
                java.lang.String.format("%s: mimeType=%s, description=%s", apicFrame.f44134d, apicFrame.f44111e, apicFrame.f44112f);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.id3.CommentFrame) {
                com.google.android.exoplayer2.metadata.id3.CommentFrame commentFrame = (com.google.android.exoplayer2.metadata.id3.CommentFrame) entry;
                java.lang.String.format("%s: language=%s, description=%s", commentFrame.f44134d, commentFrame.f44127e, commentFrame.f44128f);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.id3.Id3Frame) {
                java.lang.String.format("%s", ((com.google.android.exoplayer2.metadata.id3.Id3Frame) entry).f44134d);
            } else if (entry instanceof com.google.android.exoplayer2.metadata.emsg.EventMessage) {
                com.google.android.exoplayer2.metadata.emsg.EventMessage eventMessage = (com.google.android.exoplayer2.metadata.emsg.EventMessage) entry;
                java.lang.String.format("EMSG: scheme=%s, id=%d, value=%s", eventMessage.f44105d, java.lang.Long.valueOf(eventMessage.f44108g), eventMessage.f44106e);
            }
            i17++;
        }
    }

    @Override // d9.h
    public void a(int i17, com.google.android.exoplayer2.Format format, int i18, java.lang.Object obj, long j17) {
    }

    @Override // m8.z
    public void b(boolean z17) {
    }

    @Override // n8.n
    public void c(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", "audioDecoderInitialized [" + C() + ", " + str + ", " + j18 + "]");
    }

    @Override // m8.z
    public void d(m8.e eVar) {
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Video.Exo.EventLogger", eVar, "playerFailed [" + C() + "]", new java.lang.Object[0]);
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
        int[][][] iArr;
        q9.j jVar = this.f4472d.f360866c;
        if (jVar == null) {
            return;
        }
        for (int i17 = 0; i17 < jVar.f360859a; i17++) {
            d9.l0[] l0VarArr = jVar.f360860b;
            d9.l0 l0Var2 = l0VarArr[i17];
            q9.m mVar = nVar.f360868b[i17];
            if (l0Var2.f227375a > 0) {
                int i18 = 0;
                while (i18 < l0Var2.f227375a) {
                    d9.k0 k0Var = l0Var2.f227376b[i18];
                    int i19 = k0Var.f227370a;
                    int i27 = l0VarArr[i17].f227376b[i18].f227370a;
                    int[] iArr2 = new int[i27];
                    int i28 = 0;
                    int i29 = 0;
                    while (true) {
                        iArr = jVar.f360862d;
                        if (i28 >= i27) {
                            break;
                        }
                        if ((iArr[i17][i18][i28] & 7) == 4) {
                            iArr2[i29] = i28;
                            i29++;
                        }
                        i28++;
                    }
                    int[] copyOf = java.util.Arrays.copyOf(iArr2, i29);
                    int i37 = 16;
                    java.lang.String str = null;
                    d9.l0 l0Var3 = l0Var2;
                    int i38 = 0;
                    boolean z17 = false;
                    int i39 = 0;
                    while (i38 < copyOf.length) {
                        int[] iArr3 = copyOf;
                        java.lang.String str2 = l0VarArr[i17].f227376b[i18].f227371b[copyOf[i38]].f44080i;
                        int i47 = i39 + 1;
                        if (i39 == 0) {
                            str = str2;
                        } else {
                            z17 |= !t9.d0.a(str, str2);
                        }
                        i37 = java.lang.Math.min(i37, iArr[i17][i18][i38] & 24);
                        i38++;
                        i39 = i47;
                        copyOf = iArr3;
                    }
                    if (z17) {
                        java.lang.Math.min(i37, jVar.f360861c[i17]);
                    }
                    for (int i48 = 0; i48 < k0Var.f227370a; i48++) {
                        if (mVar != null) {
                            q9.e eVar = (q9.e) mVar;
                            if (eVar.f360847a == k0Var) {
                                eVar.e(i48);
                            }
                        }
                        int i49 = iArr[i17][i18][i48];
                        com.google.android.exoplayer2.Format.s(k0Var.f227371b[i48]);
                    }
                    i18++;
                    l0Var2 = l0Var3;
                }
                if (mVar != null) {
                    int i57 = 0;
                    while (true) {
                        q9.e eVar2 = (q9.e) mVar;
                        if (i57 >= eVar2.f360849c.length) {
                            break;
                        }
                        com.google.android.exoplayer2.metadata.Metadata metadata = eVar2.f360850d[i57].f44078g;
                        if (metadata != null) {
                            F(metadata, "      ");
                            break;
                        }
                        i57++;
                    }
                }
            }
        }
        d9.l0 l0Var4 = jVar.f360863e;
        if (l0Var4.f227375a > 0) {
            for (int i58 = 0; i58 < l0Var4.f227375a; i58++) {
                d9.k0 k0Var2 = l0Var4.f227376b[i58];
                for (int i59 = 0; i59 < k0Var2.f227370a; i59++) {
                    com.google.android.exoplayer2.Format.s(k0Var2.f227371b[i59]);
                }
            }
        }
    }

    @Override // d9.h
    public void f(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // u9.t
    public void g(int i17, long j17) {
        C();
    }

    @Override // u9.t
    public void h(int i17, int i18, int i19, float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", "videoSizeChanged [" + i17 + ", " + i18 + ", " + i19 + ", " + f17 + "]");
    }

    @Override // n8.n
    public void i(o8.f fVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", "audioDisabled [" + C() + ", " + af1.z.c(fVar) + "]");
    }

    @Override // u9.t
    public void j(o8.f fVar) {
        C();
    }

    @Override // d9.h
    public void k() {
    }

    @Override // u9.t
    public void l(java.lang.String str, long j17, long j18) {
        C();
    }

    @Override // n8.n
    public void m(int i17) {
    }

    @Override // u9.t
    public void n(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", "renderedFirstFrame [" + surface + "]");
    }

    @Override // n8.n
    public void o(o8.f fVar) {
        C();
    }

    @Override // d9.u
    public void onLoadError(java.io.IOException iOException) {
        E("loadError", iOException);
    }

    @Override // z8.f
    public void p(com.google.android.exoplayer2.metadata.Metadata metadata) {
        F(metadata, "  ");
    }

    @Override // u9.t
    public void q(o8.f fVar) {
        C();
        af1.z.c(fVar);
    }

    @Override // d9.h
    public void r(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28, java.io.IOException iOException, boolean z17) {
        E("loadError", iOException);
    }

    @Override // u9.t
    public void s(com.google.android.exoplayer2.Format format) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", "videoFormatChanged [" + C() + ", " + com.google.android.exoplayer2.Format.s(format) + "]");
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
        int e17 = m0Var.e();
        int i17 = m0Var.i();
        for (int i18 = 0; i18 < java.lang.Math.min(e17, 3); i18++) {
            m8.k0 k0Var = this.f4474f;
            m0Var.c(i18, k0Var);
            D(m8.b.b(k0Var.f324598d));
        }
        for (int i19 = 0; i19 < java.lang.Math.min(i17, 3); i19++) {
            m8.l0 l0Var = this.f4473e;
            m0Var.g(i19, l0Var);
            D(m8.b.b(l0Var.f324628f));
        }
    }

    @Override // m8.z
    public void u(m8.y yVar) {
        java.lang.String.format("[speed=%.2f, pitch=%.2f]", java.lang.Float.valueOf(yVar.f324679a), java.lang.Float.valueOf(yVar.f324680b));
    }

    @Override // d9.h
    public void v(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19, long j27, long j28) {
    }

    @Override // d9.h
    public void w(r9.n nVar, int i17, int i18, com.google.android.exoplayer2.Format format, int i19, java.lang.Object obj, long j17, long j18, long j19) {
    }

    @Override // n8.n
    public void x(int i17, long j17, long j18) {
        E("audioTrackUnderrun [" + i17 + ", " + j17 + ", " + j18 + "]", null);
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state [");
        sb6.append(C());
        sb6.append(", ");
        sb6.append(z17);
        sb6.append(", ");
        sb6.append(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "?" : androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : "R" : "B" : "I");
        sb6.append("]");
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.Exo.EventLogger", sb6.toString());
    }

    @Override // m8.z
    public void z(int i17) {
    }
}
