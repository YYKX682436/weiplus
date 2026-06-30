package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "i", "Lyz5/a;", "getShowEditPanel", "()Lyz5/a;", "setShowEditPanel", "(Lyz5/a;)V", "showEditPanel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveNewFansClubAnnouncementView */
/* loaded from: classes3.dex */
public final class C14337xdaa7e550 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f197589d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f197590e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f197591f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f197592g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f197593h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a showEditPanel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14337xdaa7e550(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.diz, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f197589d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.fdi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197590e = findViewById;
        android.view.View view = this.f197589d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.qp8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f197591f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById2;
        android.view.View view2 = this.f197589d;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.fdh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f197592g = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f197589d;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.fsi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f197593h = (android.widget.ImageView) findViewById4;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f197591f;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("showAnnouncementSwitch");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.w7(this, context));
        android.view.View view4 = this.f197590e;
        if (view4 != null) {
            view4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.x7(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentContainer");
            throw null;
        }
    }

    public final void b(r45.qo qoVar) {
        boolean z17 = true;
        if ((qoVar != null ? qoVar.m75945x2fec8307(1) : null) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f197591f;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("showAnnouncementSwitch");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
            android.view.View view = this.f197590e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f197591f;
        if (viewOnClickListenerC22631x1cc07cc82 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("showAnnouncementSwitch");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(true);
        android.view.View view2 = this.f197590e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentContainer");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView", "updateContent", "(Lcom/tencent/mm/protocal/protobuf/Bulletin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f197592g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContent");
            throw null;
        }
        java.lang.String m75945x2fec8307 = qoVar.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(m75945x2fec8307);
        java.lang.String m75945x2fec83072 = qoVar.m75945x2fec8307(2);
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.widget.ImageView imageView = this.f197593h;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentPic");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f197593h;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentPic");
            throw null;
        }
        imageView2.setVisibility(0);
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(qoVar.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411498s));
        android.widget.ImageView imageView3 = this.f197593h;
        if (imageView3 != null) {
            b17.c(imageView3);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentPic");
            throw null;
        }
    }

    public final yz5.a getShowEditPanel() {
        return this.showEditPanel;
    }

    /* renamed from: setShowEditPanel */
    public final void m57419xb9e7565b(yz5.a aVar) {
        this.showEditPanel = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14337xdaa7e550(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a(context);
    }
}
