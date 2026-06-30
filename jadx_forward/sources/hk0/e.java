package hk0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.h f363257a;

    /* renamed from: b, reason: collision with root package name */
    public final int f363258b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363259c;

    public e(hk0.h doodleType, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doodleType, "doodleType");
        this.f363257a = doodleType;
        this.f363258b = i17;
        this.f363259c = i18;
    }

    /* renamed from: equals */
    public boolean m133629xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.e)) {
            return false;
        }
        hk0.e eVar = (hk0.e) obj;
        return this.f363257a == eVar.f363257a && this.f363258b == eVar.f363258b && this.f363259c == eVar.f363259c;
    }

    /* renamed from: hashCode */
    public int m133630x8cdac1b() {
        return (((this.f363257a.hashCode() * 31) + java.lang.Integer.hashCode(this.f363258b)) * 31) + java.lang.Integer.hashCode(this.f363259c);
    }

    /* renamed from: toString */
    public java.lang.String m133631x9616526c() {
        return "DoodleBean(doodleType=" + this.f363257a + ", color=" + this.f363258b + ", index=" + this.f363259c + ')';
    }

    public /* synthetic */ e(hk0.h hVar, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(hVar, (i19 & 2) != 0 ? 0 : i17, (i19 & 4) != 0 ? 0 : i18);
    }
}
