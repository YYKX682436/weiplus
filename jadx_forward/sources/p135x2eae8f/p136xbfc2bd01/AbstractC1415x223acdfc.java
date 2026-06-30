package p135x2eae8f.p136xbfc2bd01;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "Complex", "Simple", "Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key$Complex;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: coil.memory.MemoryCache$Key */
/* loaded from: classes7.dex */
public abstract class AbstractC1415x223acdfc implements android.os.Parcelable {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key$Complex;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: coil.memory.MemoryCache$Key$Complex */
    /* loaded from: classes7.dex */
    public static final /* data */ class Complex extends p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex> f4388x681a0c0c = new p135x2eae8f.p136xbfc2bd01.a();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f125435d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.List f125436e;

        /* renamed from: f, reason: collision with root package name */
        public final p135x2eae8f.p138x35e001.AbstractC1421x275421 f125437f;

        /* renamed from: g, reason: collision with root package name */
        public final java.util.Map f125438g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complex(java.lang.String base, java.util.List transformations, p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421, java.util.Map parameters) {
            super(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base, "base");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transformations, "transformations");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameters, "parameters");
            this.f125435d = base;
            this.f125436e = transformations;
            this.f125437f = abstractC1421x275421;
            this.f125438g = parameters;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m15431xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex)) {
                return false;
            }
            p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex complex = (p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Complex) obj;
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125435d, complex.f125435d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125436e, complex.f125436e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125437f, complex.f125437f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125438g, complex.f125438g);
        }

        /* renamed from: hashCode */
        public int m15432x8cdac1b() {
            int hashCode = ((this.f125435d.hashCode() * 31) + this.f125436e.hashCode()) * 31;
            p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421 = this.f125437f;
            return ((hashCode + (abstractC1421x275421 == null ? 0 : abstractC1421x275421.hashCode())) * 31) + this.f125438g.hashCode();
        }

        /* renamed from: toString */
        public java.lang.String m15433x9616526c() {
            return "Complex(base=" + this.f125435d + ", transformations=" + this.f125436e + ", size=" + this.f125437f + ", parameters=" + this.f125438g + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            out.writeString(this.f125435d);
            out.writeStringList(this.f125436e);
            out.writeParcelable(this.f125437f, i17);
            java.util.Map map = this.f125438g;
            out.writeInt(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                out.writeString((java.lang.String) entry.getKey());
                out.writeString((java.lang.String) entry.getValue());
            }
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: coil.memory.MemoryCache$Key$Simple */
    /* loaded from: classes7.dex */
    public static final /* data */ class Simple extends p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Simple> f4389x681a0c0c = new p135x2eae8f.p136xbfc2bd01.b();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f125439d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Simple(java.lang.String value) {
            super(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            this.f125439d = value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m15435xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Simple) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125439d, ((p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc.Simple) obj).f125439d);
        }

        /* renamed from: hashCode */
        public int m15436x8cdac1b() {
            return this.f125439d.hashCode();
        }

        /* renamed from: toString */
        public java.lang.String m15437x9616526c() {
            return "Simple(value=" + this.f125439d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            out.writeString(this.f125439d);
        }
    }

    public AbstractC1415x223acdfc(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }
}
