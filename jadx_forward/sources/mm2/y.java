package mm2;

/* loaded from: classes3.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.y f411080d = new mm2.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.util.concurrent.ConcurrentHashMap safeSetValue = (java.util.concurrent.ConcurrentHashMap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(safeSetValue, "$this$safeSetValue");
        for (java.util.Map.Entry entry : safeSetValue.entrySet()) {
            ((lm2.k0) entry.getValue()).f400949a = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismiss reddot of ");
            sb6.append((java.lang.String) entry.getKey());
            sb6.append(", lastBuffer:");
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ((lm2.k0) entry.getValue()).f400950b;
            if (gVar != null) {
                try {
                    str = android.util.Base64.encodeToString(gVar.g(), 2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "encodeToString(...)");
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder", "ByteString encode failed.");
                    str = "";
                }
            } else {
                str = null;
            }
            sb6.append(str);
            java.lang.String str2 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "str");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "redDotFlowLog ".concat(str2));
        }
        return jz5.f0.f384359a;
    }
}
