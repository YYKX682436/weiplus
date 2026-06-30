package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class bm implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component {

    /* renamed from: a, reason: collision with root package name */
    final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn, java.lang.Boolean> f130524a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn f130525b;

    private int e() {
        return this.f130524a.size();
    }

    public void a(android.content.Context context) {
    }

    public void b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
    }

    public final void b_() {
        c_();
        if (this.f130524a.size() <= 0) {
            this.f130525b = null;
        }
    }

    public void c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
    }

    public synchronized void c_() {
    }

    public synchronized void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        if (bnVar != null) {
            this.f130524a.remove(bnVar);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component
    /* renamed from: n_, reason: merged with bridge method [inline-methods] */
    public final synchronized com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9() {
        return this.f130525b;
    }

    public synchronized void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        if (bnVar != null) {
            this.f130524a.put(bnVar, java.lang.Boolean.TRUE);
        }
        a(bnVar, null);
    }

    public final android.content.Context c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9 = mo36621x2de760a9();
        if (mo36621x2de760a9 != null) {
            return mo36621x2de760a9.mo36630x76847179();
        }
        return null;
    }

    public synchronized void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, android.os.Bundle bundle) {
        if (this.f130524a.size() == 0) {
            return;
        }
        this.f130525b = bnVar;
    }
}
