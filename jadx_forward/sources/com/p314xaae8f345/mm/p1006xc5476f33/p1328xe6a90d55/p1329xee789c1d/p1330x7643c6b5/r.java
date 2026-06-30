package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

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
            wo.d1 d1Var = this.f546096g;
            if (d1Var == null || !this.f546100n) {
                return;
            }
            d1Var.g(this.D);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenVoiceCameraRender", e17, "setPreviewCallback error: %s", e17.getMessage());
        }
    }

    public boolean l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraRender", "startPreview");
        try {
            xq4.d dVar = this.f546106t;
            if (dVar != null) {
                dVar.q(16);
            }
            g();
            this.f546096g.k();
            xq4.d dVar2 = this.f546106t;
            if (dVar2 != null) {
                dVar2.q(21);
            }
            android.hardware.Camera.Parameters c17 = this.f546096g.c();
            this.f546097h = c17;
            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
            if (vq4.b0.f520812j) {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(this.f546096g.f529186b, cameraInfo);
                this.f546111y = cameraInfo.orientation;
            }
            if (previewSize != null) {
                int i17 = previewSize.width;
                int i18 = previewSize.height;
                this.f546098i = new wo.q1(i17, i18);
                this.f546106t.Y(i17, i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraRender", "Camera Open Success, preview available : w,h:" + previewSize.width + "," + previewSize.height);
            }
            this.f546107u = true;
            return true;
        } catch (java.lang.Exception e17) {
            xq4.d dVar3 = this.f546106t;
            if (dVar3 != null) {
                dVar3.q(2);
            }
            this.f546107u = false;
            this.f546095f = 1;
            xq4.d dVar4 = this.f546106t;
            if (dVar4 != null) {
                dVar4.o();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoiceCameraRender", "startPreview:error" + e17.toString());
            return false;
        }
    }

    public boolean m() {
        wo.d1 d1Var;
        if (!this.f546107u || (d1Var = this.f546096g) == null) {
            return true;
        }
        this.f546108v = false;
        if (!d1Var.f529187c) {
            this.f546096g.g(null);
        }
        try {
            xq4.d dVar = this.f546106t;
            if (dVar != null) {
                dVar.q(17);
            }
            this.f546096g.l();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoiceCameraRender", "stopPreview:error" + e17.toString());
        }
        this.f546107u = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraRender", "stopPreview");
        return true;
    }

    public boolean n(int i17, int i18) {
        if (!this.f546093d ? xq4.e.f537646a.f546120h == null : xq4.e.f537646a.f546119g == null) {
            return false;
        }
        long j17 = this.F + 1;
        this.F = j17;
        if (j17 % 10 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceCameraRender", "switchPreviewSize w:%d, h:%d, mSize.w:%d, mSize.h:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f546098i.f529323a), java.lang.Integer.valueOf(this.f546098i.f529324b));
        }
        wo.q1 q1Var = this.f546098i;
        try {
            wo.q1 b17 = yq4.b.b(this.f546096g, i17, i18);
            int i19 = b17.f529323a;
            int i27 = b17.f529324b;
            if (i19 / i27 != i17 / i18) {
                return false;
            }
            int i28 = q1Var.f529323a;
            wo.q1 q1Var2 = this.f546098i;
            if (i28 == q1Var2.f529323a && i27 == q1Var2.f529324b) {
                return false;
            }
            m();
            j(this.f546096g, i19, i27);
            k(this.f546096g, this.f546093d);
            android.hardware.Camera.Parameters c17 = this.f546096g.c();
            this.f546097h = c17;
            android.hardware.Camera.Size previewSize = c17.getPreviewSize();
            if (previewSize != null) {
                this.f546098i = new wo.q1(previewSize.width, previewSize.height);
            }
            l();
            this.f546109w = i17;
            this.f546110x = i18;
            wo.q1 q1Var3 = this.f546098i;
            return (q1Var3 == null || q1Var3 == q1Var) ? false : true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenVoiceCameraRender", e17, "switchPreviewSize", new java.lang.Object[0]);
            if (q1Var != null) {
                try {
                    m();
                    this.f546107u = false;
                    j(this.f546096g, q1Var.f529323a, q1Var.f529324b);
                    l();
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoiceCameraRender", "boom in recovery camera preview");
                }
            }
            return false;
        }
    }
}
