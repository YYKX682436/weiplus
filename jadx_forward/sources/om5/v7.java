package om5;

/* loaded from: classes10.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final om5.v7 f428217d = new om5.v7();

    public v7() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.f6 storage = (com.p314xaae8f345.mm.vfs.f6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "$this$storage");
        jz5.l lVar = new jz5.l[]{new jz5.l("noStrip", "")}[0];
        java.lang.Object obj2 = lVar.f384367e;
        boolean z17 = obj2 instanceof java.lang.String;
        java.util.HashMap hashMap = storage.f294468k;
        java.lang.Object obj3 = lVar.f384366d;
        if (z17 || !(obj2 instanceof java.lang.Object[])) {
            hashMap.put(obj3, obj2.toString());
        } else {
            hashMap.put(obj3, obj2);
        }
        storage.f294467j = om5.u7.f428206d;
        return jz5.f0.f384359a;
    }
}
