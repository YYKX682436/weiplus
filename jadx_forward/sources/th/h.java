package th;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f500782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th.o f500783e;

    public h(th.o oVar, android.widget.TextView textView) {
        this.f500783e = oVar;
        this.f500782d = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id6 = view.getId();
        th.o oVar = this.f500783e;
        if (id6 == com.p314xaae8f345.mm.R.id.hwe) {
            oVar.f500805j.mo40853xab27b508(oVar.f500802g);
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.hxs) {
            android.widget.TextView textView = (android.widget.TextView) oVar.f500800e.findViewById(com.p314xaae8f345.mm.R.id.op7);
            android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(view.getContext(), textView);
            java.util.List n17 = sh.c.n(view.getContext());
            java.util.Iterator it = ((java.util.ArrayList) n17).iterator();
            while (it.hasNext()) {
                m3.d dVar = (m3.d) it.next();
                popupMenu.getMenu().add("Process :" + th.o.c((java.lang.String) dVar.f404626b));
            }
            popupMenu.setOnMenuItemClickListener(new th.e(this, n17, textView));
            popupMenu.show();
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.hmp) {
            oVar.f500806k.run();
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.f568977oo4) {
            android.view.View findViewById = oVar.f500800e.findViewById(com.p314xaae8f345.mm.R.id.hyl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = oVar.f500800e.findViewById(com.p314xaae8f345.mm.R.id.hmq);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.f567031hw0) {
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bsw);
            checkBox.setChecked(!checkBox.isChecked());
            oVar.f500803h = checkBox.isChecked();
            android.content.Context context = view.getContext();
            oVar.getClass();
            context.getSharedPreferences("Matrix_TopThreadIndicator", 0).edit().putBoolean("show-power", oVar.f500803h).apply();
            return;
        }
        android.view.View view2 = oVar.f500800e;
        if (view == view2 && view2.findViewById(com.p314xaae8f345.mm.R.id.hyl).getVisibility() == 8) {
            android.widget.PopupMenu popupMenu2 = new android.widget.PopupMenu(view.getContext(), oVar.f500800e.findViewById(com.p314xaae8f345.mm.R.id.hmq));
            popupMenu2.getMenu().add("Expand");
            popupMenu2.getMenu().add("Close");
            popupMenu2.setOnMenuItemClickListener(new th.g(this));
            popupMenu2.show();
        }
    }
}
