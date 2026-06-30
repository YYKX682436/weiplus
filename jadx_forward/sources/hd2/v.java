package hd2;

/* loaded from: classes8.dex */
public final class v implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f362073e;

    public v(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e) {
        this.f362072d = context;
        this.f362073e = c14133xabc4217e;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        if (i17 == 1014) {
            java.lang.String str = (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames")) == null) ? null : (java.lang.String) kz5.n0.Z(stringArrayListExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, this.f362072d, "share_comment", false, this.f362073e.o0(i18 == -1 ? 0 : 1, str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? 3 : 2), 4, null);
        }
    }
}
