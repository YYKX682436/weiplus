package ap1;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.o0 f94239d;

    public n0(ap1.o0 o0Var) {
        this.f94239d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ap1.c2 c2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamBottomContactAvatarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.o0 o0Var = this.f94239d;
        j75.f fVar = o0Var.f94246g;
        if (fVar == null) {
            fVar = o0Var.Q6();
            o0Var.f94246g = fVar;
        }
        if (fVar != null && (c2Var = (ap1.c2) fVar.mo140437x75286adb()) != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("already_select_contact", (java.lang.String[]) c2Var.f94163n.toArray(new java.lang.String[0]));
            pf5.j0.a(intent, ap1.d1.class);
            pf5.j0.a(intent, ap1.x1.class);
            pf5.j0.a(intent, ap1.u1.class);
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = o0Var.m158354x19263085();
            cVar.d(intent);
            cVar.c(true);
            cVar.a("com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI");
            cVar.h(126);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBottomContactAvatarUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
