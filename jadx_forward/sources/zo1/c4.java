package zo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public c4(java.lang.Object obj) {
        super(1, obj, zo1.k4.class, "notifyTaskChanged", "notifyTaskChanged(J)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        zo1.k4 k4Var = (zo1.k4) this.f72685xcfcbe9ef;
        java.util.Iterator it = k4Var.f556207e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == longValue) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            k4Var.m8147xed6e4d18(i17);
        }
        return jz5.f0.f384359a;
    }
}
