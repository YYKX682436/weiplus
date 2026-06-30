package ei3;

/* loaded from: classes10.dex */
public class p extends ei3.u {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f334648J;

    public p(int i17, int i18, int i19, boolean z17) {
        super(i17, i18, i19, null, z17);
        this.f334648J = new java.util.ArrayList();
    }

    @Override // ei3.u, ei3.j
    public int c(int i17, java.lang.String str) {
        java.util.ArrayList arrayList = this.f334648J;
        arrayList.clear();
        arrayList.add(java.lang.Integer.valueOf(i17));
        return super.c(i17, str);
    }

    @Override // ei3.u
    public boolean j() {
        return true;
    }

    @Override // ei3.u
    public void k(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        java.util.ArrayList arrayList = this.f334648J;
        if (arrayList.size() <= 0 || byteBuffer == null || this.f334677u) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69255xb00a27f9(((java.lang.Integer) it.next()).intValue(), byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
        }
    }

    @Override // ei3.u
    public void l(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = this.f334648J;
        if (arrayList.size() <= 0 || byteBuffer == null || this.f334677u) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69257xfe3d4dc1(((java.lang.Integer) it.next()).intValue(), byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs, i17, i18, i19);
        }
    }
}
