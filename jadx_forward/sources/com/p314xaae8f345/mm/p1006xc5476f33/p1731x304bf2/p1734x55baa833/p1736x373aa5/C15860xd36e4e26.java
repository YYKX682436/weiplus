package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatRoomSelectView */
/* loaded from: classes15.dex */
public class C15860xd36e4e26 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15849x99cbe261 f220517d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m3 f220518e;

    public C15860xd36e4e26(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569924s1, this);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.i3b)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l3(this));
        this.f220517d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15849x99cbe261) findViewById(com.p314xaae8f345.mm.R.id.f565149bg1);
    }

    /* renamed from: setData */
    public void m64437x76491f2c(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d> list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15849x99cbe261 c15849x99cbe261 = this.f220517d;
        if (c15849x99cbe261 != null) {
            c15849x99cbe261.m64411x76491f2c(list);
        }
    }

    /* renamed from: setOnCloseListener */
    public void m64438xe922de6b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m3 m3Var) {
        this.f220518e = m3Var;
    }

    public C15860xd36e4e26(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public C15860xd36e4e26(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
