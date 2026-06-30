package vc5;

/* loaded from: classes5.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21817xf8653721 f516861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc5.j f516863f;

    public k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21817xf8653721 c21817xf8653721, int i17, vc5.j jVar) {
        this.f516861d = c21817xf8653721;
        this.f516862e = i17;
        this.f516863f = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildFilterChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2661x2cfb7d39.C21817xf8653721 c21817xf8653721 = this.f516861d;
        int i17 = c21817xf8653721.f283260n;
        int i18 = this.f516862e;
        if (i17 == i18) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildFilterChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c21817xf8653721.f283260n = i18;
        android.widget.LinearLayout linearLayout = c21817xf8653721.f283258i;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            android.widget.LinearLayout linearLayout2 = c21817xf8653721.f283258i;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            android.view.View childAt = linearLayout2.getChildAt(i19);
            if (childAt != null) {
                int i27 = i19 == c21817xf8653721.f283260n ? 1 : 0;
                android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.p314xaae8f345.mm.R.id.srz);
                if (textView != null) {
                    textView.setTypeface(null, i27);
                    textView.setTextColor(c21817xf8653721.getContext().getResources().getColor(i27 != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.abw : com.p314xaae8f345.mm.R.C30859x5a72f63.adg, null));
                }
            }
            i19++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filter selected: ");
        vc5.j jVar = this.f516863f;
        sb6.append(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryFilterBarView", sb6.toString());
        yz5.l onFilterSelectedListener = c21817xf8653721.getOnFilterSelectedListener();
        if (onFilterSelectedListener != null) {
            onFilterSelectedListener.mo146xb9724478(jVar);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryFilterBarView$rebuildFilterChips$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
