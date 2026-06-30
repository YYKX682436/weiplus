package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.f, xq4.d {
    public final p3325xe03a0797.p3326xc267989b.y0 A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final boolean H;

    public u(android.content.Context context, fw1.d dVar, org.json.JSONObject jSONObject, int i17, int i18) {
        super(context, dVar, jSONObject);
        this.A = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r(i17, i18);
        this.E = 1;
        this.H = true;
    }

    public final boolean E(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("camera", "back");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraVideoView", "camera:" + optString);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "back")) {
                return false;
            }
        }
        return true;
    }

    public final void F() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g gVar = this.C;
        if (gVar != null) {
            int m54524xb7d6578e = m54524xb7d6578e();
            int m54523x2925a05f = m54523x2925a05f();
            lf1.j jVar = (lf1.j) gVar;
            if (jVar.f399802o == m54524xb7d6578e && jVar.f399803p == m54523x2925a05f) {
                return;
            }
            jVar.f399802o = m54524xb7d6578e;
            jVar.f399803p = m54523x2925a05f;
            jVar.s();
        }
    }

    @Override // xq4.d
    public void e(int i17) {
        if (android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation", 0) != 0) {
            fw1.i.a(i17, this.B.f546093d);
            this.E = i17;
            F();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraVideoView", "uint, viewId:" + mo54526x346a5196() + ", openId:" + mo54519x28dae7fb() + ", memberId:" + mo54518x552492cb());
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r rVar = this.B;
        rVar.i();
        rVar.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void i(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.H) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraVideoView", "update, viewId:" + mo54526x346a5196() + ", openId:" + mo54519x28dae7fb() + ", memberId:" + mo54518x552492cb() + ", data:" + data);
            boolean E = E(data);
            if (E != this.D) {
                this.D = E;
                this.B.a();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public void k(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraVideoView", "init: " + data);
        this.f177373h = data.optInt("viewId");
        this.D = E(data);
        java.lang.String optString = data.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15495x767d9974, "fill");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != 3143043) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && optString.equals("contain")) {
                        this.f177383u = 1;
                    }
                } else if (optString.equals("cover")) {
                    this.f177383u = 2;
                }
            } else if (optString.equals("fill")) {
                this.f177383u = 0;
            }
        }
        this.B.d(this, this.D);
        p3325xe03a0797.p3326xc267989b.l.d(this.A, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.t(mo54518x552492cb() + "_video", this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean n(int i17, int i18) {
        return this.B.n(i17, i18);
    }

    /* renamed from: setSameLayerCallback */
    public void m54552xbca2d1ae(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g gVar) {
        this.C = gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r13.f546105s == 90) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r13.f546105s == 90) goto L31;
     */
    @Override // xq4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(byte[] r7, long r8, int r10, int r11, int r12, int r13, double r14) {
        /*
            r6 = this;
            java.lang.String r8 = "pBuffer"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y2 r9 = r8.f177552h
            monitor-enter(r9)
            boolean r13 = r9.f177675c     // Catch: java.lang.Throwable -> L53
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L53
            if (r13 != 0) goto L11
            return
        L11:
            int r9 = r6.F
            if (r9 != r10) goto L19
            int r9 = r6.G
            if (r9 == r11) goto L20
        L19:
            r6.F = r10
            r6.G = r11
            r6.F()
        L20:
            int r9 = r6.E
            if (r9 == 0) goto L42
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.r r13 = r6.B
            r14 = 1
            r15 = 90
            if (r9 == r14) goto L3a
            r14 = 2
            if (r9 == r14) goto L37
            r14 = 3
            if (r9 == r14) goto L32
            goto L42
        L32:
            int r9 = r13.f546105s
            if (r9 != r15) goto L44
            goto L3f
        L37:
            int r12 = r12 + 512
            goto L3f
        L3a:
            int r9 = r13.f546105s
            if (r9 != r15) goto L3f
            goto L44
        L3f:
            int r12 = r12 + 1024
            goto L44
        L42:
            int r12 = r12 + 512
        L44:
            r2 = r12
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y1 r9 = new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.y1
            r0 = r9
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.n(r9)
            return
        L53:
            r7 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L53
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.u.v(byte[], long, int, int, int, int, double):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d
    public boolean z() {
        return false;
    }
}
