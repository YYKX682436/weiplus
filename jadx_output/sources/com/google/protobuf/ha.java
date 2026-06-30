package com.google.protobuf;

/* loaded from: classes16.dex */
public final class ha {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Appendable f45169a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f45170b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f45171c = false;

    public ha(java.lang.Appendable appendable, boolean z17, com.google.protobuf.da daVar) {
        this.f45169a = appendable;
    }

    public void a() {
        this.f45169a.append("\n");
        this.f45171c = true;
    }

    public void b() {
        java.lang.StringBuilder sb6 = this.f45170b;
        int length = sb6.length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException(" Outdent() without matching Indent().");
        }
        sb6.setLength(length - 2);
    }

    public void c(java.lang.CharSequence charSequence) {
        boolean z17 = this.f45171c;
        java.lang.Appendable appendable = this.f45169a;
        if (z17) {
            this.f45171c = false;
            appendable.append(this.f45170b);
        }
        appendable.append(charSequence);
    }
}
