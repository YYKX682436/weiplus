package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog */
/* loaded from: classes11.dex */
public class ActivityC18543xcf2786cd extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f253971i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static boolean f253972m = false;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f253976g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f253973d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f253974e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f253975f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: h, reason: collision with root package name */
    public final c01.r8 f253977h = new hg4.a(this);

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) ? super.getResources() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_a);
        aVar.f293262s = " ";
        aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_8);
        aVar.E = new hg4.b(this);
        aVar.f293266w = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.k__);
        aVar.F = new hg4.c(this);
        aVar.H = new hg4.d(this);
        this.f253973d = getIntent().getStringExtra("_RemindDialog_User");
        java.lang.String stringExtra = getIntent().getStringExtra("_RemindDialog_Remind");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f253974e;
        arrayList.clear();
        arrayList.add(stringExtra);
        java.util.Iterator it = ((java.util.ArrayList) f253971i).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        this.f253976g = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f253976g.show();
        this.f253975f.mo50293x3498a0(new hg4.e(this));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.r8 r8Var;
        f253972m = false;
        zf4.l wi6 = zf4.l.wi();
        if (wi6 != null && (r8Var = this.f253977h) != null) {
            ((java.util.HashSet) wi6.f554209h).remove(r8Var);
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.r8 r8Var;
        f253972m = true;
        zf4.l wi6 = zf4.l.wi();
        if (wi6 != null && (r8Var = this.f253977h) != null) {
            ((java.util.HashSet) wi6.f554209h).add(r8Var);
        }
        super.onResume();
    }
}
