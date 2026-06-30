package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2014x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/ui/widget/loading/MMProgressLoading;", "g", "Ljz5/g;", "getMmProgressLoading", "()Lcom/tencent/mm/ui/widget/loading/MMProgressLoading;", "mmProgressLoading", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "h", "getResultImageView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "resultImageView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView */
/* loaded from: classes5.dex */
public final class C17091x497841c9 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f237963d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f237964e;

    /* renamed from: f, reason: collision with root package name */
    public final cw3.d f237965f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mmProgressLoading;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resultImageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17091x497841c9(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getMmProgressLoading */
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f m68378x4e4197d9() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f) ((jz5.n) this.mmProgressLoading).mo141623x754a37bb();
    }

    /* renamed from: getResultImageView */
    private final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m68379x72822ccd() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.resultImageView).mo141623x754a37bb();
    }

    public void a(cw3.i newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        java.lang.String name = newMode.getClass().getName();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f237963d, name);
        java.util.Map map = this.f237964e;
        if (!b17) {
            android.view.View view = (android.view.View) ((java.util.LinkedHashMap) map).get(this.f237963d);
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f237963d = name;
        }
        boolean z17 = newMode instanceof cw3.g;
        cw3.d dVar = this.f237965f;
        if (z17) {
            float f17 = ((cw3.g) newMode).f305696a;
            if (f17 <= 0.0d) {
                return;
            }
            if (!map.containsKey(name) && m68378x4e4197d9().getParent() == null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f m68378x4e4197d9 = m68378x4e4197d9();
                int i17 = dVar.f305692c;
                map.put(name, m68378x4e4197d9);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
                layoutParams.gravity = 17;
                addView(m68378x4e4197d9, layoutParams);
            }
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            android.view.View view2 = (android.view.View) linkedHashMap.get(name);
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.Object obj = linkedHashMap.get(this.f237963d);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f = obj instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f) obj : null;
            if (c22703xb395948f != null) {
                c22703xb395948f.setVisibility(0);
                c22703xb395948f.m82049x3ae760af((int) (f17 * 100));
                return;
            }
            return;
        }
        if (!(newMode instanceof cw3.h)) {
            boolean z18 = newMode instanceof cw3.e;
            return;
        }
        if (!map.containsKey(name) && m68379x72822ccd().getParent() == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m68379x72822ccd = m68379x72822ccd();
            int i18 = dVar.f305691b;
            map.put(name, m68379x72822ccd);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i18, i18);
            layoutParams2.gravity = 17;
            addView(m68379x72822ccd, layoutParams2);
        }
        android.view.View view3 = (android.view.View) ((java.util.LinkedHashMap) map).get(name);
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusView", "onModeUpdate", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/BehaviorStatusViewMode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.lang.Object systemService = context.getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17091x497841c9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237963d = cw3.f.class.getName();
        this.f237964e = new java.util.LinkedHashMap();
        cw3.d dVar = new cw3.d(0, 0, 0, 0, 0, 31, null);
        this.f237965f = dVar;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gt3.a.f356914a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            dVar.f305690a = obtainStyledAttributes.getResourceId(3, dVar.f305690a);
            dVar.f305691b = obtainStyledAttributes.getDimensionPixelSize(4, dVar.f305691b);
            dVar.f305693d = obtainStyledAttributes.getColor(2, dVar.f305693d);
            dVar.f305692c = obtainStyledAttributes.getDimensionPixelSize(1, dVar.f305692c);
            dVar.f305694e = obtainStyledAttributes.getColor(0, dVar.f305694e);
            obtainStyledAttributes.recycle();
        }
        this.mmProgressLoading = jz5.h.b(new cw3.b(context, this));
        this.resultImageView = jz5.h.b(new cw3.c(context, this));
    }
}
