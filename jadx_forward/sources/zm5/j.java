package zm5;

/* loaded from: classes3.dex */
public final class j implements db5.a8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zm5.l f555761a;

    public j(zm5.l lVar) {
        this.f555761a = lVar;
    }

    @Override // db5.a8
    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryPageUIC", "longClick");
        zm5.l lVar = this.f555761a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        zm5.f0 f0Var = (zm5.f0) zVar.a(activity).a(zm5.f0.class);
        zm5.x0 x0Var = f0Var.f555749r;
        zm5.x0 x0Var2 = zm5.x0.f555820e;
        if ((x0Var == x0Var2 || f0Var.f555746o == x0Var2) ? false : true) {
            java.util.ArrayList arrayList = lVar.f555768f;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = lVar.f555767e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21520x5bb48e5e);
            java.lang.Object obj = arrayList.get(c21520x5bb48e5e.m80830xfda78ef6());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = (com.p314xaae8f345.mm.api.C4988x89c61bdd) obj;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((zm5.f0) zVar.a(activity2).a(zm5.f0.class)).S6(c4988x89c61bdd.f134736d, c4988x89c61bdd.f134743n);
        }
    }
}
