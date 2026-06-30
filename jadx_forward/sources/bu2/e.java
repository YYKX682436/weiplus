package bu2;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bu2.g f106030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bu2.g gVar) {
        super(1);
        this.f106030d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.ka1 it = (r45.ka1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.LinkedList m75941xfb821914 = it.m75941xfb821914(1);
        bu2.g gVar = this.f106030d;
        if (m75941xfb821914 != null) {
            gVar.getClass();
            m75941xfb821914.size();
        }
        java.util.ArrayList arrayList = gVar.f106043a;
        arrayList.clear();
        if (m75941xfb821914 != null) {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.hz2) it6.next()).m75936x14adae67(0);
                if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
        }
        java.util.ArrayList arrayList2 = gVar.f106043a;
        arrayList2.size();
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, ",");
        java.lang.String T0 = g92.b.f351302e.T0();
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = T0.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "finder/black_list/");
        sb6.append(encodeToString);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        byte[] bytes2 = c17.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        com.p314xaae8f345.mm.vfs.w6.S(sb7, bytes2, 0, bytes2.length);
        return jz5.f0.f384359a;
    }
}
