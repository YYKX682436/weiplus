package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/JoinRoomExternalConfirmView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView */
/* loaded from: classes15.dex */
public final class C15863x539d1b35 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public long f220529d;

    /* renamed from: e, reason: collision with root package name */
    public long f220530e;

    /* renamed from: f, reason: collision with root package name */
    public final x33.g f220531f;

    public C15863x539d1b35(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bml, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i18 = com.p314xaae8f345.mm.R.id.c9y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15853x4deb0e54 c15853x4deb0e54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15853x4deb0e54) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.c9y);
        if (c15853x4deb0e54 != null) {
            i18 = com.p314xaae8f345.mm.R.id.c_5;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.c_5);
            if (textView != null) {
                i18 = com.p314xaae8f345.mm.R.id.c_r;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.c_r);
                if (textView2 != null) {
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                    i18 = com.p314xaae8f345.mm.R.id.hoo;
                    android.widget.Button button = (android.widget.Button) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.hoo);
                    if (button != null) {
                        i18 = com.p314xaae8f345.mm.R.id.f567731kk0;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f567731kk0);
                        if (textView3 != null) {
                            i18 = com.p314xaae8f345.mm.R.id.ouk;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ouk);
                            if (c22628xfde5d61d != null) {
                                this.f220531f = new x33.g(c1073x7e08a787, c15853x4deb0e54, textView, textView2, c1073x7e08a787, button, textView3, c22628xfde5d61d);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public C15863x539d1b35(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
