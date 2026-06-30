package yv0;

/* loaded from: classes5.dex */
public class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ex0.a0 f547498d;

    /* renamed from: e, reason: collision with root package name */
    public final bx0.h f547499e;

    /* renamed from: f, reason: collision with root package name */
    public final dx0.n f547500f;

    /* renamed from: g, reason: collision with root package name */
    public final int f547501g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f547502h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f547503i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f547504m;

    /* renamed from: n, reason: collision with root package name */
    public yv0.a f547505n;

    public h(ex0.a0 timelineVM, bx0.h timelineCalc, dx0.n thumbnailProviderManager, int i17, boolean z17, p3325xe03a0797.p3326xc267989b.y0 mainScope, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineVM, "timelineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineCalc, "timelineCalc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailProviderManager, "thumbnailProviderManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        this.f547498d = timelineVM;
        this.f547499e = timelineCalc;
        this.f547500f = thumbnailProviderManager;
        this.f547501g = i17;
        this.f547502h = z17;
        this.f547503i = mainScope;
        timelineCalc.f117810d.b();
        this.f547504m = y();
    }

    public final boolean B(ex0.r rVar, java.util.List list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        java.util.List list2 = this.f547504m;
        java.lang.Integer num = null;
        if (list2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentInfos");
            throw null;
        }
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yv0.p) obj).f547518a, rVar.f338701b)) {
                break;
            }
        }
        yv0.p pVar = (yv0.p) obj;
        java.lang.Integer valueOf = (pVar == null || (rect2 = pVar.f547522e) == null) ? null : java.lang.Integer.valueOf(rect2.width());
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yv0.p) obj2).f547518a, rVar.f338701b)) {
                break;
            }
        }
        yv0.p pVar2 = (yv0.p) obj2;
        if (pVar2 != null && (rect = pVar2.f547522e) != null) {
            num = java.lang.Integer.valueOf(rect.width());
        }
        if (valueOf == null || num == null) {
            return false;
        }
        double intValue = this.f547499e.f117812f + (num.intValue() - valueOf.intValue());
        if (intValue < 0.0d) {
            intValue = 0.0d;
        }
        yv0.a aVar = this.f547505n;
        if (aVar != null) {
            aVar.b(intValue, false);
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f547504m;
        if (list != null) {
            return list.size();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentInfos");
        throw null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfh, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new yv0.f(this, inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        yv0.f holder = (yv0.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = holder.f547495e;
        if (c3971x241f78 != null) {
            holder.f547496f.f547500f.a(c3971x241f78);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 i17 = holder.i();
        if (i17.f150825h) {
            i17.f150825h = false;
        }
    }

    public final void x(cx0.c cVar) {
        int i17;
        java.lang.Object obj;
        android.graphics.Rect rect;
        int i18;
        java.lang.Object obj2;
        android.graphics.Rect rect2;
        boolean z17;
        boolean z18 = false;
        if (cVar != null) {
            java.util.List list = this.f547504m;
            if (list == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentInfos");
                throw null;
            }
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = ((yv0.p) it.next()).f547518a;
                    if (c3971x241f78 != null && cVar.a() && (cVar.f306038f.contains(c3971x241f78) || cVar.f306039g.contains(c3971x241f78) || cVar.f306040h.contains(c3971x241f78))) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            boolean z19 = !cVar.f306033a.isEmpty();
            if (!z17 && !z19) {
                return;
            }
        }
        java.util.List y17 = y();
        ex0.a0 a0Var = this.f547498d;
        ex0.r n17 = a0Var.n();
        if (n17 == null) {
            return;
        }
        cx0.e eVar = cVar != null ? cVar.f306037e : null;
        int i19 = eVar == null ? -1 : yv0.g.f547497a[eVar.ordinal()];
        bx0.h hVar = this.f547499e;
        ug.m mVar = ug.m.MovieClip;
        ug.m mVar2 = ug.m.VideoClip;
        ug.m mVar3 = ug.m.ImageClip;
        if (i19 == 1) {
            if (kz5.z.G(new ug.m[]{mVar3, mVar2, mVar}, n17.f338702c) && (i17 = hVar.f117818l) != 0) {
                java.util.Iterator it6 = ((java.util.ArrayList) y17).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yv0.p) obj).f547518a, n17.f338701b)) {
                            break;
                        }
                    }
                }
                yv0.p pVar = (yv0.p) obj;
                hVar.f117817k = i17 - ((pVar == null || (rect = pVar.f547522e) == null) ? i17 : rect.width());
            }
            if (n17 instanceof ex0.f) {
                if (a0Var.r() == ax0.e.f96511g && ((ex0.f) n17).f338667j == ax0.a.f96494e) {
                    z18 = true;
                }
                if (z18) {
                    B(n17, y17);
                } else {
                    yv0.a aVar = this.f547505n;
                    if (aVar != null) {
                        aVar.b(hVar.f117812f, true);
                    }
                }
            }
        } else if (i19 == 2) {
            ex0.r n18 = a0Var.n();
            if (n18 != null) {
                if (kz5.z.G(new ug.m[]{mVar3, mVar2, mVar}, n18.f338702c) && (i18 = hVar.f117818l) != 0) {
                    java.util.Iterator it7 = ((java.util.ArrayList) y17).iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it7.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yv0.p) obj2).f547518a, n18.f338701b)) {
                                break;
                            }
                        }
                    }
                    yv0.p pVar2 = (yv0.p) obj2;
                    hVar.f117817k = i18 - ((pVar2 == null || (rect2 = pVar2.f547522e) == null) ? i18 : rect2.width());
                }
                if (n18 instanceof ex0.f) {
                    if (a0Var.r() == ax0.e.f96511g && ((ex0.f) n18).f338667j == ax0.a.f96495f) {
                        z18 = true;
                    }
                    if (z18) {
                        B(n18, y17);
                    } else {
                        yv0.a aVar2 = this.f547505n;
                        if (aVar2 != null) {
                            aVar2.b(hVar.f117812f, true);
                        }
                    }
                }
            }
        } else if (i19 == 3) {
            ex0.r n19 = a0Var.n();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a k17 = n19 != null ? n19.k() : com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            yv0.a aVar3 = this.f547505n;
            if (aVar3 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
                aVar3.a(k17);
            }
        }
        java.util.List list2 = this.f547504m;
        if (list2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentInfos");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a17 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new yv0.n(list2, y17), true);
        this.f547504m = y17;
        a17.b(this);
    }

    public final java.util.List y() {
        bx0.h hVar = this.f547499e;
        hVar.f117810d.b();
        ex0.a0 a0Var = this.f547498d;
        java.util.List list = a0Var.f338630g.f338710e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ex0.r segmentViewModel = (ex0.r) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentViewModel, "segmentViewModel");
            ug.m mVar = segmentViewModel.f338702c;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = segmentViewModel.f338701b;
            arrayList.add(new yv0.p(c3971x241f78, mVar, hVar.b(c3971x241f78, false), i17 == 0, i17 == ((java.util.ArrayList) a0Var.f338630g.f338710e).size() - 1));
            i17 = i18;
        }
        return arrayList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(yv0.f holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f547504m;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentInfos");
            throw null;
        }
        yv0.p data = (yv0.p) list.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        holder.l(data.f547522e);
        ug.m mVar = data.f547519b;
        java.util.Objects.toString(mVar);
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = data.f547518a;
        java.util.Objects.toString(c3971x241f78);
        if (mVar == ug.m.Transition) {
            return;
        }
        holder.f547495e = c3971x241f78;
        yv0.h hVar = holder.f547496f;
        if (!hVar.f547502h) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 i18 = holder.i();
            i18.f150822e = data.f547520c;
            i18.f150823f = data.f547521d;
        }
        p3325xe03a0797.p3326xc267989b.l.d(hVar.f547503i, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yv0.b(hVar, data, null), 2, null);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 i19 = holder.i();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f782 = data.f547518a;
        ex0.a0 a0Var = hVar.f547498d;
        bx0.h hVar2 = hVar.f547499e;
        dx0.n nVar = hVar.f547500f;
        i19.a(nVar, c3971x241f782, a0Var, hVar2, nVar.b(), mVar == ug.m.ImageClip);
        holder.i().m47145x11822312(hVar.f547501g);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        yv0.f holder = (yv0.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        java.lang.Object obj = payloads.get(0);
        if (obj == yv0.o.f547515d || obj == yv0.o.f547516e) {
            java.util.List list = this.f547504m;
            if (list != null) {
                holder.l(((yv0.p) list.get(i17)).f547522e);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentInfos");
                throw null;
            }
        }
    }
}
