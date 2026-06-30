package fg1;

/* loaded from: classes7.dex */
public final class n extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg1.u f343408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.Object obj, fg1.u uVar) {
        super(obj);
        this.f343408b = uVar;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj).booleanValue();
        fg1.u uVar = this.f343408b;
        if (booleanValue) {
            if (((java.lang.Boolean) ((b06.b) uVar.f343431d).b(uVar, fg1.u.f343427m[0])).booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a17 = uVar.a();
                if (a17 != null) {
                    a17.P(25, -1, uVar.f343436i);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a18 = uVar.a();
                if (a18 != null) {
                    a18.P(24, -1, uVar.f343437j);
                }
                uVar.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, uVar.f343429b);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a19 = uVar.a();
        if (a19 != null) {
            a19.B1(uVar.f343436i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 a27 = uVar.a();
        if (a27 != null) {
            a27.B1(uVar.f343437j);
        }
        uVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().unregisterContentObserver(uVar.f343429b);
    }
}
