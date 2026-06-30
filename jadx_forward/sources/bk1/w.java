package bk1;

/* loaded from: classes4.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f102888d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f102889e = new java.util.HashMap();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f102888d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bk1.p holder = (bk1.p) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f102888d;
        try {
            bk1.y yVar = (bk1.y) arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            k91.v5 v5Var = yVar.f102892a;
            android.widget.ImageView imageView = holder.f102876d;
            if (imageView != null) {
                l01.d0.f396294a.b(imageView, v5Var.f68910xea1bd3d4, l01.a.h(), l01.q0.f396320d);
            }
            android.widget.TextView textView = holder.f102877e;
            if (textView != null) {
                textView.setText(v5Var.f68913x21f9b213);
            }
            android.widget.TextView textView2 = holder.f102878f;
            if (textView2 != null) {
                textView2.post(new bk1.v(holder, this, yVar));
            }
            android.view.View view = holder.f102879g;
            if (view != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    return;
                }
                layoutParams2.setMarginStart(i17 != arrayList.size() + (-1) ? i65.a.f(view.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561263dm) : 0);
                view.setLayoutParams(layoutParams2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyManagePage", "onBindViewHolder, get authScopeInfo fail since " + e17 + ", position: " + i17);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new bk1.p(parent);
    }

    public final void x(java.util.List fetchedUserAuthScopeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetchedUserAuthScopeList, "fetchedUserAuthScopeList");
        java.util.ArrayList arrayList = this.f102888d;
        int size = arrayList.size();
        int size2 = fetchedUserAuthScopeList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "appendFetchedUserAuthorizeScopeList, posInsert: " + size + ", insertCount: " + size2);
        arrayList.addAll(fetchedUserAuthScopeList);
        int i17 = 0;
        for (java.lang.Object obj : fetchedUserAuthScopeList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bk1.y yVar = (bk1.y) obj;
            java.util.HashMap hashMap = this.f102889e;
            java.lang.String field_username = yVar.f102892a.f68924xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
            hashMap.put(field_username, new jz5.l(yVar, java.lang.Integer.valueOf(i17 + size)));
            i17 = i18;
        }
        m8153xd399a4d9(size, size2);
    }
}
