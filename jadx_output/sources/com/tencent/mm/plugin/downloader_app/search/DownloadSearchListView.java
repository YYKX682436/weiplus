package com.tencent.mm.plugin.downloader_app.search;

/* loaded from: classes8.dex */
public class DownloadSearchListView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView implements xn5.a0 {

    /* renamed from: f2, reason: collision with root package name */
    public final android.content.Context f97340f2;

    /* renamed from: g2, reason: collision with root package name */
    public p02.h f97341g2;

    /* renamed from: h2, reason: collision with root package name */
    public java.util.List f97342h2;

    /* renamed from: i2, reason: collision with root package name */
    public java.util.List f97343i2;

    /* renamed from: j2, reason: collision with root package name */
    public final vz.i1 f97344j2;

    public DownloadSearchListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f97344j2 = new p02.i(this);
        this.f97340f2 = context;
    }

    private void setData(java.util.List<p02.l> list) {
        p02.h hVar = this.f97341g2;
        java.util.ArrayList arrayList = hVar.f350398f;
        arrayList.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            arrayList.addAll(list);
        }
        hVar.notifyDataSetChanged();
    }

    public void l1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.content.Context context = this.f97340f2;
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
        this.f97342h2 = p02.l.b(context);
    }

    public void m1() {
        this.f97340f2.getSharedPreferences("search_history_href", 0).edit().putString("search_history_list", "").commit();
        java.util.List list = this.f97342h2;
        if (list != null) {
            list.clear();
        }
        setData(null);
    }

    public void n1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Context context = this.f97340f2;
        p02.l.a(context, str);
        java.util.List<p02.l> b17 = p02.l.b(context);
        this.f97342h2 = b17;
        setData(b17);
    }

    public void o1() {
        setData(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchListView", "onAttachedToWindow");
        super.onAttachedToWindow();
        vz.i1 i1Var = this.f97344j2;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96909f).add(i1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadSearchListView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        vz.i1 i1Var = this.f97344j2;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96909f).remove(i1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        android.content.Context context = this.f97340f2;
        p02.h hVar = new p02.h(context, this);
        this.f97341g2 = hVar;
        setAdapter(hVar);
        N(new p02.m(getResources()));
        this.f97342h2 = p02.l.b(context);
        this.f97343i2 = new java.util.ArrayList();
    }

    public void p1() {
        setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f97342h2)) {
            this.f97342h2 = p02.l.b(this.f97340f2);
        }
        setData(this.f97342h2);
    }

    public void q1(java.util.List list) {
        setVisibility(0);
        ((java.util.ArrayList) this.f97343i2).clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            ((java.util.ArrayList) this.f97343i2).addAll(list);
        }
        setData(this.f97343i2);
    }

    public DownloadSearchListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f97344j2 = new p02.i(this);
        this.f97340f2 = context;
    }
}
