package kl5;

/* loaded from: classes13.dex */
public class a implements java.text.CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f390506d;

    /* renamed from: e, reason: collision with root package name */
    public final int f390507e;

    /* renamed from: f, reason: collision with root package name */
    public int f390508f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f390509g;

    public a(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f390509g = charSequence;
        this.f390508f = i17;
        this.f390506d = i17;
        this.f390507e = i18;
    }

    @Override // java.text.CharacterIterator
    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i17 = this.f390508f;
        if (i17 == this.f390507e) {
            return (char) 65535;
        }
        return this.f390509g.charAt(i17);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f390508f = this.f390506d;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f390506d;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f390507e;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f390508f;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i17 = this.f390506d;
        int i18 = this.f390507e;
        if (i17 == i18) {
            this.f390508f = i18;
            return (char) 65535;
        }
        int i19 = i18 - 1;
        this.f390508f = i19;
        return this.f390509g.charAt(i19);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i17 = this.f390508f + 1;
        this.f390508f = i17;
        int i18 = this.f390507e;
        if (i17 < i18) {
            return this.f390509g.charAt(i17);
        }
        this.f390508f = i18;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i17 = this.f390508f;
        if (i17 <= this.f390506d) {
            return (char) 65535;
        }
        int i18 = i17 - 1;
        this.f390508f = i18;
        return this.f390509g.charAt(i18);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i17) {
        if (this.f390506d > i17 || i17 > this.f390507e) {
            return current();
        }
        this.f390508f = i17;
        return current();
    }
}
