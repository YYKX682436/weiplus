package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTagTv", "()Landroid/widget/TextView;", "setTagTv", "(Landroid/widget/TextView;)V", "tagTv", "Lkotlin/Function2;", "Landroid/view/View;", "", "Ljz5/f0;", "e", "Lyz5/p;", "getClickListener", "()Lyz5/p;", "setClickListener", "(Lyz5/p;)V", "clickListener", "f", "Z", "getHasJoinFansClub", "()Z", "setHasJoinFansClub", "(Z)V", "hasJoinFansClub", "isAnchor", "setAnchor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget */
/* loaded from: classes3.dex */
public final class C14397xacff3a56 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView tagTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.p clickListener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean hasJoinFansClub;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f199149g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14397xacff3a56(android.content.Context context, android.util.AttributeSet attr) {
        super(context, attr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attr, "attr");
        this.f199149g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.uf(this);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqc, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dsd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m57899x53bc0c7a((android.widget.TextView) findViewById);
        m57895x752df206().setTextSize(1, 12.0f);
        com.p314xaae8f345.mm.ui.bk.r0(m57895x752df206().getPaint(), 0.8f);
        setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vf(this));
    }

    public final void a(boolean z17, java.lang.String tag, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        m57895x752df206().setText(tag);
        this.hasJoinFansClub = z18;
        if (z17) {
            m57895x752df206().setVisibility(0);
            return;
        }
        if (z18) {
            setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_b));
            m57895x752df206().setVisibility(8);
            return;
        }
        java.lang.Object tag2 = m57895x752df206().getTag();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag2, bool)) {
            m57895x752df206().setVisibility(0);
            m57895x752df206().postDelayed(this.f199149g, 3000L);
            m57895x752df206().setTag(bool);
        }
        setContentDescription(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dlp));
    }

    public final yz5.p getClickListener() {
        return this.clickListener;
    }

    public final boolean getHasJoinFansClub() {
        return this.hasJoinFansClub;
    }

    /* renamed from: getTagTv */
    public final android.widget.TextView m57895x752df206() {
        android.widget.TextView textView = this.tagTv;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tagTv");
        throw null;
    }

    /* renamed from: setAnchor */
    public final void m57896x40f19b7(boolean z17) {
    }

    /* renamed from: setClickListener */
    public final void m57897xa2b9091a(yz5.p pVar) {
        this.clickListener = pVar;
    }

    /* renamed from: setHasJoinFansClub */
    public final void m57898x3b43c2d8(boolean z17) {
        this.hasJoinFansClub = z17;
    }

    /* renamed from: setTagTv */
    public final void m57899x53bc0c7a(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.tagTv = textView;
    }
}
