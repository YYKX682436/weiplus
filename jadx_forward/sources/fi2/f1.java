package fi2;

/* loaded from: classes10.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f344365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(zi2.w wVar) {
        super(0);
        this.f344365d = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zi2.w wVar = this.f344365d;
        android.content.Context context = wVar.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new ni2.p2(context, wVar.S0(), wVar);
    }
}
