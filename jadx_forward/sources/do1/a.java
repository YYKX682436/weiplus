package do1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f323602a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f323603b;

    public a(boolean z17, boolean z18) {
        this.f323602a = z17;
        this.f323603b = z18;
    }

    /* renamed from: equals */
    public boolean m125845xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do1.a)) {
            return false;
        }
        do1.a aVar = (do1.a) obj;
        return this.f323602a == aVar.f323602a && this.f323603b == aVar.f323603b;
    }

    /* renamed from: hashCode */
    public int m125846x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f323602a) * 31) + java.lang.Boolean.hashCode(this.f323603b);
    }

    /* renamed from: toString */
    public java.lang.String m125847x9616526c() {
        return "BackupExtraInfo(isRoam=" + this.f323602a + ", isTextOnly=" + this.f323603b + ')';
    }
}
