package jc1;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f380436a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f380437b;

    public d(int i17) {
        this(i17, null);
    }

    /* renamed from: equals */
    public boolean m140611xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jc1.d.class == obj.getClass() && this.f380436a == ((jc1.d) obj).f380436a;
    }

    /* renamed from: hashCode */
    public int m140612x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f380436a));
    }

    /* renamed from: toString */
    public java.lang.String m140613x9616526c() {
        return "ErrorInfo{errno=" + this.f380436a + ", errMsg='" + this.f380437b + "'}";
    }

    public d(int i17, java.lang.String str) {
        this.f380436a = i17;
        this.f380437b = str;
    }
}
