package ht0;

/* loaded from: classes10.dex */
public class h implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.j f366230d;

    public h(ht0.j jVar) {
        this.f366230d = jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h90.z zVar;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) obj2;
        byteBuffer.position(0);
        if (byteBuffer.remaining() < bufferInfo.size) {
            return null;
        }
        ht0.s sVar = this.f366230d.f366234d;
        if (sVar.f366294i == null) {
            return null;
        }
        long j17 = bufferInfo.presentationTimeUs;
        if ((bufferInfo.flags & 1) > 0 && (zVar = sVar.H) != null) {
            ta1.c cVar = (ta1.c) zVar;
            synchronized (cVar) {
                ta1.l0 l0Var = cVar.f498139a.f498148d;
                if (l0Var != null) {
                    ((ma1.C29125x3046dc) l0Var).a(j17 / 1000);
                }
            }
        }
        ht0.s sVar2 = this.f366230d.f366234d;
        if (sVar2.f366300o.f334572a == ei3.l.Stop) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] writeH264Data, already stop");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h hVar = sVar2.f366302q;
        int i17 = bufferInfo.size;
        long j18 = bufferInfo.presentationTimeUs;
        hVar.getClass();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.h.f243947c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69259x798715d1(hVar.f243948a, byteBuffer, i17, j18);
        }
        this.f366230d.f366234d.U++;
        return null;
    }
}
