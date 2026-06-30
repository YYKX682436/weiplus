package mn0;

/* loaded from: classes3.dex */
public abstract class a0 implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {
    public void a(int i17, int i18) {
    }

    public abstract void b();

    public void c() {
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        if (i17 == 2009) {
            a(bundle != null ? bundle.getInt("EVT_PARAM1") : 0, bundle != null ? bundle.getInt("EVT_PARAM2") : 0);
        } else if (i17 == 2033) {
            b();
        } else {
            if (i17 != 2103) {
                return;
            }
            c();
        }
    }
}
