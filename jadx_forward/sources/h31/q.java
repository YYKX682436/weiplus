package h31;

/* loaded from: classes9.dex */
public final class q implements m31.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f359959a;

    public q(h31.r rVar) {
        this.f359959a = rVar;
    }

    @Override // m31.o0
    public void a(java.lang.String templateId, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        j31.e eVar = j31.e.f378925a;
        if (i17 < j31.e.f378928d) {
            java.util.ArrayList arrayList = (java.util.ArrayList) j31.e.f378927c;
            arrayList.set(i17, java.lang.Integer.valueOf(((java.lang.Number) arrayList.get(i17)).intValue() + 1));
        }
        eVar.c(5, this.f359959a.f359978s);
    }
}
