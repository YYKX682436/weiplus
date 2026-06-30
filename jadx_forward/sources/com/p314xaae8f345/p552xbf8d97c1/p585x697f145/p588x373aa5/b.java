package com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f134605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134608g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134609h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134610i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134613o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134614p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134615q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int[] f134616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int[] f134617s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ mj.i f134618t;

    public b(mj.i iVar, float f17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int[] iArr, int[] iArr2) {
        this.f134618t = iVar;
        this.f134605d = f17;
        this.f134606e = str;
        this.f134607f = str2;
        this.f134608g = str3;
        this.f134609h = str4;
        this.f134610i = str5;
        this.f134611m = str6;
        this.f134612n = str7;
        this.f134613o = str8;
        this.f134614p = str9;
        this.f134615q = str10;
        this.f134616r = iArr;
        this.f134617s = iArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i iVar = this.f134618t;
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6.LineChartView lineChartView = iVar.f408507d.f134562e;
        float f17 = this.f134605d;
        int i17 = iVar.f408516m;
        lineChartView.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.a aVar = new com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.a(lineChartView, (int) f17, i17);
        java.util.LinkedList linkedList = lineChartView.f134585h;
        if (linkedList.size() >= 50) {
            linkedList.removeLast();
        }
        linkedList.addFirst(aVar);
        lineChartView.invalidate();
        iVar.f408507d.f134561d.setText(java.lang.String.format("%.2f FPS", java.lang.Float.valueOf(f17)));
        iVar.f408507d.f134561d.setTextColor(iVar.f408516m);
        iVar.f408507d.f134564g.setText(this.f134606e);
        iVar.f408507d.f134565h.setText(this.f134607f);
        iVar.f408507d.f134566i.setText(this.f134608g);
        iVar.f408507d.f134567m.setText(this.f134609h);
        iVar.f408507d.f134568n.setText(this.f134610i);
        iVar.f408507d.f134569o.setText(this.f134611m);
        iVar.f408507d.f134570p.setText(this.f134612n);
        iVar.f408507d.f134571q.setText(this.f134613o);
        if (mj.i.f408503q >= 31) {
            iVar.f408507d.f134572r.setText(this.f134614p);
        } else {
            iVar.f408507d.f134572r.setText("gpu: unusable");
        }
        iVar.f408507d.f134573s.setText(this.f134615q);
        android.widget.TextView textView = iVar.f408507d.f134574t;
        int[] iArr = this.f134616r;
        textView.setText(java.lang.String.valueOf(iArr[1]));
        iVar.f408507d.f134575u.setText(java.lang.String.valueOf(iArr[2]));
        iVar.f408507d.f134576v.setText(java.lang.String.valueOf(iArr[3]));
        iVar.f408507d.f134577w.setText(java.lang.String.valueOf(iArr[4]));
        android.widget.TextView textView2 = iVar.f408507d.f134578x;
        int[] iArr2 = this.f134617s;
        textView2.setText(java.lang.String.valueOf(iArr2[1]));
        iVar.f408507d.f134579y.setText(java.lang.String.valueOf(iArr2[2]));
        iVar.f408507d.f134580z.setText(java.lang.String.valueOf(iArr2[3]));
        iVar.f408507d.A.setText(java.lang.String.valueOf(iArr2[4]));
    }
}
