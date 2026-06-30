package oq;

/* loaded from: classes12.dex */
public final class a implements com.p314xaae8f345.mm.p2614xca6eae71.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final f21.e f428827a;

    /* renamed from: b, reason: collision with root package name */
    public final f21.f f428828b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f428829c;

    public a(f21.e eggInfo, int i17, f21.f keyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eggInfo, "eggInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f428827a = eggInfo;
        this.f428828b = keyword;
        java.lang.String keyWord = keyword.f340424d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyWord, "keyWord");
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = keyWord.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        int length = lowerCase.length();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        while (i18 < length) {
            int codePointAt = lowerCase.codePointAt(i18);
            linkedList.add(java.lang.Integer.valueOf(codePointAt));
            i18 += java.lang.Character.charCount(codePointAt);
        }
        this.f428829c = kz5.n0.R0(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.a1
    public int[] a() {
        return this.f428829c;
    }
}
