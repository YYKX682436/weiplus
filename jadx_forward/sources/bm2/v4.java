package bm2;

/* loaded from: classes3.dex */
public final class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f103917d;

    public v4(bm2.n5 n5Var) {
        this.f103917d = n5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        int i18;
        boolean z17;
        r45.r62 r62Var;
        boolean z18;
        r45.r62 r62Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberExpandViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.n5 n5Var = this.f103917d;
        java.util.ArrayList arrayList2 = n5Var.N;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            i18 = 1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((bm2.m4) next).f103635b == n5Var.f103687t ? 1 : 0) != 0) {
                arrayList3.add(next);
            }
        }
        int size = arrayList3.size();
        java.util.ArrayList arrayList4 = n5Var.P;
        int size2 = arrayList4 != null ? arrayList4.size() : 0;
        if (size < 15) {
            if (size2 < 15) {
                pm0.v.b0(n5Var.N, new bm2.r4(n5Var));
                pm0.v.b0(n5Var.B, new bm2.s4(n5Var));
                n5Var.m8155x27702c4(n5Var.N.size());
                z18 = true;
            } else {
                z18 = false;
            }
            if (size2 > 15) {
                size2 = 15;
            }
            int size3 = z18 ? n5Var.N.size() : n5Var.N.size() - 1;
            int i19 = size;
            while (i19 < size2) {
                java.util.ArrayList arrayList5 = n5Var.P;
                if (arrayList5 != null && (r62Var2 = (r45.r62) arrayList5.get(i19)) != null) {
                    n5Var.B.add(size3, new bm2.m4((r45.xn1) r62Var2.m75936x14adae67(i17), n5Var.f103687t, 0, 0, false, r62Var2.m75941xfb821914(i18), 0, null, 208, null));
                    n5Var.N.add(size3, new bm2.m4((r45.xn1) r62Var2.m75936x14adae67(i17), n5Var.f103687t, 0, 0, false, r62Var2.m75941xfb821914(1), 0, null, 208, null));
                }
                i19++;
                i17 = 0;
                i18 = 1;
            }
            n5Var.m8153xd399a4d9(size3, size2 - size);
        } else {
            int i27 = size + 10;
            if (i27 > size2) {
                i27 = size2;
            }
            if (i27 == size2) {
                pm0.v.b0(n5Var.N, new bm2.t4(n5Var));
                pm0.v.b0(n5Var.B, new bm2.u4(n5Var));
                n5Var.m8155x27702c4(n5Var.N.size());
                z17 = true;
            } else {
                z17 = false;
            }
            int size4 = z17 ? n5Var.N.size() : n5Var.N.size() - 1;
            for (int i28 = size; i28 < i27; i28++) {
                java.util.ArrayList arrayList6 = n5Var.P;
                if (arrayList6 != null && (r62Var = (r45.r62) arrayList6.get(i28)) != null) {
                    n5Var.B.add(size4, new bm2.m4((r45.xn1) r62Var.m75936x14adae67(0), n5Var.f103687t, 0, 0, false, r62Var.m75941xfb821914(1), 0, null, 208, null));
                    n5Var.N.add(size4, new bm2.m4((r45.xn1) r62Var.m75936x14adae67(0), n5Var.f103687t, 0, 0, false, r62Var.m75941xfb821914(1), 0, null, 208, null));
                }
            }
            n5Var.m8153xd399a4d9(size4, i27 - size);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberExpandViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
