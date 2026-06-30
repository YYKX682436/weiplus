package cj5;

/* loaded from: classes.dex */
public final class l2 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f42181d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f42182e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f42183f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f42184g;

    /* renamed from: h, reason: collision with root package name */
    public xm3.t0 f42185h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f42186i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f42187m;

    /* renamed from: n, reason: collision with root package name */
    public final jn5.i f42188n;

    /* renamed from: o, reason: collision with root package name */
    public final cj5.s1 f42189o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f42190p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42181d = jz5.h.b(new cj5.i2(this));
        this.f42182e = jz5.h.b(new cj5.k2(activity));
        this.f42183f = jz5.h.b(new cj5.q1(this));
        this.f42184g = jz5.h.b(new cj5.z1(activity));
        this.f42186i = jz5.h.b(new cj5.h2(this, activity));
        long j17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.newlife.RepairerConfigNewLifeDebugSwitch1()) == 1 ? 5000L : 250L;
        jn5.i iVar = new jn5.i(new cj5.r1(this));
        iVar.f12169d = j17;
        iVar.f12170e = j17;
        iVar.f12168c = j17;
        iVar.f12171f = 0L;
        this.f42188n = iVar;
        this.f42189o = new cj5.s1();
        this.f42190p = jz5.h.b(new cj5.w1(this));
    }

    public static final void U6(cj5.l2 l2Var, android.content.Intent intent) {
        int intExtra = l2Var.getActivity().getIntent().getIntExtra("max_limit_num", -1);
        if (intExtra > 0) {
            intent.putExtra("max_limit_num", intExtra);
        }
        int intExtra2 = l2Var.getActivity().getIntent().getIntExtra("Select_Conv_Type", -1);
        if (intExtra2 >= 0) {
            intent.putExtra("Select_Conv_Type", intExtra2);
        }
    }

    public final void V6() {
        int a07;
        int a08;
        android.view.View findViewByPosition;
        j75.f stateCenter;
        wi5.n0 n0Var;
        xm3.t0 t0Var = this.f42185h;
        if (t0Var == null) {
            return;
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if ((P6 == null || (stateCenter = P6.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter.getState()) == null) ? false : n0Var.f446321q) {
            if (this.f42188n.A != null) {
                return;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = Y6().k().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int y17 = linearLayoutManager.y();
            int w17 = linearLayoutManager.w();
            if (y17 == -1 || w17 == -1 || w17 > y17) {
                return;
            }
            java.util.ArrayList arrayList = t0Var.I.f152065o;
            if (!arrayList.isEmpty() && arrayList.size() > (a08 = y17 - (a07 = t0Var.a0()))) {
                int i17 = Integer.MAX_VALUE;
                if (w17 <= y17) {
                    while (true) {
                        int i18 = w17 - a07;
                        if (i18 >= 0 && arrayList.size() > i18 && kotlin.jvm.internal.o.b(((ri5.j) arrayList.get(i18)).f396111f, "message_fold")) {
                            i17 = w17;
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
                si5.c cVar = ((ri5.j) arrayList.get(a08)).f396113h;
                kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type T of com.tencent.mm.ui.mvvm.item.SelectContactListItem.getItemExtension");
                vi5.f fVar = (vi5.f) cVar;
                if (i17 > y17) {
                    r2 = fVar.f437627g;
                } else if (i17 == y17 && (findViewByPosition = linearLayoutManager.findViewByPosition(i17)) != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    findViewByPosition.getGlobalVisibleRect(rect);
                    r2 = !(rect.height() >= findViewByPosition.getHeight());
                    rect.toString();
                    rect.height();
                    rect.width();
                    findViewByPosition.getHeight();
                    findViewByPosition.getWidth();
                }
                c7(r2);
            }
        }
    }

    public final void W6(android.content.Intent intent, int i17) {
        java.lang.String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("Select_Conv_User")) == null) {
            return;
        }
        java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList(f07);
            pm0.v.d0(linkedList, cj5.o1.f42206d);
            int i18 = i17 == 2306836 ? 2 : 1;
            if (!((wi5.n0) Q6.getState()).e()) {
                Q6.B3(new wi5.c0(linkedList, -1));
                return;
            }
            wi5.m0 m0Var = new wi5.m0(linkedList, -1);
            m0Var.f446311c = i18;
            Q6.B3(m0Var);
        }
    }

    public final android.widget.LinearLayout X6() {
        return (android.widget.LinearLayout) ((jz5.n) this.f42183f).getValue();
    }

    public final em.l2 Y6() {
        return (em.l2) ((jz5.n) this.f42181d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj5.l2.Z6():void");
    }

    public final boolean a7() {
        j75.f stateCenter;
        wi5.n0 n0Var;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter.getState()) == null) {
            return false;
        }
        return n0Var.f446322r;
    }

    public final void b7(java.util.List list) {
        j75.f stateCenter;
        if (list != null) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
            wi5.n0 n0Var = (P6 == null || (stateCenter = P6.getStateCenter()) == null) ? null : (wi5.n0) stateCenter.getState();
            if (n0Var != null) {
                n0Var.f446323s = list.size();
            }
        }
        this.f42187m = list;
    }

    public final void c7(boolean z17) {
        int visibility = X6().getVisibility();
        X6().setVisibility(z17 ? 0 : 8);
        if (visibility != X6().getVisibility()) {
            X6().post(new cj5.j2(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7() {
        /*
            r6 = this;
            em.l2 r0 = r6.Y6()
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.k()
            java.lang.String r1 = "getSelectContactRv(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = xm3.u0.a(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L40
            java.util.ArrayList r0 = r0.f152065o
            if (r0 == 0) goto L40
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            r4 = r3
            ri5.j r4 = (ri5.j) r4
            int r4 = r4.f396110e
            ri5.h r5 = ri5.j.I
            int r5 = ri5.j.f396106p0
            if (r4 != r5) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = r1
        L35:
            if (r4 == 0) goto L1d
            goto L39
        L38:
            r3 = r2
        L39:
            ri5.j r3 = (ri5.j) r3
            if (r3 == 0) goto L40
            si5.c r0 = r3.f396113h
            goto L41
        L40:
            r0 = r2
        L41:
            boolean r3 = r0 instanceof vi5.d
            if (r3 == 0) goto L48
            r2 = r0
            vi5.d r2 = (vi5.d) r2
        L48:
            if (r2 == 0) goto L68
            boolean r0 = r6.a7()
            r2.f437618i = r0
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r0 = r6.P6()
            if (r0 == 0) goto L66
            j75.f r0 = r0.getStateCenter()
            if (r0 == 0) goto L66
            j75.a r0 = r0.getState()
            wi5.n0 r0 = (wi5.n0) r0
            if (r0 == 0) goto L66
            int r1 = r0.f446323s
        L66:
            r2.f437619j = r1
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj5.l2.d7():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 2306836 && i18 == -1 && intent != null) {
            W6(intent, 2306836);
        } else if (i17 == 2306837 && i18 == -1 && intent != null) {
            W6(intent, 2306837);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        wi5.n0 n0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate() called isHasPlaceTopFoldFlowBtn:");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        sb6.append((P6 == null || (stateCenter2 = P6.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter2.getState()) == null) ? false : n0Var.f446321q);
        sb6.append(" isPlaceTopFoldStatus:");
        sb6.append(a7());
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", sb6.toString());
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new cj5.f2(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
