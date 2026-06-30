package y20;

/* loaded from: classes.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f540547d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f540548e;

    public n(java.util.List items, yz5.p onItemClick, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        items = (i17 & 1) != 0 ? kz5.p0.f395529d : items;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f540547d = items;
        this.f540548e = onItemClick;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f540547d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.lang.Object obj = this.f540547d.get(i17);
        if (obj instanceof qq.e) {
            return 0;
        }
        if (obj instanceof qq.d) {
            return 1;
        }
        if (obj instanceof qq.g) {
            return 2;
        }
        if (obj instanceof y20.i) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException("Unknown item type");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.Object obj;
        java.lang.String obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj3 = this.f540547d.get(i17);
        if (holder instanceof y20.k) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ecs.test.EcsTestModels.EcsSettingGroupTitle");
            ((y20.k) holder).f540542d.setText(((qq.e) obj3).f447398a);
            return;
        }
        boolean z17 = holder instanceof y20.h;
        yz5.p onItemClick = this.f540548e;
        if (z17) {
            y20.h hVar = (y20.h) holder;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ecs.test.EcsTestModels.EcsSettingButton");
            qq.d dVar = (qq.d) obj3;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
            hVar.f540540d.setText(dVar.f447395a);
            hVar.f3639x46306858.setOnClickListener(new y20.g(onItemClick, dVar));
            return;
        }
        if (!(holder instanceof y20.m)) {
            if (holder instanceof y20.j) {
                return;
            }
            return;
        }
        y20.m mVar = (y20.m) holder;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ecs.test.EcsTestModels.EcsSettingSwitch<*>");
        qq.g gVar = (qq.g) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        mVar.f540545d.setText(gVar.f447400a);
        qq.c0 c0Var = (qq.c0) i95.n0.c(qq.c0.class);
        java.lang.Object obj4 = gVar.f447403d;
        if (c0Var != null) {
            obj4 = ((qq.s) c0Var).Ai(gVar.f447404e, obj4);
        }
        java.util.Iterator it = gVar.f447402c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((qq.c) obj).f447394b, obj4)) {
                    break;
                }
            }
        }
        qq.c cVar = (qq.c) obj;
        if (cVar == null || (obj2 = cVar.f447393a) == null) {
            obj2 = obj4.toString();
        }
        mVar.f540546e.setText(obj2);
        mVar.f3639x46306858.setOnClickListener(new y20.l(onItemClick, gVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4p, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new y20.k(inflate);
        }
        if (i17 == 1) {
            android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4l, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new y20.h(inflate2);
        }
        if (i17 == 2) {
            android.view.View inflate3 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4q, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
            return new y20.m(inflate3);
        }
        if (i17 == 3) {
            android.view.View inflate4 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4o, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
            return new y20.j(inflate4);
        }
        throw new java.lang.IllegalArgumentException("Unknown view type: " + i17);
    }

    public final void x(java.util.List newItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItems, "newItems");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = newItems.size();
        for (int i17 = 0; i17 < size; i17++) {
            qq.f fVar = (qq.f) newItems.get(i17);
            arrayList.add(fVar);
            boolean z17 = true;
            if (i17 < newItems.size() - 1) {
                qq.f fVar2 = (qq.f) newItems.get(i17 + 1);
                if ((!(fVar instanceof qq.e) || (!(fVar2 instanceof qq.d) && !(fVar2 instanceof qq.g))) && ((!(fVar instanceof qq.d) && !(fVar instanceof qq.g)) || (!(fVar2 instanceof qq.d) && !(fVar2 instanceof qq.g)))) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(y20.i.f540541a);
                }
            }
        }
        this.f540547d = arrayList;
        m8146xced61ae5();
    }
}
