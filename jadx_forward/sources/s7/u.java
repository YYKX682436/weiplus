package s7;

/* loaded from: classes16.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f485373a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f485374b = 0;

    public u(s7.b bVar) {
    }

    public void a() {
        this.f485374b += 1000;
    }

    /* renamed from: toString */
    public java.lang.String m164029x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f485373a.iterator();
        while (it.hasNext()) {
            sb6.append((s7.v) it.next());
            sb6.append(' ');
        }
        sb6.append('[');
        sb6.append(this.f485374b);
        sb6.append(']');
        return sb6.toString();
    }
}
