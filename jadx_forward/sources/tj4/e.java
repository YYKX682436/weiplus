package tj4;

/* loaded from: classes11.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f501360d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f501361e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f501362f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f501363g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f501364h;

    public e(java.util.ArrayList itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f501360d = itemList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f501360d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 == 0 ? 1 : 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicSelfStatusAdapter", "onBindViewHolder " + i17);
        if (holder instanceof tj4.c) {
            java.lang.Object obj = this.f501360d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            tj4.a aVar = (tj4.a) obj;
            tj4.c cVar = (tj4.c) holder;
            cVar.f501355e.setText(aVar.f501346a);
            cVar.f501356f.b(aVar.f501348c, aVar.f501349d);
        }
        holder.f3639x46306858.setOnClickListener(new tj4.d(i17, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicSelfStatusAdapter", "onCreateViewHolder >> " + i17);
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dhd, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new tj4.b(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dhe, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new tj4.c(inflate2);
    }
}
