package com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomAvatarsFrame */
/* loaded from: classes15.dex */
public class C18550x4e85dcba extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f253982m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f253983d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 f253984e;

    /* renamed from: f, reason: collision with root package name */
    public fh4.g f253985f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f253986g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f253987h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f253988i;

    public C18550x4e85dcba(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f253983d = i65.a.b(null, 58);
        b();
    }

    public final void a() {
        fh4.g gVar = this.f253985f;
        java.lang.String str = this.f253988i;
        gVar.f344229f = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f253985f.notifyDataSetChanged();
            return;
        }
        if (this.f253984e.m79007x8e1f5b83()) {
            return;
        }
        fh4.g gVar2 = this.f253985f;
        int indexOf = gVar2.f344227d.indexOf(this.f253988i);
        int i17 = this.f253983d;
        int i18 = indexOf * i17;
        int m79006x9746038c = this.f253984e.m79006x9746038c();
        if (i18 < m79006x9746038c) {
            this.f253984e.c(i18);
        } else if (i18 > m79006x9746038c + (i17 * 4)) {
            this.f253984e.c(i18 - (i17 * 4));
        } else {
            this.f253985f.notifyDataSetChanged();
        }
    }

    public final void b() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cxo, this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9) findViewById(com.p314xaae8f345.mm.R.id.f566782h13);
        this.f253984e = c21500x7be515c9;
        c21500x7be515c9.m79011x15066afe(true);
        this.f253984e.m79008x3ea112a6(true);
        this.f253984e.m79010xdbabe831(this.f253983d);
        fh4.g gVar = new fh4.g(getContext());
        this.f253985f = gVar;
        this.f253984e.setAdapter((android.widget.ListAdapter) gVar);
        this.f253986g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f253984e.m79009xd176e766(new fh4.d(this));
        this.f253987h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fh4.e(this), false);
    }

    /* renamed from: setCurMemeber */
    public void m71576x36212d01(java.lang.String str) {
        if (this.f253984e == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f253988i) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f253988i) || !this.f253988i.equals(str)) {
            this.f253988i = str;
            a();
        }
    }

    /* renamed from: setMembersList */
    public void m71577xc3c27395(java.util.List<java.lang.String> list) {
        fh4.g gVar = this.f253985f;
        if (gVar == null) {
            return;
        }
        if (list == null) {
            gVar.f344227d.clear();
        } else {
            gVar.f344227d = list;
        }
        gVar.notifyDataSetChanged();
    }

    public C18550x4e85dcba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f253983d = i65.a.b(null, 58);
        b();
    }
}
