package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/preference/VerifyRecordListView;", "Landroid/widget/LinearLayout;", "Ly35/j;", "args", "Ljz5/f0;", "setFMessageArgs", "", "forceHideReply", "setForceHideReply", "hide", "setHide", "Ly35/k;", "callback", "setGotoSayHiCallBack", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView */
/* loaded from: classes11.dex */
public final class C19715xef2590cd extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public y35.j f272607d;

    /* renamed from: e, reason: collision with root package name */
    public y35.d f272608e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f272609f;

    /* renamed from: g, reason: collision with root package name */
    public final y35.d[] f272610g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272611h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f272612i;

    /* renamed from: m, reason: collision with root package name */
    public y35.k f272613m;

    /* renamed from: n, reason: collision with root package name */
    public final l75.q0 f272614n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19715xef2590cd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f272610g = new y35.d[3];
        this.f272614n = new y35.j0(this);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aa_));
        int i17 = 0;
        textView.setTextSize(0, i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        textView.setVisibility(8);
        this.f272609f = textView;
        addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
        while (i17 < 3) {
            int i18 = i17 + 1;
            y35.d dVar = new y35.d(getContext(), i18);
            dVar.m176454xffaa9d4c(8);
            dVar.setVisibility(8);
            addView(dVar, new android.widget.LinearLayout.LayoutParams(-1, -2));
            this.f272610g[i17] = dVar;
            i17 = i18;
        }
        y35.d dVar2 = new y35.d(getContext(), true);
        dVar2.setVisibility(8);
        this.f272608e = dVar2;
        addView(dVar2, new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(y35.r[] r14) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd.a(y35.r[]):void");
    }

    public final void b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj().mo49775xc84af884(this.f272614n);
        for (y35.d dVar : this.f272610g) {
            if (dVar != null) {
                dVar.c();
            }
        }
        y35.d dVar2 = this.f272608e;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f272608e = null;
        this.f272609f = null;
        this.f272607d = null;
    }

    public final void c() {
        for (y35.d dVar : this.f272610g) {
            if (dVar != null) {
                dVar.setVisibility(8);
            }
        }
        y35.d dVar2 = this.f272608e;
        if (dVar2 != null) {
            dVar2.setVisibility(8);
        }
        android.widget.TextView textView = this.f272609f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj().add(this.f272614n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordListView", "onAttachedToWindow, cloudListener registered");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* renamed from: setFMessageArgs */
    public final void m75607xd75a02c0(y35.j jVar) {
        this.f272607d = jVar;
        y35.d.m176453xd75a02c0(jVar);
        if (jVar != null) {
            for (y35.d dVar : this.f272610g) {
                if (dVar != null) {
                    dVar.e();
                }
            }
            y35.d dVar2 = this.f272608e;
            if (dVar2 != null) {
                dVar2.e();
            }
        }
    }

    /* renamed from: setForceHideReply */
    public final void m75608x2bd9211f(boolean z17) {
        this.f272612i = z17;
    }

    /* renamed from: setGotoSayHiCallBack */
    public final void m75609x351d3dec(y35.k kVar) {
        this.f272613m = kVar;
        y35.d dVar = this.f272608e;
        if (dVar != null) {
            dVar.m176456x351d3dec(kVar);
        }
    }

    /* renamed from: setHide */
    public final void m75610x764b0cc4(boolean z17) {
        this.f272611h = z17;
    }
}
