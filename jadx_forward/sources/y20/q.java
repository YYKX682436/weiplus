package y20;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUI f540554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI) {
        super(2);
        this.f540554d = ecsTestUI;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qq.f item = (qq.f) obj;
        android.content.Context context = (android.content.Context) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = com.tencent.mm.feature.ecs.test.EcsTestUI.n;
        com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI = this.f540554d;
        ecsTestUI.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestUI", "handleItemClick: " + item.a());
        if (item instanceof qq.d) {
            try {
                ((qq.d) item).f447397c.mo146xb9724478(context);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsTestUI", "Button action executed: " + ((qq.d) item).f447396b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsTestUI", "Button action failed: " + ((qq.d) item).f447396b, e17);
            }
        } else if (item instanceof qq.g) {
            qq.g gVar = (qq.g) item;
            y20.p pVar = new y20.p(item, ecsTestUI);
            qq.c0 c0Var = (qq.c0) i95.n0.c(qq.c0.class);
            java.lang.String str = gVar.f447400a;
            java.util.List list = gVar.f447402c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c0Var);
            y20.f fVar = new y20.f(context, str, list, ((qq.s) c0Var).Ai(gVar.f447404e, gVar.f447403d), new y20.o(gVar, c0Var, pVar));
            android.content.Context context2 = fVar.f540532a;
            android.view.View inflate = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4m, (android.view.ViewGroup) null);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.unh);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.czu)).setText(fVar.f540533b);
            y20.c cVar = new y20.c(fVar.f540534c, fVar.f540535d, new y20.e(fVar));
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context2));
            c1163xf1deaba4.mo7960x6cab2c8d(cVar);
            p012xc85e97e9.p016x746ad0e3.app.l lVar = new p012xc85e97e9.p016x746ad0e3.app.l(context2);
            p012xc85e97e9.p016x746ad0e3.app.h hVar = lVar.f90726a;
            hVar.f90677p = inflate;
            y20.d dVar = y20.d.f540530d;
            hVar.f90670i = "取消";
            hVar.f90671j = dVar;
            p012xc85e97e9.p016x746ad0e3.app.m a17 = lVar.a();
            fVar.f540537f = a17;
            a17.show();
        } else if (item instanceof qq.e) {
            item.b();
        }
        return jz5.f0.f384359a;
    }
}
