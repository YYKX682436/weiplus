package k93;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.d4 f387458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k93.j f387459e;

    public p(k93.j jVar, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var) {
        this.f387459e = jVar;
        this.f387458d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k93.j jVar = this.f387459e;
        boolean z17 = jVar.f387435q;
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = this.f387458d;
        if (z17) {
            k93.j.x(jVar, "" + d4Var.f66585x70ce48ca, d4Var.f66586x7661fe9a);
        } else {
            java.lang.String str = "" + d4Var.f66585x70ce48ca;
            java.lang.String str2 = d4Var.f66586x7661fe9a;
            jVar.getClass();
            f93.q5 q5Var = f93.q5.f341974a;
            boolean b17 = q5Var.b();
            android.content.Context context = jVar.f387431m;
            if (b17) {
                q5Var.d((android.app.Activity) context, str, str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelAdapter", "startActivity ContactEditLabel labelID:%s lebalName:%s", str, str2);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("label_id", str);
                intent.putExtra("label_name", str2);
                intent.putExtra("label_source", "label_source_SNS");
                intent.putExtra("last_page_source_type", 1);
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12.class);
                android.content.Context context2 = jVar.f387431m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "jumpToLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter", "jumpToLabelEditUI", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
