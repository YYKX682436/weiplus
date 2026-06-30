package pk2;

/* loaded from: classes3.dex */
public final class gb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(pk2.o9 o9Var) {
        super(1);
        this.f437324d = o9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        this.f437324d.d(list);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            java.lang.String str = "";
            while (it.hasNext()) {
                str = str + ((java.lang.String) it.next()) + ';';
            }
            if (r26.i0.o(str, ";", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a.a(list, linkedHashMap);
            linkedHashMap.put("share_scene", java.lang.String.valueOf(zl2.r4.f555483a.Z0()));
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Fk(str, ml2.j5.f409163e, linkedHashMap);
        }
        return jz5.f0.f384359a;
    }
}
