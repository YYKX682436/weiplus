package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes.dex */
public class q3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f146375a = false;

    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (this.f146375a) {
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "xlog had moved.", 0).show();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "action: wechat.shell.PULL_XLOG");
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "start to move xlog.", 0).show();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40540x580354d9();
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "xlog move success", 0).show();
        this.f146375a = true;
    }
}
