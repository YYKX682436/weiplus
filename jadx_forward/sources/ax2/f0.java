package ax2;

/* loaded from: classes3.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ax2.f0 f96574d = new ax2.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
        java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Oj().z0()).iterator();
        while (it.hasNext()) {
            ce2.i iVar = (ce2.i) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(synchronizedMap);
            synchronizedMap.put(iVar.f67814x2c488eb6, iVar);
        }
        return synchronizedMap;
    }
}
