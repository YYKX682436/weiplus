package ng1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f418450a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8 f418451b;

    public d(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v8 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f418450a = z17;
        this.f418451b = reason;
    }

    /* renamed from: equals */
    public boolean m149547xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.d)) {
            return false;
        }
        ng1.d dVar = (ng1.d) obj;
        return this.f418450a == dVar.f418450a && this.f418451b == dVar.f418451b;
    }

    /* renamed from: hashCode */
    public int m149548x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f418450a) * 31) + this.f418451b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149549x9616526c() {
        return "AwaitCgiSyncCondition(await=" + this.f418450a + ", reason=" + this.f418451b + ')';
    }
}
