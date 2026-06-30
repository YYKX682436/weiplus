package rx4;

/* loaded from: classes8.dex */
public final class k1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f482749d;

    public k1(rx4.h2 h2Var) {
        this.f482749d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        rx4.s2 s2Var;
        java.util.Map T6;
        java.lang.String str;
        java.util.List list;
        rx4.h2 h2Var = this.f482749d;
        android.app.Activity context = h2Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rx4.u0 u0Var = (rx4.u0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rx4.u0.class);
        if (u0Var.f482816g || (T6 = u0Var.T6()) == null) {
            s2Var = null;
        } else {
            java.lang.Object obj = T6.get("item_exptime");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((java.lang.Long) obj).longValue();
            java.lang.Object obj2 = T6.get("itemid");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj2;
            rx4.w0 w0Var = u0Var.f482817h;
            if (w0Var == null || (list = w0Var.f482851e) == null) {
                str = "";
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList.add(((rx4.x0) it.next()).a());
                }
                str = kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null);
            }
            s2Var = new rx4.s2(vu4.a.f521773g, str2, str, u0Var.f482816g, kz5.b1.e(new jz5.l("expstaytime", java.lang.Long.valueOf(longValue))));
        }
        if (s2Var == null) {
            return true;
        }
        h2Var.q7(s2Var.f482805a, s2Var.f482806b, s2Var.f482807c, s2Var.f482808d, s2Var.f482809e);
        return true;
    }
}
