package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.TypeModifier$dealNodeInfo$1 */
/* loaded from: classes14.dex */
public final class C4931xb96c7c9c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: $nodeInfo */
    final /* synthetic */ android.view.accessibility.AccessibilityNodeInfo f21231x1c8b51f4;

    /* renamed from: $view */
    final /* synthetic */ android.view.View f21232x23288c9;

    @p3321xbce91901.InterfaceC29042xe907df4f(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.provider.TypeModifier$dealNodeInfo$1$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: $EnumSwitchMapping$0 */
        public static final /* synthetic */ int[] f21233x8296b301;

        static {
            int[] iArr = new int[com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.m42829xcee59d22().length];
            try {
                iArr[com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21345x77471352.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21349xc808f992.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21348xd8bf9a5b.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21346x5f7507c3.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f.f21347x63577677.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f21233x8296b301 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4931xb96c7c9c(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super(1);
        this.f21232x23288c9 = view;
        this.f21231x1c8b51f4 = accessibilityNodeInfo;
    }

    @Override // yz5.l
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean mo146xb9724478(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Map<java.lang.Integer, com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f> map = it.m42276xd84dcfd3().get(java.lang.Integer.valueOf(this.f21232x23288c9.getId()));
        if (map == null) {
            return java.lang.Boolean.FALSE;
        }
        android.view.View m42254x811f1304 = it.m42254x811f1304(this.f21232x23288c9, kz5.n0.S0(map.keySet()));
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4964x4b21c79f enumC4964x4b21c79f = map.get(m42254x811f1304 != null ? java.lang.Integer.valueOf(m42254x811f1304.getId()) : null);
        if (enumC4964x4b21c79f == null) {
            enumC4964x4b21c79f = map.get(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21228x4fbc8495.m42653x2ee31f5b(this.f21232x23288c9));
        }
        if (enumC4964x4b21c79f != null) {
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.f21231x1c8b51f4;
            int i17 = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4931xb96c7c9c.WhenMappings.f21233x8296b301[enumC4964x4b21c79f.ordinal()];
            if (i17 == 1) {
                accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
            } else if (i17 == 2) {
                accessibilityNodeInfo.setClassName(android.widget.TextView.class.getName());
            } else if (i17 == 3) {
                accessibilityNodeInfo.setClassName(android.widget.SeekBar.class.getName());
            } else if (i17 == 4) {
                accessibilityNodeInfo.setClassName(android.widget.CheckBox.class.getName());
            } else {
                if (i17 != 5) {
                    return java.lang.Boolean.FALSE;
                }
                accessibilityNodeInfo.setClassName(android.widget.EditText.class.getName());
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.f21228x4fbc8495.m42654xbe97959d(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.C4930x24ae7051.TAG, this.f21232x23288c9, "findRoot success but not found Type?");
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4853x7e4b6695 m42517xe172022e = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4876xaa469f58.f21085x4fbc8495.m42517xe172022e(this.f21232x23288c9);
        if (m42517xe172022e != null) {
            m42517xe172022e.m42398xbdda0201(this.f21231x1c8b51f4.getClassName());
        }
        return java.lang.Boolean.TRUE;
    }
}
