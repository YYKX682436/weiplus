package kv4;

/* loaded from: classes12.dex */
public final class h implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.a f394234a;

    public h(mv4.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f394234a = data;
    }

    @Override // jv4.j
    public int a() {
        return java.lang.Math.min(((java.util.ArrayList) mo141453x749b8e0a()).size(), 1);
    }

    @Override // jv4.j
    /* renamed from: getItems */
    public java.util.List mo141453x749b8e0a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mv4.a aVar = this.f394234a;
        if (((mv4.b) kz5.n0.Z(((rv4.a) aVar).f481957a)) != null) {
            arrayList.add(new kv4.l(aVar));
        }
        return arrayList;
    }
}
