package ir1;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e f375510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e) {
        super(2);
        this.f375510d = activityC12967xcacb933e;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e = this.f375510d;
        java.lang.Object obj3 = activityC12967xcacb933e.f175467f.f375483e.get(intValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
        r45.d04 d04Var = (r45.d04) obj3;
        rl5.r rVar = activityC12967xcacb933e.f175470i;
        if (rVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = activityC12967xcacb933e.f175470i;
        if (rVar2 != null) {
            rVar2.h(view, new ir1.m(activityC12967xcacb933e), new ir1.q(activityC12967xcacb933e, d04Var), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
        throw null;
    }
}
