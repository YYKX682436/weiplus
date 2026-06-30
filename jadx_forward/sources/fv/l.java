package fv;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final wu5.c f348466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348467b;

    public l(wu5.c task, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f348466a = task;
        this.f348467b = i17;
    }

    /* renamed from: equals */
    public boolean m130485xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv.l)) {
            return false;
        }
        fv.l lVar = (fv.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f348466a, lVar.f348466a) && this.f348467b == lVar.f348467b;
    }

    /* renamed from: hashCode */
    public int m130486x8cdac1b() {
        return (this.f348466a.hashCode() * 31) + java.lang.Integer.hashCode(this.f348467b);
    }

    /* renamed from: toString */
    public java.lang.String m130487x9616526c() {
        return super.toString() + ", priority:" + this.f348467b + ", state:" + this.f348466a.mo144429x75286adb();
    }
}
