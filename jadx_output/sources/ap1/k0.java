package ap1;

/* loaded from: classes5.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.o0 f12692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f12693e;

    public k0(ap1.o0 o0Var, java.lang.String str) {
        this.f12692d = o0Var;
        this.f12693e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamBottomContactAvatarUIC$SelectedAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.o0 o0Var = this.f12692d;
        j75.f fVar = o0Var.f12713g;
        if (fVar == null) {
            fVar = o0Var.Q6();
            o0Var.f12713g = fVar;
        }
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBottomContactAvatarUIC$SelectedAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.Iterator it = ((ap1.c2) fVar.getState()).f12629m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((ap1.a0) obj).f12600a, this.f12693e)) {
                    break;
                }
            }
        }
        ap1.a0 a0Var = (ap1.a0) obj;
        if (a0Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBottomContactAvatarUIC$SelectedAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            fVar.B3(new ap1.h2(false, a0Var, null, 4, null));
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamBottomContactAvatarUIC$SelectedAvatarAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
