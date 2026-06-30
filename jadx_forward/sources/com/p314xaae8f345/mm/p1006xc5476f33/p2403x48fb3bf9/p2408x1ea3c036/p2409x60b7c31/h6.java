package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class h6 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i6 f263864a;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i6 i6Var) {
        this.f263864a = i6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f6
    public void a(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.i6 i6Var = this.f263864a;
        sw4.e eVar = i6Var.f263881b;
        if (eVar != null) {
            if (!z17) {
                eVar.f(null);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("media_id", str);
            bundle.putString("media_url", str2);
            i6Var.f263881b.f(bundle);
        }
    }
}
