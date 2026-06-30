package vu0;

/* loaded from: classes5.dex */
public final class m0 implements com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f521653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu0.d f521654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f521655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f521657e;

    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, tu0.d dVar, yz5.l lVar, java.lang.String str, yz5.l lVar2) {
        this.f521653a = c0Var;
        this.f521654b = dVar;
        this.f521655c = lVar;
        this.f521656d = str;
        this.f521657e = lVar2;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p483x6a710b1.C4201xab88f943.OnComplete
    /* renamed from: onComplete */
    public final boolean mo34696x815f5438(java.nio.ByteBuffer byteBuffer, boolean z17) {
        tu0.d dVar = this.f521654b;
        java.lang.String audioFilePath = this.f521656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f521653a;
        if (c0Var.f391645d) {
            return false;
        }
        try {
            byteBuffer.rewind();
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            dVar.getClass();
            tu0.g gVar = dVar.f503614b;
            if (gVar != null) {
                gVar.h(bArr, remaining, z17);
            }
            tu0.b bVar = dVar.f503613a;
            if (bVar != null) {
                tu0.h hVar = (tu0.h) bVar;
                hVar.a(bArr, remaining, z17);
                try {
                    java.io.OutputStream outputStream = hVar.f503617f;
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, remaining);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (z17) {
                dVar.a();
                c0Var.f391645d = true;
                yz5.l lVar = this.f521655c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(audioFilePath, "$audioFilePath");
                lVar.mo146xb9724478(audioFilePath);
            }
            return true;
        } catch (java.lang.Exception e17) {
            dVar.a();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(audioFilePath);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoSubtitleService", "extractAudioPCM: deleteFile = ".concat(audioFilePath));
                com.p314xaae8f345.mm.vfs.w6.h(audioFilePath);
            }
            c0Var.f391645d = true;
            this.f521657e.mo146xb9724478(new java.lang.IllegalStateException("Encode PCM data to file failed", e17));
            return false;
        }
    }
}
