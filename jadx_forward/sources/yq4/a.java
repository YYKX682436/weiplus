package yq4;

/* loaded from: classes14.dex */
public class a implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq4.b f546092d;

    public a(yq4.b bVar) {
        this.f546092d = bVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        int i17;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.CaptureRender", "onPreviewFrame");
        yq4.b bVar = this.f546092d;
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(159L, 0L, 1L, false);
            g0Var.mo68477x336bdfd8(159L, 3L, 1L, false);
            xq4.d dVar = bVar.f546106t;
            if (dVar != null) {
                dVar.o();
                return;
            }
            return;
        }
        if (bVar.f546098i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "onPreviewFrame mSize is null");
            return;
        }
        if (bVar.f546106t != null) {
            byte[] bArr2 = bVar.A;
            if (bArr2 == null || bArr2.length != bArr.length) {
                bVar.A = new byte[bArr.length];
            }
            boolean z18 = false;
            java.lang.System.arraycopy(bArr, 0, bVar.A, 0, bArr.length);
            if (bVar.f546093d) {
                i17 = xq4.e.f537649d;
                wo.e eVar = wo.v1.f529355b;
                if (eVar.f529198j) {
                    wo.d dVar2 = eVar.f529197i;
                    if (dVar2.f529179d != 0) {
                        int i18 = dVar2.f529180e;
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                i17 = xq4.e.f537650e;
                wo.e eVar2 = wo.v1.f529355b;
                if (eVar2.f529200l) {
                    wo.d dVar3 = eVar2.f529199k;
                    if (dVar3.f529179d != 0) {
                        int i19 = dVar3.f529180e;
                        z17 = true;
                    }
                }
                z17 = false;
            }
            int i27 = i17 > 0 ? 32 : 0;
            if (!z17 && i17 > 0) {
                z18 = true;
            }
            bVar.f546094e = z18;
            wo.q1 q1Var = bVar.f546098i;
            int i28 = q1Var.f529323a;
            int i29 = q1Var.f529324b;
            if (z17) {
                bVar.getClass();
            }
            xq4.d dVar4 = bVar.f546106t;
            byte[] bArr3 = bVar.A;
            long length = bArr3.length;
            wo.q1 q1Var2 = bVar.f546098i;
            dVar4.v(bArr3, length, q1Var2.f529323a, q1Var2.f529324b, bVar.f546099m, i27, 0.0d);
            r45.n27 n27Var = vq4.p0.f520907a;
            wo.d1 d1Var = bVar.f546096g;
            if (d1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "the camera is null and has been release");
            } else if (d1Var != null) {
                d1Var.a(bArr);
            }
        }
    }
}
