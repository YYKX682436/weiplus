package mq2;

/* loaded from: classes15.dex */
public final class q implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 f412293d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60) {
        this.f412293d = c14558x6dc32d60;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1592xc4e39b55.C14558x6dc32d60 c14558x6dc32d60 = this.f412293d;
        if (c14558x6dc32d60.f203636u) {
            return false;
        }
        c14558x6dc32d60.f203636u = true;
        if (c14558x6dc32d60.f203639x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "dismissTipDialog");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c14558x6dc32d60.f203628m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            c14558x6dc32d60.f203628m = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
            return false;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = c14558x6dc32d60.f203628m;
            if (u3Var2 != null) {
                u3Var2.setMessage(c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574152h61));
            }
            c14558x6dc32d60.f203637v = new mq2.b(f18, f17, (int) d18);
            qa0.e eVar = (qa0.e) i95.n0.c(qa0.e.class);
            int i18 = c14558x6dc32d60.f203633r;
            mq2.b bVar = c14558x6dc32d60.f203637v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            float f19 = bVar.f412252b;
            mq2.b bVar2 = c14558x6dc32d60.f203637v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
            float f27 = bVar2.f412251a;
            mq2.b bVar3 = c14558x6dc32d60.f203637v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar3);
            int i19 = bVar3.f412253c;
            ((pa0.e) eVar).getClass();
            c14558x6dc32d60.f412255d = new an3.f(i18, f19, f27, i19, i17, "", "");
            com.p314xaae8f345.mm.p944x882e457a.r1 d27 = gm0.j1.d();
            java.lang.Object obj = c14558x6dc32d60.f412255d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d27.g((com.p314xaae8f345.mm.p944x882e457a.m1) obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "onGetLocation doScene");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.e(11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPersonUIC", "dismissTipDialog");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = c14558x6dc32d60.f203628m;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            c14558x6dc32d60.f203628m = null;
            android.view.View findViewById = c14558x6dc32d60.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.k5p);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$onLocationGet$1", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/person/NearbyPersonV1UIC$onLocationGet$1", "onGetLocation", "(ZFFIDDD)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ListView listView = c14558x6dc32d60.f203626h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(listView);
            listView.setVisibility(8);
            c14558x6dc32d60.f203634s = true;
            if (!c14558x6dc32d60.f203638w && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                c14558x6dc32d60.f203638w = true;
                db5.e1.C(c14558x6dc32d60.m158354x19263085(), c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), c14558x6dc32d60.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new mq2.p(c14558x6dc32d60), null);
            }
        }
        return false;
    }
}
