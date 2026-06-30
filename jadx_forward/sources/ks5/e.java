package ks5;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f393382a;

    /* renamed from: b, reason: collision with root package name */
    public int f393383b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f393384c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f393385d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f393386e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f393387f;

    public e(java.lang.Class cls) {
        this.f393382a = cls;
    }

    public java.lang.Object a(int i17, int i18) {
        for (int i19 = 0; i19 < this.f393383b; i19++) {
            if (this.f393385d[i19] < i18 && this.f393386e[i19] > i17) {
                return this.f393384c[i19];
            }
        }
        return null;
    }

    public void b(android.text.Spanned spanned, int i17, int i18) {
        java.lang.Object[] objArr;
        java.lang.Class cls = this.f393382a;
        java.lang.Object[] spans = spanned.getSpans(i17, i18, cls);
        int length = spans.length;
        if (length > 0 && ((objArr = this.f393384c) == null || objArr.length < length)) {
            this.f393384c = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, length);
            this.f393385d = new int[length];
            this.f393386e = new int[length];
            this.f393387f = new int[length];
        }
        this.f393383b = 0;
        for (java.lang.Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart != spanEnd) {
                int spanFlags = spanned.getSpanFlags(obj);
                java.lang.Object[] objArr2 = this.f393384c;
                int i19 = this.f393383b;
                objArr2[i19] = obj;
                this.f393385d[i19] = spanStart;
                this.f393386e[i19] = spanEnd;
                this.f393387f[i19] = spanFlags;
                this.f393383b = i19 + 1;
            }
        }
    }
}
