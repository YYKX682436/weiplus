package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class a1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f151956d;

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int size = com.p314xaae8f345.mm.p943x351df9c2.b1.f151958a.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoveAvatarTask", "RemoveOldAvatar left count:" + size);
        if (size <= 2000 || com.p314xaae8f345.mm.p943x351df9c2.b1.f151959b >= 300) {
            java.lang.Runnable runnable = this.f151956d;
            if (runnable != null) {
                runnable.run();
            }
            com.p314xaae8f345.mm.p943x351df9c2.b1.f151959b = 0;
            return false;
        }
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        for (int i17 = size - 1; i17 >= size - 30; i17--) {
            com.p314xaae8f345.mm.p943x351df9c2.b1.f151959b++;
            java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.p943x351df9c2.b1.f151958a.get(i17);
            com.p314xaae8f345.mm.p943x351df9c2.b1.f151958a.remove(i17);
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str, false);
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().p(str, true);
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().u0(str);
        }
        gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        return true;
    }
}
