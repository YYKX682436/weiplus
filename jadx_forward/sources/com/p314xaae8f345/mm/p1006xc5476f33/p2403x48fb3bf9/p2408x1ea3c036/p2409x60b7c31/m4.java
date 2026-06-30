package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class m4 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f263930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263932c;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, java.lang.String str, android.content.Context context) {
        this.f263930a = q5Var;
        this.f263931b = str;
        this.f263932c = context;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f263930a;
            if (i18 == -1) {
                q5Var.a(null, null);
                z17 = true;
            } else {
                z17 = false;
            }
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20, 2001, 3, z17 ? 48 : 56, 0, this.f263931b);
            ((q80.z) this.f263932c).R1(null);
            q5Var.a("cancel", null);
        }
    }
}
