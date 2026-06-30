package t23;

/* loaded from: classes10.dex */
public final class b implements u23.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.d f496648a;

    public b(t23.d dVar) {
        this.f496648a = dVar;
    }

    @Override // u23.o
    public void a() {
    }

    @Override // u23.o
    public void b(java.util.List result, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        t23.d dVar = this.f496648a;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "[MediaLoader.LoaderListener] onDataLoad %s", java.lang.Integer.valueOf(result.size()));
        java.util.List list = dVar.f496662e;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(result);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            v23.b bVar = (v23.b) it.next();
            java.lang.String str3 = bVar.f514419a;
            java.util.List list2 = bVar.f514420b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(list2.size());
            boolean z18 = bVar instanceof v23.c;
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
            java.lang.String str4 = bVar.f514421c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "name:%s bucketId:%s mediasize:%d isprivate:%b", str3, str4, valueOf, valueOf2);
            if (!list2.isEmpty() || !z18) {
                if (z18) {
                    c15630x7d8d0183 = ((v23.c) bVar).f514425g;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183(bVar.f514419a, list2.size());
                    c15630x7d8d01832.r(str4);
                    c15630x7d8d01832.f219953i = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.a0(list2, 0);
                    c15630x7d8d01832.f219954m = bVar.f514422d;
                    c15630x7d8d01832.f219955n = bVar.f514423e == 2;
                    c15630x7d8d0183 = c15630x7d8d01832;
                }
                linkedList.add(c15630x7d8d0183);
            }
        }
        if (!z17) {
            v23.b bVar2 = dVar.f496663f;
            java.lang.String str5 = "";
            if (bVar2 == null || (str = bVar2.f514419a) == null) {
                str = "";
            }
            if (bVar2 != null && (str2 = bVar2.f514421c) != null) {
                str5 = str2;
            }
            dVar.f496663f = dVar.a(list, str, str5);
        }
        e60.x0 x0Var = dVar.f496658a;
        if (x0Var != null) {
            x0Var.a(linkedList, java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // u23.o
    public void c() {
    }
}
