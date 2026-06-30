package fy0;

/* loaded from: classes5.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 f348757d;

    /* renamed from: e, reason: collision with root package name */
    public final fy0.p f348758e;

    /* renamed from: f, reason: collision with root package name */
    public final int f348759f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f348760g;

    /* renamed from: h, reason: collision with root package name */
    public int f348761h;

    /* renamed from: i, reason: collision with root package name */
    public int f348762i;

    /* renamed from: m, reason: collision with root package name */
    public double f348763m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f348764n;

    public r(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 timelineView, fy0.p callback, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineView, "timelineView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f348757d = timelineView;
        this.f348758e = callback;
        this.f348759f = i17;
        this.f348760g = z17;
    }

    public final double a() {
        bx0.h timelineLayoutCalc;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = this.f348757d;
        ex0.a0 timelineVM = abstractC11003x25486817.getTimelineVM();
        double d17 = 0.0d;
        if (timelineVM == null || (timelineLayoutCalc = abstractC11003x25486817.getTimelineLayoutCalc()) == null) {
            return 0.0d;
        }
        int i17 = 0;
        for (java.lang.Object obj : timelineVM.f338630g.f338710e) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            d17 += timelineLayoutCalc.b(((ex0.r) obj).f338701b, false).width();
            i17 = i18;
        }
        return ((d17 + abstractC11003x25486817.m47432x1e87e5ec().f328577a) + abstractC11003x25486817.m47432x1e87e5ec().f328579c) - this.f348759f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:13|(2:14|15)|(3:18|(2:20|(1:58)(9:25|26|(1:28)(1:48)|29|31|32|33|(3:39|(1:41)(1:43)|42)|44))(3:60|61|62)|16)|64|65|31|32|33|(5:35|37|39|(0)(0)|42)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(double r16) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy0.r.b(double):void");
    }

    public final void c(double d17) {
        if (this.f348761h == 0) {
            if (this.f348763m == d17) {
                return;
            }
            this.f348762i = 0;
            this.f348761h = 0;
            if (d17 < 0.0d) {
                d17 = 0.0d;
            }
            double a17 = a();
            if (d17 > a17) {
                d17 = a17;
            }
            e(d17, fy0.q.f348753d);
            ((fy0.e) this.f348758e).a(0, -a06.d.a(d17), false);
        }
    }

    public final void d(double d17, boolean z17) {
        if (this.f348761h == 0) {
            if (!(this.f348763m == d17) || z17) {
                if (d17 < 0.0d) {
                    d17 = 0.0d;
                }
                double a17 = a();
                if (d17 > a17) {
                    d17 = a17;
                }
                this.f348762i = 0;
                this.f348761h = 0;
                this.f348763m = d17;
                e(d17, fy0.q.f348753d);
                b(d17);
            }
        }
    }

    public final void e(double d17, fy0.q qVar) {
        qVar.name();
        this.f348763m = d17;
        fy0.e eVar = (fy0.e) this.f348758e;
        eVar.getClass();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = eVar.f348713a;
        fy0.b bVar = abstractC11003x25486817.f151262p;
        if (bVar != null) {
            bVar.a(d17, qVar);
        }
        eVar.f348714b.f117812f = d17;
        abstractC11003x25486817.j();
        abstractC11003x25486817.m47437x4905e9fa().D0();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        fy0.e eVar = (fy0.e) this.f348758e;
        eVar.getClass();
        fy0.a aVar = eVar.f348713a.f151264r;
        if (aVar != null) {
            aVar.a(i17);
        }
        this.f348762i = this.f348761h;
        this.f348761h = i17;
        if (i17 == 0) {
            e(this.f348763m, fy0.q.f348755f);
        }
        this.f348764n = true;
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        recyclerView.mo7958x54496c8e();
        double d17 = this.f348763m + i17;
        this.f348763m = d17;
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        double a17 = a();
        if (d17 > a17) {
            d17 = a17;
        }
        this.f348763m = d17;
        boolean z17 = this.f348761h == 0;
        if (!z17 || this.f348762i != 0) {
            if (z17) {
                this.f348762i = 0;
            }
            fy0.q qVar = z17 ? fy0.q.f348755f : fy0.q.f348754e;
            if (this.f348764n) {
                double d18 = d17 >= 0.0d ? d17 : 0.0d;
                double a18 = a();
                if (d18 > a18) {
                    d18 = a18;
                }
                e(d18, fy0.q.f348753d);
                b(d18);
                this.f348764n = false;
            }
            e(this.f348763m, qVar);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
