package b2;

/* loaded from: classes13.dex */
public class a implements java.text.CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f98800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98801e;

    /* renamed from: f, reason: collision with root package name */
    public int f98802f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f98803g;

    public a(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f98803g = charSequence;
        this.f98802f = i17;
        this.f98800d = i17;
        this.f98801e = i18;
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
        int i17 = this.f98802f;
        if (i17 == this.f98801e) {
            return (char) 65535;
        }
        return this.f98803g.charAt(i17);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f98802f = this.f98800d;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f98800d;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f98801e;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f98802f;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i17 = this.f98800d;
        int i18 = this.f98801e;
        if (i17 == i18) {
            this.f98802f = i18;
            return (char) 65535;
        }
        int i19 = i18 - 1;
        this.f98802f = i19;
        return this.f98803g.charAt(i19);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i17 = this.f98802f + 1;
        this.f98802f = i17;
        int i18 = this.f98801e;
        if (i17 < i18) {
            return this.f98803g.charAt(i17);
        }
        this.f98802f = i18;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i17 = this.f98802f;
        if (i17 <= this.f98800d) {
            return (char) 65535;
        }
        int i18 = i17 - 1;
        this.f98802f = i18;
        return this.f98803g.charAt(i18);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i17) {
        if (this.f98800d > i17 || i17 > this.f98801e) {
            throw new java.lang.IllegalArgumentException("invalid position");
        }
        this.f98802f = i17;
        return current();
    }
}
