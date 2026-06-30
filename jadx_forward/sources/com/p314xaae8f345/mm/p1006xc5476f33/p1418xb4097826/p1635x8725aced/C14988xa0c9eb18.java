package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer */
/* loaded from: classes2.dex */
public final class C14988xa0c9eb18 extends com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f207899z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f207900y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14988xa0c9eb18(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        super.c(z17, z18, i17);
        if (z17 || z18) {
            return;
        }
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14988xa0c9eb18(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e5j, m82795xcb847e8d());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f207900y = inflate;
        android.widget.Button btnCancel = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565015b02);
        android.view.View btnAdd = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.azw);
        android.widget.TextView tvTitle = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        android.widget.TextView tvDesc = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.vjg);
        android.widget.TextView tvChannel = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568957vi2);
        setId(com.p314xaae8f345.mm.R.id.tbf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tvTitle, "tvTitle");
        com.p314xaae8f345.mm.ui.fk.b(tvTitle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tvDesc, "tvDesc");
        com.p314xaae8f345.mm.ui.fk.c(tvDesc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(btnCancel, "btnCancel");
        com.p314xaae8f345.mm.ui.fk.b(btnCancel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tvChannel, "tvChannel");
        com.p314xaae8f345.mm.ui.fk.b(tvChannel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(btnAdd, "btnAdd");
        k(btnAdd);
        k(btnCancel);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            i19 = i19 >= i18 ? i19 : i18;
        }
        m82810x46bc3006(i19 - ((int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aoc)));
        m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.d0m);
        m82805x59f38d7d(true);
        m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        setBackgroundResource(getBackgroundColorRes());
        m82804xbcf4cbbe(false);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 m82799xc8ac06c0 = m82799xc8ac06c0();
        android.view.ViewGroup.LayoutParams layoutParams = m82799xc8ac06c0().getLayoutParams();
        layoutParams.height = -2;
        m82799xc8ac06c0.setLayoutParams(layoutParams);
        btnAdd.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
        btnAdd.setOnClickListener(new au2.k(this));
        btnCancel.setOnClickListener(new au2.l(this));
    }

    public /* synthetic */ C14988xa0c9eb18(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }
}
