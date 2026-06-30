package bm2;

/* loaded from: classes3.dex */
public final class a4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: o, reason: collision with root package name */
    public static float f21763o;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f21764d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f21765e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21766f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f21767g;

    /* renamed from: h, reason: collision with root package name */
    public tg2.h f21768h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f21769i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f21770m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f21771n;

    public a4(android.content.Context context, com.tencent.mm.view.recyclerview.WxRecyclerView gridView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(gridView, "gridView");
        this.f21764d = context;
        this.f21765e = gridView;
        this.f21767g = new java.util.ArrayList();
        this.f21769i = new java.util.ArrayList();
        this.f21770m = jz5.h.b(new bm2.x3(this));
        this.f21771n = jz5.h.b(new bm2.y3(this));
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
                if (ad5Var.getLong(1) <= 0 || (ad5Var.getLong(6) > 0 && ad5Var.getLong(6) - i17 <= 0)) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(next);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.Long.valueOf(((r45.ad5) it6.next()).getLong(1)));
            }
            java.util.Iterator it7 = arrayList2.iterator();
            j17 = 0;
            while (it7.hasNext()) {
                j17 += ((java.lang.Number) it7.next()).longValue();
            }
        } else {
            j17 = 0;
        }
        android.widget.TextView textView = n3Var.f22138r;
        if (j17 > 0) {
            textView.setText("x" + j17);
            zl2.r4.f473950a.b3(n3Var.f22138r);
        } else {
            i18 = 8;
        }
        textView.setVisibility(i18);
    }

    public final void B(boolean z17) {
        java.util.ArrayList arrayList = this.f21769i;
        if (arrayList.contains(x()) == z17) {
            return;
        }
        java.util.ArrayList arrayList2 = this.f21767g;
        if (z17) {
            arrayList.add(x());
            notifyItemInserted((arrayList2.size() + arrayList.size()) - 1);
            return;
        }
        int size = arrayList2.size() + arrayList.indexOf(x());
        arrayList.remove(x());
        if (size >= 0) {
            notifyItemRemoved(size);
        } else {
            notifyDataSetChanged();
        }
    }

    public final void E(java.util.List giftList, int i17, java.util.LinkedList eachPageIndexList, boolean z17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(giftList, "giftList");
        kotlin.jvm.internal.o.g(eachPageIndexList, "eachPageIndexList");
        int size = giftList.size();
        com.tencent.mars.xlog.Log.i("FinderLiveGiftGridAdapter", "updateGift pageIndex:" + i17 + ",size:" + size + ",eachPageIndexList:" + eachPageIndexList);
        java.util.ArrayList arrayList = this.f21767g;
        arrayList.clear();
        if (eachPageIndexList.size() > 1) {
            java.lang.Object obj2 = eachPageIndexList.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            for (java.lang.String str : (java.lang.Iterable) obj2) {
                java.util.Iterator it = giftList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((ce2.i) obj).field_rewardProductId, str)) {
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
            java.lang.String str2 = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
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
        java.lang.String str3 = com.tencent.mm.plugin.finder.live.plugin.hm.T1;
        if (size2 > 8) {
            android.view.View view = (android.view.View) ((jz5.n) this.f21770m).getValue();
            kotlin.jvm.internal.o.f(view, "<get-listEndFooterView>(...)");
            java.util.ArrayList arrayList2 = this.f21769i;
            if (arrayList2.contains(view)) {
                return;
            }
            arrayList2.add(view);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21767g.size() + this.f21769i.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        int i18 = 0;
        if (i17 >= 0 && i17 < this.f21767g.size()) {
            i18 = 1;
        }
        return i18 ^ 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0130 A[LOOP:0: B:19:0x0101->B:27:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139 A[EDGE_INSN: B:28:0x0139->B:29:0x0139 BREAK  A[LOOP:0: B:19:0x0101->B:27:0x0130], SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r33, int r34) {
        /*
            Method dump skipped, instructions count: 1395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.a4.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = this.f21764d;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ark, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new bm2.n3(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aru, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new bm2.o3(inflate2);
    }

    public final android.view.View x() {
        java.lang.Object value = ((jz5.n) this.f21771n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void z(java.lang.String curGiftId, int i17) {
        kotlin.jvm.internal.o.g(curGiftId, "curGiftId");
        java.util.ArrayList arrayList = this.f21767g;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.Object obj = arrayList.get(i18);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            ce2.i iVar = (ce2.i) obj;
            androidx.recyclerview.widget.k3 p07 = this.f21765e.p0(i18);
            bm2.n3 n3Var = p07 instanceof bm2.n3 ? (bm2.n3) p07 : null;
            if (n3Var != null) {
                if (kotlin.jvm.internal.o.b(iVar.field_rewardProductId, curGiftId)) {
                    n3Var.i(curGiftId, i17);
                } else {
                    com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView finderLiveGiftPreviewView = n3Var.f22137q;
                    finderLiveGiftPreviewView.f115940f.n();
                    finderLiveGiftPreviewView.setVisibility(8);
                }
            }
        }
    }
}
