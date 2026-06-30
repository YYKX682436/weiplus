package pr;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final pr.k f439255d = new pr.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.e5 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(intValue);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPack: checkDesigner ");
        sb6.append(intValue);
        sb6.append(' ');
        java.util.LinkedList linkedList = a17.f275391b;
        sb6.append(linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", sb6.toString());
        if (linkedList.isEmpty()) {
            new pr.d(intValue, null).b();
        }
        return jz5.f0.f384359a;
    }
}
