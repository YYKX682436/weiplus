package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollItem */
/* loaded from: classes9.dex */
public class C16355x97a04787 extends android.widget.ListView {

    /* renamed from: m, reason: collision with root package name */
    public static final android.util.SparseArray f227480m;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f227481d;

    /* renamed from: e, reason: collision with root package name */
    public long f227482e;

    /* renamed from: f, reason: collision with root package name */
    public int f227483f;

    /* renamed from: g, reason: collision with root package name */
    public int f227484g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.CountDownTimer f227485h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i f227486i;

    static {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f227480m = sparseArray;
        sparseArray.put(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cby));
        sparseArray.put(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cbz));
        sparseArray.put(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563546cc0));
        sparseArray.put(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563547cc1));
        sparseArray.put(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563548cc2));
        sparseArray.put(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563549cc3));
        sparseArray.put(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563550cc4));
        sparseArray.put(7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563551cc5));
        sparseArray.put(8, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cc6));
        sparseArray.put(9, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cc7));
    }

    public C16355x97a04787(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f227482e = 900L;
        this.f227483f = 0;
        this.f227484g = 0;
        this.f227486i = null;
        this.f227481d = context;
        setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.h(this, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyAutoScrollView", "hy: scroll height is: %d", java.lang.Integer.valueOf((int) ((this.f227481d.getResources().getDisplayMetrics().density * 60.0f) + 0.5f)));
    }

    /* renamed from: setResouceMap */
    public static void m66158xcb5d38d6(android.util.SparseArray<java.lang.Integer> sparseArray) {
        android.util.SparseArray sparseArray2 = f227480m;
        sparseArray2.clear();
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            sparseArray2.put(keyAt, sparseArray.get(keyAt));
        }
    }

    public void b() {
        android.os.CountDownTimer countDownTimer = this.f227485h;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f(this, (this.f227483f * 50) + this.f227482e));
    }

    /* renamed from: setFinalNumber */
    public void m66159xe412d29d(int i17) {
        this.f227483f = i17;
    }

    /* renamed from: setOnScrollEndListener */
    public void m66160xd59d7dc1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i iVar) {
        this.f227486i = iVar;
    }

    /* renamed from: setScrollTime */
    public void m66161x2058853c(long j17) {
        this.f227482e = j17;
    }

    public C16355x97a04787(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
