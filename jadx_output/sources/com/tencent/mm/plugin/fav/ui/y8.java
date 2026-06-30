package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class y8 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f101625d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f101626e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f101627f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.f8 f101628g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.e8 f101629h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.d8 f101630i;

    public y8(java.util.ArrayList types, java.util.List tags) {
        kotlin.jvm.internal.o.g(types, "types");
        kotlin.jvm.internal.o.g(tags, "tags");
        this.f101625d = types;
        this.f101626e = tags;
        this.f101627f = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), kotlinx.coroutines.t3.a(null, 1, null));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f101625d.size() + this.f101626e.size() + 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            return 18;
        }
        java.util.ArrayList arrayList = this.f101625d;
        if (i17 <= 0 || i17 > arrayList.size()) {
            return i17 == arrayList.size() + 1 ? 19 : 21;
        }
        return 20;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.fav.ui.c8 holder = (com.tencent.mm.plugin.fav.ui.c8) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String str = "[onBindViewHolder] position = " + i17 + ", item type = " + getItemViewType(i17);
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", str, null);
        int itemViewType = getItemViewType(i17);
        java.util.ArrayList arrayList = this.f101625d;
        switch (itemViewType) {
            case 18:
                com.tencent.mm.plugin.fav.ui.b8 b8Var = (com.tencent.mm.plugin.fav.ui.b8) holder;
                b8Var.f100519d.setImageResource(com.tencent.mm.R.raw.fav_icons_outlined_sort);
                b8Var.f100520e.setText(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.c9q));
                android.view.View view = b8Var.f100521f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.fav.ui.m8 m8Var = new com.tencent.mm.plugin.fav.ui.m8(this);
                android.view.View view2 = b8Var.f100521f;
                view2.setOnClickListener(m8Var);
                view2.post(new com.tencent.mm.plugin.fav.ui.n8(this, b8Var));
                return;
            case 19:
                com.tencent.mm.plugin.fav.ui.b8 b8Var2 = (com.tencent.mm.plugin.fav.ui.b8) holder;
                b8Var2.f100519d.setImageResource(com.tencent.mm.R.raw.fav_list_tag);
                b8Var2.f100520e.setText(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.c9p));
                android.view.View view3 = b8Var2.f100521f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavTopMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/fav/ui/FavTopMenuAdapter$FavTopViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            case 20:
                com.tencent.mm.plugin.fav.ui.a8 a8Var = (com.tencent.mm.plugin.fav.ui.a8) holder;
                java.lang.Object obj = arrayList.get(i17 - 1);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                java.lang.String str2 = (java.lang.String) obj;
                a8Var.f100466d.setText(str2);
                a8Var.itemView.setOnClickListener(new com.tencent.mm.plugin.fav.ui.o8(this, str2));
                return;
            case 21:
                com.tencent.mm.plugin.fav.ui.a8 a8Var2 = (com.tencent.mm.plugin.fav.ui.a8) holder;
                int size = (i17 - arrayList.size()) - 2;
                t72.a aVar = (t72.a) this.f101626e.get(size);
                a8Var2.f100466d.setText(aVar.field_name);
                a8Var2.itemView.setOnClickListener(new com.tencent.mm.plugin.fav.ui.p8(this, aVar));
                a8Var2.itemView.setOnLongClickListener(new com.tencent.mm.plugin.fav.ui.q8(this, aVar, i17, size));
                return;
            default:
                return;
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        switch (i17) {
            case 18:
            case 19:
                android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488766ac3, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                return new com.tencent.mm.plugin.fav.ui.b8(inflate);
            case 20:
            case 21:
                android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.abq, (android.view.ViewGroup) null);
                kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
                return new com.tencent.mm.plugin.fav.ui.a8(inflate2);
            default:
                androidx.recyclerview.widget.k3 createViewHolder = super.createViewHolder(parent, i17);
                kotlin.jvm.internal.o.f(createViewHolder, "createViewHolder(...)");
                return (com.tencent.mm.plugin.fav.ui.c8) createViewHolder;
        }
    }

    public final boolean x(java.lang.String tagName) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        java.util.Iterator it = this.f101626e.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(tagName, ((t72.a) it.next()).field_name)) {
                return true;
            }
        }
        return false;
    }
}
