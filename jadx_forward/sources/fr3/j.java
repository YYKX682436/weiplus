package fr3;

/* loaded from: classes10.dex */
public final class j extends fr3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f347331a;

    public j(java.util.List list) {
        super(null);
        this.f347331a = list;
    }

    /* renamed from: equals */
    public boolean m130065xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr3.j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f347331a, ((fr3.j) obj).f347331a);
    }

    /* renamed from: hashCode */
    public int m130066x8cdac1b() {
        java.util.List list = this.f347331a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130067x9616526c() {
        return "deleteContactStates(deletedUserNameList=" + this.f347331a + ')';
    }
}
