package zo1;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556245d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        this.f556245d = activityC12867x6b26c82f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556245d;
        zo1.w wVar = activityC12867x6b26c82f.f174340p;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.x()) {
            zo1.w wVar2 = activityC12867x6b26c82f.f174340p;
            if (wVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
                throw null;
            }
            java.util.Iterator it = wVar2.f556338e.iterator();
            while (it.hasNext()) {
                ((zo1.s) it.next()).f556295c = false;
            }
            wVar2.f556339f = 0;
            yz5.a aVar = wVar2.f556340g;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            wVar2.m8146xced61ae5();
            android.widget.TextView textView = activityC12867x6b26c82f.f174337m;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572214a75);
        } else {
            zo1.w wVar3 = activityC12867x6b26c82f.f174340p;
            if (wVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
                throw null;
            }
            java.util.Iterator it6 = wVar3.f556338e.iterator();
            while (it6.hasNext()) {
                ((zo1.s) it6.next()).f556295c = true;
            }
            wVar3.f556339f = wVar3.f556338e.size();
            yz5.a aVar2 = wVar3.f556340g;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
            wVar3.m8146xced61ae5();
            android.widget.TextView textView2 = activityC12867x6b26c82f.f174337m;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectAllTv");
                throw null;
            }
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a76);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
