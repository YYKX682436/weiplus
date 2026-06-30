package in5;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f374555a;

    /* renamed from: b, reason: collision with root package name */
    public long f374556b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f374557c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f374558d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f374559e = -1;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f374560f;

    public e(java.lang.Object obj) {
        this.f374555a = obj;
    }

    /* renamed from: equals */
    public boolean m136782xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof in5.e)) {
            return false;
        }
        if (this != obj) {
            java.lang.Object obj2 = this.f374555a;
            int hashCode = obj2 != null ? obj2.hashCode() : 0;
            java.lang.Object obj3 = ((in5.e) obj).f374555a;
            if (hashCode != (obj3 != null ? obj3.hashCode() : 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m136783x8cdac1b() {
        java.lang.Object obj = this.f374555a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m136784x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        sb6.append("adapterPosition = " + this.f374559e);
        sb6.append("\n");
        sb6.append("exposeTime = " + this.f374558d);
        sb6.append("\n");
        sb6.append("startTime = " + this.f374556b);
        sb6.append("\n");
        sb6.append("endTime = " + this.f374557c);
        sb6.append("\n");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
