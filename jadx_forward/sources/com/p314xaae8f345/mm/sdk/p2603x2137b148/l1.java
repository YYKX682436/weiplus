package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes10.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f274350a = true;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceGpuUtil", "setMaxTextureGet: %s, canGetTextureSize %s.", java.lang.Boolean.TRUE, true);
        if (f274350a) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v1 v1Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.u1.f274536a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GPU_TAG", "pennqin, updateTextureMaxSize, before: %s.", java.lang.Integer.valueOf(v1Var.f274566a));
            try {
                v1Var.a();
                int[] iArr = new int[1];
                android.opengl.GLES10.glGetIntegerv(3379, iArr, 0);
                int i17 = iArr[0];
                v1Var.f274566a = i17 > 2048 ? i17 : 2048;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GPU_TAG", "pennqin, get max texture size: %s %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v1Var.f274566a));
                f274350a = false;
                try {
                    v1Var.b();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GPU_TAG", th6, "release err: %s", th6.getMessage());
                }
            } catch (java.lang.Throwable th7) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GPU_TAG", th7, "err: %s", th7.getMessage());
                    f274350a = false;
                    try {
                        v1Var.b();
                    } catch (java.lang.Throwable th8) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GPU_TAG", th8, "release err: %s", th8.getMessage());
                    }
                } catch (java.lang.Throwable th9) {
                    f274350a = false;
                    try {
                        v1Var.b();
                    } catch (java.lang.Throwable th10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GPU_TAG", th10, "release err: %s", th10.getMessage());
                    }
                    throw th9;
                }
            }
        }
    }
}
