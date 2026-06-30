package yi2;

/* loaded from: classes3.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f544032h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f544033i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.b f544034m;

    /* renamed from: n, reason: collision with root package name */
    public int f544035n;

    /* renamed from: o, reason: collision with root package name */
    public int f544036o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, yz5.l onPkMicSettingChange) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPkMicSettingChange, "onPkMicSettingChange");
        this.f544032h = onPkMicSettingChange;
        this.f544035n = -1;
        android.view.ViewGroup.LayoutParams layoutParams = this.f199917g.f526370d.getLayoutParams();
        if (layoutParams != null) {
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z17) {
                i18 = i18 >= i17 ? i18 : i17;
            }
            layoutParams.height = i18 / 3;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        android.widget.TextView f17 = f();
        f17.setEnabled(true);
        return f17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e8c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nob);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveAnchorMicSettingsPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Mic setting option clicked: ");
        sb6.append(view != null ? java.lang.Integer.valueOf(view.getId()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMicSettingsPanelWidget", sb6.toString());
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.b bVar = this.f544034m;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = bVar.f343475c.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Selected ALL mic mode");
            y(0);
        } else {
            fg2.b bVar2 = this.f544034m;
            if (bVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = bVar2.f343477e.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Selected FOLLOWED_ANCHORS mic mode");
                y(1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveAnchorMicSettingsPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.sde;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sde);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.sdf;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdf);
            if (c1073x7e08a787 != null) {
                i17 = com.p314xaae8f345.mm.R.id.sdg;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdg);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.sdh;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdh);
                    if (c22699x3dcdb3522 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.sdi;
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sdi);
                        if (c1073x7e08a7872 != null) {
                            this.f544034m = new fg2.b((android.widget.LinearLayout) rootView, c22699x3dcdb352, c1073x7e08a787, textView, c22699x3dcdb3522, c1073x7e08a7872);
                            c1073x7e08a787.setOnClickListener(this);
                            fg2.b bVar = this.f544034m;
                            if (bVar != null) {
                                bVar.f343477e.setOnClickListener(this);
                                return;
                            } else {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        a();
        int i17 = this.f544035n;
        if (i17 != this.f544036o) {
            fj2.s sVar = fj2.s.f344716a;
            if (i17 == 0) {
                sVar.d(ml2.q2.X, this.f544033i, null);
            } else if (i17 == 1) {
                sVar.d(ml2.q2.Y, this.f544033i, null);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Confirm button clicked, current: " + this.f544035n + ", old: " + this.f544036o);
        this.f544032h.mo146xb9724478(java.lang.Integer.valueOf(this.f544035n));
    }

    public final void y(int i17) {
        if (this.f544035n == i17) {
            return;
        }
        this.f544035n = i17;
        if (i17 == 0) {
            fg2.b bVar = this.f544034m;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            bVar.f343474b.setVisibility(0);
            fg2.b bVar2 = this.f544034m;
            if (bVar2 != null) {
                bVar2.f343476d.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        fg2.b bVar3 = this.f544034m;
        if (bVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        bVar3.f343474b.setVisibility(8);
        fg2.b bVar4 = this.f544034m;
        if (bVar4 != null) {
            bVar4.f343476d.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}
