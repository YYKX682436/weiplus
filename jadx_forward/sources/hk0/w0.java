package hk0;

/* loaded from: classes3.dex */
public final class w0 extends hk0.a {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f363368b;

    /* renamed from: c, reason: collision with root package name */
    public final hk0.z0 f363369c;

    /* renamed from: d, reason: collision with root package name */
    public final xk0.k f363370d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f363371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(hk0.l type, hk0.z0 mosaicType, xk0.k kVar, java.util.ArrayList arrayList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(type);
        kVar = (i17 & 4) != 0 ? null : kVar;
        arrayList = (i17 & 8) != 0 ? null : arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mosaicType, "mosaicType");
        this.f363368b = type;
        this.f363369c = mosaicType;
        this.f363370d = kVar;
        this.f363371e = arrayList;
    }

    /* renamed from: equals */
    public boolean m133659xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.w0)) {
            return false;
        }
        hk0.w0 w0Var = (hk0.w0) obj;
        return this.f363368b == w0Var.f363368b && this.f363369c == w0Var.f363369c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363370d, w0Var.f363370d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363371e, w0Var.f363371e);
    }

    /* renamed from: hashCode */
    public int m133660x8cdac1b() {
        int hashCode = ((this.f363368b.hashCode() * 31) + this.f363369c.hashCode()) * 31;
        xk0.k kVar = this.f363370d;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        java.util.ArrayList arrayList = this.f363371e;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133661x9616526c() {
        return "MosaicEditData(type=" + this.f363368b + ", mosaicType=" + this.f363369c + ", item=" + this.f363370d + ", itemList=" + this.f363371e + ')';
    }
}
