package qf4;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f444234a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f444235b;

    public h(java.lang.String label, java.util.List storyInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyInfos, "storyInfos");
        this.f444234a = label;
        this.f444235b = storyInfos;
    }

    /* renamed from: toString */
    public java.lang.String m159957x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (nf4.h hVar : this.f444235b) {
            java.lang.String str = null;
            r45.xe6 xe6Var = hVar.f418387p.y0().f460965h.f463738e.size() > 0 ? (r45.xe6) hVar.f418387p.y0().f460965h.f463738e.get(0) : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\t[date=");
            sb7.append(hVar.f69196x225a93d3);
            sb7.append(" localId=");
            sb7.append((int) hVar.f418387p.f72763xa3c65b86);
            sb7.append(", storyId=");
            sb7.append(hVar.f418387p.f69410x443468b);
            sb7.append(", thumb=");
            sb7.append(xe6Var != null ? xe6Var.f471558h : null);
            sb7.append(", video=");
            if (xe6Var != null) {
                str = xe6Var.f471556f;
            }
            sb7.append(str);
            sb7.append("]\n");
            sb6.append(sb7.toString());
        }
        return "[" + this.f444234a + "] \n " + ((java.lang.Object) sb6);
    }
}
