package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes4.dex */
public class p extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f179915d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f179916e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f179917f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f179918g;

    /* renamed from: h, reason: collision with root package name */
    public final int f179919h;

    /* renamed from: i, reason: collision with root package name */
    public final int f179920i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Bitmap f179921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13348x405f070b f179922n;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13348x405f070b activityC13348x405f070b, android.content.Context context) {
        this.f179922n = activityC13348x405f070b;
        this.f179917f = 1;
        this.f179921m = null;
        this.f179918g = context;
        int h17 = i65.a.h(activityC13348x405f070b.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561890vk);
        this.f179920i = h17;
        int B = i65.a.B(activityC13348x405f070b.mo55332x76847179()) - (i65.a.h(activityC13348x405f070b.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf) * 2);
        int h18 = i65.a.h(activityC13348x405f070b.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
        int i17 = B / (h17 + h18);
        i17 = (B - (i17 * h17)) - ((i17 + (-1)) * h18) > h17 ? i17 + 1 : i17;
        this.f179917f = i17;
        this.f179919h = (int) ((i65.a.B(context) - (h17 * i17)) / (i17 + 1.0f));
        try {
            this.f179921m = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(context.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
        } catch (java.io.IOException unused) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "decode stream default avatar failed. %s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
    }

    public void a(java.util.LinkedList linkedList) {
        if (this.f179915d == null) {
            this.f179915d = new java.util.LinkedList();
        }
        if (this.f179916e) {
            this.f179915d.clear();
            this.f179916e = false;
        }
        this.f179915d.addAll(linkedList);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f179915d;
        int size = linkedList == null ? 0 : linkedList.size();
        return size > 0 ? (int) java.lang.Math.ceil(size / this.f179917f) : size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.LinkedList linkedList = this.f179915d;
        if (linkedList == null || i17 >= linkedList.size()) {
            return null;
        }
        return (r45.rj0) this.f179915d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.q qVar;
        android.view.View view2;
        o11.g gVar;
        int i18 = this.f179920i;
        int i19 = this.f179917f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13348x405f070b activityC13348x405f070b = this.f179922n;
        if (view == null || view.getTag() == null) {
            android.content.Context context = this.f179918g;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            int i27 = this.f179919h;
            linearLayout.setPadding(0, 0, 0, i27);
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.q qVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.q(activityC13348x405f070b);
            qVar2.f179925a = linearLayout;
            linearLayout.setTag(qVar2);
            for (int i28 = 0; i28 < i19; i28++) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i18, i18);
                layoutParams2.leftMargin = i27;
                qVar2.f179925a.addView(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13327xb327a1e3(context, null), i28, layoutParams2);
            }
            qVar = qVar2;
            view2 = linearLayout;
        } else {
            qVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.q) view.getTag();
            view2 = view;
        }
        for (int i29 = 0; i29 < i19; i29++) {
            int i37 = (i17 * i19) + i29;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13327xb327a1e3 c13327xb327a1e3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13327xb327a1e3) qVar.f179925a.getChildAt(i29);
            java.util.LinkedList linkedList = this.f179915d;
            r45.rj0 rj0Var = (linkedList == null || i37 >= linkedList.size()) ? null : (r45.rj0) this.f179915d.get(i37);
            if (rj0Var != null) {
                c13327xb327a1e3.setVisibility(0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rj0Var.f466475d)) {
                    c13327xb327a1e3.setImageBitmap(this.f179921m);
                } else {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = rj0Var.f466475d;
                    java.lang.String str2 = activityC13348x405f070b.f179794d;
                    int i38 = y12.f.f540392a;
                    java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.o(n22.m.g(), str2, str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
                        gVar = null;
                    } else {
                        o11.f fVar = new o11.f();
                        fVar.f423610a = true;
                        fVar.f423611b = true;
                        fVar.f423615f = o17;
                        fVar.f423620k = i18;
                        fVar.f423619j = i18;
                        gVar = fVar.a();
                    }
                    b17.h(str, c13327xb327a1e3, gVar);
                }
            } else {
                c13327xb327a1e3.setVisibility(8);
            }
        }
        return view2;
    }
}
