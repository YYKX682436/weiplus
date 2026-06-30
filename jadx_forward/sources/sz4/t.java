package sz4;

/* loaded from: classes12.dex */
public final class t extends sz4.u {
    public final java.util.LinkedList A;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f495760y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f495761z;

    public t(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495760y = jz5.h.b(new sz4.s(this));
        this.f495761z = new java.util.LinkedList();
        this.A = new java.util.LinkedList();
        i65.a.h(this.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        for (int i17 = 0; i17 < 3; i17++) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f3639x46306858.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8a, (android.view.ViewGroup) p(), false);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nqi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            sz4.r rVar = new sz4.r(this, imageView, inflate);
            this.f495761z.add(rVar);
            android.widget.LinearLayout linearLayout = this.f495776u;
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2454x373aa5.C19530x8dd60bce c19530x8dd60bce = linearLayout instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2454x373aa5.C19530x8dd60bce ? (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2454x373aa5.C19530x8dd60bce) linearLayout : null;
            if (c19530x8dd60bce != null) {
                android.view.View view2 = rVar.f495752c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "<get-subCoverView>(...)");
                java.util.LinkedList linkedList = c19530x8dd60bce.f269817d;
                if (!linkedList.contains(view2)) {
                    linkedList.add(view2);
                }
            }
            p().addView(inflate);
            if (i17 != 2) {
                android.view.View inflate2 = android.view.LayoutInflater.from(this.f3639x46306858.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c89, (android.view.ViewGroup) p(), false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2;
                p().addView(linearLayout2);
                java.util.LinkedList linkedList2 = this.A;
                linkedList2.add(new sz4.m(this, linearLayout2, linkedList2.size() + 1));
            }
            int i18 = 0;
            for (java.lang.Object obj : this.f495761z) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sz4.r rVar2 = (sz4.r) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = i18 == 0 ? this.f495765g : ((sz4.m) this.A.get(i18 - 1)).f495741a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = i18 == this.f495761z.size() + (-1) ? this.f495766h : ((sz4.m) this.A.get(i18)).f495741a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19515x154ec45a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19515x154ec45a2);
                rVar2.getClass();
                rVar2.f495755f = c19515x154ec45a;
                rVar2.f495756g = c19515x154ec45a2;
                i18 = i19;
            }
        }
        this.f495766h.f269647l1 = this.A.size() + 1;
    }

    @Override // sz4.a
    public int i() {
        return 7;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        java.util.List list;
        if (cVar != null && (list = cVar.f377642g) != null) {
            ((java.util.LinkedList) list).clear();
        }
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = ((sz4.m) it.next()).f495741a;
            c19515x154ec45a.m74976xaf1e83df(i17);
            if (cVar != null) {
                ((java.util.LinkedList) cVar.f377642g).add(c19515x154ec45a);
            }
        }
        java.util.LinkedList<sz4.r> linkedList = this.f495761z;
        for (sz4.r rVar : linkedList) {
            rVar.f495757h = false;
            android.view.View view = rVar.f495754e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = rVar.f495750a;
            imageView.setImageDrawable(null);
            imageView.setOnClickListener(new sz4.p(rVar));
            imageView.setOnLongClickListener(null);
            rVar.a().m74977xd69f0faf(new sz4.q(rVar));
        }
        iz4.p pVar = cVar instanceof iz4.p ? (iz4.p) cVar : null;
        if (pVar == null) {
            return;
        }
        int i19 = 0;
        for (java.lang.Object obj : pVar.f377669t) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            iz4.c item = (iz4.c) obj;
            java.lang.Object obj2 = linkedList.get(i19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            sz4.r rVar2 = (sz4.r) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            item.d();
            boolean z17 = item instanceof iz4.f;
            sz4.t tVar = rVar2.f495758i;
            android.widget.ImageView imageView2 = rVar2.f495750a;
            if (z17) {
                iz4.f fVar = (iz4.f) item;
                java.lang.String str = fVar.f377668s;
                java.lang.String str2 = fVar.f377671t;
                if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    str = com.p314xaae8f345.mm.vfs.w6.j(str2) ? str2 : null;
                }
                if (tVar.f495715d.f414842q == 3) {
                    if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                        str2 = str;
                    }
                    str = str2;
                }
                imageView2.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? null : qz4.c.g(str, null));
            } else if (item instanceof iz4.k) {
                iz4.k kVar = (iz4.k) item;
                android.graphics.Bitmap g17 = qz4.c.g(kVar.f377650t, null);
                if (g17 == null && com.p314xaae8f345.mm.vfs.w6.j(kVar.f377668s) && (g17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.b(kVar.f377668s)) != null) {
                    try {
                        if (com.p314xaae8f345.mm.vfs.w6.j(kVar.f377650t)) {
                            com.p314xaae8f345.mm.vfs.w6.h(kVar.f377650t);
                        }
                        q35.g.a(g17, 60, android.graphics.Bitmap.CompressFormat.JPEG, kVar.f377650t, false);
                    } catch (java.lang.Exception unused) {
                    }
                }
                imageView2.setImageBitmap(g17);
                android.view.View view2 = rVar2.f495754e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "bindItemForVideoData", "(Lcom/tencent/mm/plugin/wenote/model/datamodel/VideoDataItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "bindItemForVideoData", "(Lcom/tencent/mm/plugin/wenote/model/datamodel/VideoDataItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rVar2.a().m74977xd69f0faf(null);
            imageView2.setOnClickListener(new sz4.n(tVar, i17, i19, item));
            imageView2.setOnLongClickListener(new sz4.o(i19, i17));
            rVar2.f495757h = true;
            i19 = i27;
        }
        pVar.f377670u = this;
        super.j(pVar, i17, i18);
        if (!pVar.f377644i) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((sz4.r) it6.next()).b(false);
            }
            return;
        }
        int i28 = 0;
        for (java.lang.Object obj3 : linkedList) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((sz4.r) obj3).b(nz4.y.h().l().f423155d - 1 == i28);
            i28 = i29;
        }
    }

    @Override // sz4.u
    public nz4.g n(android.view.View view) {
        return r();
    }

    @Override // sz4.u
    public void o(iz4.c cVar) {
        boolean z17 = false;
        if (cVar != null && cVar.f377637b) {
            z17 = true;
        }
        if (!z17) {
            super.o(cVar);
        } else {
            if (s()) {
                return;
            }
            super.o(cVar);
            s();
        }
    }

    public final android.widget.LinearLayout p() {
        java.lang.Object mo141623x754a37bb = this.f495760y.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.LinearLayout) mo141623x754a37bb;
    }

    public final nz4.g q(int i17) {
        java.util.LinkedList linkedList = this.f495761z;
        if (i17 == 0) {
            android.view.View view = ((sz4.r) linkedList.get(0)).f495752c;
            nz4.g gVar = new nz4.g();
            gVar.f423149d = this.f495765g;
            gVar.f423150e = i17;
            gVar.f423151f = view;
            return gVar;
        }
        java.util.LinkedList linkedList2 = this.A;
        if (i17 == linkedList2.size() + 1) {
            android.view.View view2 = ((sz4.r) linkedList.get(linkedList.size() - 1)).f495752c;
            nz4.g gVar2 = new nz4.g();
            gVar2.f423149d = this.f495766h;
            gVar2.f423150e = i17;
            gVar2.f423151f = view2;
            return gVar2;
        }
        int i18 = i17 - 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = ((sz4.m) linkedList2.get(i18)).f495741a;
        android.view.View view3 = ((sz4.r) linkedList.get(i18)).f495752c;
        nz4.g gVar3 = new nz4.g();
        gVar3.f423149d = c19515x154ec45a;
        gVar3.f423150e = i17;
        gVar3.f423151f = view3;
        return gVar3;
    }

    public final nz4.g r() {
        nz4.y h17 = nz4.y.h();
        if (h17.m() == 0) {
            return null;
        }
        int m74969x1c481d6b = this.f495765g.m74969x1c481d6b();
        nz4.h l17 = h17.l();
        if (l17.f423152a == m74969x1c481d6b && l17.f423154c == m74969x1c481d6b) {
            return q(l17.f423155d);
        }
        return null;
    }

    public final boolean s() {
        java.util.LinkedList linkedList = this.f495761z;
        boolean z17 = false;
        for (int size = linkedList.size() - 1; -1 < size; size--) {
            java.lang.Object obj = linkedList.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            sz4.r rVar = (sz4.r) obj;
            if (rVar.a().isFocused()) {
                if (rVar.f495757h) {
                    return true;
                }
                z17 = true;
            } else if (z17 && rVar.f495757h) {
                rVar.a().requestFocus();
                return true;
            }
        }
        return false;
    }
}
