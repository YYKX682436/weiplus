package hk0;

/* loaded from: classes3.dex */
public final class c extends hk0.a {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f363237b;

    /* renamed from: c, reason: collision with root package name */
    public final hk0.h f363238c;

    /* renamed from: d, reason: collision with root package name */
    public final xk0.d f363239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f363240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hk0.l type, hk0.h brushType, xk0.d dVar, java.util.ArrayList arrayList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(type);
        dVar = (i17 & 4) != 0 ? null : dVar;
        arrayList = (i17 & 8) != 0 ? null : arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brushType, "brushType");
        this.f363237b = type;
        this.f363238c = brushType;
        this.f363239d = dVar;
        this.f363240e = arrayList;
    }

    /* renamed from: equals */
    public boolean m133617xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.c)) {
            return false;
        }
        hk0.c cVar = (hk0.c) obj;
        return this.f363237b == cVar.f363237b && this.f363238c == cVar.f363238c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363239d, cVar.f363239d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363240e, cVar.f363240e);
    }

    /* renamed from: hashCode */
    public int m133618x8cdac1b() {
        int hashCode = ((this.f363237b.hashCode() * 31) + this.f363238c.hashCode()) * 31;
        xk0.d dVar = this.f363239d;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        java.util.ArrayList arrayList = this.f363240e;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133619x9616526c() {
        return "BrushEditData(type=" + this.f363237b + ", brushType=" + this.f363238c + ", item=" + this.f363239d + ", itemList=" + this.f363240e + ')';
    }
}
