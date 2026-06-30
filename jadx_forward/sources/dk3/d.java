package dk3;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk3.e f315981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dk3.e eVar) {
        super(0);
        this.f315981d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk3.e eVar = this.f315981d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f2 = eVar.f315985d;
        if (c16600x72af54f2 != null) {
            c16600x72af54f2.setVisibility(8);
            android.view.ViewGroup a17 = eVar.f315983b.a();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2 c16600x72af54f22 = eVar.f315985d;
                if ((c16600x72af54f22 != null ? c16600x72af54f22.getParent() : null) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatMultiTaskIndicatorController", "attachFloatIndicatorView, already attached");
                } else if (a17 != null) {
                    int childCount = a17.getChildCount();
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= childCount) {
                            break;
                        }
                        if (a17.getChildAt(i18) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1895x42ab1b84.p1896x1ac3eac7.C16600x72af54f2) {
                            a17.removeViewAt(i18);
                            break;
                        }
                        i18++;
                    }
                    int childCount2 = a17.getChildCount();
                    int childCount3 = a17.getChildCount();
                    while (true) {
                        if (i17 >= childCount3) {
                            break;
                        }
                        if (a17.getChildAt(i17) instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) {
                            childCount2 = i17 + 1;
                            break;
                        }
                        i17++;
                    }
                    a17.addView(eVar.f315985d, childCount2);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatMultiTaskIndicatorController", e17, "attachFloatIndicatorView exception:%s", e17);
            }
        }
        return jz5.f0.f384359a;
    }
}
