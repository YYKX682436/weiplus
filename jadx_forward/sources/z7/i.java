package z7;

/* loaded from: classes16.dex */
public class i extends z7.l implements java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f552008d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f552009e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient z7.g f552010f = new z7.g();

    @Override // z7.l
    public z7.i d() {
        return this;
    }

    @Override // z7.l
    /* renamed from: equals */
    public boolean mo178486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z7.i.class != obj.getClass()) {
            return false;
        }
        z7.i iVar = (z7.i) obj;
        if (((java.util.ArrayList) this.f552008d).equals(iVar.f552008d)) {
            if (((java.util.ArrayList) this.f552009e).equals(iVar.f552009e)) {
                return true;
            }
        }
        return false;
    }

    @Override // z7.l
    public void g(z7.m mVar) {
        mVar.g();
        java.util.Iterator it = ((java.util.ArrayList) this.f552008d).iterator();
        java.util.Iterator it6 = ((java.util.ArrayList) this.f552009e).iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            if (!z17) {
                mVar.h();
            }
            java.lang.String str = (java.lang.String) it.next();
            java.io.Writer writer = mVar.f552030a;
            writer.write(34);
            mVar.d(str);
            writer.write(34);
            mVar.e();
            ((z7.l) it6.next()).g(mVar);
            z17 = false;
        }
        mVar.f();
    }

    public z7.i h(java.lang.String str, z7.l lVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("name is null");
        }
        if (lVar == null) {
            throw new java.lang.NullPointerException("value is null");
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f552008d;
        int size = arrayList.size();
        z7.g gVar = this.f552010f;
        gVar.getClass();
        int hashCode = str.hashCode();
        byte[] bArr = gVar.f552005a;
        int length = hashCode & (bArr.length - 1);
        if (size < 255) {
            bArr[length] = (byte) (size + 1);
        } else {
            bArr[length] = 0;
        }
        arrayList.add(str);
        ((java.util.ArrayList) this.f552009e).add(lVar);
        return this;
    }

    @Override // z7.l
    /* renamed from: hashCode */
    public int mo178487x8cdac1b() {
        return ((((java.util.ArrayList) this.f552008d).hashCode() + 31) * 31) + ((java.util.ArrayList) this.f552009e).hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new z7.f(this, ((java.util.ArrayList) this.f552008d).iterator(), ((java.util.ArrayList) this.f552009e).iterator());
    }

    public z7.l j(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name is null");
        }
        int k17 = k(str);
        if (k17 != -1) {
            return (z7.l) ((java.util.ArrayList) this.f552009e).get(k17);
        }
        return null;
    }

    public int k(java.lang.String str) {
        z7.g gVar = this.f552010f;
        gVar.getClass();
        int hashCode = str.hashCode();
        int i17 = (gVar.f552005a[hashCode & (r0.length - 1)] & 255) - 1;
        java.util.List list = this.f552008d;
        return (i17 == -1 || !str.equals(((java.util.ArrayList) list).get(i17))) ? ((java.util.ArrayList) list).lastIndexOf(str) : i17;
    }
}
