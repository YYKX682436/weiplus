package bu2;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bu2.g f24497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bu2.g gVar) {
        super(1);
        this.f24497d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        r45.ka1 it = (r45.ka1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.LinkedList list = it.getList(1);
        bu2.g gVar = this.f24497d;
        if (list != null) {
            gVar.getClass();
            list.size();
        }
        java.util.ArrayList arrayList = gVar.f24510a;
        arrayList.clear();
        if (list != null) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.hz2) it6.next()).getCustom(0);
                if (finderContact == null || (str = finderContact.getUsername()) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
        }
        java.util.ArrayList arrayList2 = gVar.f24510a;
        arrayList2.size();
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ",");
        java.lang.String T0 = g92.b.f269769e.T0();
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = T0.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "finder/black_list/");
        sb6.append(encodeToString);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.d(c17);
        byte[] bytes2 = c17.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        com.tencent.mm.vfs.w6.S(sb7, bytes2, 0, bytes2.length);
        return jz5.f0.f302826a;
    }
}
