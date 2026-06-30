package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMGridPaperGridView */
/* loaded from: classes8.dex */
public final class C21498xf966a151 extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public int f278951d;

    /* renamed from: e, reason: collision with root package name */
    public int f278952e;

    /* renamed from: f, reason: collision with root package name */
    public int f278953f;

    /* renamed from: g, reason: collision with root package name */
    public int f278954g;

    /* renamed from: h, reason: collision with root package name */
    public int f278955h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f278956i;

    /* renamed from: m, reason: collision with root package name */
    public db5.y2 f278957m;

    /* renamed from: n, reason: collision with root package name */
    public db5.v2 f278958n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f278959o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f278960p;

    public C21498xf966a151(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278955h = -1;
        this.f278956i = false;
        this.f278959o = new db5.w2(this);
        this.f278960p = new db5.x2(this);
    }

    public void b(int i17, int i18, int i19, db5.v2 v2Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Boolean.valueOf(v2Var == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMGridPaperGridView", "index[%d], rows[%d], columns[%d], adapter is null[%B]", objArr);
        this.f278951d = i17;
        this.f278952e = i19;
        this.f278958n = v2Var;
        int i27 = i18 * i19;
        this.f278953f = i27;
        this.f278954g = i17 * i27;
        if (v2Var != null && ((za3.b) v2Var).f552422b.size() - this.f278954g < this.f278953f) {
            this.f278953f = ((za3.b) this.f278958n).f552422b.size() - this.f278954g;
        }
        if (getAdapter() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMGridPaperGridView", "get adapter null, new one");
            db5.y2 y2Var = new db5.y2(this, null);
            this.f278957m = y2Var;
            setAdapter((android.widget.ListAdapter) y2Var);
        }
        setNumColumns(this.f278952e);
        setColumnWidth(3);
        setOnItemClickListener(this.f278959o);
        setOnItemLongClickListener(this.f278960p);
    }

    /* renamed from: getIndex */
    public int m79002x7498cf1c() {
        return this.f278951d;
    }

    /* renamed from: setClearMode */
    public void m79003xffda74e(boolean z17) {
        this.f278956i = z17;
    }

    /* renamed from: setHiddenIndex */
    public void m79004x3cb74f86(int i17) {
        this.f278955h = i17;
    }

    public C21498xf966a151(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278955h = -1;
        this.f278956i = false;
        this.f278959o = new db5.w2(this);
        this.f278960p = new db5.x2(this);
    }
}
