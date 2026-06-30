package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class jo extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> f131575a;

    private jo(java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList) {
        this.f131575a = arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm
    public final boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar) {
        if (this.f131575a.isEmpty()) {
            return true;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm jmVar = this.f131575a.get(0);
        if (jmVar.a(jpVar)) {
            this.f131575a.remove(jmVar);
        }
        return this.f131575a.isEmpty();
    }
}
