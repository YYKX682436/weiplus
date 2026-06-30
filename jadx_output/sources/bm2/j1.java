package bm2;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.o1 f21999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f22000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f22001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22002g;

    public j1(bm2.o1 o1Var, bm2.h1 h1Var, dk2.zf zfVar, int i17) {
        this.f21999d = o1Var;
        this.f22000e = h1Var;
        this.f22001f = zfVar;
        this.f22002g = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        boolean z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        bm2.o1 o1Var = this.f21999d;
        if (action == 0) {
            z17 = false;
            o1Var.f22185r = false;
            o1Var.f22184q = new jz5.l(java.lang.Integer.valueOf((int) motionEvent.getRawX()), java.lang.Integer.valueOf((int) motionEvent.getRawY()));
            com.tencent.mars.xlog.Log.i(o1Var.f22179i, "touch down");
        } else {
            if (action == 1) {
                if (o1Var.f22185r) {
                    com.tencent.mars.xlog.Log.i(o1Var.f22179i, "touch up, but longClickHandled");
                    yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
                o1Var.f22184q = new jz5.l(java.lang.Integer.valueOf((int) motionEvent.getRawX()), java.lang.Integer.valueOf((int) motionEvent.getRawY()));
                dk2.ef efVar = dk2.ef.f233372a;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                o1Var.f22186s = pm0.v.z(c1Var != null ? c1Var.f328807g2 : 0, 8);
                ae2.in inVar = ae2.in.f3688a;
                int intValue = ((java.lang.Number) ae2.in.f3746f7.r()).intValue();
                int i17 = this.f22002g;
                bm2.h1 h1Var = this.f22000e;
                dk2.zf zfVar = this.f22001f;
                if (intValue == 1) {
                    boolean contains = pm0.v.r(h1Var.f21929g).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    if (zfVar == null || !contains) {
                        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
                        if (c1Var2 != null) {
                            java.lang.String str = o1Var.f22179i;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSingleTapConfirmed: OnClick IndexOutOfBounds! liveMsg-null:");
                            sb6.append(zfVar == null);
                            sb6.append(", isContains:");
                            sb6.append(contains);
                            sb6.append(", position:");
                            sb6.append(i17);
                            sb6.append(" commentList.size:");
                            sb6.append(o1Var.f22180m.size());
                            sb6.append(" view:");
                            sb6.append(h1Var.itemView);
                            sb6.append(", isInInputState:");
                            sb6.append(o1Var.f22186s);
                            com.tencent.mars.xlog.Log.w(str, sb6.toString());
                            if (!o1Var.f22186s && !zl2.r4.f473950a.w1()) {
                                c1Var2.N1 = true;
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) c1Var2.business(mm2.c1.class)).N1);
                                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                                if (k0Var != null) {
                                    k0Var.statusChange(qo0.b.Z2, bundle);
                                }
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(o1Var.f22179i, "onSingleTapConfirmed: topComment,content:" + zfVar.j() + ",position:" + i17);
                        yz5.q qVar = o1Var.f22181n;
                        if (qVar != null) {
                            android.view.View itemView = h1Var.itemView;
                            kotlin.jvm.internal.o.f(itemView, "itemView");
                            qVar.invoke(zfVar, itemView, h1Var);
                        }
                    }
                    z18 = contains;
                } else {
                    if (zfVar != null) {
                        com.tencent.mars.xlog.Log.i(o1Var.f22179i, "onSingleTapConfirmed: topComment,content:" + zfVar.j() + ",position:" + i17);
                        yz5.q qVar2 = o1Var.f22181n;
                        if (qVar2 != null) {
                            android.view.View itemView2 = h1Var.itemView;
                            kotlin.jvm.internal.o.f(itemView2, "itemView");
                            qVar2.invoke(zfVar, itemView2, h1Var);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w(o1Var.f22179i, "onSingleTapConfirmed: OnClick IndexOutOfBounds! position:" + i17 + " commentList.size:" + o1Var.f22180m.size() + " view:" + h1Var.itemView);
                    }
                    z18 = true;
                }
                com.tencent.mars.xlog.Log.i(o1Var.f22179i, "onTouchEvent-result = " + z18 + ", isInInputState:" + o1Var.f22186s);
                yj0.a.i(z18, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return z18;
            }
            if (action == 2) {
                o1Var.f22184q = new jz5.l(java.lang.Integer.valueOf((int) motionEvent.getRawX()), java.lang.Integer.valueOf((int) motionEvent.getRawY()));
            }
            z17 = false;
        }
        z18 = z17;
        yj0.a.i(z18, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$_onBindViewHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z18;
    }
}
