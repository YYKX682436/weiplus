package p52;

/* loaded from: classes15.dex */
public final class a implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p52.b f433526a;

    public a(p52.b bVar) {
        this.f433526a = bVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (str == null || !r26.i0.y(str, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$", false)) {
            return;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onUserVisibleFragmentChange", str2);
        p52.b bVar = this.f433526a;
        if (b17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V", str3)) {
            if (objArr == null || objArr.length < 3) {
                return;
            }
            java.lang.Object obj2 = objArr[0];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = objArr[1];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj3).intValue();
            java.lang.Object obj4 = objArr[2];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentFragment");
            com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 abstractC22277x94c24639 = (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639) obj4;
            if (booleanValue) {
                if (intValue == bVar.f433534h) {
                    bVar.f433533g = new java.lang.ref.WeakReference(abstractC22277x94c24639);
                    return;
                }
                return;
            } else {
                if (intValue == bVar.f433535i) {
                    new java.lang.ref.WeakReference(abstractC22277x94c24639);
                    bVar.getClass();
                    return;
                }
                return;
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("onFragmentChange", str2) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("(IIII)V", str3) || objArr == null || objArr.length < 4) {
            return;
        }
        java.lang.Object obj5 = objArr[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
        bVar.f433535i = ((java.lang.Integer) obj5).intValue();
        java.lang.Object obj6 = objArr[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
        bVar.f433534h = ((java.lang.Integer) obj6).intValue();
        if (obj != null) {
            com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 b18 = bVar.b(obj, bVar.f433534h);
            com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 c17 = bVar.c(obj, bVar.f433535i);
            com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 a17 = p52.b.a(bVar, obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) a17;
            java.lang.ref.WeakReference weakReference = bVar.f433532f;
            if ((weakReference != null ? (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8) weakReference.get() : null) == null) {
                bVar.f433532f = new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf);
            }
            o52.e eVar = bVar.f433531e;
            if (eVar != null) {
                java.lang.String name = b18 != null ? b18.getClass().getName() : null;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, c17 != null ? c17.getClass().getName() : null) || name == null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFragment, cur=");
                    sb6.append(b18 != null ? b18.getClass().getName() : null);
                    sb6.append(", last=");
                    sb6.append(c17 != null ? c17.getClass().getName() : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FinderHomeMonitor", sb6.toString());
                    if (c17 != null) {
                        eVar.a(abstractActivityC21394xb3d2c0cf, c17, currentTimeMillis, 1);
                    }
                    if (b18 != null) {
                        eVar.b(abstractActivityC21394xb3d2c0cf, b18, currentTimeMillis, 0);
                    }
                }
            }
        }
    }
}
