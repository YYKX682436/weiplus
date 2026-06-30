package wz1;

/* loaded from: classes5.dex */
public final class c implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wz1.c f532232d = new wz1.c();

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (gm0.j1.a() && i17 == 5) {
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            boolean z17 = false;
            if (str != null) {
                if (!(str.length() == 0)) {
                    z17 = true;
                }
            }
            wz1.b.b(true ^ z17);
        }
    }
}
