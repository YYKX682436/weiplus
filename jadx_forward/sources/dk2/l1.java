package dk2;

/* loaded from: classes.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f315245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(java.lang.ref.WeakReference weakReference) {
        super(4);
        this.f315245d = weakReference;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        yz5.r rVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.tp2 resp = (r45.tp2) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(7);
        boolean z17 = true;
        if (zm6Var != null && zm6Var.m75933x41a8a7f2(1)) {
            r45.zm6 zm6Var2 = (r45.zm6) resp.m75936x14adae67(7);
            java.lang.String m75945x2fec8307 = zm6Var2 != null ? zm6Var2.m75945x2fec8307(0) : null;
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                r45.zm6 zm6Var3 = (r45.zm6) resp.m75936x14adae67(7);
                db5.t7.m123883x26a183b(context, zm6Var3 != null ? zm6Var3.m75945x2fec8307(0) : null, 0).show();
            }
        }
        java.lang.ref.WeakReference weakReference = this.f315245d;
        if (weakReference != null && (rVar = (yz5.r) weakReference.get()) != null) {
            rVar.C(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), str, resp);
        }
        return jz5.f0.f384359a;
    }
}
