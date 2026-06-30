package dk5;

@j95.b
/* loaded from: classes.dex */
public final class y extends i95.w implements n13.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f316531d = "MicroMsg.ForwardDialogFeatureService";

    public boolean Ai(android.content.Context context, co.a model, java.util.List usernameList, n13.t info) {
        ek5.b bVar;
        java.lang.Class f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.List list = ek5.g.f335223a;
        java.util.Iterator it = ek5.g.f335223a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (ek5.b) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(model.getClass(), bVar.h())) {
                break;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f316531d, "showHalfScreenForwardView config:" + bVar);
        if (bVar == null || (f17 = bVar.f()) == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar = info.f415668c;
        n13.a0.V0.getClass();
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar, n13.y.f415674a);
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String i17 = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.i();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(usernameList, 10));
        java.util.Iterator it6 = usernameList.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            arrayList.add("{'RecieveType':" + com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.j(str, i17) + ";'ToUserId':" + str + ";'ToUserFrom':" + com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290832f + '}');
        }
        bundle.putString("ForwardParams_ReportForwardObjList", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null));
        bundle.putInt("ForwardParams_ReportConfirmScreenFrom", 2);
        bundle.putInt("ForwardParams_ReportFromScene", info.f415671f.f415672a);
        bundle.putInt("ForwardParams_ForwardMsgType", 4);
        m50.x.f405044r.a(context, model, usernameList, f17, z17, bundle, info.f415668c, info.f415670e, new dk5.x(info));
        return true;
    }

    public boolean wi(android.content.Context context, co.a model, java.lang.String str, n13.t info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (str == null) {
            str = "";
        }
        return Ai(context, model, r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null), info);
    }
}
