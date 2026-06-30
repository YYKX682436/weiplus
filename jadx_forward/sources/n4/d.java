package n4;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416396a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f416397b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f416398c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f416399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f416400e;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2) {
        this.f416396a = str;
        this.f416397b = str2;
        this.f416398c = str3;
        this.f416399d = java.util.Collections.unmodifiableList(list);
        this.f416400e = java.util.Collections.unmodifiableList(list2);
    }

    /* renamed from: equals */
    public boolean m149078xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.d.class != obj.getClass()) {
            return false;
        }
        n4.d dVar = (n4.d) obj;
        if (this.f416396a.equals(dVar.f416396a) && this.f416397b.equals(dVar.f416397b) && this.f416398c.equals(dVar.f416398c) && this.f416399d.equals(dVar.f416399d)) {
            return this.f416400e.equals(dVar.f416400e);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m149079x8cdac1b() {
        return (((((((this.f416396a.hashCode() * 31) + this.f416397b.hashCode()) * 31) + this.f416398c.hashCode()) * 31) + this.f416399d.hashCode()) * 31) + this.f416400e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149080x9616526c() {
        return "ForeignKey{referenceTable='" + this.f416396a + "', onDelete='" + this.f416397b + "', onUpdate='" + this.f416398c + "', columnNames=" + this.f416399d + ", referenceColumnNames=" + this.f416400e + '}';
    }
}
