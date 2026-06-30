package com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf;

/* renamed from: com.tencent.mm.pluginsdk.permission.PermissionHelper_Deprecated$AuxSupportFragment */
/* loaded from: classes13.dex */
public final class C19628xe37bd42a extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {
    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        if (m7482xefa32bc()) {
            return;
        }
        synchronized (j35.a0.f379030c) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.HashMap) j35.a0.f379031d).remove(java.lang.Integer.valueOf(i17)));
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        m7577x58a249bc(true);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        super.mo7516x953457f1(i17, strArr, iArr);
        if (m7482xefa32bc()) {
            return;
        }
        byte[] bArr = j35.a0.f379028a;
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        synchronized (j35.a0.f379028a) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.HashMap) j35.a0.f379029b).remove(java.lang.Integer.valueOf(i17)));
        }
    }
}
