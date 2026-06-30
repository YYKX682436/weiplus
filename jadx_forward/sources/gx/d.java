package gx;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.e f357705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gx.e eVar) {
        super(2);
        this.f357705d = eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        gx.e eVar = this.f357705d;
        if (z17) {
            eVar.s().mo146xb9724478(eVar.h(1, str));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str2);
            if (yw.h1.f547876l > 0) {
                cx.w0 w0Var = (cx.w0) eVar.f399423a;
                if (w0Var != null) {
                    gx.c cVar = new gx.c(eVar, hashMap, str2);
                    ax.t tVar = w0Var.f306012x;
                    tVar.getClass();
                    tVar.n("getBrandServiceJumpPaths", null, new ax.n(cVar));
                }
            } else {
                eVar.s().mo146xb9724478(eVar.l(hashMap));
            }
        }
        return jz5.f0.f384359a;
    }
}
