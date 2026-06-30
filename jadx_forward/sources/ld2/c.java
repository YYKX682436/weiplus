package ld2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f399616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f399617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.a aVar, yz5.p pVar) {
        super(3);
        this.f399616d = aVar;
        this.f399617e = pVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476 action = (com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476) obj2;
        r45.h32 h32Var = (r45.h32) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        activity.finish();
        if (action == com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43667x76f894fc) {
            this.f399616d.mo152xb9724478();
        } else {
            this.f399617e.mo149xb9724478(action, h32Var);
        }
        return jz5.f0.f384359a;
    }
}
