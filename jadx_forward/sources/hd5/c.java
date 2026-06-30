package hd5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f362122a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362123b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f362124c;

    public c(boolean z17, java.lang.String afterReplaceContent, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterReplaceContent, "afterReplaceContent");
        this.f362122a = z17;
        this.f362123b = afterReplaceContent;
        this.f362124c = z18;
    }

    /* renamed from: equals */
    public boolean m133229xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd5.c)) {
            return false;
        }
        hd5.c cVar = (hd5.c) obj;
        return this.f362122a == cVar.f362122a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362123b, cVar.f362123b) && this.f362124c == cVar.f362124c;
    }

    /* renamed from: hashCode */
    public int m133230x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f362122a) * 31) + this.f362123b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f362124c);
    }

    /* renamed from: toString */
    public java.lang.String m133231x9616526c() {
        return "ProcessTextInfo(isNeedReplace=" + this.f362122a + ", afterReplaceContent=" + this.f362123b + ", isSpecialForNeatText=" + this.f362124c + ')';
    }
}
