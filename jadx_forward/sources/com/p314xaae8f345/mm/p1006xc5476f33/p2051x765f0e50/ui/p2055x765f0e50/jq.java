package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class jq {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.LinearLayout f242744a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f242745b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f242746c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f242747d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f242748e;

    public void a(java.lang.String str) {
        if (str.equals("downloading")) {
            this.f242744a.setVisibility(0);
            this.f242745b.setVisibility(8);
            this.f242746c.setVisibility(8);
            this.f242747d.setVisibility(8);
            this.f242748e.setVisibility(8);
            return;
        }
        if (str.equals("downloaded")) {
            this.f242744a.setVisibility(8);
            this.f242745b.setVisibility(0);
            this.f242746c.setVisibility(8);
            this.f242747d.setVisibility(8);
            this.f242748e.setVisibility(8);
            return;
        }
        if (str.equals("undownloaded")) {
            this.f242744a.setVisibility(8);
            this.f242745b.setVisibility(8);
            this.f242746c.setVisibility(0);
            this.f242747d.setVisibility(8);
            this.f242748e.setVisibility(8);
            return;
        }
        if (str.equals("using")) {
            this.f242744a.setVisibility(8);
            this.f242745b.setVisibility(8);
            this.f242746c.setVisibility(8);
            this.f242747d.setVisibility(0);
            this.f242748e.setVisibility(8);
            return;
        }
        if (str.equals("canceling")) {
            this.f242744a.setVisibility(8);
            this.f242745b.setVisibility(8);
            this.f242746c.setVisibility(8);
            this.f242747d.setVisibility(8);
            this.f242748e.setVisibility(0);
        }
    }
}
