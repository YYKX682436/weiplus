package yr3;

/* loaded from: classes11.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.c1 f546594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f546595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f546596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f546597g;

    public w0(yr3.c1 c1Var, bw5.lp0 lp0Var, bw5.v70 v70Var, r45.o5 o5Var) {
        this.f546594d = c1Var;
        this.f546595e = lp0Var;
        this.f546596f = v70Var;
        this.f546597g = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f546594d.f546292x) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.jk.f290544a.a();
        yr3.c1 c1Var = this.f546594d;
        bw5.lp0 tingItem = this.f546595e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tingItem, "$tingItem");
        bw5.v70 v70Var = this.f546596f;
        r45.o5 o5Var = this.f546597g;
        c1Var.f546292x = true;
        java.lang.String m13170xcc16feb8 = v70Var.m13170xcc16feb8();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        long j17 = 1212;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o oVar = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o.f299294b;
        java.lang.Boolean bool = c1Var.f546290v;
        if (bool == null) {
            r45.m5 m5Var = o5Var.f463471y1;
            bool = m5Var != null ? java.lang.Boolean.valueOf(m5Var.f461686d) : null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            oVar.f(m13170xcc16feb8, j17, new yr3.z0(c1Var));
        } else {
            oVar.a(tingItem, 1212, new yr3.a1(c1Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
