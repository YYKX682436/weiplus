package wo1;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.b1 f529544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.v f529545e;

    public q(wo1.b1 b1Var, wo1.v vVar) {
        this.f529544d = b1Var;
        this.f529545e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        wo1.v vVar;
        yz5.l m174232xdfafee44;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f529544d.m8183xf806b362();
        if (m8183xf806b362 != -1 && (m174232xdfafee44 = (vVar = this.f529545e).m174232xdfafee44()) != null) {
            list = vVar.f77366xde4019f2;
            m174232xdfafee44.mo146xb9724478(((wo1.n) list.get(m8183xf806b362)).f529525a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseContactAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
