package w6;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Appendable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Appendable f524740d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f524741e = true;

    public s0(java.lang.Appendable appendable) {
        this.f524740d = appendable;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(char c17) {
        boolean z17 = this.f524741e;
        java.lang.Appendable appendable = this.f524740d;
        if (z17) {
            this.f524741e = false;
            appendable.append("  ");
        }
        this.f524741e = c17 == '\n';
        appendable.append(c17);
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z17 = this.f524741e;
        java.lang.Appendable appendable = this.f524740d;
        boolean z18 = false;
        if (z17) {
            this.f524741e = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i18 - 1) == '\n') {
            z18 = true;
        }
        this.f524741e = z18;
        appendable.append(charSequence, i17, i18);
        return this;
    }
}
