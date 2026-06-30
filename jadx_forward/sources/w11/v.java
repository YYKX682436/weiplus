package w11;

/* loaded from: classes12.dex */
public final class v extends com.p314xaae8f345.mm.p944x882e457a.m1 implements w11.u {

    /* renamed from: d, reason: collision with root package name */
    public final r45.jj6 f523686d;

    public v(r45.jj6 syncData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncData, "syncData");
        this.f523686d = syncData;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 138;
    }

    /* renamed from: hashCode */
    public int m173099x8cdac1b() {
        try {
            return this.f523686d.f459421i;
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMKVHandlerProcessor", e17, "NPE?", new java.lang.Object[0]);
            return super.hashCode();
        }
    }

    @Override // w11.u
    public boolean t(java.util.Queue queue) {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m173100x9616526c() {
        return "MMKVHandlerProcessor[" + this.f523686d.f459421i + ']';
    }
}
