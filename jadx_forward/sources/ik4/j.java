package ik4;

/* loaded from: classes4.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f373472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ik4.g gVar) {
        super(0);
        this.f373472d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ik4.g gVar = this.f373472d;
        gVar.mo100933x41012807();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TPFlexiblePlayerManager", "[" + gVar.hashCode() + "]Player instance has been released");
        return jz5.f0.f384359a;
    }
}
