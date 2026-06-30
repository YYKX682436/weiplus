package gv0;

/* loaded from: classes5.dex */
public abstract class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f357503d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f357504e;

    /* renamed from: f, reason: collision with root package name */
    public final long f357505f;

    /* renamed from: g, reason: collision with root package name */
    public long f357506g;

    public b(java.util.ArrayList dataList, yz5.p onItemClickListener, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        dataList = (i17 & 1) != 0 ? new java.util.ArrayList() : dataList;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        this.f357503d = dataList;
        this.f357504e = onItemClickListener;
        this.f357505f = j17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f357503d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        gv0.c holder = (gv0.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object a07 = kz5.n0.a0(this.f357503d, i17);
        if (a07 == null) {
            return;
        }
        holder.i(a07, i17);
        holder.f3639x46306858.setOnClickListener(new gv0.a(holder, this));
    }

    public final void x(int i17, java.lang.Object obj) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f357503d;
            if (i17 >= arrayList.size()) {
                return;
            }
            arrayList.set(i17, obj);
            m8147xed6e4d18(i17);
        }
    }

    public void y(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = this.f357503d;
        int size = arrayList.size();
        arrayList.clear();
        if (list.isEmpty()) {
            m8154xdb81fc7f(0, size);
        }
        arrayList.addAll(list);
        m8146xced61ae5();
    }
}
