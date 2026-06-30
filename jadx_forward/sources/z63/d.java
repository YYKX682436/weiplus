package z63;

/* loaded from: classes5.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.g f551907d;

    public d(z63.g gVar) {
        this.f551907d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z63.g gVar = this.f551907d;
        z63.f fVar = gVar.f551944g;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TiemDatePicker", "[getPhoneNum] :%s", gVar.f551945h);
            java.lang.String str = gVar.f551945h;
            z63.m0 m0Var = (z63.m0) fVar;
            y9.i iVar = m0Var.f551963a.f551938a;
            if (iVar != null) {
                iVar.dismiss();
            }
            z63.n0 n0Var = m0Var.f551964b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = n0Var.f551966d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.U;
            activityC16081x2d23fdab.U6(str);
            n0Var.f551966d.Y6(5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/GroupSolitatireContactsPhoneNumPicker$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
