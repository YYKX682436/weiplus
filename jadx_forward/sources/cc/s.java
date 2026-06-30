package cc;

/* loaded from: classes8.dex */
public abstract class s implements java.util.Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            cc.x xVar = (cc.x) this;
            java.lang.Object key = entry.getKey();
            java.lang.Object obj2 = xVar.f121938d;
            if (obj2 == key || (obj2 != null && obj2.equals(key))) {
                java.lang.Object value = entry.getValue();
                java.lang.Object obj3 = xVar.f121939e;
                if (obj3 == value || (obj3 != null && obj3.equals(value))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        cc.x xVar = (cc.x) this;
        java.lang.Object obj = xVar.f121938d;
        int hashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = xVar.f121939e;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m14610x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        cc.x xVar = (cc.x) this;
        sb6.append(xVar.f121938d);
        sb6.append("=");
        sb6.append(xVar.f121939e);
        return sb6.toString();
    }
}
