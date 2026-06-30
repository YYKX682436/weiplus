package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveNoticeBannerView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/live/widget/yl;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView */
/* loaded from: classes3.dex */
public final class C14406x76bd35b extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f199201d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 f199202e;

    /* renamed from: f, reason: collision with root package name */
    public final int f199203f;

    /* renamed from: g, reason: collision with root package name */
    public int f199204g;

    /* renamed from: h, reason: collision with root package name */
    public r45.h32 f199205h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14406x76bd35b(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199203f = 1;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eax, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199201d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.uay);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f199202e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302) findViewById;
    }

    public final void b(r45.h32 h32Var) {
        this.f199205h = h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = this.f199202e;
        if (c14334xd566b302 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeItemTxt");
            throw null;
        }
        c14334xd566b302.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b3022 = this.f199202e;
        if (c14334xd566b3022 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeItemTxt");
            throw null;
        }
        c14334xd566b3022.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yp(this, h32Var));
        if (this.f199204g == 0) {
            this.f199204g = this.f199203f;
        } else {
            this.f199204g = 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yl
    public void j(boolean z17) {
        if (z17) {
            b(this.f199205h);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14334xd566b302 c14334xd566b302 = this.f199202e;
        if (c14334xd566b302 != null) {
            c14334xd566b302.e();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeItemTxt");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14406x76bd35b(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f199203f = 1;
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14406x76bd35b(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f199203f = 1;
        a(context);
    }
}
