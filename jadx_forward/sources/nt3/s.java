package nt3;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es0.d f421341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nt3.a0 a0Var, es0.d dVar) {
        super(2);
        this.f421340d = a0Var;
        this.f421341e = dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yz5.a aVar;
        java.nio.Buffer buffer = (java.nio.Buffer) obj2;
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameDrawFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 19L, 1L);
        }
        nt3.a0 a0Var = this.f421340d;
        a0Var.f421242J++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f421255m, "onFrameDraw, drawFrameCount:" + this.f421340d.f421242J + ", encodeFrameCount:" + this.f421340d.I + ", isDecodeEnd:" + this.f421340d.K);
        ls0.w0 w0Var = this.f421340d.B;
        if (w0Var != null && (aVar = w0Var.f402488o) != null) {
            ((ls0.t0) aVar).mo152xb9724478();
        }
        nt3.a0 a0Var2 = this.f421340d;
        if (!a0Var2.f421253k) {
            gs0.b bVar = a0Var2.f421260r;
            if (bVar != null) {
                bVar.a(0L);
            }
        } else if (buffer != null) {
            gs0.r rVar = a0Var2.f421261s;
            if (rVar != null) {
                es0.d dVar = this.f421341e;
                int i17 = dVar.f337845b;
                int i18 = dVar.f337846c;
                if (rVar.f356544a < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264TransEncoder", "writeRGBData error, buffId error");
                } else {
                    synchronized (rVar.f356549f) {
                        if (!rVar.f356547d && !rVar.f356548e) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69263x83fe2a4c(rVar.f356544a, buffer, i17, i18, false, false, i17, i18);
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("writeRGBData ");
                            sb6.append(i17);
                            sb6.append(", ");
                            sb6.append(i18);
                            sb6.append(" cost ");
                            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                            sb6.append("ms, ");
                            int i19 = rVar.f356550g;
                            rVar.f356550g = i19 + 1;
                            sb6.append(i19);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", sb6.toString());
                            if (!rVar.f356552i) {
                                ru5.i iVar = rVar.f356545b;
                                if (iVar != null) {
                                    iVar.h();
                                }
                                rVar.f356552i = true;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X264TransEncoder", "writeRGBData, already stop or cancel, ignore");
                    }
                }
            }
            nt3.a0 a0Var3 = this.f421340d;
            a0Var3.I++;
            nt3.a0.e(a0Var3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(a0Var2.f421255m, "encode error, useX264Encode true but outputBuffer null");
        }
        nt3.k kVar = this.f421340d.f421259q;
        if (kVar != null) {
            kVar.d(false);
        }
        return jz5.f0.f384359a;
    }
}
