package hk0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.d1 f363280a;

    /* renamed from: b, reason: collision with root package name */
    public final hk0.k f363281b;

    public i(hk0.d1 operateType, hk0.k stateData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operateType, "operateType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateData, "stateData");
        this.f363280a = operateType;
        this.f363281b = stateData;
    }

    /* renamed from: equals */
    public boolean m133638xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.i)) {
            return false;
        }
        hk0.i iVar = (hk0.i) obj;
        return this.f363280a == iVar.f363280a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363281b, iVar.f363281b);
    }

    /* renamed from: hashCode */
    public int m133639x8cdac1b() {
        return (this.f363280a.hashCode() * 31) + this.f363281b.m133645x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m133640x9616526c() {
        return "EditDataEvent(operateType=" + this.f363280a + ", stateData=" + this.f363281b + ')';
    }
}
