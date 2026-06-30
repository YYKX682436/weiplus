package bm2;

/* loaded from: classes3.dex */
public final class a4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: o, reason: collision with root package name */
    public static float f103296o;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f103297d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f103298e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f103299f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f103300g;

    /* renamed from: h, reason: collision with root package name */
    public tg2.h f103301h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f103302i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f103303m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f103304n;

    public a4(android.content.Context context, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 gridView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gridView, "gridView");
        this.f103297d = context;
        this.f103298e = gridView;
        this.f103300g = new java.util.ArrayList();
        this.f103302i = new java.util.ArrayList();
        this.f103303m = jz5.h.b(new bm2.x3(this));
        this.f103304n = jz5.h.b(new bm2.y3(this));
    }

    public static final void y(java.util.LinkedList linkedList, bm2.n3 n3Var, int i17) {
        long j17;
        int i18 = 0;
        if (linkedList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.ad5 ad5Var = (r45.ad5) next;
                if (ad5Var.m75942xfb822ef2(1) <= 0 || (ad5Var.m75942xfb822ef2(6) > 0 && ad5Var.m75942xfb822ef2(6) - i17 <= 0)) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(next);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((r45.ad5) it6.next()).m75942xfb822ef2(1)));
            }
            java.util.Iterator it7 = arrayList2.iterator();
            j17 = 0;
            while (it7.hasNext()) {
                j17 += ((java.lang.Number) it7.next()).longValue();
            }
        } else {
            j17 = 0;
        }
        android.widget.TextView textView = n3Var.f103671r;
        if (j17 > 0) {
            textView.setText("x" + j17);
            zl2.r4.f555483a.b3(n3Var.f103671r);
        } else {
            i18 = 8;
        }
        textView.setVisibility(i18);
    }

    public final void B(boolean z17) {
        java.util.ArrayList arrayList = this.f103302i;
        if (arrayList.contains(x()) == z17) {
            return;
        }
        java.util.ArrayList arrayList2 = this.f103300g;
        if (z17) {
            arrayList.add(x());
            m8149x8b456734((arrayList2.size() + arrayList.size()) - 1);
            return;
        }
        int size = arrayList2.size() + arrayList.indexOf(x());
        arrayList.remove(x());
        if (size >= 0) {
            m8155x27702c4(size);
        } else {
            m8146xced61ae5();
        }
    }

    public final void E(java.util.List giftList, int i17, java.util.LinkedList eachPageIndexList, boolean z17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftList, "giftList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eachPageIndexList, "eachPageIndexList");
        int size = giftList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGiftGridAdapter", "updateGift pageIndex:" + i17 + ",size:" + size + ",eachPageIndexList:" + eachPageIndexList);
        java.util.ArrayList arrayList = this.f103300g;
        arrayList.clear();
        if (eachPageIndexList.size() > 1) {
            java.lang.Object obj2 = eachPageIndexList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            for (java.lang.String str : (java.lang.Iterable) obj2) {
                java.util.Iterator it = giftList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ce2.i) obj).f67814x2c488eb6, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ce2.i iVar = (ce2.i) obj;
                if (iVar != null) {
                    arrayList.add(iVar);
                }
            }
        } else if (z17) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
            int i18 = i17 * 8;
            int i19 = i18 + 8;
            while (i18 < size && i18 < i19) {
                arrayList.add(giftList.get(i18));
                i18++;
            }
        } else {
            arrayList.addAll(giftList);
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new bm2.z3());
        }
        int size2 = arrayList.size();
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
        if (size2 > 8) {
            android.view.View view = (android.view.View) ((jz5.n) this.f103303m).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-listEndFooterView>(...)");
            java.util.ArrayList arrayList2 = this.f103302i;
            if (arrayList2.contains(view)) {
                return;
            }
            arrayList2.add(view);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103300g.size() + this.f103302i.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        int i18 = 0;
        if (i17 >= 0 && i17 < this.f103300g.size()) {
            i18 = 1;
        }
        return i18 ^ 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0130 A[LOOP:0: B:19:0x0101->B:27:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139 A[EDGE_INSN: B:28:0x0139->B:29:0x0139 BREAK  A[LOOP:0: B:19:0x0101->B:27:0x0130], SYNTHETIC] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r33, int r34) {
        /*
            Method dump skipped, instructions count: 1395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.a4.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = this.f103297d;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ark, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new bm2.n3(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aru, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new bm2.o3(inflate2);
    }

    public final android.view.View x() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f103304n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void z(java.lang.String curGiftId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curGiftId, "curGiftId");
        java.util.ArrayList arrayList = this.f103300g;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.Object obj = arrayList.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ce2.i iVar = (ce2.i) obj;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f103298e.p0(i18);
            bm2.n3 n3Var = p07 instanceof bm2.n3 ? (bm2.n3) p07 : null;
            if (n3Var != null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f67814x2c488eb6, curGiftId)) {
                    n3Var.i(curGiftId, i17);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b c14321x140d228b = n3Var.f103670q;
                    c14321x140d228b.f197473f.n();
                    c14321x140d228b.setVisibility(8);
                }
            }
        }
    }
}
