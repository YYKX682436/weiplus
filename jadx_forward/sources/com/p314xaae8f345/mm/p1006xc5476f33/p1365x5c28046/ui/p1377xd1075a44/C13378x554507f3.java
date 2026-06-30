package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/widget/EmojiDragStackView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.widget.EmojiDragStackView */
/* loaded from: classes8.dex */
public final class C13378x554507f3 extends android.widget.FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13378x554507f3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final android.view.View a(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, int i17, int i18, java.lang.Integer num) {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6l, (android.view.ViewGroup) this, false);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
        layoutParams.gravity = 81;
        inflate.setLayoutParams(layoutParams);
        if (num != null) {
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568385mn1);
            textView.setText(num.toString());
            textView.setVisibility(0);
        }
        zq.h hVar = zq.h.f556505a;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.h88);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        hVar.d(c21053xdbf1e5f4, (android.widget.ImageView) findViewById, null);
        return inflate;
    }
}
