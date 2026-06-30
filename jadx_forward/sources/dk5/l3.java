package dk5;

/* loaded from: classes9.dex */
public class l3 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f316254d = new android.util.SparseArray(0);

    /* renamed from: e, reason: collision with root package name */
    public int f316255e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316256f;

    public l3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316256f = activityC22571x51759e93;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        int i27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316256f;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p6 p6Var = activityC22571x51759e93.f292515b2;
        if (p6Var != null) {
            ?? r102 = p6Var.f288623u;
            android.widget.RelativeLayout relativeLayout = activityC22571x51759e93.C;
            int i28 = 0;
            if (relativeLayout != null) {
                if (i17 > r102) {
                    relativeLayout.setVisibility(0);
                    if (activityC22571x51759e93.f292515b2.G) {
                        activityC22571x51759e93.D.setBackground(activityC22571x51759e93.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.agd));
                        activityC22571x51759e93.E.setBackground(activityC22571x51759e93.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.agd));
                    }
                } else {
                    relativeLayout.setVisibility(8);
                }
            }
            this.f316255e = i17;
            android.view.View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                android.util.SparseArray sparseArray = this.f316254d;
                dk5.a3 a3Var = (dk5.a3) sparseArray.get(i17);
                if (a3Var == null) {
                    a3Var = new dk5.a3(this);
                }
                a3Var.f316026a = childAt.getHeight();
                a3Var.f316027b = childAt.getTop();
                sparseArray.append(i17, a3Var);
                int i29 = 0;
                while (true) {
                    i27 = this.f316255e;
                    if (i28 >= i27) {
                        break;
                    }
                    dk5.a3 a3Var2 = (dk5.a3) sparseArray.get(i28);
                    if (a3Var2 != null) {
                        i29 += a3Var2.f316026a;
                    }
                    i28++;
                }
                dk5.a3 a3Var3 = (dk5.a3) sparseArray.get(i27);
                if (a3Var3 == null) {
                    a3Var3 = new dk5.a3(this);
                }
                int i37 = i29 - a3Var3.f316027b;
                android.view.View view = activityC22571x51759e93.f287985m;
                if (view != null) {
                    view.setY(-i37);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = activityC22571x51759e93.f287983h;
                if (c19642xb279030 != null) {
                    c19642xb279030.setY(-i37);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
