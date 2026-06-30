package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m f272799d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m();

    /* renamed from: a, reason: collision with root package name */
    public int f272800a;

    /* renamed from: b, reason: collision with root package name */
    public int f272801b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l f272802c;

    public void a(java.lang.String str) {
        if (this.f272802c == null) {
            this.f272802c = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l(this, null);
        }
        char[] charArray = str.toUpperCase().toCharArray();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l lVar = this.f272802c;
        for (int i17 = 0; i17 < charArray.length; i17++) {
            char c17 = charArray[i17];
            this.f272800a++;
            int i18 = c17 <= '9' ? c17 - '0' : (c17 - 'A') + 10;
            if (lVar.f272782b == null) {
                lVar.f272782b = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l[36];
                this.f272801b += 36;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l[] lVarArr = lVar.f272782b;
            if (lVarArr[i18] == null) {
                lVarArr[i18] = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l(this, null);
                this.f272801b++;
            }
            lVar = lVarArr[i18];
            if (i17 == charArray.length - 1) {
                lVar.f272781a = true;
            }
        }
    }
}
