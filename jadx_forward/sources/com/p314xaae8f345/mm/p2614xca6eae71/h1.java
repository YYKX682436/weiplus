package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class h1 implements com.p314xaae8f345.mm.p2614xca6eae71.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f274799a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f274800b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f274801c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f274802d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f274803e;

    public h1(int i17, java.lang.String key, java.lang.String text, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f274799a = i17;
        this.f274800b = key;
        this.f274801c = text;
        this.f274802d = str;
        int length = text.length();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        while (i18 < length) {
            int codePointAt = text.codePointAt(i18);
            linkedList.add(java.lang.Integer.valueOf(codePointAt));
            i18 += java.lang.Character.charCount(codePointAt);
        }
        this.f274803e = kz5.n0.R0(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.a1
    public int[] a() {
        return this.f274803e;
    }
}
