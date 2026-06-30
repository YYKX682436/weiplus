package rk2;

/* loaded from: classes3.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f477978d;

    /* renamed from: e, reason: collision with root package name */
    public final tk2.a f477979e;

    public b(java.util.LinkedList dataList, tk2.a service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f477978d = dataList;
        this.f477979e = service;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return Integer.MAX_VALUE;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int i18;
        rk2.a holder = (rk2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.LinkedList linkedList = this.f477978d;
        int size = linkedList.size();
        if (size != 0) {
            i18 = i17 % size;
            if (i18 >= size) {
                i18 = size - 1;
            }
        } else {
            i18 = i17;
        }
        java.lang.Object obj = linkedList.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        holder.f477977d.b((uk2.b) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAdapter", "onBindViewHolder ori: " + i17 + " position: " + (i17 % linkedList.size()));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.avo, parent, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAdapter", "onCreateViewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6 c14257x862705f6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6) inflate;
        tk2.a service = this.f477979e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        c14257x862705f6.f193282h = service;
        return new rk2.a(c14257x862705f6);
    }

    public final uk2.b x(int i17) {
        java.util.LinkedList linkedList = this.f477978d;
        int size = linkedList.size();
        if (size != 0 && (i17 = i17 % size) >= size) {
            i17 = size - 1;
        }
        return (uk2.b) linkedList.get(i17);
    }
}
