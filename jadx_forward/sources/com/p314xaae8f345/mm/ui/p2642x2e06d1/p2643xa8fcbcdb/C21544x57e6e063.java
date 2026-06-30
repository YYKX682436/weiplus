package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.DialogPreference */
/* loaded from: classes11.dex */
public final class C21544x57e6e063 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i L;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 M;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.k N;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 P;

    public C21544x57e6e063(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void D(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var) {
        this.M = q0Var;
    }

    public void M() {
        android.content.Context context = this.f279303d;
        com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a = (com.p314xaae8f345.mm.ui.C21391x3d89d23a) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.byq, null);
        c21391x3d89d23a.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.j(this));
        c21391x3d89d23a.setAdapter((android.widget.ListAdapter) this.L);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = this.f279307h.toString();
        aVar.L = c21391x3d89d23a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        this.P = j0Var;
        j0Var.show();
        db5.e1.a(context, this.P);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i iVar = this.L;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g gVar = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g) iVar.f279363i.get(iVar.f279362h);
        if (gVar != null) {
            H(gVar.f279334a);
        }
        super.t(view);
    }

    public C21544x57e6e063(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i iVar = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i(context, 1);
        this.L = iVar;
        int i18 = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528721f, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            iVar.f279360f = context.getResources().getStringArray(resourceId);
        }
        iVar.f279361g = obtainStyledAttributes.getTextArray(1);
        obtainStyledAttributes.recycle();
        if (iVar.f279360f == null) {
            iVar.f279360f = new java.lang.CharSequence[0];
        }
        if (iVar.f279361g == null) {
            iVar.f279361g = new java.lang.CharSequence[0];
        }
        iz5.a.g("entries count different", iVar.f279360f.length == iVar.f279361g.length);
        java.util.HashMap hashMap = iVar.f279363i;
        hashMap.clear();
        while (true) {
            java.lang.CharSequence[] charSequenceArr = iVar.f279361g;
            if (i18 >= charSequenceArr.length) {
                return;
            }
            java.lang.CharSequence charSequence = charSequenceArr[i18];
            hashMap.put(charSequence, new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g(charSequence, iVar.f279360f[i18], 1048576 + i18));
            i18++;
        }
    }
}
