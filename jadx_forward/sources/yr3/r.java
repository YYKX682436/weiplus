package yr3;

/* loaded from: classes11.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.i f546528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f546530f;

    public r(wr3.i iVar, r45.s5 s5Var, yz5.l lVar) {
        this.f546528d = iVar;
        this.f546529e = s5Var;
        this.f546530f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initFeaturedBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f546528d.f530349f = true;
        yr3.o0[] o0VarArr = yr3.o0.f546498d;
        r45.s5 s5Var = this.f546529e;
        s5Var.f467049n = 2;
        r45.p5 p5Var = s5Var.f467047i;
        java.lang.String str = (p5Var == null || (linkedList = p5Var.f464287e) == null || (o5Var = (r45.o5) kz5.n0.Z(linkedList)) == null) ? null : o5Var.f463450h;
        if (str == null) {
            str = "";
        }
        tr3.b bVar = new tr3.b();
        bVar.f502963a = 1903;
        bVar.f502964b = true;
        bVar.f502965c = str;
        tr3.a aVar = tr3.a.f502959a;
        java.util.Map map = tr3.a.f502961c;
        ((java.util.HashMap) map).remove(1901);
        ((java.util.HashMap) map).remove(1902);
        aVar.a(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeatureMsgUtil", "user click feature tips to expand");
        this.f546530f.mo146xb9724478(java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initFeaturedBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
