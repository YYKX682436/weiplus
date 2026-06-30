package cc;

/* loaded from: classes14.dex */
public abstract class a extends cc.r {
    @Override // cc.u
    public java.util.Map a() {
        java.util.Map map = this.f40402f;
        if (map != null) {
            return map;
        }
        java.util.Map map2 = this.f40397g;
        java.util.Map jVar = map2 instanceof java.util.SortedMap ? new cc.j(this, (java.util.SortedMap) map2) : new cc.e(this, map2);
        this.f40402f = jVar;
        return jVar;
    }

    @Override // cc.u
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }
}
