package r26;

/* loaded from: classes5.dex */
public final class n extends kz5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r26.q f450439e;

    public n(r26.q qVar) {
        this.f450439e = qVar;
    }

    @Override // kz5.b, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.contains((java.lang.String) obj);
        }
        return false;
    }

    @Override // kz5.b
    public int d() {
        return this.f450439e.f450442a.groupCount() + 1;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        java.lang.String group = this.f450439e.f450442a.group(i17);
        return group == null ? "" : group;
    }

    @Override // kz5.h, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.indexOf((java.lang.String) obj);
        }
        return -1;
    }

    @Override // kz5.h, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.lastIndexOf((java.lang.String) obj);
        }
        return -1;
    }
}
