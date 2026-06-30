package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class r extends yq4.b {
    public long F;

    public r(int i17, int i18) {
        super(i17, i18);
        this.F = 0L;
    }

    @Override // yq4.b
    public void g() {
        try {
            wo.d1 d1Var = this.f464563g;
            if (d1Var == null || !this.f464567n) {
                return;
            }
            d1Var.g(this.D);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoiceCameraRender", e17, "setPreviewCallback error: %s", e17.getMessage());
        }
    }

    public boolean l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraRender", "startPreview");
        try {
            xq4.d dVar = this.f464573t;
            if (dVar != null) {
                dVar.q(16);
            }
            g();
            this.f464563g.k();
            xq4.d dVar2 = this.f464573t;
            if (dVar2 != null) {
                dVar2.q(21);
            }
            android.hardware.Camera.Parameters c17 = this.f464563g.c();
            this.f464564h = c17;
            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
            if (vq4.b0.f439279j) {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(this.f464563g.f447653b, cameraInfo);
                this.f464578y = cameraInfo.orientation;
            }
            if (previewSize != null) {
                int i17 = previewSize.width;
                int i18 = previewSize.height;
                this.f464565i = new wo.q1(i17, i18);
                this.f464573t.Y(i17, i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraRender", "Camera Open Success, preview available : w,h:" + previewSize.width + "," + previewSize.height);
            }
            this.f464574u = true;
            return true;
        } catch (java.lang.Exception e17) {
            xq4.d dVar3 = this.f464573t;
            if (dVar3 != null) {
                dVar3.q(2);
            }
            this.f464574u = false;
            this.f464562f = 1;
            xq4.d dVar4 = this.f464573t;
            if (dVar4 != null) {
                dVar4.o();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoiceCameraRender", "startPreview:error" + e17.toString());
            return false;
        }
    }

    public boolean m() {
        wo.d1 d1Var;
        if (!this.f464574u || (d1Var = this.f464563g) == null) {
            return true;
        }
        this.f464575v = false;
        if (!d1Var.f447654c) {
            this.f464563g.g(null);
        }
        try {
            xq4.d dVar = this.f464573t;
            if (dVar != null) {
                dVar.q(17);
            }
            this.f464563g.l();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoiceCameraRender", "stopPreview:error" + e17.toString());
        }
        this.f464574u = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraRender", "stopPreview");
        return true;
    }

    public boolean n(int i17, int i18) {
        if (!this.f464560d ? xq4.e.f456113a.f464587h == null : xq4.e.f456113a.f464586g == null) {
            return false;
        }
        long j17 = this.F + 1;
        this.F = j17;
        if (j17 % 10 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceCameraRender", "switchPreviewSize w:%d, h:%d, mSize.w:%d, mSize.h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f464565i.f447790a), java.lang.Integer.valueOf(this.f464565i.f447791b));
        }
        wo.q1 q1Var = this.f464565i;
        try {
            wo.q1 b17 = yq4.b.b(this.f464563g, i17, i18);
            int i19 = b17.f447790a;
            int i27 = b17.f447791b;
            if (i19 / i27 != i17 / i18) {
                return false;
            }
            int i28 = q1Var.f447790a;
            wo.q1 q1Var2 = this.f464565i;
            if (i28 == q1Var2.f447790a && i27 == q1Var2.f447791b) {
                return false;
            }
            m();
            j(this.f464563g, i19, i27);
            k(this.f464563g, this.f464560d);
            android.hardware.Camera.Parameters c17 = this.f464563g.c();
            this.f464564h = c17;
            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
            if (previewSize != null) {
                this.f464565i = new wo.q1(previewSize.width, previewSize.height);
            }
            l();
            this.f464576w = i17;
            this.f464577x = i18;
            wo.q1 q1Var3 = this.f464565i;
            return (q1Var3 == null || q1Var3 == q1Var) ? false : true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenVoiceCameraRender", e17, "switchPreviewSize", new java.lang.Object[0]);
            if (q1Var != null) {
                try {
                    m();
                    this.f464574u = false;
                    j(this.f464563g, q1Var.f447790a, q1Var.f447791b);
                    l();
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoiceCameraRender", "boom in recovery camera preview");
                }
            }
            return false;
        }
    }
}
