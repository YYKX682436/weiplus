package qe2;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe2.c f443574d;

    public d(android.content.Context context, qe2.c cVar) {
        this.f443574d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.b2 b2Var = new ya2.b2();
        qe2.c cVar = this.f443574d;
        java.lang.String field_nickname = cVar.f443569b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field_nickname, "field_nickname");
        b2Var.f69328x21f9b213 = field_nickname;
        java.lang.String field_username = cVar.f443568a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field_username, "field_username");
        b2Var.f69347xdec927b = field_username;
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb.R8((c61.yb) c17, new r45.qt2(), cVar.f443568a, 1, 0L, false, null, null, 0, 11, null, null, null, null, 7776, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
        java.lang.String D0 = b2Var.D0();
        am.zd zdVar = c5560x6f070be.f135879g;
        zdVar.f90084a = D0;
        zdVar.f90085b = 4;
        zdVar.f90086c = true;
        c5560x6f070be.e();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/coauthor/FinderLiveCoAuthorSheet$CoAuthorViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
