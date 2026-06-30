package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSActionBarSearchView */
/* loaded from: classes12.dex */
public class C15620x588c74c5 extends com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f219752x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f219753v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f219754w;

    public C15620x588c74c5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219754w = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rfy);
        m81043xdb574fcd().m81364x44f86e7(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.c0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    /* renamed from: getLayoutId */
    public int mo63625x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bce;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    public void i(boolean z17) {
        android.widget.LinearLayout linearLayout = this.f219754w;
        if (linearLayout == null || m81043xdb574fcd() == null) {
            return;
        }
        if (z17) {
            linearLayout.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f m81048x84084a54 = m81048x84084a54();
            if (m81048x84084a54 != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) m81048x84084a54.getLayoutParams();
                marginLayoutParams.leftMargin = i65.a.b(getContext(), 4);
                m81048x84084a54.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f m81048x84084a542 = m81048x84084a54();
        m81043xdb574fcd().setEllipsize(null);
        android.text.Selection.setSelection(m81043xdb574fcd().getText(), 0);
        m81043xdb574fcd().clearFocus();
        n();
        if (m81048x84084a542 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) m81048x84084a542.getLayoutParams();
            marginLayoutParams2.leftMargin = 0;
            m81048x84084a542.setLayoutParams(marginLayoutParams2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    public void j(com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar) {
        if (rVar == com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH) {
            z50.e.f551696a.b(vu4.a.D, vu4.b.f521791e, z13.f.Y6(getContext()).a7(), z13.f.Y6(getContext()).f550934g);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a
    public void k(com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar) {
        if (rVar == com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH) {
            z50.e.f551696a.b(vu4.a.f521772f, vu4.b.f521791e, z13.f.Y6(getContext()).a7(), z13.f.Y6(getContext()).f550934g);
        }
    }

    public final void n() {
        android.widget.LinearLayout linearLayout = this.f219754w;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText m81043xdb574fcd = m81043xdb574fcd();
        if (linearLayout == null || m81043xdb574fcd == null || m81043xdb574fcd.isFocused()) {
            return;
        }
        if (m81043xdb574fcd.getPaint().measureText(m81043xdb574fcd.getText().toString()) > ((float) (m81043xdb574fcd.getWidth() - i65.a.b(getContext(), 4)))) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: setCursorVisible */
    public void m63626x26e44afa(boolean z17) {
        this.f291495e.setCursorVisible(z17);
    }

    public C15620x588c74c5(android.content.Context context) {
        super(context);
        this.f219754w = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.rfy);
        m81043xdb574fcd().m81364x44f86e7(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.c0(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mec);
        this.f219753v = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b0(this));
    }
}
