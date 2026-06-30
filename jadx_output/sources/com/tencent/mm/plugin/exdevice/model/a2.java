package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public enum a2 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f98846d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f98847e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f98848f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f98849g;

    a2() {
        long j17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0).getLong(gm0.j1.b().h() + "", 0L);
        if (j17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "this user has update bound device, last time is %d", java.lang.Long.valueOf(j17));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "the user has not update bound device yet");
        }
    }

    public static void a(com.tencent.mm.plugin.exdevice.model.a2 a2Var, v32.b bVar) {
        java.lang.String str;
        a2Var.getClass();
        if (bVar == null || (str = bVar.field_connProto) == null) {
            return;
        }
        if (str.contains("1") || bVar.field_connProto.contains("3")) {
            com.tencent.mm.plugin.exdevice.model.l3.Bi().b(bVar.field_mac);
        }
    }

    public boolean d(boolean z17) {
        if (this.f98847e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound device now, just leave");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0).getLong(gm0.j1.b().h() + "", 0L);
        if (z17 || currentTimeMillis - j17 >= 86400000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardDevices not now pp");
        return false;
    }

    public boolean e(boolean z17) {
        if (this.f98848f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound iotDevice now, just leave");
            return false;
        }
        if (z17) {
            return true;
        }
        if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.M("exdevice_kv").getLong(gm0.j1.b().h() + "_iot", 0L) >= 86400000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardIotDevices not now");
        return false;
    }

    public void f(android.content.Context context, com.tencent.mm.plugin.exdevice.model.z1 z1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetBoundHardDevices");
        if (this.f98847e) {
            if (this.f98849g == null) {
                this.f98849g = new java.lang.ref.WeakReference(z1Var);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting bound device now, just leave");
            return;
        }
        com.tencent.mm.plugin.exdevice.model.h2 h2Var = new com.tencent.mm.plugin.exdevice.model.h2(1);
        if (context != null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
            android.app.ProgressDialog progressDialog = this.f98846d;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f98846d.dismiss();
                this.f98846d = null;
            }
            boolean z17 = false;
            try {
                java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
                if (!com.tencent.mm.ui.LauncherUI.class.isInstance(context)) {
                    int i17 = com.tencent.mm.ui.chatting.ChattingUI.f198253t;
                    if (!com.tencent.mm.ui.chatting.ChattingUI.class.isInstance(context)) {
                        int i18 = com.tencent.mm.ui.conversation.BaseConversationUI.f207286d;
                        if (!com.tencent.mm.ui.conversation.BaseConversationUI.class.isInstance(context)) {
                            z17 = true;
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.GetBoundDeviceLogic", th6, "", new java.lang.Object[0]);
            }
            if (z17) {
                this.f98846d = db5.e1.R(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.i_b), true, true, new com.tencent.mm.plugin.exdevice.model.w1(this, h2Var, z1Var));
            }
        }
        this.f98849g = new java.lang.ref.WeakReference(z1Var);
        gm0.j1.n().f273288b.g(h2Var);
        this.f98847e = true;
    }

    public void h() {
        if (this.f98848f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting iot device now, just leave");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetUserBindIotDevices");
        gm0.j1.n().f273288b.c(6693);
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.j2());
        this.f98848f = true;
    }

    public void i(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", java.lang.Long.valueOf(j17));
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("exdevice_pref", 0).edit().putLong(gm0.j1.b().h() + "", j17).commit();
    }
}
