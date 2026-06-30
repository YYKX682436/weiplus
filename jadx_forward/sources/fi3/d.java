package fi3;

/* loaded from: classes10.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi3.e f344487a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fi3.e eVar, android.os.Looper looper) {
        super(looper);
        this.f344487a = eVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        fi3.l lVar;
        if (message.what == 1) {
            byte[] bArr = (byte[]) message.obj;
            boolean z17 = message.arg1 == 1;
            long j17 = message.arg2;
            fi3.e eVar = this.f344487a;
            if (eVar.f344489c != null) {
                if (eVar.f344506t == null) {
                    eVar.f344506t = eVar.f344488b.a();
                }
                eVar.getClass();
                android.graphics.Bitmap bitmap = eVar.f344510x;
                if (bitmap != null) {
                    if (eVar.f344511y == null) {
                        int i17 = eVar.f344497k;
                        if (i17 == 90 || i17 == 270) {
                            eVar.f344510x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, 360 - i17);
                        } else if (i17 == 180) {
                            eVar.f344510x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(bitmap, 180.0f);
                        }
                        android.graphics.Bitmap bitmap2 = eVar.f344510x;
                        android.graphics.Point point = eVar.f344506t;
                        eVar.f344510x = android.graphics.Bitmap.createScaledBitmap(bitmap2, point.x, point.y, true);
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(eVar.f344510x.getRowBytes() * eVar.f344510x.getHeight());
                        allocateDirect.position(0);
                        eVar.f344510x.copyPixelsToBuffer(allocateDirect);
                        allocateDirect.position(0);
                        eVar.f344511y = new byte[allocateDirect.remaining()];
                        allocateDirect.get(eVar.f344511y);
                    }
                    byte[] bArr2 = eVar.f344511y;
                    android.graphics.Point point2 = eVar.f344506t;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69157x458c0024(bArr, bArr2, point2.x, point2.y);
                }
                fi3.l lVar2 = eVar.f344489c;
                android.graphics.Point point3 = eVar.f344506t;
                int i18 = point3.x;
                int i19 = point3.y;
                lVar2.getClass();
                if (z17 || bArr == null) {
                    lVar2.c(lVar2.f344576u, true, j17);
                } else {
                    int i27 = lVar2.f344559d;
                    int i28 = lVar2.f344558c;
                    boolean z18 = (i18 == i28 && i19 == i27) ? false : true;
                    if (lVar2.f344576u == null) {
                        lVar2.f344576u = new byte[((i28 * i27) * 3) >> 1];
                    }
                    if (lVar2.f344560e != 19 || z18) {
                        lVar = lVar2;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16537x7c20fff9.m66910x8353693d(bArr, 2, lVar2.f344576u, lVar2.f344577v, i18, i19, i18, i19, i28, i27);
                    } else {
                        java.lang.System.arraycopy(bArr, 0, lVar2.f344576u, 0, bArr.length);
                        lVar = lVar2;
                    }
                    lVar.f344562g++;
                    lVar.c(lVar.f344576u, false, j17);
                }
                ei3.x.f334720d.o(bArr);
            }
        }
    }
}
