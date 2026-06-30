package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/EasySimpleLivingCardView;", "Landroid/widget/RelativeLayout;", "Lyo0/i;", "getImageLoadOption", "Lr45/qt2;", "d", "Lr45/qt2;", "getReportObj", "()Lr45/qt2;", "setReportObj", "(Lr45/qt2;)V", "reportObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView */
/* loaded from: classes2.dex */
public class C14292x9b32d532 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public r45.qt2 reportObj;

    /* renamed from: e, reason: collision with root package name */
    public float f197307e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f197308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14292x9b32d532(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197307e = 1.7776f;
        android.view.View findViewById = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dmg, this).findViewById(com.p314xaae8f345.mm.R.id.k69);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197308f = (android.view.ViewGroup) findViewById;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532 r9, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r10, int r11, float r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14292x9b32d532.e(com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView, com.tencent.mm.protocal.protobuf.FinderObject, int, float, int, int, java.lang.Object):void");
    }

    /* renamed from: getImageLoadOption */
    private final yo0.i m57227x84131680() {
        return mn2.g1.f411508a.h(mn2.f1.f411486d);
    }

    public final void a(r45.mb4 mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i17) {
        java.lang.String str;
        android.view.ViewGroup viewGroup = this.f197308f;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.icp);
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i17;
        float f17 = i17;
        layoutParams.height = (int) (this.f197307e * f17);
        imageView.setLayoutParams(layoutParams);
        findViewById.getLayoutParams().width = layoutParams.width;
        findViewById.getLayoutParams().height = layoutParams.height;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (this.f197307e * f17);
        }
        viewGroup.requestLayout();
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            str = sb6.toString();
        } else {
            str = concat;
        }
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).c(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, m57227x84131680());
            return;
        }
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb.g7((c61.zb) c17, imageView, str, 0, 4, null);
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item, java.lang.String contextId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        android.content.Intent intent = new android.content.Intent();
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.b(intent);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(item.getFeedObject());
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, contextId);
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(5, item.getFeedObject());
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context, intent, arrayList, 0, wk0Var, null);
    }

    public final r45.qt2 getReportObj() {
        return this.reportObj;
    }

    /* renamed from: setReportObj */
    public final void m57229x46b194e1(r45.qt2 qt2Var) {
        this.reportObj = qt2Var;
    }
}
