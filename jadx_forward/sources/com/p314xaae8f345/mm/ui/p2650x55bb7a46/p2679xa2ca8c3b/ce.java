package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ce implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f285252b;

    public ce(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        this.f285251a = f9Var;
        this.f285252b = a0Var;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2000 && i18 == -1) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
            zy2.oc ocVar = zy2.oc.f559058a;
            this.f285252b.getClass();
            ocVar.a(this.f285251a, false, true, c17);
        }
    }
}
