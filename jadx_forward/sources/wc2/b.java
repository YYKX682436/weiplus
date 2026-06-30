package wc2;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f526035a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f526036b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f526037c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f526038d = -1;

    /* renamed from: clone */
    public java.lang.Object m173453x5a5dd5d() {
        wc2.b bVar = new wc2.b();
        bVar.f526035a = this.f526035a;
        bVar.f526036b = this.f526036b;
        bVar.f526037c = this.f526037c;
        bVar.f526038d = this.f526038d;
        return bVar;
    }

    /* renamed from: equals */
    public boolean m173454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wc2.b.class != obj.getClass()) {
            return false;
        }
        wc2.b bVar = (wc2.b) obj;
        return this.f526035a == bVar.f526035a && this.f526036b == bVar.f526036b && this.f526037c == bVar.f526037c && this.f526038d == bVar.f526038d;
    }

    /* renamed from: hashCode */
    public int m173455x8cdac1b() {
        return (((((this.f526035a * 31) + this.f526036b) * 31) + this.f526037c) * 31) + this.f526038d;
    }

    /* renamed from: toString */
    public java.lang.String m173456x9616526c() {
        return "Line{itemCount=" + this.f526035a + ", totalWidth=" + this.f526036b + ", maxHeight=" + this.f526037c + ", maxHeightIndex=" + this.f526038d + '}';
    }
}
