package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1537x5c512bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/finderlivelogo/FinderLiveLogoItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView */
/* loaded from: classes3.dex */
public final class C14376x7fc1695 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f197847d;

    public /* synthetic */ C14376x7fc1695(android.content.Context context, android.util.AttributeSet attributeSet, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    public final void a(r45.rd4 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.String m75945x2fec8307 = task.m75945x2fec8307(1);
        boolean z17 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        android.widget.ImageView imageView = this.f197847d;
        if (z17) {
            imageView.setVisibility(8);
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.e().c(new mn2.q3(task.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411498s));
        imageView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14376x7fc1695(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View findViewById = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.atl, this).findViewById(com.p314xaae8f345.mm.R.id.h6y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197847d = (android.widget.ImageView) findViewById;
    }
}
