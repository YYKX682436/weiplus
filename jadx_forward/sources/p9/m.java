package p9;

/* loaded from: classes15.dex */
public final class m implements i9.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f434388d;

    /* renamed from: e, reason: collision with root package name */
    public final int f434389e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f434390f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f434391g;

    public m(java.util.List list) {
        this.f434388d = list;
        int size = list.size();
        this.f434389e = size;
        this.f434390f = new long[size * 2];
        for (int i17 = 0; i17 < this.f434389e; i17++) {
            p9.g gVar = (p9.g) list.get(i17);
            int i18 = i17 * 2;
            long[] jArr = this.f434390f;
            jArr[i18] = gVar.f434369g;
            jArr[i18 + 1] = gVar.f434370h;
        }
        long[] jArr2 = this.f434390f;
        long[] copyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.f434391g = copyOf;
        java.util.Arrays.sort(copyOf);
    }

    @Override // i9.d
    public long a(int i17) {
        t9.a.a(i17 >= 0);
        long[] jArr = this.f434391g;
        t9.a.a(i17 < jArr.length);
        return jArr[i17];
    }

    @Override // i9.d
    public int h() {
        return this.f434391g.length;
    }

    @Override // i9.d
    public int i(long j17) {
        long[] jArr = this.f434391g;
        int b17 = t9.d0.b(jArr, j17, false, false);
        if (b17 < jArr.length) {
            return b17;
        }
        return -1;
    }

    @Override // i9.d
    public java.util.List j(long j17) {
        java.util.ArrayList arrayList;
        p9.g gVar = null;
        android.text.SpannableStringBuilder spannableStringBuilder = null;
        java.util.ArrayList arrayList2 = null;
        for (int i17 = 0; i17 < this.f434389e; i17++) {
            int i18 = i17 * 2;
            long[] jArr = this.f434390f;
            if (jArr[i18] <= j17 && j17 < jArr[i18 + 1]) {
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                p9.g gVar2 = (p9.g) this.f434388d.get(i17);
                if (!(gVar2.f371199e == Float.MIN_VALUE && gVar2.f371200f == Float.MIN_VALUE)) {
                    arrayList2.add(gVar2);
                } else if (gVar == null) {
                    gVar = gVar2;
                } else {
                    java.lang.CharSequence charSequence = gVar2.f371198d;
                    if (spannableStringBuilder == null) {
                        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                        spannableStringBuilder2.append(gVar.f371198d).append((java.lang.CharSequence) "\n").append(charSequence);
                        spannableStringBuilder = spannableStringBuilder2;
                    } else {
                        spannableStringBuilder.append((java.lang.CharSequence) "\n").append(charSequence);
                    }
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList = arrayList2;
            arrayList.add(new p9.g(0L, 0L, spannableStringBuilder, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
        } else {
            arrayList = arrayList2;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList != null ? arrayList : java.util.Collections.emptyList();
    }
}
