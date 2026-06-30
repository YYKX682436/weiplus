package xj1;

/* loaded from: classes7.dex */
public final class b0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f536313d;

    /* renamed from: e, reason: collision with root package name */
    public final xj1.d0 f536314e;

    public b0(java.util.ArrayList dataList, xj1.d0 d0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f536313d = dataList;
        this.f536314e = d0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f536313d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) this.f536313d.get(i17);
        return (c11714x918fd2e4.f157894d + c11714x918fd2e4.f157896f).hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        xj1.h0 holder = (xj1.h0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f536313d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        holder.i((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569582fg, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new xj1.h0(inflate, this.f536314e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        xj1.h0 holder = (xj1.h0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        boolean isEmpty = payloads.isEmpty();
        java.util.ArrayList arrayList = this.f536313d;
        if (!isEmpty) {
            java.lang.Object obj = payloads.get(0);
            android.os.Bundle bundle = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
            if (bundle != null && !bundle.isEmpty()) {
                java.lang.Object obj2 = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                holder.f536333m = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj2;
                if (bundle.get("icon") != null) {
                    l01.b bVar = l01.d0.f396294a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = holder.f536333m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11714x918fd2e4);
                    bVar.b(holder.f536329f, c11714x918fd2e4.f157901n, l01.a.h(), l01.q0.f396320d);
                }
                if (bundle.get("nick_name") != null) {
                    holder.j();
                    return;
                }
                return;
            }
        }
        java.lang.Object obj3 = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
        holder.i((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj3);
    }
}
