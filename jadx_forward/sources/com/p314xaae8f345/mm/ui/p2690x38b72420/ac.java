package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class ac implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f288130d = new android.util.SparseArray(0);

    /* renamed from: e, reason: collision with root package name */
    public int f288131e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb f288132f;

    public ac(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb activityC22335xd5b6c7eb) {
        this.f288132f = activityC22335xd5b6c7eb;
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
        yj0.a.b("com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22335xd5b6c7eb activityC22335xd5b6c7eb = this.f288132f;
        com.p314xaae8f345.mm.ui.p2690x38b72420.pb pbVar = activityC22335xd5b6c7eb.K;
        if (pbVar != null) {
            ?? r102 = pbVar.f288623u;
            android.widget.RelativeLayout relativeLayout = activityC22335xd5b6c7eb.C;
            int i28 = 0;
            if (relativeLayout != null) {
                if (i17 > r102) {
                    relativeLayout.setVisibility(0);
                    if (activityC22335xd5b6c7eb.K.G) {
                        activityC22335xd5b6c7eb.D.setBackground(activityC22335xd5b6c7eb.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.agd));
                        activityC22335xd5b6c7eb.E.setBackground(activityC22335xd5b6c7eb.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.agd));
                    }
                } else {
                    relativeLayout.setVisibility(8);
                }
            }
            this.f288131e = i17;
            android.view.View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                android.util.SparseArray sparseArray = this.f288130d;
                com.p314xaae8f345.mm.ui.p2690x38b72420.zb zbVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.zb) sparseArray.get(i17);
                if (zbVar == null) {
                    zbVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.zb(this);
                }
                zbVar.f288810a = childAt.getHeight();
                zbVar.f288811b = childAt.getTop();
                sparseArray.append(i17, zbVar);
                int i29 = 0;
                while (true) {
                    i27 = this.f288131e;
                    if (i28 >= i27) {
                        break;
                    }
                    com.p314xaae8f345.mm.ui.p2690x38b72420.zb zbVar2 = (com.p314xaae8f345.mm.ui.p2690x38b72420.zb) sparseArray.get(i28);
                    if (zbVar2 != null) {
                        i29 += zbVar2.f288810a;
                    }
                    i28++;
                }
                com.p314xaae8f345.mm.ui.p2690x38b72420.zb zbVar3 = (com.p314xaae8f345.mm.ui.p2690x38b72420.zb) sparseArray.get(i27);
                if (zbVar3 == null) {
                    zbVar3 = new com.p314xaae8f345.mm.ui.p2690x38b72420.zb(this);
                }
                int i37 = i29 - zbVar3.f288811b;
                android.view.View view = activityC22335xd5b6c7eb.f287985m;
                if (view != null) {
                    view.setY(-i37);
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = activityC22335xd5b6c7eb.f287983h;
                if (c19642xb279030 != null) {
                    c19642xb279030.setY(-i37);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
