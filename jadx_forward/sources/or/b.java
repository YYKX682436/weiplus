package or;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final or.b f428955d = new or.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        or.a it = (or.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("\"pic_index\":" + it.f428951a);
        arrayList.add("\"edit_sticker_source\":" + it.f428952b);
        arrayList.add("\"edit_sticker_type\":" + it.f428953c);
        java.lang.Integer num = it.f428954d;
        if (num != null) {
            arrayList.add("\"upload_succ\":" + num.intValue());
        }
        return "{" + kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null) + '}';
    }
}
