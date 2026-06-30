package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public class x implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.y f150383d;

    public x(com.p314xaae8f345.mm.p849xbf8d97c1.y yVar) {
        this.f150383d = yVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.mm.p849xbf8d97c1.o oVar = this.f150383d.f150387g;
        oVar.f150371m.postDelayed(oVar.f150370i, 3600000L);
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.mm.p849xbf8d97c1.o oVar = this.f150383d.f150387g;
        oVar.f150371m.removeCallbacks(oVar.f150370i);
    }
}
