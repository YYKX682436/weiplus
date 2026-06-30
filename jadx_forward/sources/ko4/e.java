package ko4;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf {

    /* renamed from: a, reason: collision with root package name */
    public boolean f391597a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f391598b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.tav.p2946x5a71016.C25648xd8cdf4a7 f391599c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f391600d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f391601e;

    /* renamed from: f, reason: collision with root package name */
    public int f391602f;

    /* renamed from: g, reason: collision with root package name */
    public int f391603g;

    public e(boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        this.f391597a = z17;
        this.f391598b = z18;
        this.f391599c = new com.p314xaae8f345.tav.p2946x5a71016.C25648xd8cdf4a7();
        this.f391600d = true;
        this.f391601e = true;
        this.f391602f = 0;
        this.f391603g = 0;
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf
    /* renamed from: createAudioDecoder */
    public com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96241x741d26aa(java.lang.String mime, java.lang.String scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mime, "mime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (this.f391600d && r26.i0.y(mime, "audio/pcm", false)) {
            this.f391602f = 3;
            return new ko4.a();
        }
        if (this.f391598b) {
            this.f391602f = 1;
            return new ko4.a();
        }
        try {
            com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96241x741d26aa = this.f391599c.mo96241x741d26aa(mime, scene);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo96241x741d26aa, "createAudioDecoder(...)");
            return mo96241x741d26aa;
        } catch (java.lang.Exception e17) {
            if (!this.f391601e) {
                throw e17;
            }
            this.f391602f = 2;
            return new ko4.a();
        }
    }

    @Override // com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf
    /* renamed from: createVideoDecoder */
    public com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96242xc9e59a65(java.lang.String mime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mime, "mime");
        if (this.f391597a) {
            this.f391603g = 1;
            return new ko4.l();
        }
        try {
            com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25651x5e1bd3bb mo96242xc9e59a65 = this.f391599c.mo96242xc9e59a65(mime);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo96242xc9e59a65, "createVideoDecoder(...)");
            return mo96242xc9e59a65;
        } catch (java.lang.Exception e17) {
            if (!this.f391601e) {
                throw e17;
            }
            this.f391603g = 2;
            return new ko4.l();
        }
    }
}
