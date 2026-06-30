package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes4.dex */
public class p extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f98382d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f98383e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f98384f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f98385g;

    /* renamed from: h, reason: collision with root package name */
    public final int f98386h;

    /* renamed from: i, reason: collision with root package name */
    public final int f98387i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Bitmap f98388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI f98389n;

    public p(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI, android.content.Context context) {
        this.f98389n = emojiStoreV2RewardDetailUI;
        this.f98384f = 1;
        this.f98388m = null;
        this.f98385g = context;
        int h17 = i65.a.h(emojiStoreV2RewardDetailUI.getContext(), com.tencent.mm.R.dimen.f480357vk);
        this.f98387i = h17;
        int B = i65.a.B(emojiStoreV2RewardDetailUI.getContext()) - (i65.a.h(emojiStoreV2RewardDetailUI.getContext(), com.tencent.mm.R.dimen.f479866hf) * 2);
        int h18 = i65.a.h(emojiStoreV2RewardDetailUI.getContext(), com.tencent.mm.R.dimen.f479877hq);
        int i17 = B / (h17 + h18);
        i17 = (B - (i17 * h17)) - ((i17 + (-1)) * h18) > h17 ? i17 + 1 : i17;
        this.f98384f = i17;
        this.f98386h = (int) ((i65.a.B(context) - (h17 * i17)) / (i17 + 1.0f));
        try {
            this.f98388m = com.tencent.mm.sdk.platformtools.j.c(context.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
        } catch (java.io.IOException unused) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "decode stream default avatar failed. %s", new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    public void a(java.util.LinkedList linkedList) {
        if (this.f98382d == null) {
            this.f98382d = new java.util.LinkedList();
        }
        if (this.f98383e) {
            this.f98382d.clear();
            this.f98383e = false;
        }
        this.f98382d.addAll(linkedList);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f98382d;
        int size = linkedList == null ? 0 : linkedList.size();
        return size > 0 ? (int) java.lang.Math.ceil(size / this.f98384f) : size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.LinkedList linkedList = this.f98382d;
        if (linkedList == null || i17 >= linkedList.size()) {
            return null;
        }
        return (r45.rj0) this.f98382d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.emoji.ui.v2.q qVar;
        android.view.View view2;
        o11.g gVar;
        int i18 = this.f98387i;
        int i19 = this.f98384f;
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI = this.f98389n;
        if (view == null || view.getTag() == null) {
            android.content.Context context = this.f98385g;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
            linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            int i27 = this.f98386h;
            linearLayout.setPadding(0, 0, 0, i27);
            com.tencent.mm.plugin.emoji.ui.v2.q qVar2 = new com.tencent.mm.plugin.emoji.ui.v2.q(emojiStoreV2RewardDetailUI);
            qVar2.f98392a = linearLayout;
            linearLayout.setTag(qVar2);
            for (int i28 = 0; i28 < i19; i28++) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(i18, i18);
                layoutParams2.leftMargin = i27;
                qVar2.f98392a.addView(new com.tencent.mm.plugin.emoji.ui.SquareImageView(context, null), i28, layoutParams2);
            }
            qVar = qVar2;
            view2 = linearLayout;
        } else {
            qVar = (com.tencent.mm.plugin.emoji.ui.v2.q) view.getTag();
            view2 = view;
        }
        for (int i29 = 0; i29 < i19; i29++) {
            int i37 = (i17 * i19) + i29;
            com.tencent.mm.plugin.emoji.ui.SquareImageView squareImageView = (com.tencent.mm.plugin.emoji.ui.SquareImageView) qVar.f98392a.getChildAt(i29);
            java.util.LinkedList linkedList = this.f98382d;
            r45.rj0 rj0Var = (linkedList == null || i37 >= linkedList.size()) ? null : (r45.rj0) this.f98382d.get(i37);
            if (rj0Var != null) {
                squareImageView.setVisibility(0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(rj0Var.f384942d)) {
                    squareImageView.setImageBitmap(this.f98388m);
                } else {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = rj0Var.f384942d;
                    java.lang.String str2 = emojiStoreV2RewardDetailUI.f98261d;
                    int i38 = y12.f.f458859a;
                    java.lang.String o17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.o(n22.m.g(), str2, str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
                        gVar = null;
                    } else {
                        o11.f fVar = new o11.f();
                        fVar.f342077a = true;
                        fVar.f342078b = true;
                        fVar.f342082f = o17;
                        fVar.f342087k = i18;
                        fVar.f342086j = i18;
                        gVar = fVar.a();
                    }
                    b17.h(str, squareImageView, gVar);
                }
            } else {
                squareImageView.setVisibility(8);
            }
        }
        return view2;
    }
}
