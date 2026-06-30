package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes12.dex */
public class l1 implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f150638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.m1 f150639b;

    public l1(com.p314xaae8f345.mm.p874xaefb6cc9.m1 m1Var, java.lang.String str) {
        this.f150639b = m1Var;
        this.f150638a = str;
    }

    public final void a(int i17, java.lang.String str, java.lang.Throwable th6) {
        java.lang.String valueOf = java.lang.String.valueOf(this.f150638a);
        if (!com.p314xaae8f345.mm.p874xaefb6cc9.m1.f150643d.get()) {
            synchronized (this.f150639b.f150645b) {
                this.f150639b.f150645b.add(new com.p314xaae8f345.mm.p874xaefb6cc9.k1(i17, valueOf, str, th6));
            }
            return;
        }
        if (i17 == 1) {
            if (th6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(valueOf, str);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(valueOf, th6, str, new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 2) {
            if (th6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(valueOf, str);
                return;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.h(valueOf, th6, str, new java.lang.Object[0]);
                return;
            }
        }
        if (i17 == 3) {
            if (th6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(valueOf, str);
                return;
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.g(valueOf, th6, str, new java.lang.Object[0]);
                return;
            }
        }
        if ((i17 == 4 || i17 == 5) && th6 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.b(valueOf, th6, str, new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: debug */
    public void mo46941x5b09653(java.lang.String str) {
        a(4, str, null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: error */
    public void mo46946x5c4d208(java.lang.String str) {
        a(1, str, null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: flush */
    public void mo46951x5d03b04() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: getName */
    public java.lang.String mo46952xfb82e301() {
        return this.f150638a;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: info */
    public void mo46953x3164ae(java.lang.String str) {
        a(3, str, null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: isDebugEnabled */
    public boolean mo46958xa8834bb8() {
        return true;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: isErrorEnabled */
    public boolean mo46959x817b6a63() {
        return true;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: isInfoEnabled */
    public boolean mo46960xd67f5b29() {
        return true;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: isTraceEnabled */
    public boolean mo46961x825f1c86() {
        return true;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: isWarnEnabled */
    public boolean mo46962x1e9a6a51() {
        return true;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: trace */
    public void mo46963x697f145(java.lang.String str) {
        a(5, str, null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: warn */
    public void mo46968x379286(java.lang.String str) {
        a(2, str, null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: debug */
    public void mo46942x5b09653(java.lang.String str, java.lang.Object obj) {
        a(4, java.lang.String.format(str, obj), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: error */
    public void mo46947x5c4d208(java.lang.String str, java.lang.Object obj) {
        a(1, java.lang.String.format(str, obj), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: info */
    public void mo46954x3164ae(java.lang.String str, java.lang.Object obj) {
        a(3, java.lang.String.format(str, obj), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: trace */
    public void mo46964x697f145(java.lang.String str, java.lang.Object obj) {
        a(5, java.lang.String.format(str, obj), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: warn */
    public void mo46969x379286(java.lang.String str, java.lang.Object obj) {
        a(2, java.lang.String.format(str, obj), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: debug */
    public void mo46943x5b09653(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(4, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: error */
    public void mo46948x5c4d208(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(1, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: info */
    public void mo46955x3164ae(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(3, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: trace */
    public void mo46965x697f145(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(5, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: warn */
    public void mo46970x379286(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        a(2, java.lang.String.format(str, obj, obj2), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: debug */
    public void mo46945x5b09653(java.lang.String str, java.lang.Object... objArr) {
        a(4, java.lang.String.format(str, objArr), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: error */
    public void mo46950x5c4d208(java.lang.String str, java.lang.Object... objArr) {
        a(1, java.lang.String.format(str, objArr), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: info */
    public void mo46957x3164ae(java.lang.String str, java.lang.Object... objArr) {
        a(3, java.lang.String.format(str, objArr), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: trace */
    public void mo46967x697f145(java.lang.String str, java.lang.Object... objArr) {
        a(5, java.lang.String.format(str, objArr), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: warn */
    public void mo46972x379286(java.lang.String str, java.lang.Object... objArr) {
        a(2, java.lang.String.format(str, objArr), null);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: debug */
    public void mo46944x5b09653(java.lang.String str, java.lang.Throwable th6) {
        a(4, str, th6);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: error */
    public void mo46949x5c4d208(java.lang.String str, java.lang.Throwable th6) {
        a(1, str, th6);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: info */
    public void mo46956x3164ae(java.lang.String str, java.lang.Throwable th6) {
        a(3, str, th6);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: trace */
    public void mo46966x697f145(java.lang.String str, java.lang.Throwable th6) {
        a(5, str, th6);
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0
    /* renamed from: warn */
    public void mo46971x379286(java.lang.String str, java.lang.Throwable th6) {
        a(2, str, th6);
    }
}
