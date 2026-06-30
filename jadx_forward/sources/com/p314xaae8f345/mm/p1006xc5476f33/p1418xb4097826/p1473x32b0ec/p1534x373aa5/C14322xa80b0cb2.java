package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001bJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftSendBtn;", "Landroid/widget/RelativeLayout;", "", "", "", "getReportSdkViewInfo", "Ljava/lang/Runnable;", "m", "Ljava/lang/Runnable;", "getSingleClickPagTask", "()Ljava/lang/Runnable;", "singleClickPagTask", "n", "Ljava/lang/String;", "getMCurGiftId", "()Ljava/lang/String;", "setMCurGiftId", "(Ljava/lang/String;)V", "mCurGiftId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGiftSendBtn */
/* loaded from: classes3.dex */
public final class C14322xa80b0cb2 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f197481d;

    /* renamed from: e, reason: collision with root package name */
    public final long f197482e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f197483f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f197484g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f197485h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f197486i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final java.lang.Runnable singleClickPagTask;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.lang.String mCurGiftId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14322xa80b0cb2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197481d = "FinderLiveGiftSendBtn";
        this.f197482e = 500L;
        this.f197485h = "assets://finder_live_gift_continue_click_short.pag";
        this.f197486i = "assets://finder_live_gift_single_click_short.pag";
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.as7, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.eyb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197483f = findViewById;
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.ey_);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2).o(ae2.in.f85221a.a(ym5.f6.R1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "apply(...)");
        this.f197484g = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById2;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "finder_live_room_gift_again");
        this.singleClickPagTask = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getReportSdkViewInfo */
    public final java.util.Map<java.lang.String, java.lang.Object> m57344x25f3d0c3() {
        return kz5.c1.l(new jz5.l("live_gift_id", this.mCurGiftId));
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197481d, "resetSendAgainPagPath " + str);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f197484g;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22789xd23e9a9b.m82576xfb83cc9b(), str)) {
            return;
        }
        c22789xd23e9a9b.m82581x764e93a7(str);
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197481d, "showContinueClickSendAgaim longClick:" + z17);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f197484g;
        java.lang.String m82576xfb83cc9b = c22789xd23e9a9b.m82576xfb83cc9b();
        java.lang.String str = this.f197485h;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m82576xfb83cc9b, str)) {
            if (c22789xd23e9a9b.f()) {
                c22789xd23e9a9b.n();
            }
            b(str);
            c22789xd23e9a9b.m82583xcde73672(1);
        }
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        c22789xd23e9a9b.g();
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_gift_send_again", this.f197483f, m57344x25f3d0c3(), 25561);
        }
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197481d, "showSingleClickSendAgian");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f197484g;
        java.lang.String m82576xfb83cc9b = c22789xd23e9a9b.m82576xfb83cc9b();
        java.lang.String str = this.f197486i;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m82576xfb83cc9b, str)) {
            if (c22789xd23e9a9b.f()) {
                c22789xd23e9a9b.n();
            }
            b(str);
            c22789xd23e9a9b.m82583xcde73672(-1);
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
        }
        if (c22789xd23e9a9b.f()) {
            return;
        }
        c22789xd23e9a9b.g();
    }

    public final java.lang.String getMCurGiftId() {
        return this.mCurGiftId;
    }

    public final java.lang.Runnable getSingleClickPagTask() {
        return this.singleClickPagTask;
    }

    /* renamed from: setMCurGiftId */
    public final void m57347x7522f4e0(java.lang.String str) {
        this.mCurGiftId = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14322xa80b0cb2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
