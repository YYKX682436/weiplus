package l72;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f398383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398384g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l72.j f398385h;

    public i(l72.j jVar, java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f398385h = jVar;
        this.f398381d = str;
        this.f398382e = i17;
        this.f398383f = i18;
        this.f398384g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f398381d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        l72.j jVar = this.f398385h;
        if (K0) {
            jVar.f398386a.f181722v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c69);
        } else {
            jVar.f398386a.f181722v.setText(str);
            jVar.f398386a.G = 2;
        }
        if (this.f398382e == 1) {
            jVar.f398386a.f181720t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7u);
            jVar.f398386a.f181720t.setOnClickListener(new l72.g(this));
        } else {
            jVar.f398386a.f181720t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7t);
            jVar.f398386a.f181720t.setOnClickListener(new l72.h(this));
        }
        jVar.f398386a.f181718r.clearAnimation();
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = jVar.f398386a;
        activityC13534x1dc4b4e7.f181707d.setVisibility(8);
        activityC13534x1dc4b4e7.f181710g.setVisibility(0);
        activityC13534x1dc4b4e7.f181718r.clearAnimation();
        activityC13534x1dc4b4e7.f181714n.setVisibility(0);
        activityC13534x1dc4b4e7.f181708e.setVisibility(8);
        k72.u.B.f386300y = 3;
        jVar.f398386a.I = 3;
    }
}
