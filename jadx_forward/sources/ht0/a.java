package ht0;

/* loaded from: classes10.dex */
public final class a extends ei3.u {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f366193J;

    public a(int i17, int i18, int i19, boolean z17) {
        super(i17, i18, i19, null, z17);
        this.f366193J = new java.util.ArrayList();
    }

    @Override // ei3.u
    public boolean j() {
        return true;
    }

    @Override // ei3.u
    public void k(java.nio.ByteBuffer outputBuffer, android.media.MediaCodec.BufferInfo info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputBuffer, "outputBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = this.f366193J;
        if (arrayList.size() < 0 || this.f334677u) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.e((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h) it.next(), outputBuffer, info.size, info.presentationTimeUs, 0, 0, 0, 56, null);
        }
    }

    @Override // ei3.u
    public void l(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo info, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.ArrayList arrayList = this.f366193J;
        if (arrayList.size() < 0 || byteBuffer == null || this.f334677u) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h) it.next()).d(byteBuffer, info.size, info.presentationTimeUs, i17, i18, i19);
        }
    }

    public final int n(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h sightEncode, java.lang.String tempPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sightEncode, "sightEncode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
        java.util.ArrayList arrayList = this.f366193J;
        arrayList.clear();
        arrayList.add(sightEncode);
        return c(sightEncode.f243948a, tempPath);
    }
}
