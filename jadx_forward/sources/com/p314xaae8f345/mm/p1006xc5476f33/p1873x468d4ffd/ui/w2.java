package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230974d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230974d = activityC16554x70dcab5d;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230974d;
        int i18 = activityC16554x70dcab5d.f230764g;
        if (i18 == 1 || i18 == 2) {
            di3.n nVar = activityC16554x70dcab5d.f230766i;
            di3.g0 g0Var = nVar.f314272f;
            java.lang.String str2 = "";
            if (nVar.f314274h == null) {
                str = "";
            } else {
                try {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    android.hardware.Camera.Parameters c17 = nVar.f314274h.c();
                    boolean z17 = ai3.d.f86640a;
                    java.util.ArrayList arrayList = new java.util.ArrayList(c17.getSupportedPreviewSizes());
                    java.util.Collections.sort(arrayList, new ai3.c(null));
                    android.graphics.Point f17 = ai3.d.f(nVar.f314283t);
                    int i19 = 3;
                    stringBuffer.append(java.lang.String.format("Screen size %d %d r:%.4f\n", java.lang.Integer.valueOf(f17.x), java.lang.Integer.valueOf(f17.y), java.lang.Double.valueOf((f17.x * 1.0d) / f17.y)));
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
                        if ((nVar.e() == size.width && nVar.d() == size.height) || (nVar.e() == size.height && nVar.d() == size.width)) {
                            java.lang.Object[] objArr = new java.lang.Object[i19];
                            objArr[0] = java.lang.Integer.valueOf(size.width);
                            objArr[1] = java.lang.Integer.valueOf(size.height);
                            objArr[2] = java.lang.Double.valueOf((size.height * 1.0d) / size.width);
                            stringBuffer.append(java.lang.String.format("%s*%s √ r:%.4f\n", objArr));
                            i17 = 3;
                        } else {
                            i17 = 3;
                            stringBuffer.append(java.lang.String.format("%s*%s X r:%.4f\n", java.lang.Integer.valueOf(size.width), java.lang.Integer.valueOf(size.height), java.lang.Double.valueOf((size.height * 1.0d) / size.width)));
                        }
                        i19 = i17;
                    }
                    if (nVar.f314286w != null) {
                        stringBuffer.append("\nSIGHTCROPMODE:  " + nVar.f314286w.x + " " + nVar.f314286w.y + " from " + g0Var.f314244c + " " + g0Var.f314243b);
                    } else {
                        stringBuffer.append("\nFinalPreviewSize: " + nVar.e() + " " + nVar.d());
                    }
                    stringBuffer.append("\ngetOrientation:" + nVar.c());
                    stringBuffer.append("\nrecorderOption: " + wo.v1.f529362i.f529227h);
                    str = stringBuffer.toString();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCamera", "getDebugInfo error: %s", e17.getMessage());
                    str = null;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            java.lang.String str3 = str + "\n" + java.lang.String.format("CPU: cur %s max:%s", wo.r.d(), wo.r.e());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            sb6.append("\n");
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            int i27 = di3.w.f314303d.f314233a;
            if (i27 == 1) {
                str2 = "RECORDER_TYPE_FFMPEG";
            } else if (i27 == 2) {
                str2 = "ENCODER_MEDIACODEC";
            }
            objArr2[0] = str2;
            sb6.append(java.lang.String.format("RecorderType %s", objArr2));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.v2(activityC16554x70dcab5d, sb6.toString() + "\n" + java.lang.String.format("MemoryClass: %sMB, TotalMem: %sMB", java.lang.Integer.valueOf(((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass()), java.lang.Integer.valueOf(ai3.d.o(activityC16554x70dcab5d)))));
        }
    }
}
