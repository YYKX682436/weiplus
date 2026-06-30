package mx0;

/* loaded from: classes5.dex */
public final class ia extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f413588d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f413589e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f413590f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.ja f413591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mx0.aa f413592h;

    public ia(mx0.ja jaVar, mx0.aa aaVar) {
        this.f413591g = jaVar;
        this.f413592h = aaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        kz5.p0 p0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onScrollStateChanged lastState = " + this.f413588d + ", newState = " + i17);
        this.f413588d = i17;
        mx0.ja jaVar = this.f413591g;
        if (!jaVar.f413621t) {
            this.f413590f = false;
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (i17 == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            android.view.View f17 = this.f413592h.f(c1162x665295de);
            if (f17 == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = jaVar.f413608d.q0(c1162x665295de.m8032xa86cd69f(f17), false);
            mx0.ba baVar = q07 instanceof mx0.ba ? (mx0.ba) q07 : null;
            if (baVar == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            java.util.ArrayList arrayList2 = jaVar.f413614m;
            java.util.Iterator it = arrayList2.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it.next()).f521553b, baVar.f413392d)) {
                    break;
                } else {
                    i18++;
                }
            }
            int i19 = i18;
            int size = arrayList2.size();
            int i27 = size - i19;
            mx0.z zVar = jaVar.f413611g;
            if (i27 < 3) {
                java.util.Map map = this.f413589e;
                java.lang.Object obj = ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(size));
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool)) {
                    map.put(java.lang.Integer.valueOf(size), bool);
                    yx0.b8 b8Var = ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).f151090v;
                    p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.f3(b8Var, null), 3, null);
                }
            }
            java.lang.Integer num = jaVar.f413612h;
            if (num != null && i19 == num.intValue()) {
                this.f413590f = false;
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            boolean z17 = this.f413590f;
            jz5.g gVar = jaVar.f413620s;
            if (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(baVar.f413392d, "kEmptyTemplateId")) {
                int intValue = ((java.lang.Number) gVar.mo141623x754a37bb()).intValue();
                if (intValue <= size) {
                    size = intValue;
                }
                java.util.List<vt3.p> subList = arrayList2.subList(0, size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(subList, 10));
                for (vt3.p pVar : subList) {
                    arrayList3.add(new jz5.l(pVar.f521553b, java.lang.Long.valueOf(pVar.f521556e)));
                }
                mx0.ja.a(jaVar);
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar;
                c10977x8e40eced.getClass();
                if (!c10977x8e40eced.I1) {
                    p3325xe03a0797.p3326xc267989b.l.d(c10977x8e40eced.getScope(), null, null, new mx0.k9(false, c10977x8e40eced, arrayList3, null), 3, null);
                }
                this.f413590f = false;
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            this.f413590f = false;
            vt3.p pVar2 = (vt3.p) kz5.n0.a0(arrayList2, i19);
            if (pVar2 == null) {
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            jaVar.c(i19);
            int i28 = i19 + 1;
            int intValue2 = ((java.lang.Number) gVar.mo141623x754a37bb()).intValue() + i28;
            if (intValue2 <= size) {
                size = intValue2;
            }
            if (i28 < size) {
                java.util.List<vt3.p> subList2 = arrayList2.subList(i28, size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList2, "subList(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(subList2, 10));
                for (vt3.p pVar3 : subList2) {
                    arrayList4.add(new jz5.l(pVar3.f521553b, java.lang.Long.valueOf(pVar3.f521556e)));
                }
                p0Var = arrayList4;
            } else {
                p0Var = kz5.p0.f395529d;
            }
            ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).T0(pVar2, i19, 0L, p0Var);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        e06.k kVar = new e06.k(w17, ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).y());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413591g.f413615n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE))) {
            int i19 = kVar.f327743e;
            if (w17 <= i19) {
                while (true) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onTemplateVisibleAt: " + w17);
                    this.f413591g.f413613i.M(w17);
                    if (w17 == i19) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
        } else {
            java.util.Iterator it = kz5.n0.G0(kVar, this.f413591g.f413615n).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onTemplateVisibleAt: " + intValue);
                this.f413591g.f413613i.M(intValue);
            }
            java.util.Iterator it6 = kz5.n0.G0(this.f413591g.f413615n, kVar).iterator();
            while (it6.hasNext()) {
                int intValue2 = ((java.lang.Number) it6.next()).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveFinderRecordTemplateUIPlugin", "onTemplateInvisibleAt: " + intValue2);
                java.lang.String B = this.f413591g.f413613i.B(intValue2);
                if (B != null) {
                    yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                    m7Var.getClass();
                    p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.b6(m7Var, B, null), 3, null);
                }
            }
        }
        this.f413591g.f413615n = kVar;
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/TemplateUIPlugin$setupScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
