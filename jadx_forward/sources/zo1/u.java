package zo1;

/* loaded from: classes5.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.b1 f556311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zo1.w f556312e;

    public u(wo1.b1 b1Var, zo1.w wVar) {
        this.f556311d = b1Var;
        this.f556312e = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$ConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f556311d.m8183xf806b362();
        if (m8183xf806b362 != -1) {
            zo1.w wVar = this.f556312e;
            zo1.s sVar = (zo1.s) wVar.f556338e.get(m8183xf806b362);
            boolean z17 = !sVar.f556295c;
            sVar.f556295c = z17;
            wVar.f556339f += z17 ? 1 : -1;
            wVar.m8147xed6e4d18(m8183xf806b362);
            yz5.a aVar = wVar.f556340g;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$ConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
