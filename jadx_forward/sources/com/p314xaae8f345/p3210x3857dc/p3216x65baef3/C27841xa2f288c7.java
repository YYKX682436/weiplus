package com.p314xaae8f345.p3210x3857dc.p3216x65baef3;

/* renamed from: com.tencent.xweb.pinus.PSContextWrapper */
/* loaded from: classes13.dex */
public class C27841xa2f288c7 extends com.p314xaae8f345.p3210x3857dc.v1 {

    /* renamed from: apkVersion */
    public int f61128x510fe31c;

    /* renamed from: enableV8Lite */
    public boolean f61129x9d2fc5b3;

    /* renamed from: extractedCoreDir */
    public java.lang.String f61130x8b5cd36e;

    /* renamed from: forceDarkBehavior */
    public int f61131xfd290673;

    /* renamed from: isForceDarkMode */
    public boolean f61132x90561d3a;

    /* renamed from: usingCustomContext */
    public boolean f61133xb94dbada;

    public C27841xa2f288c7(android.content.Context context, int i17) {
        super(context);
        boolean z17 = false;
        this.f61128x510fe31c = 0;
        this.f61133xb94dbada = false;
        this.f61132x90561d3a = false;
        this.f61131xfd290673 = 2;
        this.f302141d = context;
        this.f302144g = ((android.view.LayoutInflater) context.getApplicationContext().getSystemService("layout_inflater")).cloneInContext(this);
        this.f61128x510fe31c = i17;
        this.f61130x8b5cd36e = by5.z3.f(i17);
        java.lang.String b17 = by5.z3.b(i17);
        boolean z18 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429508h;
        this.f61133xb94dbada = z18;
        if (z18) {
            this.f302142e = new com.p314xaae8f345.p3210x3857dc.w2(d(context, b17), context);
        } else {
            this.f302142e = d(context, b17);
        }
        by5.c4.f("PSContextWrapper", "usingCustomContext:" + this.f61133xb94dbada + ", resources:" + this.f302142e);
        java.lang.String str = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429507g;
        java.util.Locale forLanguageTag = (str == null || str.isEmpty()) ? null : java.util.Locale.forLanguageTag(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429507g);
        if (forLanguageTag != null) {
            by5.c4.f("PSContextWrapper", "updateResourceLocale, customize locale:" + forLanguageTag.toLanguageTag());
            e(forLanguageTag);
        }
        this.f61129x9d2fc5b3 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429511k;
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(1043)) {
            by5.c4.f("PSContextWrapper", "configure v8 lite supported, enableV8Lite:" + this.f61129x9d2fc5b3);
        } else {
            by5.c4.f("PSContextWrapper", "configure v8 lite not supported");
        }
        if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() && org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf)) {
            z17 = true;
        }
        if (z17) {
            this.f61132x90561d3a = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429509i;
            this.f61131xfd290673 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429510j;
            by5.c4.f("PSContextWrapper", "force dark mode supported, isForceDarkMode:" + this.f61132x90561d3a + ", forceDarkBehavior:" + this.f61131xfd290673);
        } else {
            by5.c4.f("PSContextWrapper", "force dark mode not supported");
        }
        android.content.res.Resources resources = this.f302142e;
        if (resources == null || this.f302145h == null) {
            return;
        }
        this.f302143f = resources.newTheme();
        if (c(context, b17) != null) {
            android.content.res.Resources.Theme theme = context.getTheme();
            if (theme != null) {
                this.f302143f.setTo(theme);
            }
            this.f302143f.applyStyle(this.f302145h.theme, true);
        }
    }
}
