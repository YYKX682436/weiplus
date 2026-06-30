package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes12.dex */
public abstract class a2 {
    public static boolean a(java.io.File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.getName().contains("xweb_sandbox_crash") || file.getName().contains("xweb_gpu_crash") || file.getName().contains("xweb_render_crash");
    }
}
