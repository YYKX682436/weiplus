package kv4;

/* loaded from: classes12.dex */
public final class m0 implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.b0 f394247a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.y f394248b;

    public m0(rv4.b0 data, rv4.y delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f394247a = data;
        this.f394248b = delegate;
    }

    @Override // jv4.j
    public int a() {
        if (this.f394247a.c()) {
            return ((java.util.ArrayList) mo141453x749b8e0a()).size() + 1;
        }
        return 0;
    }

    @Override // jv4.j
    /* renamed from: getItems */
    public java.util.List mo141453x749b8e0a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.b0 b0Var = this.f394247a;
        arrayList.add(new lv4.b(b0Var, this.f394248b, b0Var.f481971a));
        java.util.List list = b0Var.f481975e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((rv4.c0) ((mv4.j) obj)).b()) {
                arrayList2.add(obj);
            }
        }
        arrayList.add(new kv4.l0(b0Var, arrayList2, ((java.util.ArrayList) b0Var.f481975e).size() > 4));
        return arrayList;
    }
}
