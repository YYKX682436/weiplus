package zx3;

/* loaded from: classes10.dex */
public final class c extends zx3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mx3.u helper) {
        super(helper);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f558637b = mx3.i.MULTITALK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx3.a
    public boolean a(java.lang.String str, int i17, boolean z17, long j17, java.lang.Boolean bool) {
        boolean d17;
        boolean k17;
        int i18;
        boolean z18;
        if (fp.h.c(29)) {
            d17 = ip.b.g(mx3.i0.h(""));
            k17 = ip.b.h(mx3.i0.h(""));
        } else {
            d17 = ip.b.d();
            k17 = ip.b.k();
        }
        if (z17) {
            d17 = true;
        }
        int i19 = 0;
        if (!d17 && !k17) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        mx3.u uVar = this.f558636a;
        uVar.Vi(r17, z17, 0L);
        if (d17) {
            boolean Ui = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui();
            boolean aj6 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultitalkSceneSetting", "isBluetoothOn: %b, isHeadsetPlugged: %b", java.lang.Boolean.valueOf(Ui), java.lang.Boolean.valueOf(aj6));
            if (mx3.f0.f414081a.k()) {
                if (!Ui && !z17 && !aj6) {
                    i18 = 1;
                    i19 = 2;
                    z18 = i18;
                }
                z18 = 0;
            } else if (z17) {
                if (!Ui && !aj6) {
                    z18 = 1;
                }
                z18 = 0;
            } else {
                if (!Ui && !aj6) {
                    i19 = 1;
                }
                i18 = i19;
                i19 = 2;
                z18 = i18;
            }
            uVar.Di(vx3.d.f522806d, i19, true);
            uVar.Vi(c01.z1.r(), z17, 0L);
            if (k17 && !z17 && !aj6 && !Ui) {
                uVar.Ri(true);
            }
            uVar.Ni(z18);
        } else {
            java.lang.String r18 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getUsernameFromUserInfo(...)");
            uVar.Ui(r18, false);
        }
        return true;
    }
}
