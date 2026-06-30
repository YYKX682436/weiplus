package mg3;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 f407764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100) {
        super(1);
        this.f407764d = c16501x5a606100;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.postTranslate(0.0f, 0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16501x5a606100 c16501x5a606100 = this.f407764d;
        mg3.l scaleConfig = c16501x5a606100.getScaleConfig();
        if (scaleConfig != null) {
            c16501x5a606100.m81922xe91e3cf7(scaleConfig.f407777b);
            c16501x5a606100.m81920x7c800d89(scaleConfig.f407778c);
        }
        return java.lang.Boolean.TRUE;
    }
}
