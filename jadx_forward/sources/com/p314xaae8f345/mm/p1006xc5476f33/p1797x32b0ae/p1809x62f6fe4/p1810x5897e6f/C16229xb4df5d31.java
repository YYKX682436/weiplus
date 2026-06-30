package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/lite/media/album/LiteAppLivePhotoTagLayout;", "Landroid/widget/LinearLayout;", "Lea3/d0;", "callback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.media.album.LiteAppLivePhotoTagLayout */
/* loaded from: classes10.dex */
public final class C16229xb4df5d31 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f225666d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f225667e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f225668f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f225669g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f225670h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 f225671i;

    /* renamed from: m, reason: collision with root package name */
    public long f225672m;

    /* renamed from: n, reason: collision with root package name */
    public int f225673n;

    /* renamed from: o, reason: collision with root package name */
    public ea3.d0 f225674o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16229xb4df5d31(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f225673n = -1;
    }

    public final void a(int i17) {
        android.widget.TextView textView;
        if (this.f225672m == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppLivePhotoTagLayout", "showLayoutInState >> " + hashCode() + " mediaId: " + this.f225672m + ", state: " + i17 + " showCurrentState: " + this.f225673n);
        if (this.f225673n == i17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = this.f225671i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d0);
        c15632xfc4fd0d0.A = i17;
        this.f225673n = i17;
        setVisibility(0);
        this.f225667e = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.scl);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.scj);
        this.f225668f = viewGroup;
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion companion = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(viewGroup, "null cannot be cast to non-null type android.view.View");
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion.m42550x8c53ca37(companion, viewGroup, i65.a.b(getContext(), 6), i65.a.b(getContext(), 8), i65.a.b(getContext(), 8), i65.a.b(getContext(), 4), false, 32, null);
        this.f225669g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.scd);
        this.f225670h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.sce);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f225669g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        if (i17 == 2) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80509x41acf4b, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        } else {
            if (i17 == 0 || i17 == 1) {
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79784x46563237, com.p314xaae8f345.mm.R.C30859x5a72f63.f560044t);
            } else if (i17 == 3) {
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79784x46563237, com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90);
            }
        }
        if (i17 == 0) {
            android.view.ViewGroup viewGroup2 = this.f225667e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            android.view.ViewGroup viewGroup3 = this.f225668f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            android.view.ViewGroup viewGroup4 = this.f225668f;
            if (viewGroup4 != null) {
                viewGroup4.setOnClickListener(null);
            }
            android.view.ViewGroup viewGroup5 = this.f225668f;
            if (viewGroup5 != null) {
                viewGroup5.setEnabled(false);
            }
        } else if (i17 == 1) {
            android.view.ViewGroup viewGroup6 = this.f225667e;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            android.view.ViewGroup viewGroup7 = this.f225668f;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(0);
            }
            android.view.ViewGroup viewGroup8 = this.f225668f;
            if (viewGroup8 != null) {
                viewGroup8.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d6_));
            }
            android.view.ViewGroup viewGroup9 = this.f225668f;
            if (viewGroup9 != null) {
                viewGroup9.setEnabled(true);
            }
            android.view.ViewGroup viewGroup10 = this.f225668f;
            if (viewGroup10 != null) {
                viewGroup10.setOnClickListener(new ea3.c0(this));
            }
        } else if (i17 == 2) {
            android.view.ViewGroup viewGroup11 = this.f225667e;
            if (viewGroup11 != null) {
                viewGroup11.setVisibility(8);
            }
            android.view.ViewGroup viewGroup12 = this.f225668f;
            if (viewGroup12 != null) {
                viewGroup12.setVisibility(0);
            }
            android.view.ViewGroup viewGroup13 = this.f225668f;
            if (viewGroup13 != null) {
                viewGroup13.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d69));
            }
            android.view.ViewGroup viewGroup14 = this.f225668f;
            if (viewGroup14 != null) {
                viewGroup14.setEnabled(true);
            }
            android.view.ViewGroup viewGroup15 = this.f225668f;
            if (viewGroup15 != null) {
                viewGroup15.setOnClickListener(new ea3.c0(this));
            }
        } else if (i17 == 3) {
            android.view.ViewGroup viewGroup16 = this.f225667e;
            if (viewGroup16 != null) {
                viewGroup16.setVisibility(8);
            }
            android.view.ViewGroup viewGroup17 = this.f225668f;
            if (viewGroup17 != null) {
                viewGroup17.setVisibility(0);
            }
            android.view.ViewGroup viewGroup18 = this.f225668f;
            if (viewGroup18 != null) {
                viewGroup18.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d68));
            }
            android.view.ViewGroup viewGroup19 = this.f225668f;
            if (viewGroup19 != null) {
                viewGroup19.setEnabled(false);
            }
            android.view.ViewGroup viewGroup20 = this.f225668f;
            if (viewGroup20 != null) {
                viewGroup20.setOnClickListener(null);
            }
        }
        if (i17 == 0 || i17 == 2) {
            android.widget.TextView textView2 = this.f225670h;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                return;
            }
            return;
        }
        if (i17 == 3) {
            android.widget.TextView textView3 = this.f225670h;
            if (textView3 != null) {
                textView3.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
                return;
            }
            return;
        }
        if (i17 != 1 || (textView = this.f225670h) == null) {
            return;
        }
        textView.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
    }

    public final void b(boolean z17) {
        int i17;
        if (this.f225672m == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLayoutSelectState >> ");
        sb6.append(hashCode());
        sb6.append(" mediaId: ");
        sb6.append(this.f225672m);
        sb6.append(", isSelect: ");
        sb6.append(z17);
        sb6.append(" currentLivePhotoState: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = this.f225671i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d0);
        sb6.append(c15632xfc4fd0d0.A);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppLivePhotoTagLayout", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d02 = this.f225671i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d02);
        int i18 = c15632xfc4fd0d02.A;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d03 = this.f225671i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d03);
            i17 = 1;
            if (c15632xfc4fd0d03.H != 1) {
                i17 = 3;
            } else if (i18 != 0) {
                return;
            }
        } else {
            i17 = 0;
        }
        a(i17);
    }

    /* renamed from: setLivePhotoTagClickCallback */
    public final void m65799xdc00daf7(ea3.d0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f225674o = callback;
    }
}
