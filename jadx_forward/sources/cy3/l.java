package cy3;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f306322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f306323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f306324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f306325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f306326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306327i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f306328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f306329n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 f306330o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ vx3.i f306331p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f306332q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f306333r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f306334s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306335t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f306336u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306337v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f306338w;

    public l(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.view.View view, android.content.Context context, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var, vx3.i iVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, long j17, int i17, java.lang.String str, boolean z18, java.lang.String str2, boolean z19) {
        this.f306322d = lVar;
        this.f306323e = h0Var;
        this.f306324f = z17;
        this.f306325g = c16077xb54fe366;
        this.f306326h = c0Var;
        this.f306327i = view;
        this.f306328m = context;
        this.f306329n = view2;
        this.f306330o = y1Var;
        this.f306331p = iVar;
        this.f306332q = c0Var2;
        this.f306333r = j17;
        this.f306334s = i17;
        this.f306335t = str;
        this.f306336u = z18;
        this.f306337v = str2;
        this.f306338w = z19;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f306322d;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f306323e.f391656d);
        }
        if (!this.f306324f) {
            yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f306325g;
        c16077xb54fe366.y();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f306326h;
        boolean z18 = c0Var.f391645d;
        android.view.View view2 = this.f306329n;
        android.content.Context context = this.f306328m;
        android.view.View view3 = this.f306327i;
        if (z18) {
            str = "(Landroid/view/View;)V";
            z17 = false;
            view3.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.axo));
            c16077xb54fe366.setVisibility(8);
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            view3.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.axn));
            c16077xb54fe366.setVisibility(0);
            if (view2 == null) {
                str = "(Landroid/view/View;)V";
                z17 = false;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                str = "(Landroid/view/View;)V";
                z17 = false;
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c16077xb54fe366.x();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y1 y1Var = this.f306330o;
        vx3.i iVar = this.f306331p;
        if (y1Var != null) {
            y1Var.a(iVar, 0L, !c0Var.f391645d);
        }
        c0Var.f391645d = !c0Var.f391645d;
        java.lang.String d17 = iVar.d();
        long c17 = iVar.c();
        boolean z19 = this.f306332q.f391645d;
        boolean z27 = y1Var != null ? y1Var.f240082b.f448919s : z17;
        long j17 = this.f306333r;
        int i17 = this.f306334s;
        java.lang.String str2 = this.f306335t;
        wx3.a.d(d17, c17, j17, 3L, i17, (r35 & 32) != 0 ? "" : str2, (r35 & 64) != 0 ? false : false, (r35 & 128) != 0 ? false : z19, (r35 & 256) != 0 ? "" : str2, (r35 & 512) != 0 ? false : this.f306336u, (r35 & 1024) != 0 ? false : z27, (r35 & 2048) != 0 ? "" : this.f306337v, (r35 & 4096) != 0 ? false : this.f306338w);
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$6", "android/view/View$OnClickListener", "onClick", str);
    }
}
