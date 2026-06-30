package ko4;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko4.l f391606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f391607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ko4.l lVar, int i17) {
        super(0);
        this.f391606d = lVar;
        this.f391607e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ko4.l lVar = this.f391606d;
        int a17 = lVar.f391621i.a(0L);
        if (a17 >= 0) {
            ko4.b c17 = lVar.f391621i.c(a17);
            int b17 = lVar.f391622j.b(0L);
            if (b17 >= 0) {
                if (com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46876xdc168c6(lVar.f391624l, c17.f391571b, this.f391607e) > 0) {
                    int m46879x7471de3d = com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46879x7471de3d(lVar.f391624l);
                    ko4.d dVar = lVar.f391623k;
                    if (dVar != null) {
                        int i17 = lVar.f391617e;
                        dVar.f391582a = m46879x7471de3d;
                        dVar.f391583b = i17;
                    }
                    lVar.f391622j.f391573b = com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46881xefb17c6a(lVar.f391624l);
                    ko4.b c18 = lVar.f391622j.c(b17);
                    java.nio.ByteBuffer byteBuffer = c18.f391571b;
                    byteBuffer.position(0);
                    int m46880xed73b4c9 = com.p314xaae8f345.mm.p871x7fa16b7e.C10909x8b10b9c6.m46880xed73b4c9(lVar.f391624l, byteBuffer);
                    long j17 = c17.f391570a.presentationTimeUs;
                    android.media.MediaCodec.BufferInfo bufferInfo = c18.f391570a;
                    bufferInfo.presentationTimeUs = j17;
                    bufferInfo.size = m46880xed73b4c9;
                    byteBuffer.position(0);
                    byteBuffer.limit(m46880xed73b4c9);
                    ko4.c cVar = lVar.f391622j;
                    java.util.concurrent.locks.ReentrantLock reentrantLock = cVar.f391575d;
                    reentrantLock.lock();
                    try {
                        cVar.f391579h++;
                        cVar.f391576e.signalAll();
                        reentrantLock.unlock();
                    } finally {
                    }
                } else {
                    ko4.c cVar2 = lVar.f391622j;
                    cVar2.f391575d.lock();
                    try {
                        cVar2.f391578g--;
                        cVar2.f391577f.signalAll();
                    } finally {
                    }
                }
                lVar.f391621i.d();
            }
        }
        return jz5.f0.f384359a;
    }
}
