package fi3;

/* loaded from: classes10.dex */
public class f implements fi3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi3.g f344512a;

    public f(fi3.g gVar) {
        this.f344512a = gVar;
    }

    @Override // fi3.p
    public void a(byte[] bArr, boolean z17, long j17) {
        fi3.o oVar;
        fi3.n nVar;
        fi3.g gVar = this.f344512a;
        if (gVar.f344533v == null) {
            gVar.f344533v = gVar.f344513b.a();
        }
        gVar.getClass();
        android.graphics.Bitmap bitmap = gVar.f344535x;
        if (bitmap != null) {
            if (gVar.f344536y == null) {
                int i17 = gVar.f344522k;
                if (i17 == 90 || i17 == 270) {
                    gVar.f344535x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, 360 - i17);
                } else if (i17 == 180) {
                    gVar.f344535x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, 180.0f);
                }
                android.graphics.Bitmap bitmap2 = gVar.f344535x;
                android.graphics.Point point = gVar.f344533v;
                gVar.f344535x = android.graphics.Bitmap.createScaledBitmap(bitmap2, point.x, point.y, true);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(gVar.f344535x.getRowBytes() * gVar.f344535x.getHeight());
                allocateDirect.position(0);
                gVar.f344535x.copyPixelsToBuffer(allocateDirect);
                allocateDirect.position(0);
                gVar.f344536y = new byte[allocateDirect.remaining()];
                allocateDirect.get(gVar.f344536y);
            }
            byte[] bArr2 = gVar.f344536y;
            android.graphics.Point point2 = gVar.f344533v;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69157x458c0024(bArr, bArr2, point2.x, point2.y);
        }
        fi3.o oVar2 = gVar.f344514c;
        if (oVar2 != null) {
            android.graphics.Point point3 = gVar.f344533v;
            int i18 = point3.x;
            int i19 = point3.y;
            int e17 = gVar.f344513b.e();
            if (bArr != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66908xa0983c9a(bArr, i18, i19, oVar2.f344585d, oVar2.f344586e, e17, oVar2.f344583b, oVar2.f344584c);
                oVar2.f344587f++;
            } else {
                oVar2.getClass();
            }
        }
        ei3.x.f334720d.o(bArr);
        if (!z17 || (oVar = gVar.f344514c) == null || (nVar = oVar.f344582a) == null) {
            return;
        }
        nVar.f344580g = true;
    }
}
