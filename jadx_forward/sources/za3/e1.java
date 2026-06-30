package za3;

/* loaded from: classes15.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f552441d;

    public e1(za3.i1 i1Var) {
        this.f552441d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        ab3.h hVar;
        int i17;
        int i18;
        int i19;
        int i27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i28 = iArr[0];
        int i29 = iArr[1];
        za3.i1 i1Var = this.f552441d;
        java.util.List list = i1Var.f552477b;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.content.Context context = i1Var.f552476a;
            float d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 85.0f);
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hVar = i1Var.f552487l;
                if (!hasNext) {
                    break;
                }
                r45.mw6 mw6Var = (r45.mw6) it.next();
                r45.wa5 wa5Var = mw6Var.f462406e;
                za3.i1 i1Var2 = i1Var;
                int i37 = i29;
                android.graphics.Point mo1004x3cd439b0 = hVar.mo1004x3cd439b0(wa5Var.f470544d, wa5Var.f470545e);
                double d18 = mw6Var.f462406e.f470544d;
                int i38 = mo1004x3cd439b0.x - i28;
                int i39 = mo1004x3cd439b0.y - i37;
                if (java.lang.Math.sqrt((i38 * i38) + (i39 * i39)) < d17) {
                    arrayList2.add(mw6Var.f462405d);
                }
                i1Var = i1Var2;
                i29 = i37;
            }
            int i47 = i29;
            za3.i1 i1Var3 = i1Var;
            r45.mw6 mw6Var2 = i1Var3.f552478c;
            if (mw6Var2 != null) {
                r45.wa5 wa5Var2 = mw6Var2.f462406e;
                android.graphics.Point mo1004x3cd439b02 = hVar.mo1004x3cd439b0(wa5Var2.f470544d, wa5Var2.f470545e);
                double d19 = i1Var3.f552478c.f462406e.f470544d;
                int i48 = mo1004x3cd439b02.x - i28;
                int i49 = mo1004x3cd439b02.y - i47;
                if (java.lang.Math.sqrt((i48 * i48) + (i49 * i49)) < d17) {
                    arrayList2.add(i1Var3.f552478c.f462405d);
                }
            }
            arrayList2.size();
            if (arrayList2.size() > 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10997, "12", 0, 0, 0);
                arrayList2.size();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576356x9);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569700j2, (android.view.ViewGroup) null);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c26 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cz_);
                c21497x5c99c26.B = 8;
                c21497x5c99c26.C = 15;
                c21497x5c99c26.m78988xc9d3cd0d(true);
                c21497x5c99c26.G = 3;
                c21497x5c99c26.F = 3;
                c21497x5c99c26.m79000x17db48d8(3);
                c21497x5c99c26.m78998x17db107e(3);
                c21497x5c99c26.m78994x924488d4(null);
                c21497x5c99c26.B = 8;
                c21497x5c99c26.C = 15;
                c21497x5c99c26.m78996xd64d3c62(70);
                c21497x5c99c26.m78995xabfd8acd(70);
                k2Var.setCanceledOnTouchOutside(true);
                k2Var.setContentView(viewGroup);
                za3.b bVar = new za3.b();
                c21497x5c99c26.m78992x7298b70b(bVar);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add((java.lang.String) it6.next());
                }
                if (arrayList3.size() < 3) {
                    c21497x5c99c26.m78998x17db107e(arrayList3.size());
                } else {
                    c21497x5c99c26.m78998x17db107e(3);
                }
                android.view.ViewGroup.LayoutParams layoutParams = c21497x5c99c26.getLayoutParams();
                int b17 = i65.a.b(context, 70);
                int b18 = i65.a.b(context, 8);
                if (arrayList3.size() > 0) {
                    if (arrayList3.size() < 3) {
                        i19 = b17 * arrayList3.size();
                        i27 = b18 * (arrayList3.size() - 1);
                    } else {
                        i19 = b17 * 3;
                        i27 = b18 * 2;
                    }
                    i17 = i19 + i27;
                } else {
                    i17 = 0;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.j.f(context);
                arrayList3.size();
                layoutParams.width = i17;
                int b19 = i65.a.b(context, 70);
                int b27 = i65.a.b(context, 15);
                if (arrayList3.size() > 0) {
                    if (arrayList3.size() > 3) {
                        if (arrayList3.size() <= 6) {
                            b19 *= 2;
                        } else {
                            b19 = (b19 * 3) + (b27 * 2);
                            b27 = i65.a.b(context, 10);
                        }
                    }
                    i18 = b19 + b27;
                } else {
                    i18 = 0;
                }
                layoutParams.height = i18;
                c21497x5c99c26.setLayoutParams(layoutParams);
                c21497x5c99c26.requestLayout();
                java.util.ArrayList arrayList4 = bVar.f552422b;
                arrayList4.clear();
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    arrayList4.add((java.lang.String) it7.next());
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(bVar.f310085a == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGridPaperAdapter", "notifyDataSetChange, notifier is null ? %B", objArr);
                db5.u2 u2Var = bVar.f310085a;
                if (u2Var != null) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21497x5c99c26 c21497x5c99c262 = ((db5.m2) u2Var).f309972a;
                    c21497x5c99c262.f278938n = c21497x5c99c262.f278939o * c21497x5c99c262.f278944t * c21497x5c99c262.f278945u;
                    c21497x5c99c262.d();
                }
                k2Var.show();
            }
            arrayList2.size();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
