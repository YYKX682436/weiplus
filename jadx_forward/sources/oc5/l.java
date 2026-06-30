package oc5;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.m f425982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(oc5.m mVar, int i17) {
        super(2);
        this.f425982d = mVar;
        this.f425983e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        oc5.e action = (oc5.e) obj;
        oc5.e targetAction = (oc5.e) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetAction, "targetAction");
        if (action.mo151047xba8879a4() < targetAction.mo151047xba8879a4()) {
            int i17 = this.f425983e;
            oc5.m mVar = this.f425982d;
            if (mVar.e(i17) == null) {
                targetAction.mo151046xfb85f7b0();
                mVar.g(targetAction.mo151046xfb85f7b0(), 4);
            }
        }
        return jz5.f0.f384359a;
    }
}
