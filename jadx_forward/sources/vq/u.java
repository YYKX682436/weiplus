package vq;

/* loaded from: classes4.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vq.u f520759d = new vq.u();

    public u() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        f21.g b17 = rr.t.b(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a("/sdcard/temp/egg.xml")));
        if (b17 != null) {
            f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
            K.f340432e = b17.f340432e;
            java.util.LinkedList linkedList = K.f340431d;
            linkedList.clear();
            java.util.Iterator it = b17.f340431d.iterator();
            while (it.hasNext()) {
                f21.e eVar = (f21.e) it.next();
                if (eVar.f340411n <= 13) {
                    linkedList.add(eVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
