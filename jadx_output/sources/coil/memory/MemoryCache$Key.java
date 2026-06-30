package coil.memory;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "Complex", "Simple", "Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key$Complex;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes7.dex */
public abstract class MemoryCache$Key implements android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key$Complex;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes7.dex */
    public static final /* data */ class Complex extends coil.memory.MemoryCache$Key {
        public static final android.os.Parcelable.Creator<coil.memory.MemoryCache$Key.Complex> CREATOR = new coil.memory.a();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f43902d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.List f43903e;

        /* renamed from: f, reason: collision with root package name */
        public final coil.size.Size f43904f;

        /* renamed from: g, reason: collision with root package name */
        public final java.util.Map f43905g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complex(java.lang.String base, java.util.List transformations, coil.size.Size size, java.util.Map parameters) {
            super(null);
            kotlin.jvm.internal.o.g(base, "base");
            kotlin.jvm.internal.o.g(transformations, "transformations");
            kotlin.jvm.internal.o.g(parameters, "parameters");
            this.f43902d = base;
            this.f43903e = transformations;
            this.f43904f = size;
            this.f43905g = parameters;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof coil.memory.MemoryCache$Key.Complex)) {
                return false;
            }
            coil.memory.MemoryCache$Key.Complex complex = (coil.memory.MemoryCache$Key.Complex) obj;
            return kotlin.jvm.internal.o.b(this.f43902d, complex.f43902d) && kotlin.jvm.internal.o.b(this.f43903e, complex.f43903e) && kotlin.jvm.internal.o.b(this.f43904f, complex.f43904f) && kotlin.jvm.internal.o.b(this.f43905g, complex.f43905g);
        }

        public int hashCode() {
            int hashCode = ((this.f43902d.hashCode() * 31) + this.f43903e.hashCode()) * 31;
            coil.size.Size size = this.f43904f;
            return ((hashCode + (size == null ? 0 : size.hashCode())) * 31) + this.f43905g.hashCode();
        }

        public java.lang.String toString() {
            return "Complex(base=" + this.f43902d + ", transformations=" + this.f43903e + ", size=" + this.f43904f + ", parameters=" + this.f43905g + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            kotlin.jvm.internal.o.g(out, "out");
            out.writeString(this.f43902d);
            out.writeStringList(this.f43903e);
            out.writeParcelable(this.f43904f, i17);
            java.util.Map map = this.f43905g;
            out.writeInt(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                out.writeString((java.lang.String) entry.getKey());
                out.writeString((java.lang.String) entry.getValue());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes7.dex */
    public static final /* data */ class Simple extends coil.memory.MemoryCache$Key {
        public static final android.os.Parcelable.Creator<coil.memory.MemoryCache$Key.Simple> CREATOR = new coil.memory.b();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f43906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Simple(java.lang.String value) {
            super(null);
            kotlin.jvm.internal.o.g(value, "value");
            this.f43906d = value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof coil.memory.MemoryCache$Key.Simple) && kotlin.jvm.internal.o.b(this.f43906d, ((coil.memory.MemoryCache$Key.Simple) obj).f43906d);
        }

        public int hashCode() {
            return this.f43906d.hashCode();
        }

        public java.lang.String toString() {
            return "Simple(value=" + this.f43906d + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int i17) {
            kotlin.jvm.internal.o.g(out, "out");
            out.writeString(this.f43906d);
        }
    }

    public MemoryCache$Key(kotlin.jvm.internal.i iVar) {
    }
}
