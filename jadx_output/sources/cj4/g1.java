package cj4;

/* loaded from: classes4.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f41933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41934e;

    public g1(mj4.h hVar, cj4.i1 i1Var) {
        this.f41933d = hVar;
        this.f41934e = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        mj4.k kVar = (mj4.k) this.f41933d;
        java.lang.String str = kVar.f327067b.field_PoiID;
        if (str == null) {
            str = "";
        }
        f96Var.set(5, str);
        f96Var.set(0, java.lang.Float.valueOf((float) kVar.f327067b.field_Longitude));
        f96Var.set(1, java.lang.Float.valueOf((float) kVar.f327067b.field_Latitude));
        f96Var.set(3, kVar.k());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.service.p3 p3Var = com.tencent.mm.plugin.finder.service.p3.f126174a;
        cj4.i1 i1Var = this.f41934e;
        p3Var.b(i1Var.w(), f96Var, zy2.o9.f477516d, 14, "", new cj4.f1(f96Var, intent, i1Var));
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$update$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
