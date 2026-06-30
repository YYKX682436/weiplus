package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class u9 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 f289638d;

    public u9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var) {
        this.f289638d = x9Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        java.util.HashMap hashMap;
        java.util.Collection values;
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606 c22363xe804606 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var = this.f289638d;
        c22363xe804606.m(x9Var.f289772a, x9Var.f289773b, true, true, false);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var = x9Var.f289774c;
        if (o5Var != null && (viewOnTouchListenerC22366xcd5c2226 = o5Var.f289459f) != null) {
            int childCount = viewOnTouchListenerC22366xcd5c2226.getChildCount();
            int i27 = 0;
            while (true) {
                if (i27 >= childCount) {
                    break;
                }
                android.view.View childAt = viewOnTouchListenerC22366xcd5c2226.getChildAt(i27);
                android.view.View findViewById = childAt != null ? childAt.findViewById(com.p314xaae8f345.mm.R.id.f565477cj1) : null;
                if (findViewById != null && (findViewById.getTag() instanceof yf5.n)) {
                    java.lang.Object tag = findViewById.getTag();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.adapter.ConvViewHolder");
                    yf5.n nVar = (yf5.n) tag;
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(nVar.f543459m)) {
                        yf5.j0 j0Var = o5Var.f289457d;
                        if (j0Var == null || (hashMap = ((yf5.w0) j0Var).f543518q.f543379c) == null || (values = hashMap.values()) == null) {
                            l4Var = null;
                        } else {
                            java.util.Iterator it = values.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it.next();
                                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj).f276618g2 == 66) {
                                        break;
                                    }
                                }
                            }
                            l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj;
                        }
                        if (!(l4Var != null)) {
                            if (childAt.getBottom() <= o5Var.f289469s) {
                                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.h(o5Var, 8, false, 2, null);
                            } else {
                                o5Var.f(0, false);
                            }
                        }
                    }
                    if (nVar.f543460n) {
                        if (nVar.f543467u != 0 && childAt.getBottom() >= o5Var.f289469s) {
                            o5Var.f(0, false);
                            break;
                        }
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.h(o5Var, 8, false, 2, null);
                    } else if (childAt.getTop() <= o5Var.f289469s) {
                        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5.h(o5Var, 8, false, 2, null);
                        break;
                    }
                }
                i27++;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9 x9Var = this.f289638d;
        if (i17 != 0) {
            x9Var.b();
        } else {
            if (x9Var.f289772a == null) {
                yj0.a.h(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x9.a(x9Var, -1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/PreLoadHelper$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
