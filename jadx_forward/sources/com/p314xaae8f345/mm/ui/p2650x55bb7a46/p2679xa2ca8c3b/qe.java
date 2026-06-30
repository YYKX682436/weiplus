package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class qe implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f286883b;

    public qe(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        this.f286882a = f9Var;
        this.f286883b = a0Var;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2000 && i18 == -1) {
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null, "");
            zy2.oc ocVar = zy2.oc.f559058a;
            this.f286883b.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286882a;
            boolean z17 = f9Var.mo78013xfb85f7b0() == 1040187441;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            ocVar.a(f9Var, false, z17, c17);
        }
    }
}
