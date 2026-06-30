package gp2;

/* loaded from: classes10.dex */
public final class d0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355744d;

    public d0(gp2.l0 l0Var) {
        this.f355744d = l0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        gp2.l0 l0Var = this.f355744d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "onScrollStateChanged newState:" + i17);
        gp2.q0 q0Var = l0Var.f355799y;
        if (q0Var != null) {
            if (i17 == 0) {
                if (!q0Var.f355836n && q0Var.f355835m) {
                    q0Var.f355832g.mo146xb9724478(java.lang.Integer.valueOf(q0Var.f355833h));
                }
                if (q0Var.f355837o && q0Var.f355838p != null && q0Var.f355830e) {
                    pm0.v.K(null, new gp2.p0(q0Var));
                }
                q0Var.f355836n = false;
            } else if (i17 == 1) {
                q0Var.f355837o = true;
            } else if (i17 == 2) {
                q0Var.f355836n = true;
            }
        }
        if (i17 == 0) {
            l0Var.g();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        gp2.l0 l0Var = this.f355744d;
        l0Var.j();
        gp2.q0 q0Var = l0Var.f355799y;
        if (q0Var != null) {
            if (q0Var.f355835m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled return for isInvokeAutoPlayCallback");
            } else if (q0Var.f355833h < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled return for onTouchPos:" + q0Var.f355833h);
            } else {
                if (q0Var.f355834i == 0) {
                    q0Var.f355834i = i18;
                }
                if (java.lang.Math.abs(i18 - q0Var.f355834i) > 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled hit auto play pos:" + q0Var.f355833h + " (" + q0Var.f355834i + ", " + i18 + ')');
                    q0Var.f355831f.mo146xb9724478(java.lang.Integer.valueOf(q0Var.f355833h));
                    q0Var.f355835m = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "handleOnScrolled auto play pos:" + q0Var.f355833h + " (" + q0Var.f355834i + ", " + i18 + " move:" + java.lang.Math.abs(i18 - q0Var.f355834i) + " threshold:1");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/play/NearbyLiveAutoPlayManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
