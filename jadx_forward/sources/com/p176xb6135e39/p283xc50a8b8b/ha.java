package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class ha {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Appendable f126702a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f126703b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f126704c = false;

    public ha(java.lang.Appendable appendable, boolean z17, com.p176xb6135e39.p283xc50a8b8b.da daVar) {
        this.f126702a = appendable;
    }

    public void a() {
        this.f126702a.append("\n");
        this.f126704c = true;
    }

    public void b() {
        java.lang.StringBuilder sb6 = this.f126703b;
        int length = sb6.length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException(" Outdent() without matching Indent().");
        }
        sb6.setLength(length - 2);
    }

    public void c(java.lang.CharSequence charSequence) {
        boolean z17 = this.f126704c;
        java.lang.Appendable appendable = this.f126702a;
        if (z17) {
            this.f126704c = false;
            appendable.append(this.f126703b);
        }
        appendable.append(charSequence);
    }
}
