package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f294565a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294566b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.x1 f294567c;

    public k6(int i17, java.lang.String str, com.p314xaae8f345.mm.vfs.x1 entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        this.f294565a = i17;
        this.f294566b = str;
        this.f294567c = entry;
    }

    public final com.p314xaae8f345.mm.vfs.x1 a() {
        return this.f294567c;
    }

    public final java.lang.String b() {
        return this.f294566b;
    }

    public final int c() {
        return this.f294565a;
    }

    /* renamed from: equals */
    public boolean m82421xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.k6)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.k6 k6Var = (com.p314xaae8f345.mm.vfs.k6) obj;
        return this.f294565a == k6Var.f294565a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294566b, k6Var.f294566b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294567c, k6Var.f294567c);
    }

    /* renamed from: hashCode */
    public int m82422x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f294565a) * 31;
        java.lang.String str = this.f294566b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f294567c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m82423x9616526c() {
        return "TaggedFileEntry(tag=" + this.f294565a + ", fsName=" + this.f294566b + ", entry=" + this.f294567c + ')';
    }
}
