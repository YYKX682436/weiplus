package tb5;

/* loaded from: classes12.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tb5.y f498635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498636e;

    public x(tb5.y yVar, java.lang.String str) {
        this.f498635d = yVar;
        this.f498636e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tb5.v vVar = this.f498635d.f498638f;
        java.lang.String talker = this.f498636e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(talker, "$talker");
        vVar.getClass();
        tb5.j jVar = vVar.f498625i;
        jVar.getClass();
        java.util.ArrayList arrayList = jVar.f498589a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        java.util.ArrayList arrayList3 = jVar.f498590b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
        java.util.ArrayList arrayList5 = jVar.f498591c;
        tb5.j jVar2 = new tb5.j(arrayList2, arrayList4, new java.util.ArrayList(arrayList5));
        tb5.d a17 = tb5.d.a(vVar.f498623g, 0.0f, 0.0f, 0.0f, 0L, 15, null);
        tb5.d a18 = tb5.d.a(vVar.f498624h, 0.0f, 0.0f, 0.0f, 0L, 15, null);
        java.util.HashMap hashMap = vVar.f498626j;
        java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
        java.util.HashMap hashMap3 = vVar.f498627k;
        java.util.HashMap hashMap4 = new java.util.HashMap(hashMap3);
        java.util.HashMap hashMap5 = vVar.f498628l;
        java.util.HashMap hashMap6 = new java.util.HashMap(hashMap5);
        java.util.HashMap hashMap7 = vVar.f498629m;
        java.util.HashMap hashMap8 = new java.util.HashMap(hashMap7);
        java.util.ArrayList arrayList6 = vVar.f498630n;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(arrayList6);
        tb5.f fVar = vVar.f498632p;
        pm0.v.K(null, new tb5.t(hashMap2, hashMap4, hashMap6, hashMap8, arrayList7, jVar2, a17, a18, new tb5.f(fVar.f498582a), talker, vVar));
        tb5.d dVar = vVar.f498623g;
        dVar.f498571a = 0.0f;
        dVar.f498572b = 0.0f;
        dVar.f498574d = 0L;
        dVar.f498573c = 0.0f;
        tb5.d dVar2 = vVar.f498624h;
        dVar2.f498571a = 0.0f;
        dVar2.f498572b = 0.0f;
        dVar2.f498574d = 0L;
        dVar2.f498573c = 0.0f;
        arrayList.clear();
        arrayList3.clear();
        arrayList5.clear();
        hashMap.clear();
        hashMap3.clear();
        hashMap5.clear();
        hashMap7.clear();
        arrayList6.clear();
        fVar.f498582a = new java.util.LinkedHashMap();
    }
}
