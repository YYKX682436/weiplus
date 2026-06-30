package com.tencent.matrix.trace.view;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f53072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53074f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53075g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53076h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53077i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53078m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53079n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53080o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53081p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53082q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int[] f53083r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int[] f53084s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ mj.i f53085t;

    public b(mj.i iVar, float f17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int[] iArr, int[] iArr2) {
        this.f53085t = iVar;
        this.f53072d = f17;
        this.f53073e = str;
        this.f53074f = str2;
        this.f53075g = str3;
        this.f53076h = str4;
        this.f53077i = str5;
        this.f53078m = str6;
        this.f53079n = str7;
        this.f53080o = str8;
        this.f53081p = str9;
        this.f53082q = str10;
        this.f53083r = iArr;
        this.f53084s = iArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i iVar = this.f53085t;
        com.tencent.matrix.trace.view.FloatFrameView.LineChartView lineChartView = iVar.f326974d.f53029e;
        float f17 = this.f53072d;
        int i17 = iVar.f326983m;
        lineChartView.getClass();
        com.tencent.matrix.trace.view.a aVar = new com.tencent.matrix.trace.view.a(lineChartView, (int) f17, i17);
        java.util.LinkedList linkedList = lineChartView.f53052h;
        if (linkedList.size() >= 50) {
            linkedList.removeLast();
        }
        linkedList.addFirst(aVar);
        lineChartView.invalidate();
        iVar.f326974d.f53028d.setText(java.lang.String.format("%.2f FPS", java.lang.Float.valueOf(f17)));
        iVar.f326974d.f53028d.setTextColor(iVar.f326983m);
        iVar.f326974d.f53031g.setText(this.f53073e);
        iVar.f326974d.f53032h.setText(this.f53074f);
        iVar.f326974d.f53033i.setText(this.f53075g);
        iVar.f326974d.f53034m.setText(this.f53076h);
        iVar.f326974d.f53035n.setText(this.f53077i);
        iVar.f326974d.f53036o.setText(this.f53078m);
        iVar.f326974d.f53037p.setText(this.f53079n);
        iVar.f326974d.f53038q.setText(this.f53080o);
        if (mj.i.f326970q >= 31) {
            iVar.f326974d.f53039r.setText(this.f53081p);
        } else {
            iVar.f326974d.f53039r.setText("gpu: unusable");
        }
        iVar.f326974d.f53040s.setText(this.f53082q);
        android.widget.TextView textView = iVar.f326974d.f53041t;
        int[] iArr = this.f53083r;
        textView.setText(java.lang.String.valueOf(iArr[1]));
        iVar.f326974d.f53042u.setText(java.lang.String.valueOf(iArr[2]));
        iVar.f326974d.f53043v.setText(java.lang.String.valueOf(iArr[3]));
        iVar.f326974d.f53044w.setText(java.lang.String.valueOf(iArr[4]));
        android.widget.TextView textView2 = iVar.f326974d.f53045x;
        int[] iArr2 = this.f53084s;
        textView2.setText(java.lang.String.valueOf(iArr2[1]));
        iVar.f326974d.f53046y.setText(java.lang.String.valueOf(iArr2[2]));
        iVar.f326974d.f53047z.setText(java.lang.String.valueOf(iArr2[3]));
        iVar.f326974d.A.setText(java.lang.String.valueOf(iArr2[4]));
    }
}
