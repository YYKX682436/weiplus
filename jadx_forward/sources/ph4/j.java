package ph4;

/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final ph4.f f436019a;

    public j(ph4.f callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f436019a = callback;
    }

    public abstract int a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c);

    public abstract java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c);

    public void c(ph4.b viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }

    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) viewModel.f400257d).get(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "onBind " + i17 + ' ' + c16601x7ed0e40c.v0().m75945x2fec8307(1) + ' ' + c16601x7ed0e40c.f66793x2262335f + ' ' + c16601x7ed0e40c.f66791xc8a07680);
        viewHolder.f435997g.setText(b(c16601x7ed0e40c));
        android.view.View view = viewHolder.f435999i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = viewHolder.f436000m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewHolder.f436001n.setVisibility(8);
        android.widget.ImageView imageView = viewHolder.f435994d;
        imageView.setVisibility(0);
        imageView.setImageResource(a(c16601x7ed0e40c));
        android.widget.ImageView imageView2 = viewHolder.f435995e;
        imageView2.setImageDrawable(null);
        imageView2.setBackground(null);
        if (lh4.n.f400252e.b(c16601x7ed0e40c.f66793x2262335f)) {
            java.lang.String str = c16601x7ed0e40c.f66791xc8a07680;
            if (str == null) {
                str = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = gh4.m0.f353472a;
            sb6.append(gh4.m0.f353473b);
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            if (!com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String str3 = gh4.m0.f353472a;
                sb8.append(gh4.m0.f353472a);
                sb8.append(str);
                sb7 = sb8.toString();
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "load snapshots " + c16601x7ed0e40c.f66791xc8a07680 + ' ' + sb7);
                n11.a.b().j(sb7, imageView2, gh4.j0.f353467b, new ph4.h(i17, c16601x7ed0e40c, viewHolder, this));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[file not exist] " + c16601x7ed0e40c.f66791xc8a07680);
                c(viewHolder);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[disabled] " + c16601x7ed0e40c.f66791xc8a07680);
            c(viewHolder);
        }
        viewHolder.f435998h.setOnClickListener(new ph4.i(this, viewHolder));
    }
}
