package mm3;

/* loaded from: classes10.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f411207d;

    public t(mm3.w wVar) {
        this.f411207d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.w wVar = this.f411207d;
        yz5.l lVar = wVar.f411213q;
        java.util.Iterator it = wVar.f411211o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fm3.b) obj).f345561a, wVar.f411214r)) {
                    break;
                }
            }
        }
        lVar.mo146xb9724478(obj);
        wVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
