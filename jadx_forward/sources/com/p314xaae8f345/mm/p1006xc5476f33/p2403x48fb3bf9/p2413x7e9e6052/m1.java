package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f264854a = new java.util.LinkedList();

    public final void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        synchronized (this.f264854a) {
            java.lang.String str2 = (java.lang.String) this.f264854a.peekLast();
            java.lang.String encode = java.net.URLEncoder.encode(str);
            if (str2 == null || !str2.equals(encode)) {
                this.f264854a.addLast(encode);
            }
            if (this.f264854a.size() > 10) {
                this.f264854a.removeFirst();
            }
        }
    }

    public java.lang.String[] b() {
        java.lang.String[] strArr;
        synchronized (this.f264854a) {
            strArr = new java.lang.String[this.f264854a.size()];
            java.util.Iterator it = this.f264854a.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                strArr[i17] = (java.lang.String) it.next();
                i17++;
            }
        }
        return strArr;
    }
}
