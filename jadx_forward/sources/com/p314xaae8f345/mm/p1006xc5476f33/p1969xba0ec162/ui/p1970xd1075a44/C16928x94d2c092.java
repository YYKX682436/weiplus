package com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView */
/* loaded from: classes15.dex */
public class C16928x94d2c092 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f236332d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236333e;

    /* renamed from: f, reason: collision with root package name */
    public int f236334f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f236335g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f236336h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f236337i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f236338m;

    /* renamed from: n, reason: collision with root package name */
    public gs3.e f236339n;

    public C16928x94d2c092(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public final void a() {
        java.lang.StringBuilder sb6 = this.f236332d;
        if (sb6 != null) {
            this.f236334f = sb6.length();
        } else {
            this.f236334f = 0;
        }
        if (this.f236334f >= 4) {
            this.f236333e = true;
        } else {
            this.f236333e = false;
        }
        gs3.e eVar = this.f236339n;
        if (eVar != null) {
            boolean z17 = this.f236333e;
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = ((fs3.n) eVar).f347845a;
            activityC16925x87b5f55d.f236291m = sb7;
            if (z17) {
                activityC16925x87b5f55d.f236287f = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d.U6(activityC16925x87b5f55d);
            }
        }
    }

    public void b() {
        int i17 = this.f236334f;
        if (i17 > 0) {
            this.f236332d.delete(0, i17);
        }
        a();
        c();
    }

    public final void c() {
        for (int i17 = 0; i17 < 4; i17++) {
            java.lang.String str = this.f236334f > i17 ? this.f236332d.toString().charAt(i17) + "" : "";
            if (i17 == 0) {
                d(this.f236335g, str);
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(ir3.b.class)).m42291x53d8522f("title_num_1", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.MMPwdInputView", "1, number = " + str);
            } else if (i17 == 1) {
                d(this.f236336h, str);
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(ir3.b.class)).m42291x53d8522f("title_num_2", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.MMPwdInputView", "2, number = " + str);
            } else if (i17 == 2) {
                d(this.f236337i, str);
                android.content.Context context3 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                pf5.z zVar3 = pf5.z.f435481a;
                if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(ir3.b.class)).m42291x53d8522f("title_num_3", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.MMPwdInputView", "3, number = " + str);
            } else if (i17 != 3) {
                continue;
            } else {
                d(this.f236338m, str);
                android.content.Context context4 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
                pf5.z zVar4 = pf5.z.f435481a;
                if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((ir3.b) zVar4.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(ir3.b.class)).m42291x53d8522f("title_num_4", str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Facing.MMPwdInputView", "4, number = " + str);
            }
        }
    }

    public final void d(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            return;
        }
        if (str.equals("0")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bvx);
            return;
        }
        if (str.equals("1")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bvy);
            return;
        }
        if (str.equals("2")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bvz);
            return;
        }
        if (str.equals("3")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562392bw0);
            return;
        }
        if (str.equals("4")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562393bw1);
            return;
        }
        if (str.equals("5")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562394bw2);
            return;
        }
        if (str.equals("6")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562395bw3);
            return;
        }
        if (str.equals("7")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562396bw4);
            return;
        }
        if (str.equals("8")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562397bw5);
        } else if (str.equals("9")) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bw6);
        } else {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bw7);
        }
    }

    /* renamed from: setNumberStyle */
    public void m67751x9b8db226(gs3.f fVar) {
    }

    /* renamed from: setNumberWidth */
    public void m67752x9bc0c23b(int i17) {
        android.widget.ImageView imageView = this.f236335g;
        if (imageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i17;
            this.f236335g.setLayoutParams(layoutParams);
            this.f236336h.setLayoutParams(layoutParams);
            this.f236337i.setLayoutParams(layoutParams);
            this.f236338m.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: setOnFinishInputListener */
    public void m67753xa1eddd2a(gs3.e eVar) {
        this.f236339n = eVar;
    }

    public C16928x94d2c092(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f236332d = new java.lang.StringBuilder();
        this.f236333e = false;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cba, null);
        this.f236335g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g6k);
        this.f236336h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mfv);
        this.f236337i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o5y);
        this.f236338m = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gd6);
        this.f236335g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bw7);
        this.f236336h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bw7);
        this.f236337i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bw7);
        this.f236338m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bw7);
        addView(inflate);
    }
}
