package jf2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f380938a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f380939b;

    public v(java.util.List priorityList, java.util.List exclusiveButtons) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(priorityList, "priorityList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exclusiveButtons, "exclusiveButtons");
        this.f380938a = priorityList;
        this.f380939b = exclusiveButtons;
    }

    /* renamed from: equals */
    public boolean m140818xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf2.v)) {
            return false;
        }
        jf2.v vVar = (jf2.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380938a, vVar.f380938a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380939b, vVar.f380939b);
    }

    /* renamed from: hashCode */
    public int m140819x8cdac1b() {
        return (this.f380938a.hashCode() * 31) + this.f380939b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140820x9616526c() {
        return "ModePriorityConfig(priorityList=" + this.f380938a + ", exclusiveButtons=" + this.f380939b + ')';
    }

    public /* synthetic */ v(java.util.List list, java.util.List list2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, (i17 & 2) != 0 ? kz5.p0.f395529d : list2);
    }
}
