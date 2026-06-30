package bk1;

/* loaded from: classes4.dex */
public final class w extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f21355d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f21356e = new java.util.HashMap();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21355d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bk1.p holder = (bk1.p) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f21355d;
        try {
            bk1.y yVar = (bk1.y) arrayList.get(i17);
            kotlin.jvm.internal.o.d(yVar);
            k91.v5 v5Var = yVar.f21359a;
            android.widget.ImageView imageView = holder.f21343d;
            if (imageView != null) {
                l01.d0.f314761a.b(imageView, v5Var.field_brandIconURL, l01.a.h(), l01.q0.f314787d);
            }
            android.widget.TextView textView = holder.f21344e;
            if (textView != null) {
                textView.setText(v5Var.field_nickname);
            }
            android.widget.TextView textView2 = holder.f21345f;
            if (textView2 != null) {
                textView2.post(new bk1.v(holder, this, yVar));
            }
            android.view.View view = holder.f21346g;
            if (view != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    return;
                }
                layoutParams2.setMarginStart(i17 != arrayList.size() + (-1) ? i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479730dm) : 0);
                view.setLayoutParams(layoutParams2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyManagePage", "onBindViewHolder, get authScopeInfo fail since " + e17 + ", position: " + i17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new bk1.p(parent);
    }

    public final void x(java.util.List fetchedUserAuthScopeList) {
        kotlin.jvm.internal.o.g(fetchedUserAuthScopeList, "fetchedUserAuthScopeList");
        java.util.ArrayList arrayList = this.f21355d;
        int size = arrayList.size();
        int size2 = fetchedUserAuthScopeList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "appendFetchedUserAuthorizeScopeList, posInsert: " + size + ", insertCount: " + size2);
        arrayList.addAll(fetchedUserAuthScopeList);
        int i17 = 0;
        for (java.lang.Object obj : fetchedUserAuthScopeList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bk1.y yVar = (bk1.y) obj;
            java.util.HashMap hashMap = this.f21356e;
            java.lang.String field_username = yVar.f21359a.field_username;
            kotlin.jvm.internal.o.f(field_username, "field_username");
            hashMap.put(field_username, new jz5.l(yVar, java.lang.Integer.valueOf(i17 + size)));
            i17 = i18;
        }
        notifyItemRangeInserted(size, size2);
    }
}
