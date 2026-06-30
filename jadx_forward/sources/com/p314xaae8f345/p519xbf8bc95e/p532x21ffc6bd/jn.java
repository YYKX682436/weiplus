package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class jn extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> f131574a;

    private jn(java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> arrayList) {
        this.f131574a = arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm
    public final boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jp jpVar) {
        if (this.f131574a.isEmpty()) {
            return true;
        }
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jm> it = this.f131574a.iterator();
        while (it.hasNext()) {
            it.next().a(jpVar);
        }
        return true;
    }
}
