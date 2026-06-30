package ab2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab2.g f84298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ab2.g gVar) {
        super(1);
        this.f84298d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        android.content.Intent data = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ab2.a aVar = (ab2.a) this.f84298d.z();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = aVar.f188690f;
        if (a1Var != null && (m56022x4905e9fa = a1Var.m56022x4905e9fa()) != null) {
            hc2.f1.w(m56022x4905e9fa, data, aVar.f188689e, false, null, 12, null);
        }
        return jz5.f0.f384359a;
    }
}
