package i12;

/* loaded from: classes15.dex */
public class s extends j12.b {

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f368768i;

    /* renamed from: m, reason: collision with root package name */
    public final int f368769m;

    /* renamed from: n, reason: collision with root package name */
    public int f368770n;

    /* renamed from: o, reason: collision with root package name */
    public final int f368771o;

    /* renamed from: p, reason: collision with root package name */
    public final int f368772p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f368773q;

    /* renamed from: r, reason: collision with root package name */
    public i12.q f368774r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.HashMap f368775s;

    public s(android.content.Context context, boolean z17) {
        super(context);
        this.f368769m = 3;
        this.f368770n = 0;
        this.f368768i = context;
        this.f368773q = z17;
        context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.i_);
        this.f368771o = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j);
        this.f368772p = (int) ((i65.a.B(context) - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561893vn) * 3)) / (3 + 1.0f));
    }

    @Override // j12.b
    public int c() {
        return 0;
    }

    @Override // j12.b
    public int f() {
        return this.f368770n;
    }

    @Override // j12.b
    public boolean g(int i17) {
        return false;
    }

    @Override // j12.b, android.widget.Adapter
    public int getCount() {
        double ceil;
        boolean z17 = this.f368773q;
        int i17 = this.f368769m;
        if (!z17) {
            if (t() <= this.f368770n) {
                return 0;
            }
            return (int) java.lang.Math.ceil((r0 - r3) / i17);
        }
        int i18 = this.f368770n;
        if (i18 == 0) {
            return 0;
        }
        if (i18 > 0) {
            if (t() > this.f368770n) {
                ceil = java.lang.Math.ceil(r1 / i17);
                return (int) ceil;
            }
        }
        ceil = java.lang.Math.ceil(t() / i17);
        return (int) ceil;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.widget.LinearLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // j12.b, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ?? linearLayout;
        i12.r rVar;
        int i18 = this.f368769m;
        android.content.Context context = this.f368768i;
        if (view == null || view.getTag() == null) {
            linearLayout = new android.widget.LinearLayout(context);
            android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(0, 0, 0, this.f368771o);
            rVar = new i12.r(this);
            rVar.f368767a = linearLayout;
            linearLayout.setTag(rVar);
            for (int i19 = 0; i19 < i18; i19++) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = this.f368772p;
                rVar.f368767a.addView(new i12.d(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.a7x).f368735b, i19, layoutParams2);
            }
        } else {
            rVar = (i12.r) view.getTag();
            linearLayout = view;
        }
        for (int i27 = 0; i27 < i18; i27++) {
            int i28 = (this.f368773q ? i17 * i18 : (i17 * i18) + this.f368770n) + i27;
            android.view.View childAt = rVar.f368767a.getChildAt(i27);
            i12.d dVar = new i12.d(context, childAt);
            childAt.setOnClickListener(new i12.p(this, dVar, i28));
            j12.i item = getItem(i28);
            if (i28 > t() - 1 || item == null) {
                childAt.setClickable(false);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f368738e.setBackgroundDrawable(null);
            } else {
                if (this.f368775s == null) {
                    this.f368775s = new java.util.HashMap();
                }
                if (this.f368775s.containsValue(dVar)) {
                    this.f368775s.remove(dVar.f368734a);
                }
                dVar.f368734a = d(item);
                this.f368775s.put(d(item), dVar);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV2PersonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.f368737d.setText(item.f378700b.f473663f);
                n11.a b17 = n11.a.b();
                r45.zj0 zj0Var = item.f378700b;
                java.lang.String str = zj0Var.f473662e;
                b17.h(str, dVar.f368736c, y12.f.b(zj0Var.f473661d, str));
                dVar.f368738e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77996x9d7050cd);
                childAt.setClickable(true);
                u(dVar, item.f378704f);
            }
        }
        return linearLayout;
    }

    @Override // j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return null;
    }

    @Override // j12.b
    public int k() {
        return 0;
    }

    @Override // j12.b
    public i12.c l(android.content.Context context, android.view.View view) {
        return null;
    }

    @Override // j12.b
    public void o(int i17) {
    }

    @Override // j12.b
    public void p(int i17) {
        this.f368770n = i17;
    }

    @Override // j12.b
    public void q(int i17) {
    }

    @Override // j12.b
    public void s(java.lang.String str, int i17) {
        java.util.HashMap hashMap = this.f368775s;
        if (hashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus mCacheHolder is nulll.");
            return;
        }
        i12.d dVar = (i12.d) hashMap.get(str);
        j12.i g17 = this.f378685e.g(str);
        if (g17 != null) {
            n(g17, str, i17);
        }
        if (g17 != null && this.f378685e != null && g17.f378704f == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "force refresh status");
            j12.f fVar = this.f378685e;
            boolean z17 = fVar.f378694g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) fVar.f378692e.get(str);
            java.util.HashMap hashMap2 = this.f378685e.f378693f;
            g17.b(z17, f5Var, hashMap2 == null ? false : hashMap2.containsKey(str));
        }
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "updateStatus viewHolder is nulll.");
        } else {
            u(dVar, i17);
        }
    }

    public int t() {
        if (!this.f368773q) {
            return super.getCount();
        }
        int i17 = this.f368770n;
        if (i17 == 0) {
            return 0;
        }
        if (i17 > 0) {
            int count = super.getCount();
            int i18 = this.f368770n;
            if (count > i18) {
                return i18;
            }
        }
        return super.getCount();
    }

    public final void u(i12.d dVar, int i17) {
        android.content.Context context = this.f378684d;
        if (i17 != 7) {
            dVar.f368737d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            dVar.f368737d.setCompoundDrawables(null, null, null, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2PersonAdapter", "unknow product status:%d", java.lang.Integer.valueOf(i17));
        } else {
            dVar.f368737d.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79040xfe242231);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            dVar.f368737d.setCompoundDrawables(null, null, drawable, null);
        }
    }
}
