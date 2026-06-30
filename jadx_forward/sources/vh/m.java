package vh;

/* loaded from: classes12.dex */
public class m extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f518326f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f518327g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f518328h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f518329i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f518330m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f518331n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f518332o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f518333p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f518334q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f518335r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f518336s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f518337t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f518338u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f518339v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f518340w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f518341x;

    public m(android.view.View view) {
        super(view);
        this.f518326f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqb);
        this.f518327g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        this.f518328h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqi);
        this.f518329i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oqj);
        this.f518330m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.oo7);
        this.f518331n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hlt);
        this.f518332o = view.findViewById(com.p314xaae8f345.mm.R.id.hwr);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hww);
        this.f518333p = findViewById;
        this.f518334q = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.onb);
        this.f518335r = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.onc);
        this.f518336s = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.om7);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.hwx);
        this.f518337t = findViewById2;
        this.f518338u = view.findViewById(com.p314xaae8f345.mm.R.id.hws);
        this.f518339v = view.findViewById(com.p314xaae8f345.mm.R.id.hwt);
        this.f518340w = view.findViewById(com.p314xaae8f345.mm.R.id.hwu);
        this.f518341x = view.findViewById(com.p314xaae8f345.mm.R.id.hwv);
        vh.k kVar = new vh.k(this);
        view.findViewById(com.p314xaae8f345.mm.R.id.hyj).setOnClickListener(kVar);
        view.findViewById(com.p314xaae8f345.mm.R.id.hxw).setOnClickListener(kVar);
        findViewById2.setOnClickListener(new vh.l(this));
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4643xdca56fd7 c4643xdca56fd7 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4643xdca56fd7) hVar;
        this.f518351d = c4643xdca56fd7;
        android.view.View view = this.f518332o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f518333p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f518337t;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f518338u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f518339v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f518340w;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.f518341x;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "resetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j(c4643xdca56fd7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.ui.C4643xdca56fd7 c4643xdca56fd7) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        boolean z18;
        android.view.View view;
        android.view.View inflate;
        android.view.View inflate2;
        boolean isEmpty = android.text.TextUtils.isEmpty(c4643xdca56fd7.f134159p.f134141i);
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord reportRecord = c4643xdca56fd7.f134159p;
        java.lang.String str3 = isEmpty ? "" : reportRecord.f134141i;
        str3.getClass();
        int i17 = -1;
        switch (str3.hashCode()) {
            case -1367725928:
                if (str3.equals("canary")) {
                    z17 = false;
                    break;
                }
                z17 = -1;
                break;
            case 529694916:
                if (str3.equals("overheat")) {
                    z17 = true;
                    break;
                }
                z17 = -1;
                break;
            case 570410685:
                if (str3.equals("internal")) {
                    z17 = 2;
                    break;
                }
                z17 = -1;
                break;
            default:
                z17 = -1;
                break;
        }
        switch (z17) {
            case false:
                if (reportRecord.b("app_fg", false)) {
                    str = "前台 Polling 监控";
                    str2 = "App 在前台时, 周期性地执行电量统计 (具体周期见时长)";
                    break;
                } else {
                    str = "待机功耗监控";
                    str2 = "App 进入后台并持续一段时间后 (待机), 再次切换到前台时执行一次电量统计。";
                    break;
                }
            case true:
                str = "Runnable 任务监控";
                str2 = "ThreadPool 等需要执行大量零碎 Runnable 的专项电量统计。";
                break;
            case true:
                str = "Matrix 内部监控";
                str2 = "Matrix 自身电量开销的监控, 避免电量监控框架自身导致的耗电问题";
                break;
            default:
                str = ": " + reportRecord.f134141i;
                str2 = "缺乏描述";
                break;
        }
        wh.c2 c2Var = vh.s.f518350e;
        this.f518326f.setText(((java.text.DateFormat) c2Var.b()).format(new java.util.Date(c4643xdca56fd7.f134133e)));
        this.f518330m.setRotation(c4643xdca56fd7.f134160q ? 180.0f : 0.0f);
        android.view.View view2 = this.f518332o;
        int i18 = c4643xdca56fd7.f134160q ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f518327g.setText(str);
        this.f518328h.setText(((java.text.DateFormat) c2Var.b()).format(new java.util.Date(c4643xdca56fd7.f134133e - c4643xdca56fd7.f134142m)) + " ~ " + ((java.text.DateFormat) c2Var.b()).format(new java.util.Date(c4643xdca56fd7.f134133e)));
        java.util.Iterator it = reportRecord.f134138h.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (str4.endsWith("_overheat") && reportRecord.b(str4, false)) {
                    z18 = true;
                }
            } else {
                z18 = false;
            }
        }
        android.widget.TextView textView = this.f518329i;
        android.widget.ImageView imageView = this.f518331n;
        if (z18) {
            imageView.setImageLevel(4);
            textView.setText("#OVERHEAT");
        } else {
            imageView.setImageLevel(2);
            textView.setText("正常");
        }
        if (c4643xdca56fd7.f134160q) {
            this.f518334q.setText("模式: " + c4643xdca56fd7.f134141i);
            this.f518335r.setText("时长: " + java.lang.Math.max(1L, c4643xdca56fd7.f134142m / 60000) + "min");
            if (!android.text.TextUtils.isEmpty(null)) {
                str2 = null;
            }
            this.f518336s.setText(str2);
            android.view.View view3 = this.f518337t;
            int i19 = !c4643xdca56fd7.f134143n.isEmpty() ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean isEmpty2 = c4643xdca56fd7.f134143n.isEmpty();
            float f17 = 5.0f;
            int i27 = -2;
            int i28 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cvo;
            if (!isEmpty2) {
                boolean b17 = reportRecord.b("jiffy_overheat", false);
                android.view.View view4 = this.f518337t;
                android.widget.TextView textView2 = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.onb);
                textView2.setTextColor(textView2.getResources().getColor(b17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.alp : com.p314xaae8f345.mm.R.C30859x5a72f63.all));
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view4.findViewById(com.p314xaae8f345.mm.R.id.hwn);
                int childCount = linearLayout.getChildCount();
                for (int i29 = 0; i29 < childCount; i29++) {
                    android.view.View childAt = linearLayout.getChildAt(i29);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                int i37 = 0;
                while (i37 < 5) {
                    if (i37 < c4643xdca56fd7.f134143n.size()) {
                        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.ThreadInfo threadInfo = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.ThreadInfo) c4643xdca56fd7.f134143n.get(i37);
                        if (i37 < childCount) {
                            inflate2 = linearLayout.getChildAt(i37);
                        } else {
                            inflate2 = android.view.LayoutInflater.from(linearLayout.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvo, (android.view.ViewGroup) linearLayout, false);
                            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, i27);
                            layoutParams.topMargin = (int) android.util.TypedValue.applyDimension(1, f17, linearLayout.getContext().getResources().getDisplayMetrics());
                            linearLayout.addView(inflate2, layoutParams);
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(inflate2, arrayList4.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(inflate2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.onr);
                        android.widget.TextView textView4 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.oqs);
                        textView3.setVisibility(threadInfo != null ? 0 : 8);
                        textView4.setVisibility(threadInfo != null ? 0 : 8);
                        if (threadInfo != null) {
                            textView3.setText(threadInfo.f134149e);
                            textView4.setText(threadInfo.f134148d + " / " + java.lang.Math.max(1L, (threadInfo.f134151g * 10) / 60000) + "min / " + threadInfo.f134150f);
                            i37++;
                            i17 = -1;
                            f17 = 5.0f;
                            i27 = -2;
                        }
                    }
                    i37++;
                    i17 = -1;
                    f17 = 5.0f;
                    i27 = -2;
                }
            }
            int i38 = 1;
            for (int i39 = 4; i38 <= i39; i39 = 4) {
                if (i38 == 1) {
                    view = this.f518338u;
                } else if (i38 == 2) {
                    view = this.f518339v;
                } else if (i38 == 3) {
                    view = this.f518340w;
                } else {
                    if (i38 != i39) {
                        throw new java.lang.IndexOutOfBoundsException("entryList section out of bound: " + i38);
                    }
                    view = this.f518341x;
                }
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.EntryInfo entryInfo = i38 <= c4643xdca56fd7.f134144o.size() ? (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.EntryInfo) c4643xdca56fd7.f134144o.get(i38 - 1) : null;
                int i47 = entryInfo != null ? 0 : 8;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(java.lang.Integer.valueOf(i47));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view, arrayList5.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.ReportRecord.EntryInfo entryInfo2 = entryInfo;
                yj0.a.f(view, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (entryInfo2 != null) {
                    ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.onb)).setText(entryInfo2.f134145d);
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.hwn);
                    int childCount2 = linearLayout2.getChildCount();
                    for (int i48 = 0; i48 < childCount2; i48++) {
                        android.view.View childAt2 = linearLayout2.getChildAt(i48);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(childAt2, arrayList6.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(childAt2, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    int i49 = 0;
                    for (java.util.Map.Entry entry : entryInfo2.f134147f.entrySet()) {
                        i49++;
                        if (i49 > 6) {
                            break;
                        }
                        if (i49 < childCount2) {
                            inflate = linearLayout2.getChildAt(i49);
                        } else {
                            inflate = android.view.LayoutInflater.from(linearLayout2.getContext()).inflate(i28, (android.view.ViewGroup) linearLayout2, false);
                            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                            layoutParams2.topMargin = (int) android.util.TypedValue.applyDimension(1, 5.0f, linearLayout2.getContext().getResources().getDisplayMetrics());
                            linearLayout2.addView(inflate, layoutParams2);
                        }
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(inflate, arrayList7.toArray(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(inflate, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$ViewHolder$EventDumpHolder", "updateView", "(Lcom/tencent/matrix/batterycanary/stats/ui/BatteryStatsAdapter$Item$EventDumpItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.onr);
                        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqs);
                        textView5.setText((java.lang.CharSequence) entry.getKey());
                        textView6.setText((java.lang.CharSequence) entry.getValue());
                        i28 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cvo;
                    }
                }
                i38++;
                i28 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cvo;
            }
        }
    }
}
