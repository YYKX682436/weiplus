package gz0;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f359194a;

    /* renamed from: b, reason: collision with root package name */
    public final long f359195b;

    /* renamed from: c, reason: collision with root package name */
    public final long f359196c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f359197d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 f359198e;

    /* renamed from: f, reason: collision with root package name */
    public final gz0.d f359199f;

    public h(java.lang.String playUrl, long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j18 = (i17 & 4) != 0 ? -1L : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playUrl, "playUrl");
        this.f359194a = playUrl;
        this.f359195b = j17;
        this.f359196c = j18;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f359197d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844>(a0Var) { // from class: com.tencent.mm.mj_template.sns.MusicPlayer$voipCallEventListener$1
            {
                this.f39173x3fe91575 = 1965200980;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844 c6228x1d6c1844) {
                com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844 event = c6228x1d6c1844;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (!gm0.j1.a()) {
                    return false;
                }
                int i18 = event.f136475g.f89694d;
                gz0.h hVar = gz0.h.this;
                if (i18 == 11) {
                    com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = hVar.f359198e;
                    if (interfaceC26164x73fc6bc62 != null) {
                        interfaceC26164x73fc6bc62.mo100940x3aa51598(1.0f);
                    }
                } else if (i18 == 7 && (interfaceC26164x73fc6bc6 = hVar.f359198e) != null) {
                    interfaceC26164x73fc6bc6.mo100940x3aa51598(0.0f);
                }
                return true;
            }
        };
        this.f359199f = new gz0.d();
    }

    public final void a() {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "pausePlay: " + this.f359198e);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f359198e;
            if (interfaceC26164x73fc6bc6 != null) {
                interfaceC26164x73fc6bc6.mo100930x65825f6();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicPlayer", "pausePlay: error", m143898xd4a2fc34);
        }
    }

    public final void b() {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "resumePlay: " + this.f359198e);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = this.f359198e;
            if (interfaceC26164x73fc6bc6 != null) {
                interfaceC26164x73fc6bc6.mo100975x68ac462();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicPlayer", "resumePlay: error", m143898xd4a2fc34);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gz0.e
            if (r0 == 0) goto L13
            r0 = r7
            gz0.e r0 = (gz0.e) r0
            int r1 = r0.f359191g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f359191g = r1
            goto L18
        L13:
            gz0.e r0 = new gz0.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f359189e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f359191g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L7a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.f359188d
            gz0.h r2 = (gz0.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L62
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "startPlay: "
            r7.<init>(r2)
            java.lang.String r2 = r6.f359194a
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.MusicPlayer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            com.tencent.thumbplayer.api.ITPPlayer r7 = r6.f359198e
            if (r7 == 0) goto L61
            r0.f359188d = r6
            r0.f359191g = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            com.tencent.mm.sdk.event.IListener r7 = r2.f359197d
            r7.mo48813x58998cd()
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            gz0.f r4 = new gz0.f
            r5 = 0
            r4.<init>(r2, r5)
            r0.f359188d = r5
            r0.f359191g = r3
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r7, r4, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.h.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "stopPlay: " + this.f359194a);
        this.f359197d.mo48814x2efc64();
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new gz0.g(this, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }
}
