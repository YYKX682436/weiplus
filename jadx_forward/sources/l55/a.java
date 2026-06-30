package l55;

/* loaded from: classes10.dex */
public final class a implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7.TAVAudioProcessorEffect {

    /* renamed from: a, reason: collision with root package name */
    public kl.i f398198a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f398199b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f398200c = new byte[0];

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 f398201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l55.b f398202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.j f398203f;

    public a(l55.b bVar, rm5.j jVar) {
        this.f398202e = bVar;
        this.f398203f = jVar;
        com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984 = new com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984();
        this.f398201d = c25756x82a4b984;
        c25756x82a4b984.f47985x88751aa = bVar.f398204a;
        c25756x82a4b984.f47983xf99d8dcc = bVar.f398205b;
        c25756x82a4b984.f47984x2771c84d = 2;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305
    /* renamed from: getDestAudioInfo */
    public com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 mo96699x84ccd6c() {
        return this.f398201d;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305
    /* renamed from: processAudioPCM */
    public java.nio.ByteBuffer mo96700x9d40a4b3(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 time, java.nio.ByteBuffer pcmBuffer, com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 audioInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcmBuffer, "pcmBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioInfo, "audioInfo");
        if (this.f398198a == null) {
            java.lang.String str = this.f398203f.f479032a;
            int i17 = audioInfo.f47985x88751aa;
            int i18 = audioInfo.f47983xf99d8dcc;
            int i19 = audioInfo.f47984x2771c84d;
            com.p314xaae8f345.tav.p2959x5befac44.C25756x82a4b984 c25756x82a4b984 = this.f398201d;
            this.f398198a = new kl.i(str, i17, i18, i19, c25756x82a4b984.f47985x88751aa, c25756x82a4b984.f47983xf99d8dcc, c25756x82a4b984.f47984x2771c84d, 3);
            this.f398202e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioResampler", "processAudioPCM, create convert processor, src:" + audioInfo + ", dst:" + c25756x82a4b984);
        }
        if (this.f398200c.length != pcmBuffer.limit()) {
            this.f398200c = new byte[pcmBuffer.limit()];
        }
        pcmBuffer.position(0);
        pcmBuffer.get(this.f398200c);
        pcmBuffer.position(0);
        kl.i iVar = this.f398198a;
        byte[] a17 = iVar != null ? iVar.a(this.f398200c) : null;
        if (a17 == null) {
            return pcmBuffer;
        }
        java.nio.ByteBuffer byteBuffer = this.f398199b;
        if (!(byteBuffer != null && byteBuffer.capacity() == a17.length)) {
            java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(a17.length).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            order.put(a17);
            this.f398199b = order;
            order.position(0);
            return order;
        }
        java.nio.ByteBuffer byteBuffer2 = this.f398199b;
        if (byteBuffer2 != null) {
            byteBuffer2.position(0);
        }
        java.nio.ByteBuffer byteBuffer3 = this.f398199b;
        if (byteBuffer3 != null) {
            byteBuffer3.put(a17);
        }
        java.nio.ByteBuffer byteBuffer4 = this.f398199b;
        if (byteBuffer4 != null) {
            byteBuffer4.position(0);
        }
        java.nio.ByteBuffer byteBuffer5 = this.f398199b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(byteBuffer5);
        return byteBuffer5;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.InterfaceC25674xc28db305
    /* renamed from: release */
    public void mo96701x41012807() {
        kl.i iVar = this.f398198a;
        if (iVar != null) {
            iVar.mo143607x41012807();
        }
    }
}
