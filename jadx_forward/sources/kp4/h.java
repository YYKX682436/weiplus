package kp4;

/* loaded from: classes10.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f392642d = "MicroMsg.EditFrameListAdapter";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f392643e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f392644f = -1;

    /* renamed from: g, reason: collision with root package name */
    public kp4.g f392645g;

    public h() {
        mo8164xbbdced85(true);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f392643e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return ((kp4.c1) this.f392643e.get(i17)).f392612i;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (((kp4.c1) this.f392643e.get(i17)).e()) {
            return 1;
        }
        return super.mo863xcdaf1228(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        kp4.c viewHolder = (kp4.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f392643e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        viewHolder.i((kp4.c1) obj);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            return new kp4.d(this, new android.view.View(parent.getContext()));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571133d43, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new kp4.f(this, inflate, parent.getHeight());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        kp4.c holder = (kp4.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        holder.j();
    }

    public final void x(int i17) {
        int i18;
        if (i17 != this.f392644f) {
            java.util.LinkedList linkedList = this.f392643e;
            java.util.Iterator it = linkedList.iterator();
            int i19 = 0;
            while (true) {
                i18 = -1;
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((kp4.c1) it.next()).f392612i == this.f392644f) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 >= 0) {
                m8148xed6e4d18(i19, java.lang.Boolean.FALSE);
            }
            java.util.Iterator it6 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                if (((kp4.c1) it6.next()).f392612i == i17) {
                    i18 = i27;
                    break;
                }
                i27++;
            }
            if (i18 >= 0) {
                m8148xed6e4d18(i18, java.lang.Boolean.TRUE);
            }
            this.f392644f = i17;
        }
    }

    public final void y(java.util.List tracks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracks, "tracks");
        java.util.LinkedList linkedList = this.f392643e;
        linkedList.clear();
        linkedList.addAll(tracks);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext() && !((kp4.c1) it.next()).e()) {
        }
        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            if (((kp4.c1) listIterator.previous()).e()) {
                listIterator.nextIndex();
                return;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        kp4.c viewHolder = (kp4.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        java.lang.Object Z = kz5.n0.Z(payloads);
        java.lang.Boolean bool = Z instanceof java.lang.Boolean ? (java.lang.Boolean) Z : null;
        java.util.LinkedList linkedList = this.f392643e;
        if (bool == null) {
            java.lang.Object obj = linkedList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            viewHolder.i((kp4.c1) obj);
        } else {
            java.lang.Object obj2 = linkedList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            viewHolder.k((kp4.c1) obj2, bool.booleanValue());
        }
    }
}
