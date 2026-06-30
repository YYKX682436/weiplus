package x;

/* loaded from: classes13.dex */
public class b extends x.n implements java.util.Map {

    /* renamed from: n, reason: collision with root package name */
    public x.m f532339n;

    public b(x.n nVar) {
        if (nVar != null) {
            i(nVar);
        }
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        if (this.f532339n == null) {
            this.f532339n = new x.a(this);
        }
        x.m mVar = this.f532339n;
        if (mVar.f532370a == null) {
            mVar.f532370a = new x.i(mVar);
        }
        return mVar.f532370a;
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        if (this.f532339n == null) {
            this.f532339n = new x.a(this);
        }
        x.m mVar = this.f532339n;
        if (mVar.f532371b == null) {
            mVar.f532371b = new x.j(mVar);
        }
        return mVar.f532371b;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        b(this.f532379f + map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        if (this.f532339n == null) {
            this.f532339n = new x.a(this);
        }
        x.m mVar = this.f532339n;
        if (mVar.f532372c == null) {
            mVar.f532372c = new x.l(mVar);
        }
        return mVar.f532372c;
    }
}
