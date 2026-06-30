package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class a1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f70423d;

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int size = com.tencent.mm.modelavatar.b1.f70425a.size();
        com.tencent.mars.xlog.Log.e("MicroMsg.RemoveAvatarTask", "RemoveOldAvatar left count:" + size);
        if (size <= 2000 || com.tencent.mm.modelavatar.b1.f70426b >= 300) {
            java.lang.Runnable runnable = this.f70423d;
            if (runnable != null) {
                runnable.run();
            }
            com.tencent.mm.modelavatar.b1.f70426b = 0;
            return false;
        }
        long F = gm0.j1.u().f273153f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        for (int i17 = size - 1; i17 >= size - 30; i17--) {
            com.tencent.mm.modelavatar.b1.f70426b++;
            java.lang.String str = (java.lang.String) com.tencent.mm.modelavatar.b1.f70425a.get(i17);
            com.tencent.mm.modelavatar.b1.f70425a.remove(i17);
            com.tencent.mm.modelavatar.d1.Ai().p(str, false);
            com.tencent.mm.modelavatar.d1.Ai().p(str, true);
            com.tencent.mm.modelavatar.d1.Ni().u0(str);
        }
        gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
        return true;
    }
}
