package j9;

/* loaded from: classes15.dex */
public final class d extends i9.a implements java.lang.Comparable {

    /* renamed from: g, reason: collision with root package name */
    public final int f379824g;

    public d(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f17, int i17, int i18, float f18, int i19, float f19, boolean z17, int i27, int i28) {
        super(charSequence, alignment, f17, i17, i18, f18, i19, f19, z17, i27);
        this.f379824g = i28;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        int i17 = ((j9.d) obj).f379824g;
        int i18 = this.f379824g;
        if (i17 < i18) {
            return -1;
        }
        return i17 > i18 ? 1 : 0;
    }
}
