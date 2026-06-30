package hi3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final di3.o f363042a = new hi3.a(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab f363043b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab c16557x646260ab) {
        this.f363043b = c16557x646260ab;
    }

    public void a(byte[] bArr, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab c16557x646260ab = this.f363043b;
        if (c16557x646260ab != null) {
            if (bArr == null) {
                c16557x646260ab.getClass();
                return;
            }
            hi3.c cVar = c16557x646260ab.f230835d;
            if (cVar == null || cVar.f363049c) {
                return;
            }
            cVar.a(bArr, c16557x646260ab.f230836e, c16557x646260ab.f230837f, i17, z17);
            c16557x646260ab.requestRender();
        }
    }

    public void b(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab c16557x646260ab = this.f363043b;
        if (c16557x646260ab != null) {
            int i27 = (i19 == 0 || i19 == 180) ? i17 : i18;
            if (i19 == 0 || i19 == 180) {
                i17 = i18;
            }
            c16557x646260ab.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), c16557x646260ab);
            c16557x646260ab.f230836e = i27;
            c16557x646260ab.f230837f = i17;
            c16557x646260ab.f230838g = i19;
        }
    }
}
