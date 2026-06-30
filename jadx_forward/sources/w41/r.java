package w41;

/* loaded from: classes4.dex */
public final class r implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f524414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f524415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f524416c;

    public r(android.view.ViewGroup viewGroup, k41.g0 g0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f524414a = viewGroup;
        this.f524415b = g0Var;
        this.f524416c = y1Var;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17 = iArr != null && iArr[0] == 0;
        l41.y1 y1Var = l41.y1.f397503a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = this.f524416c;
        k41.g0 contact = this.f524415b;
        android.view.ViewGroup viewGroup = this.f524414a;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            w41.p pVar = new w41.p(f17, y1Var2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqController", "ACCESS_FINE_LOCATION onPermissionGranted");
            java.lang.String str = contact.f68613xdec927b;
            y1Var.a(context, str != null ? str : "", true, new l41.m1(pVar, contact, context));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        w41.q qVar = new w41.q(f18, y1Var2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqController", "ACCESS_FINE_LOCATION onPermissionGranted");
        java.lang.String str2 = contact.f68613xdec927b;
        y1Var.a(context2, str2 != null ? str2 : "", true, new l41.m1(qVar, contact, context2));
    }
}
