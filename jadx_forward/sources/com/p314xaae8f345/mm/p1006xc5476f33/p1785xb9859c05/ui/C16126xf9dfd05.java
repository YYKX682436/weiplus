package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressCountView */
/* loaded from: classes3.dex */
public class C16126xf9dfd05 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f224068d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f224069e;

    public C16126xf9dfd05(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.blj, this);
        this.f224068d = findViewById(com.p314xaae8f345.mm.R.id.cak);
        this.f224069e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.caj);
    }

    /* renamed from: setAddressCount */
    public void m65173xa56faafd(int i17) {
        this.f224069e.setText(getContext().getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571198b, i17, java.lang.Integer.valueOf(i17)));
    }

    public C16126xf9dfd05(android.content.Context context, int i17) {
        super(context);
        a();
        m65173xa56faafd(i17);
    }
}
