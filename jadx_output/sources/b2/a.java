package b2;

/* loaded from: classes13.dex */
public class a implements java.text.CharacterIterator {

    /* renamed from: d, reason: collision with root package name */
    public final int f17267d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17268e;

    /* renamed from: f, reason: collision with root package name */
    public int f17269f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f17270g;

    public a(java.lang.CharSequence charSequence, int i17, int i18) {
        this.f17270g = charSequence;
        this.f17269f = i17;
        this.f17267d = i17;
        this.f17268e = i18;
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
        int i17 = this.f17269f;
        if (i17 == this.f17268e) {
            return (char) 65535;
        }
        return this.f17270g.charAt(i17);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f17269f = this.f17267d;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f17267d;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f17268e;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f17269f;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i17 = this.f17267d;
        int i18 = this.f17268e;
        if (i17 == i18) {
            this.f17269f = i18;
            return (char) 65535;
        }
        int i19 = i18 - 1;
        this.f17269f = i19;
        return this.f17270g.charAt(i19);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i17 = this.f17269f + 1;
        this.f17269f = i17;
        int i18 = this.f17268e;
        if (i17 < i18) {
            return this.f17270g.charAt(i17);
        }
        this.f17269f = i18;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i17 = this.f17269f;
        if (i17 <= this.f17267d) {
            return (char) 65535;
        }
        int i18 = i17 - 1;
        this.f17269f = i18;
        return this.f17270g.charAt(i18);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i17) {
        if (this.f17267d > i17 || i17 > this.f17268e) {
            throw new java.lang.IllegalArgumentException("invalid position");
        }
        this.f17269f = i17;
        return current();
    }
}
