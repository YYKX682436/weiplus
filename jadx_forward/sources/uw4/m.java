package uw4;

/* loaded from: classes8.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0 f513276b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.o0();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uw4.n f513277c;

    public m(uw4.n nVar) {
        this.f513277c = nVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuggageMMWebChromeClientProxy", "onPermissionRequest");
        uw4.n nVar = this.f513277c;
        android.app.Activity a17 = q75.a.a(nVar.getContext());
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "onPermissionRequest NULL activity");
        } else {
            this.f513276b.h(permissionRequest, a17, nVar.mo120156xb5887639());
        }
    }
}
