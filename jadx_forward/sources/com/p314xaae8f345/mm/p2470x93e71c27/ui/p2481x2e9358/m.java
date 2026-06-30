package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class m implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 f272009a;

    public m(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083) {
        this.f272009a = c19664x489a3083;
    }

    public int a(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = this.f272009a;
        int i18 = c19664x489a3083.f271478w;
        if (i17 >= i18) {
            return (i17 < i18 || i17 >= c19664x489a3083.f271479x) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int length = c19664x489a3083.f271466i.length;
        int i19 = 0;
        for (int i27 = 0; i27 < length; i27++) {
            if (c19664x489a3083.f271466i[i27]) {
                if (i19 == i17) {
                    return i27;
                }
                i19++;
            }
        }
        return Integer.MAX_VALUE;
    }
}
