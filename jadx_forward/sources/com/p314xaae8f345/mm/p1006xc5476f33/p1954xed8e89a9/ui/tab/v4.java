package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f236156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 f236157e;

    public v4(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90) {
        this.f236156d = o4Var;
        this.f236157e = c16892x4a36dc90;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "checkCrash clear crash flag");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = this.f236157e;
        this.f236156d.G(c16892x4a36dc90.f235750w, false);
        c16892x4a36dc90.f235749v = false;
    }
}
