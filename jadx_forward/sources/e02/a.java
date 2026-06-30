package e02;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f327378a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f327379b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Pair f327380c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.Pair f327381d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Pair f327382e;

    public void a() {
        android.util.Pair pair;
        boolean z17 = this.f327378a;
        if (!z17 || (pair = this.f327380c) == null || this.f327381d == null || this.f327382e == null) {
            throw new java.lang.RuntimeException("ApkSectionInfo paramters is not valid : " + m126557x9616526c());
        }
        if (!z17) {
            throw null;
        }
        if (!(((long) ((java.nio.ByteBuffer) pair.first).remaining()) + ((java.lang.Long) this.f327380c.second).longValue() == ((java.lang.Long) this.f327381d.second).longValue() && ((long) ((java.nio.ByteBuffer) this.f327381d.first).remaining()) + ((java.lang.Long) this.f327381d.second).longValue() == ((java.lang.Long) this.f327382e.second).longValue() && ((long) ((java.nio.ByteBuffer) this.f327382e.first).remaining()) + ((java.lang.Long) this.f327382e.second).longValue() == this.f327379b)) {
            throw new java.lang.RuntimeException("ApkSectionInfo paramters is not valid : " + m126557x9616526c());
        }
        android.util.Pair pair2 = this.f327382e;
        long d17 = e02.e.d((java.nio.ByteBuffer) pair2.first, ((java.lang.Long) pair2.second).longValue());
        if (d17 == ((java.lang.Long) this.f327381d.second).longValue()) {
            return;
        }
        throw new java.lang.RuntimeException("CentralDirOffset mismatch , EocdCentralDirOffset : " + d17 + ", centralDirOffset : " + this.f327381d.second);
    }

    /* renamed from: toString */
    public java.lang.String m126557x9616526c() {
        return "lowMemory : " + this.f327378a + "\n apkSize : " + this.f327379b + "\n contentEntry : null\n schemeV2Block : " + this.f327380c + "\n centralDir : " + this.f327381d + "\n eocd : " + this.f327382e;
    }
}
