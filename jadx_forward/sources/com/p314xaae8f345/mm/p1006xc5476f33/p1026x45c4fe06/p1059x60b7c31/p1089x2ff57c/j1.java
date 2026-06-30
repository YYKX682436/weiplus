package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public class j1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f162606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n1 f162608d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n1 n1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.content.Context context, int i17) {
        this.f162608d = n1Var;
        this.f162605a = lVar;
        this.f162606b = context;
        this.f162607c = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult openResult = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.C12105x9a9f8a9.OpenResult) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162605a;
        if (lVar.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n1 n1Var = this.f162608d;
            if (openResult == null || (i17 = openResult.f162556d) == 2147483645) {
                str = "fail env error";
            } else if (i17 != 0) {
                switch (i17) {
                    case 2147483646:
                        str = "fail no third apps supported";
                        break;
                    case Integer.MAX_VALUE:
                        str = "fail user cancel";
                        break;
                    default:
                        str = "fail file type not supported " + openResult.f162556d;
                        break;
                }
            } else {
                n1Var.f162635h = new rh1.a(new ak3.i((android.app.Activity) this.f162606b));
                str = "ok";
            }
            lVar.a(this.f162607c, n1Var.o(str));
        }
    }
}
