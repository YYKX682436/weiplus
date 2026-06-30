package q11;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f441063a;

    public a(int i17) {
        this.f441063a = new jt0.j(i17);
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        kk.j jVar = this.f441063a;
        if (jVar != null) {
            return ((lt0.f) jVar).put(obj, obj2);
        }
        throw new java.lang.NullPointerException("mData == null");
    }

    /* renamed from: toString */
    public final synchronized java.lang.String m159266x9616526c() {
        kk.j jVar;
        jVar = this.f441063a;
        if (jVar == null) {
            throw new java.lang.NullPointerException("mData == null");
        }
        return jVar.toString();
    }
}
