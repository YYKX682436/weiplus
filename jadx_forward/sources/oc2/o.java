package oc2;

/* loaded from: classes8.dex */
public final class o implements oc2.l {

    /* renamed from: a, reason: collision with root package name */
    public r45.cp5 f425769a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f425770b = new java.util.LinkedList();

    /* renamed from: toString */
    public java.lang.String m151008x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isolateNode=");
        r45.cp5 cp5Var = this.f425769a;
        java.util.ArrayList arrayList = null;
        sb6.append(cp5Var != null ? cp5Var.mo12245xcc313de3() : null);
        sb6.append(";containerNodes=");
        java.util.LinkedList linkedList = this.f425770b;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.cp5) it.next()).mo12245xcc313de3());
            }
        }
        sb6.append(arrayList);
        return sb6.toString();
    }
}
