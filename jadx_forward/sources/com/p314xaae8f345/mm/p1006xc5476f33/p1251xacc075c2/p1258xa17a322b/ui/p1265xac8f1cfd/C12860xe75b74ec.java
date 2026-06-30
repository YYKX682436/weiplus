package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/TaskStatusCardView;", "Lwo1/a1;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Lkotlin/Function1;", "", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "Lyz5/l;", "getTaskChangeCallback", "()Lyz5/l;", "setTaskChangeCallback", "(Lyz5/l;)V", "taskChangeCallback", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView */
/* loaded from: classes5.dex */
public final class C12860xe75b74ec extends wo1.a1 {

    /* renamed from: A, reason: from kotlin metadata */
    public yz5.l taskChangeCallback;
    public java.lang.String B;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnClickListener f174290v;

    /* renamed from: w, reason: collision with root package name */
    public zo1.b4 f174291w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 f174292x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f174293y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f174294z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12860xe75b74ec(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // wo1.a1
    public void d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (this.f174294z) {
            super.d(pkgInfo, task, device, error);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6.e(c12859x4b4f7ad6, com.p314xaae8f345.mm.R.C30861xcebc809e.cwp, null, 2, null);
        c12859x4b4f7ad6.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.my_);
    }

    @Override // wo1.a1
    public void e(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.e(pkgInfo, task, device, i17);
            return;
        }
        r();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.a();
        w(pkgInfo, c12859x4b4f7ad6.getF174287e());
    }

    @Override // wo1.a1
    public void f(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.f(pkgInfo, task, device, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.c();
        c12859x4b4f7ad6.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.mzo);
    }

    @Override // wo1.a1
    public void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (this.f174294z) {
            super.g(pkgInfo, task, device, error);
            return;
        }
        boolean z17 = task.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        boolean z18 = (task instanceof qo1.v0) && ((qo1.v0) task).f447090x;
        boolean z19 = z17 && task.p();
        if (z17 && !z19 && !z18) {
            q(pkgInfo, task, device, -1);
            return;
        }
        if (!z17 || z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6.e(this.f174292x, com.p314xaae8f345.mm.R.C30861xcebc809e.cwp, null, 2, null);
        } else {
            this.f174292x.d(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, new android.graphics.PorterDuffColorFilter(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        if (z17) {
            this.f174292x.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.mzm);
        } else {
            this.f174292x.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.f574409n03);
        }
    }

    public final yz5.l getTaskChangeCallback() {
        return this.taskChangeCallback;
    }

    @Override // wo1.a1
    public void h(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (this.f174294z) {
            super.h(pkgInfo, task, device, error);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6.e(c12859x4b4f7ad6, com.p314xaae8f345.mm.R.C30861xcebc809e.cwp, null, 2, null);
        c12859x4b4f7ad6.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.a8c);
    }

    @Override // wo1.a1
    public void i(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a extState, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extState, "extState");
        if (this.f174294z) {
            super.i(pkgInfo, task, device, extState, obj);
            return;
        }
        int ordinal = extState.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        if (ordinal == 0) {
            java.lang.String c17 = obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : c(task);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6.e(c12859x4b4f7ad6, com.p314xaae8f345.mm.R.C30861xcebc809e.cwp, null, 2, null);
            android.widget.TextView textView = c12859x4b4f7ad6.f174287e;
            textView.setText(c12859x4b4f7ad6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n08, java.util.Arrays.copyOf(new java.lang.Object[]{c17}, 1)));
            textView.setVisibility(0);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.listeners.DeleteParams");
        io1.a aVar = (io1.a) obj;
        if (aVar.f374989e) {
            c12859x4b4f7ad6.a();
            c12859x4b4f7ad6.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.mvu);
            return;
        }
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mya);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.B = string;
        int i17 = (int) (aVar.f374988d * 100);
        c12859x4b4f7ad6.c();
        c12859x4b4f7ad6.m54003x765074af(this.B + ' ' + i17 + '%');
    }

    @Override // wo1.a1
    public void j(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.j(pkgInfo, task, device, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.b();
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n0b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c12859x4b4f7ad6.m54003x765074af(string);
        c12859x4b4f7ad6.m54005x61c36c0c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
    }

    @Override // wo1.a1
    public void k(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.k(pkgInfo, task, device, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.a();
        w(pkgInfo, c12859x4b4f7ad6.getF174287e());
    }

    @Override // wo1.a1
    public void l(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (this.f174294z) {
            super.l(pkgInfo, task, device, error);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        if (task.f447009b == o0Var) {
            c12859x4b4f7ad6.d(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, new android.graphics.PorterDuffColorFilter(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6.e(c12859x4b4f7ad6, com.p314xaae8f345.mm.R.C30861xcebc809e.cwp, null, 2, null);
        }
        c12859x4b4f7ad6.m54002x765074af(com.p314xaae8f345.mm.R.C30867xcad56011.mzl);
    }

    @Override // wo1.a1
    public void m(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.m(pkgInfo, task, device, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.c();
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.myb, ((qo1.f0) task) instanceof qo1.c1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        c12859x4b4f7ad6.m54003x765074af(string);
    }

    @Override // wo1.a1
    public void n(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (this.f174294z) {
            super.n(pkgInfo, task, device, error);
            return;
        }
        boolean z17 = task.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        boolean z18 = (task instanceof qo1.v0) && ((qo1.v0) task).f447090x;
        boolean z19 = z17 && task.p();
        if (z17 && !z19 && !z18) {
            q(pkgInfo, task, device, -1);
            return;
        }
        if (!z17 || z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6.e(this.f174292x, com.p314xaae8f345.mm.R.C30861xcebc809e.cwp, null, 2, null);
        } else {
            this.f174292x.d(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d, new android.graphics.PorterDuffColorFilter(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        java.lang.Object[] objArr = {c(task)};
        c12859x4b4f7ad6.getClass();
        android.widget.TextView textView = c12859x4b4f7ad6.f174287e;
        textView.setText(c12859x4b4f7ad6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n08, java.util.Arrays.copyOf(objArr, 1)));
        textView.setVisibility(0);
    }

    @Override // wo1.a1
    public void o(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, qo1.i0 error, po1.d device, int i17) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.o(pkgInfo, task, error, device, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.b();
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        qo1.f0 f0Var = (qo1.f0) task;
        if (f0Var instanceof qo1.c1) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.myc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (f0Var.o()) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.my8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.my9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        this.B = string;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
        c12859x4b4f7ad6.m54003x765074af(this.B + ' ' + ((int) ((a2Var != null ? a2Var.b() : 0.0f) * 100)) + '%');
        c12859x4b4f7ad6.m54005x61c36c0c(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19);
    }

    @Override // wo1.a1
    public void p(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.f0 task, po1.d device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (task.f447012e == null) {
            qo1.j1.f447056a.i(pkgInfo.f297362d);
            return;
        }
        java.lang.String b17 = device.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskStatusCardView", "popupConfirmStopMenu, taskType=" + task.f447009b + ", deviceName=" + b17);
        if (task.o()) {
            qo1.j1 j1Var = qo1.j1.f447056a;
            long j17 = task.f447016i;
            j1Var.i(j17);
            eo1.a.f337078a.b(j17, 86400000L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.q(j17);
            return;
        }
        int i17 = task instanceof qo1.c1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572224ab0 : com.p314xaae8f345.mm.R.C30867xcad56011.mwq;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(getContext(), 1, true);
        db5.h4 h4Var = new db5.h4(getContext(), 0, 0);
        int color = getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
        h4Var.f309909t = i17;
        h4Var.f309903n = color;
        k0Var.f293405n = new wo1.n1(h4Var);
        k0Var.f293414s = new wo1.o1(h4Var, task);
        java.lang.String string = task instanceof qo1.v0 ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mws, b17) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        k0Var.q(string, 17);
        k0Var.v();
    }

    @Override // wo1.a1
    public void q(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        if (this.f174294z) {
            super.q(pkgInfo, task, device, i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        c12859x4b4f7ad6.a();
        w(pkgInfo, c12859x4b4f7ad6.getF174287e());
    }

    @Override // wo1.a1
    public void r() {
        boolean z17 = this.f174294z;
        android.widget.LinearLayout linearLayout = this.f174293y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6 c12859x4b4f7ad6 = this.f174292x;
        if (z17) {
            linearLayout.setVisibility(0);
            c12859x4b4f7ad6.setVisibility(8);
            c12859x4b4f7ad6.a();
            super.r();
            return;
        }
        linearLayout.setVisibility(8);
        c12859x4b4f7ad6.setVisibility(0);
        c12859x4b4f7ad6.m54005x61c36c0c(com.p314xaae8f345.mm.R.C30859x5a72f63.adg);
        m174214xd0783aec().clearAnimation();
        m174222xcb110131(false);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f174290v = onClickListener;
        super.setOnClickListener(new wo1.p1(this));
    }

    /* renamed from: setTaskChangeCallback */
    public final void m54008xd93940fc(yz5.l lVar) {
        this.taskChangeCallback = lVar;
    }

    @Override // wo1.a1
    public void u(float f17, qo1.j0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f174294z) {
            super.u(f17, task);
            return;
        }
        this.f174292x.m54003x765074af(this.B + ' ' + ((int) (f17 * 100)) + '%');
    }

    public final void w(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, android.widget.TextView textView) {
        long j17 = 1000;
        long j18 = (gVar.f297370o.f297372e & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) * j17;
        if (j18 <= 0) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mzz);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0 h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().h(gVar.f297362d);
        long j19 = h17.f297423g * j17;
        long j27 = h17.f297421e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskStatusCardView", "pkgId = " + gVar.f297362d + ",lastBackupUpdateTime=" + j19 + ", lastStopOrErrorTime=" + j27 + ", timestamp=" + j18);
        if (j19 <= 0) {
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oeu, k35.m1.f(getContext(), j18, true, false)));
        } else if (j27 >= j19) {
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oet, k35.m1.f(getContext(), j27, true, false)));
        } else if (java.lang.System.currentTimeMillis() - j19 < 60000) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mwa);
        } else {
            textView.setText(k35.m1.f(getContext(), j19, true, false));
        }
    }

    public final void x(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, qo1.j0 task, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        this.f174294z = z17;
        v(pkgInfo, task, state, error);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12860xe75b74ec(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        this(context, attrs, i17, 0, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12860xe75b74ec(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto L6
            r4 = r0
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            r5 = r0
        Lb:
            java.lang.String r6 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r6)
            java.lang.String r6 = "attrs"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
            r1.<init>(r2, r3, r4, r5)
            r2 = 2131322302(0x7f0965be, float:1.8263251E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12859x4b4f7ad6) r2
            r1.f174292x = r2
            r2 = 2131322291(0x7f0965b3, float:1.8263229E38)
            android.view.View r2 = r1.findViewById(r2)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f174293y = r2
            java.lang.String r2 = ""
            r1.B = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12860xe75b74ec.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}
