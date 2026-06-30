package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8;

/* renamed from: com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView */
/* loaded from: classes8.dex */
public class C13237x4b7b34f3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 implements xn5.a0 {

    /* renamed from: f2, reason: collision with root package name */
    public final android.content.Context f178873f2;

    /* renamed from: g2, reason: collision with root package name */
    public p02.h f178874g2;

    /* renamed from: h2, reason: collision with root package name */
    public java.util.List f178875h2;

    /* renamed from: i2, reason: collision with root package name */
    public java.util.List f178876i2;

    /* renamed from: j2, reason: collision with root package name */
    public final vz.i1 f178877j2;

    public C13237x4b7b34f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178877j2 = new p02.i(this);
        this.f178873f2 = context;
    }

    /* renamed from: setData */
    private void m54709x76491f2c(java.util.List<p02.l> list) {
        p02.h hVar = this.f178874g2;
        java.util.ArrayList arrayList = hVar.f431931f;
        arrayList.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            arrayList.addAll(list);
        }
        hVar.m8146xced61ae5();
    }

    public void l1(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.content.Context context = this.f178873f2;
        if (!K0) {
            p02.l.a(context, str);
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("search_history_href", 0);
            java.lang.String string = sharedPreferences.getString("search_history_list", "");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(android.util.Base64.encodeToString(str.getBytes(), 0));
            stringBuffer.append(";");
            stringBuffer.append(string);
            java.lang.String[] split = stringBuffer.toString().split(";");
            stringBuffer.setLength(0);
            for (int i17 = 0; i17 < split.length && i17 < 10; i17++) {
                stringBuffer.append(split[i17]);
                stringBuffer.append(";");
            }
            sharedPreferences.edit().putString("search_history_list", stringBuffer.toString()).commit();
        }
        this.f178875h2 = p02.l.b(context);
    }

    public void m1() {
        this.f178873f2.getSharedPreferences("search_history_href", 0).edit().putString("search_history_list", "").commit();
        java.util.List list = this.f178875h2;
        if (list != null) {
            list.clear();
        }
        m54709x76491f2c(null);
    }

    public void n1(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Context context = this.f178873f2;
        p02.l.a(context, str);
        java.util.List<p02.l> b17 = p02.l.b(context);
        this.f178875h2 = b17;
        m54709x76491f2c(b17);
    }

    public void o1() {
        m54709x76491f2c(null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchListView", "onAttachedToWindow");
        super.onAttachedToWindow();
        vz.i1 i1Var = this.f178877j2;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).add(i1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadSearchListView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        vz.i1 i1Var = this.f178877j2;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178442f).remove(i1Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c.f178440d;
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
        android.content.Context context = this.f178873f2;
        p02.h hVar = new p02.h(context, this);
        this.f178874g2 = hVar;
        mo7960x6cab2c8d(hVar);
        N(new p02.m(getResources()));
        this.f178875h2 = p02.l.b(context);
        this.f178876i2 = new java.util.ArrayList();
    }

    public void p1() {
        setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f178875h2)) {
            this.f178875h2 = p02.l.b(this.f178873f2);
        }
        m54709x76491f2c(this.f178875h2);
    }

    public void q1(java.util.List list) {
        setVisibility(0);
        ((java.util.ArrayList) this.f178876i2).clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            ((java.util.ArrayList) this.f178876i2).addAll(list);
        }
        m54709x76491f2c(this.f178876i2);
    }

    public C13237x4b7b34f3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f178877j2 = new p02.i(this);
        this.f178873f2 = context;
    }
}
