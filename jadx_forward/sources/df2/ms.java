package df2;

/* loaded from: classes10.dex */
public final class ms implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312335e;

    public ms(df2.lt ltVar, android.view.ViewGroup viewGroup) {
        this.f312334d = ltVar;
        this.f312335e = viewGroup;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.m8185xcdaf1228() == 1) {
            df2.lt ltVar = this.f312334d;
            if (ltVar.f312250y.size() <= 0 || i17 == -1) {
                return;
            }
            java.util.ArrayList arrayList = ltVar.f312250y;
            java.lang.Object obj = arrayList.get(i17 % arrayList.size());
            dk2.h hVar = obj instanceof dk2.h ? (dk2.h) obj : null;
            java.lang.String str = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "onClick jump");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - ltVar.f312247v < 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "don't click again in 500ms");
                return;
            }
            ltVar.f312247v = currentTimeMillis;
            if (hVar != null) {
                boolean U6 = ltVar.U6();
                android.view.ViewGroup viewGroup = this.f312335e;
                if (!U6) {
                    android.content.Context context = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    df2.lt.Z6(ltVar, context, hVar);
                } else if (com.p314xaae8f345.mm.ui.bk.d0() || zl2.r4.f555483a.x1()) {
                    android.content.Context context2 = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    df2.lt.Z6(ltVar, context2, hVar);
                } else {
                    ltVar.W6(new df2.ls(ltVar, viewGroup, hVar));
                }
            }
            ltVar.t7(ltVar.n7(hVar, 2));
            in5.c cVar = ltVar.f312243r;
            dk2.h hVar2 = cVar instanceof dk2.h ? (dk2.h) cVar : null;
            r45.bm1 bm1Var = hVar2 != null ? hVar2.f315078h : null;
            if ((bm1Var != null && bm1Var.m75939xb282bd08(12) == 1) && bm1Var.m75939xb282bd08(11) == 1) {
                r45.jn0 jn0Var = new r45.jn0();
                jn0Var.set(0, java.lang.Long.valueOf(((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410516m));
                jn0Var.set(2, ((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410526w);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 70);
                jSONObject.put(dm.i4.f66865x76d1ec5a, bm1Var.m75945x2fec8307(0));
                jn0Var.set(3, jSONObject.toString());
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Kj(null, 18054, jn0Var);
            }
        }
    }
}
