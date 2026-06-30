package kp4;

/* loaded from: classes10.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f392668d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f392669e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f392670f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f392671g = -1;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f392672h;

    /* renamed from: i, reason: collision with root package name */
    public kp4.s0 f392673i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f392674m;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f392668d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (((kp4.a) this.f392668d.get(i17)).e()) {
            return 1;
        }
        return super.mo863xcdaf1228(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        kp4.n viewHolder = (kp4.n) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f392668d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        viewHolder.i((kp4.a) obj);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            return new kp4.o(this, new android.view.View(parent.getContext()));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571134d44, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new kp4.q(this, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        kp4.n holder = (kp4.n) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        holder.j();
    }

    public final kp4.a x(int i17) {
        java.lang.Object obj = this.f392668d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (kp4.a) obj;
    }

    public final void y(int i17) {
        if (i17 != this.f392671g) {
            java.util.LinkedList linkedList = this.f392668d;
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (((kp4.a) it.next()).f392612i == this.f392671g) {
                    break;
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                if (((kp4.a) it6.next()).f392612i == i17) {
                    break;
                }
            }
            this.f392671g = i17;
            m8146xced61ae5();
        }
    }

    public final void z(java.util.List tracks) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracks, "tracks");
        java.util.LinkedList linkedList = this.f392668d;
        linkedList.clear();
        linkedList.addAll(tracks);
        java.util.Iterator it = linkedList.iterator();
        int i18 = 0;
        while (true) {
            i17 = -1;
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else if (((kp4.a) it.next()).e()) {
                break;
            } else {
                i18++;
            }
        }
        this.f392669e = i18 + 1;
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            } else if (((kp4.a) listIterator.previous()).e()) {
                i17 = listIterator.nextIndex();
                break;
            }
        }
        this.f392670f = i17 - 1;
    }
}
