package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0018R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\r\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLoadBar;", "Landroid/widget/FrameLayout;", "", "d", "Ljz5/g;", "getDefaultProcessLoadingId", "()I", "defaultProcessLoadingId", "e", "getDefaultProcessLoadingColor", "defaultProcessLoadingColor", "f", "getDefaultIconId", "defaultIconId", "g", "getDefaultIconColor", "defaultIconColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/ee", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLoadBar */
/* loaded from: classes2.dex */
public final class C15322xff344627 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultProcessLoadingId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultProcessLoadingColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultIconId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultIconColor;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f212799h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a f212800i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee f212801m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15322xff344627(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.defaultProcessLoadingId = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ie.f213835d);
        this.defaultProcessLoadingColor = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.he.f213769d);
        this.defaultIconId = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ge.f213691d);
        this.defaultIconColor = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fe.f213636d);
        this.f212801m = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee.f213533d;
        a(this, true, null, null, 6, null);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15322xff344627 c15322xff344627, boolean z17, java.lang.Integer num, java.lang.Integer num2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        if ((i17 & 4) != 0) {
            num2 = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("idle cur status=");
        sb6.append(c15322xff344627.f212801m);
        sb6.append(" processBar(");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a = c15322xff344627.f212800i;
        sb6.append(c15338xa845bc0a != null ? c15338xa845bc0a.hashCode() : 0);
        sb6.append("),parent:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a2 = c15322xff344627.f212800i;
        android.view.ViewParent parent = c15338xa845bc0a2 != null ? c15338xa845bc0a2.getParent() : null;
        sb6.append(parent != null ? parent.hashCode() : 0);
        sb6.append("; icon(");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c15322xff344627.f212799h;
        sb6.append(c22699x3dcdb352 != null ? c22699x3dcdb352.hashCode() : 0);
        sb6.append("),parent:");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c15322xff344627.f212799h;
        android.view.ViewParent parent2 = c22699x3dcdb3522 != null ? c22699x3dcdb3522.getParent() : null;
        sb6.append(parent2 != null ? parent2.hashCode() : 0);
        c15322xff344627.b(sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee eeVar = c15322xff344627.f212801m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee eeVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee.f213534e;
        if (eeVar != eeVar2 || z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a3 = c15322xff344627.f212800i;
            if (c15338xa845bc0a3 != null) {
                c15338xa845bc0a3.e();
            }
            c15322xff344627.removeAllViews();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = c15322xff344627.f212799h;
            if (c22699x3dcdb3523 == null) {
                c22699x3dcdb3523 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(c15322xff344627.getContext());
                c22699x3dcdb3523.s(c15322xff344627.m62190xe569155f(), c15322xff344627.m62189xbf60109f());
            }
            c15322xff344627.f212799h = c22699x3dcdb3523;
            if (num != null) {
                int intValue = num.intValue();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = c15322xff344627.f212799h;
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.setImageResource(intValue);
                }
            }
            if (num2 != null) {
                int intValue2 = num2.intValue();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = c15322xff344627.f212799h;
                if (c22699x3dcdb3525 != null) {
                    c22699x3dcdb3525.m82040x7541828(c15322xff344627.getContext().getResources().getColor(intValue2, null));
                }
            }
            c15322xff344627.addView(c15322xff344627.f212799h);
            c15322xff344627.f212801m = eeVar2;
        }
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15322xff344627 c15322xff344627, java.lang.Integer num, java.lang.Integer num2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            num2 = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processing cur status=");
        sb6.append(c15322xff344627.f212801m);
        sb6.append(" processBar(");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a = c15322xff344627.f212800i;
        sb6.append(c15338xa845bc0a != null ? c15338xa845bc0a.hashCode() : 0);
        sb6.append("),parent:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a2 = c15322xff344627.f212800i;
        android.view.ViewParent parent = c15338xa845bc0a2 != null ? c15338xa845bc0a2.getParent() : null;
        sb6.append(parent != null ? parent.hashCode() : 0);
        sb6.append("; icon(");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c15322xff344627.f212799h;
        sb6.append(c22699x3dcdb352 != null ? c22699x3dcdb352.hashCode() : 0);
        sb6.append("),parent:");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c15322xff344627.f212799h;
        android.view.ViewParent parent2 = c22699x3dcdb3522 != null ? c22699x3dcdb3522.getParent() : null;
        sb6.append(parent2 != null ? parent2.hashCode() : 0);
        c15322xff344627.b(sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee eeVar = c15322xff344627.f212801m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee eeVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee.f213535f;
        if (eeVar == eeVar2) {
            return;
        }
        c15322xff344627.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a3 = c15322xff344627.f212800i;
        if (c15338xa845bc0a3 == null) {
            android.content.Context context = c15322xff344627.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c15338xa845bc0a3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a(context, 0L, 2, null);
            c15338xa845bc0a3.c(c15322xff344627.m62192x418a39f3(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(c15322xff344627.m62191xf43fb38b(), null));
        }
        c15322xff344627.f212800i = c15338xa845bc0a3;
        if (num != null || num2 != null) {
            c15338xa845bc0a3.c(num != null ? num.intValue() : c15322xff344627.m62192x418a39f3(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(num2 != null ? num2.intValue() : c15322xff344627.m62191xf43fb38b(), null));
        }
        c15322xff344627.addView(c15322xff344627.f212800i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15338xa845bc0a c15338xa845bc0a4 = c15322xff344627.f212800i;
        if (c15338xa845bc0a4 != null) {
            c15338xa845bc0a4.d();
        }
        c15322xff344627.f212801m = eeVar2;
    }

    /* renamed from: getDefaultIconColor */
    private final int m62189xbf60109f() {
        return ((java.lang.Number) this.defaultIconColor.mo141623x754a37bb()).intValue();
    }

    /* renamed from: getDefaultIconId */
    private final int m62190xe569155f() {
        return ((java.lang.Number) this.defaultIconId.mo141623x754a37bb()).intValue();
    }

    /* renamed from: getDefaultProcessLoadingColor */
    private final int m62191xf43fb38b() {
        return ((java.lang.Number) this.defaultProcessLoadingColor.mo141623x754a37bb()).intValue();
    }

    /* renamed from: getDefaultProcessLoadingId */
    private final int m62192x418a39f3() {
        return ((java.lang.Number) this.defaultProcessLoadingId.mo141623x754a37bb()).intValue();
    }

    public final void b(java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLoadBar#" + hashCode(), str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15322xff344627(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.defaultProcessLoadingId = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ie.f213835d);
        this.defaultProcessLoadingColor = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.he.f213769d);
        this.defaultIconId = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ge.f213691d);
        this.defaultIconColor = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fe.f213636d);
        this.f212801m = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ee.f213533d;
        a(this, true, null, null, 6, null);
    }
}
