package pm3;

/* loaded from: classes10.dex */
public final class b extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final r45.oc5 f438403b;

    public b(r45.oc5 previewDataObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewDataObj, "previewDataObj");
        this.f438403b = previewDataObj;
    }

    /* renamed from: equals */
    public boolean m158718xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm3.b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f438403b, ((pm3.b) obj).f438403b);
    }

    /* renamed from: hashCode */
    public int m158719x8cdac1b() {
        return this.f438403b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m158720x9616526c() {
        return "InitAction(previewDataObj=" + this.f438403b + ')';
    }
}
