package com.tencent.mm.plugin.backup.roambackup.ui.component;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/TaskStatusCardView;", "Lwo1/a1;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "Lkotlin/Function1;", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lyz5/l;", "getTaskChangeCallback", "()Lyz5/l;", "setTaskChangeCallback", "(Lyz5/l;)V", "taskChangeCallback", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TaskStatusCardView extends wo1.a1 {

    /* renamed from: A, reason: from kotlin metadata */
    public yz5.l taskChangeCallback;
    public java.lang.String B;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View.OnClickListener f92757v;

    /* renamed from: w, reason: collision with root package name */
    public zo1.b4 f92758w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView f92759x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f92760y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f92761z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaskStatusCardView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // wo1.a1
    public void d(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92761z) {
            super.d(pkgInfo, task, device, error);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView.e(statusWithIconView, com.tencent.mm.R.drawable.cwp, null, 2, null);
        statusWithIconView.setText(com.tencent.mm.R.string.my_);
    }

    @Override // wo1.a1
    public void e(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.e(pkgInfo, task, device, i17);
            return;
        }
        r();
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.a();
        w(pkgInfo, statusWithIconView.getF92754e());
    }

    @Override // wo1.a1
    public void f(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.f(pkgInfo, task, device, i17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.c();
        statusWithIconView.setText(com.tencent.mm.R.string.mzo);
    }

    @Override // wo1.a1
    public void g(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92761z) {
            super.g(pkgInfo, task, device, error);
            return;
        }
        boolean z17 = task.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        boolean z18 = (task instanceof qo1.v0) && ((qo1.v0) task).f365557x;
        boolean z19 = z17 && task.p();
        if (z17 && !z19 && !z18) {
            q(pkgInfo, task, device, -1);
            return;
        }
        if (!z17 || z19) {
            com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView.e(this.f92759x, com.tencent.mm.R.drawable.cwp, null, 2, null);
        } else {
            this.f92759x.d(com.tencent.mm.R.raw.exclamation_mark_circle_regular, new android.graphics.PorterDuffColorFilter(getContext().getColor(com.tencent.mm.R.color.FG_1), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        if (z17) {
            this.f92759x.setText(com.tencent.mm.R.string.mzm);
        } else {
            this.f92759x.setText(com.tencent.mm.R.string.f492876n03);
        }
    }

    public final yz5.l getTaskChangeCallback() {
        return this.taskChangeCallback;
    }

    @Override // wo1.a1
    public void h(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92761z) {
            super.h(pkgInfo, task, device, error);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView.e(statusWithIconView, com.tencent.mm.R.drawable.cwp, null, 2, null);
        statusWithIconView.setText(com.tencent.mm.R.string.a8c);
    }

    @Override // wo1.a1
    public void i(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, com.tencent.mm.plugin.backup.roambackup.a extState, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(extState, "extState");
        if (this.f92761z) {
            super.i(pkgInfo, task, device, extState, obj);
            return;
        }
        int ordinal = extState.ordinal();
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        if (ordinal == 0) {
            java.lang.String c17 = obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() ? com.tencent.mm.plugin.backup.roambackup.w1.f92923a : com.tencent.mm.plugin.backup.roambackup.w1.f92924b : c(task);
            com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView.e(statusWithIconView, com.tencent.mm.R.drawable.cwp, null, 2, null);
            android.widget.TextView textView = statusWithIconView.f92754e;
            textView.setText(statusWithIconView.getContext().getString(com.tencent.mm.R.string.n08, java.util.Arrays.copyOf(new java.lang.Object[]{c17}, 1)));
            textView.setVisibility(0);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.roambackup.listeners.DeleteParams");
        io1.a aVar = (io1.a) obj;
        if (aVar.f293456e) {
            statusWithIconView.a();
            statusWithIconView.setText(com.tencent.mm.R.string.mvu);
            return;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.mya);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.B = string;
        int i17 = (int) (aVar.f293455d * 100);
        statusWithIconView.c();
        statusWithIconView.setText(this.B + ' ' + i17 + '%');
    }

    @Override // wo1.a1
    public void j(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.j(pkgInfo, task, device, i17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.b();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String string = context.getString(com.tencent.mm.R.string.n0b);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        statusWithIconView.setText(string);
        statusWithIconView.setTextColorRes(com.tencent.mm.R.color.Brand_100);
    }

    @Override // wo1.a1
    public void k(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.k(pkgInfo, task, device, i17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.a();
        w(pkgInfo, statusWithIconView.getF92754e());
    }

    @Override // wo1.a1
    public void l(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92761z) {
            super.l(pkgInfo, task, device, error);
            return;
        }
        com.tencent.wechat.aff.affroam.o0 o0Var = com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        if (task.f365476b == o0Var) {
            statusWithIconView.d(com.tencent.mm.R.raw.exclamation_mark_circle_regular, new android.graphics.PorterDuffColorFilter(getContext().getColor(com.tencent.mm.R.color.FG_1), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView.e(statusWithIconView, com.tencent.mm.R.drawable.cwp, null, 2, null);
        }
        statusWithIconView.setText(com.tencent.mm.R.string.mzl);
    }

    @Override // wo1.a1
    public void m(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.m(pkgInfo, task, device, i17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.c();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String string = context.getString(com.tencent.mm.R.string.myb, ((qo1.f0) task) instanceof qo1.c1 ? com.tencent.mm.plugin.backup.roambackup.w1.f92924b : com.tencent.mm.plugin.backup.roambackup.w1.f92923a);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        statusWithIconView.setText(string);
    }

    @Override // wo1.a1
    public void n(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device, qo1.i0 error) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92761z) {
            super.n(pkgInfo, task, device, error);
            return;
        }
        boolean z17 = task.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
        boolean z18 = (task instanceof qo1.v0) && ((qo1.v0) task).f365557x;
        boolean z19 = z17 && task.p();
        if (z17 && !z19 && !z18) {
            q(pkgInfo, task, device, -1);
            return;
        }
        if (!z17 || z19) {
            com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView.e(this.f92759x, com.tencent.mm.R.drawable.cwp, null, 2, null);
        } else {
            this.f92759x.d(com.tencent.mm.R.raw.exclamation_mark_circle_regular, new android.graphics.PorterDuffColorFilter(getContext().getColor(com.tencent.mm.R.color.FG_1), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        java.lang.Object[] objArr = {c(task)};
        statusWithIconView.getClass();
        android.widget.TextView textView = statusWithIconView.f92754e;
        textView.setText(statusWithIconView.getContext().getString(com.tencent.mm.R.string.n08, java.util.Arrays.copyOf(objArr, 1)));
        textView.setVisibility(0);
    }

    @Override // wo1.a1
    public void o(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, qo1.i0 error, po1.d device, int i17) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(error, "error");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.o(pkgInfo, task, error, device, i17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.b();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qo1.f0 f0Var = (qo1.f0) task;
        if (f0Var instanceof qo1.c1) {
            string = context.getString(com.tencent.mm.R.string.myc);
            kotlin.jvm.internal.o.d(string);
        } else if (f0Var.o()) {
            string = context.getString(com.tencent.mm.R.string.my8);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = context.getString(com.tencent.mm.R.string.my9);
            kotlin.jvm.internal.o.d(string);
        }
        this.B = string;
        com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
        statusWithIconView.setText(this.B + ' ' + ((int) ((a2Var != null ? a2Var.b() : 0.0f) * 100)) + '%');
        statusWithIconView.setTextColorRes(com.tencent.mm.R.color.Brand_100);
    }

    @Override // wo1.a1
    public void p(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.f0 task, po1.d device) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (task.f365479e == null) {
            qo1.j1.f365523a.i(pkgInfo.f215829d);
            return;
        }
        java.lang.String b17 = device.b();
        com.tencent.mars.xlog.Log.i("TaskStatusCardView", "popupConfirmStopMenu, taskType=" + task.f365476b + ", deviceName=" + b17);
        if (task.o()) {
            qo1.j1 j1Var = qo1.j1.f365523a;
            long j17 = task.f365483i;
            j1Var.i(j17);
            eo1.a.f255545a.b(j17, 86400000L);
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(j17);
            return;
        }
        int i17 = task instanceof qo1.c1 ? com.tencent.mm.R.string.f490691ab0 : com.tencent.mm.R.string.mwq;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(getContext(), 1, true);
        db5.h4 h4Var = new db5.h4(getContext(), 0, 0);
        int color = getContext().getColor(com.tencent.mm.R.color.Red_100);
        h4Var.f228376t = i17;
        h4Var.f228370n = color;
        k0Var.f211872n = new wo1.n1(h4Var);
        k0Var.f211881s = new wo1.o1(h4Var, task);
        java.lang.String string = task instanceof qo1.v0 ? getContext().getString(com.tencent.mm.R.string.mws, b17) : getContext().getString(com.tencent.mm.R.string.mwt);
        kotlin.jvm.internal.o.d(string);
        k0Var.q(string, 17);
        k0Var.v();
    }

    @Override // wo1.a1
    public void q(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, po1.d device, int i17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(device, "device");
        if (this.f92761z) {
            super.q(pkgInfo, task, device, i17);
            return;
        }
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        statusWithIconView.a();
        w(pkgInfo, statusWithIconView.getF92754e());
    }

    @Override // wo1.a1
    public void r() {
        boolean z17 = this.f92761z;
        android.widget.LinearLayout linearLayout = this.f92760y;
        com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView statusWithIconView = this.f92759x;
        if (z17) {
            linearLayout.setVisibility(0);
            statusWithIconView.setVisibility(8);
            statusWithIconView.a();
            super.r();
            return;
        }
        linearLayout.setVisibility(8);
        statusWithIconView.setVisibility(0);
        statusWithIconView.setTextColorRes(com.tencent.mm.R.color.adg);
        getIconSquare().clearAnimation();
        setNeedRotateAnimation(false);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f92757v = onClickListener;
        super.setOnClickListener(new wo1.p1(this));
    }

    public final void setTaskChangeCallback(yz5.l lVar) {
        this.taskChangeCallback = lVar;
    }

    @Override // wo1.a1
    public void u(float f17, qo1.j0 task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f92761z) {
            super.u(f17, task);
            return;
        }
        this.f92759x.setText(this.B + ' ' + ((int) (f17 * 100)) + '%');
    }

    public final void w(com.tencent.wechat.aff.affroam.g gVar, android.widget.TextView textView) {
        long j17 = 1000;
        long j18 = (gVar.f215837o.f215839e & io.flutter.embedding.android.KeyboardMap.kValueMask) * j17;
        if (j18 <= 0) {
            textView.setText(com.tencent.mm.R.string.mzz);
            return;
        }
        com.tencent.wechat.aff.affroam.l0 h17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().h(gVar.f215829d);
        long j19 = h17.f215890g * j17;
        long j27 = h17.f215888e;
        com.tencent.mars.xlog.Log.i("TaskStatusCardView", "pkgId = " + gVar.f215829d + ",lastBackupUpdateTime=" + j19 + ", lastStopOrErrorTime=" + j27 + ", timestamp=" + j18);
        if (j19 <= 0) {
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.oeu, k35.m1.f(getContext(), j18, true, false)));
        } else if (j27 >= j19) {
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.oet, k35.m1.f(getContext(), j27, true, false)));
        } else if (java.lang.System.currentTimeMillis() - j19 < 60000) {
            textView.setText(com.tencent.mm.R.string.mwa);
        } else {
            textView.setText(k35.m1.f(getContext(), j19, true, false));
        }
    }

    public final void x(com.tencent.wechat.aff.affroam.g pkgInfo, qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error, boolean z17) {
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        this.f92761z = z17;
        v(pkgInfo, task, state, error);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaskStatusCardView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        this(context, attrs, i17, 0, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TaskStatusCardView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
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
            kotlin.jvm.internal.o.g(r2, r6)
            java.lang.String r6 = "attrs"
            kotlin.jvm.internal.o.g(r3, r6)
            r1.<init>(r2, r3, r4, r5)
            r2 = 2131322302(0x7f0965be, float:1.8263251E38)
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView r2 = (com.tencent.mm.plugin.backup.roambackup.ui.component.StatusWithIconView) r2
            r1.f92759x = r2
            r2 = 2131322291(0x7f0965b3, float:1.8263229E38)
            android.view.View r2 = r1.findViewById(r2)
            kotlin.jvm.internal.o.f(r2, r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.f92760y = r2
            java.lang.String r2 = ""
            r1.B = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.ui.component.TaskStatusCardView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }
}
