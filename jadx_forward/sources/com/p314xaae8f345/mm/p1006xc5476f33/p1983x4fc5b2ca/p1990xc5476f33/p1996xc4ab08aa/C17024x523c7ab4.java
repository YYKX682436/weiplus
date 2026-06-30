package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "Landroid/view/View;", "w", "Ljz5/g;", "getCloseView", "()Landroid/view/View;", "closeView", "x", "getFuncBottomParent", "funcBottomParent", "Landroid/widget/Button;", "y", "getFinishBtn", "()Landroid/widget/Button;", "finishBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout */
/* loaded from: classes3.dex */
public class C17024x523c7ab4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285 {
    public int A;
    public final float B;
    public boolean C;
    public final android.view.GestureDetector D;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g closeView;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final jz5.g funcBottomParent;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final jz5.g finishBtn;

    /* renamed from: z, reason: collision with root package name */
    public int f237366z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17024x523c7ab4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.closeView = jz5.h.b(new ju3.i1(this));
        this.funcBottomParent = jz5.h.b(new ju3.k1(this));
        this.finishBtn = jz5.h.b(new ju3.j1(this));
        this.f237366z = -1;
        this.A = -1;
        this.B = 0.8f;
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new ju3.o1(this));
        this.D = gestureDetector;
        android.view.View m68025x6d2fdb0f = m68025x6d2fdb0f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        arrayList.add(valueOf);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m68025x6d2fdb0f, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m68025x6d2fdb0f.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m68025x6d2fdb0f, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View m68023xe2ac4207 = m68023xe2ac4207();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(valueOf);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m68023xe2ac4207, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m68023xe2ac4207.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(m68023xe2ac4207, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        gestureDetector.setIsLongpressEnabled(false);
    }

    public static final void A(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17024x523c7ab4 c17024x523c7ab4) {
        if (c17024x523c7ab4.m68025x6d2fdb0f().getVisibility() == 0 && c17024x523c7ab4.m68023xe2ac4207().getVisibility() == 0) {
            android.view.View m68025x6d2fdb0f = c17024x523c7ab4.m68025x6d2fdb0f();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m68025x6d2fdb0f, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m68025x6d2fdb0f.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m68025x6d2fdb0f, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View m68023xe2ac4207 = c17024x523c7ab4.m68023xe2ac4207();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m68023xe2ac4207, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m68023xe2ac4207.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m68023xe2ac4207, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17024x523c7ab4.C = true;
            return;
        }
        if (c17024x523c7ab4.C) {
            android.view.View m68025x6d2fdb0f2 = c17024x523c7ab4.m68025x6d2fdb0f();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(m68025x6d2fdb0f2, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m68025x6d2fdb0f2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(m68025x6d2fdb0f2, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View m68023xe2ac42072 = c17024x523c7ab4.m68023xe2ac4207();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(m68023xe2ac42072, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m68023xe2ac42072.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(m68023xe2ac42072, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordEditPhotoPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17024x523c7ab4.C = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCloseView */
    public final android.view.View m68023xe2ac4207() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.closeView).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getFinishBtn */
    private final android.widget.Button m68024x22ac3e13() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.finishBtn).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.Button) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFuncBottomParent */
    public final android.view.View m68025x6d2fdb0f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.funcBottomParent).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
        android.os.Bundle bundle = configProvider != null ? configProvider.M : null;
        if (bundle != null) {
            int i17 = bundle.getInt("key_preview_location_type", -1);
            int i18 = bundle.getInt("key_preview_margin_top", -1);
            int i19 = bundle.getInt("key_back_margin_top", -1);
            int i27 = bundle.getInt("key_edit_control_margin_bottom", -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPluginLayout", "changeUILocation >> previewLocationType: " + i17 + ", previewMarginTop: " + i18 + ", closeMarginTop: " + i19 + ", editControlMarginBottom: " + i27);
            if (i17 != -1 && i18 != -1 && i19 != -1 && i27 != -1) {
                android.view.ViewGroup.LayoutParams layoutParams = m68023xe2ac4207().getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                int a17 = i19 - com.p314xaae8f345.mm.ui.zk.a(getContext(), 6);
                if (a17 > 0) {
                    layoutParams2.topMargin = a17;
                    m68023xe2ac4207().setLayoutParams(layoutParams2);
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = m68025x6d2fdb0f().getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                int c17 = com.p314xaae8f345.mm.ui.bl.c(m68025x6d2fdb0f().getContext());
                int a18 = (i27 - com.p314xaae8f345.mm.ui.zk.a(getContext(), 40)) - c17;
                int a19 = a18 - com.p314xaae8f345.mm.ui.zk.a(getContext(), 6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPluginLayout", "changeEditControlLocation >> " + i27 + ", " + a18 + ", " + a19 + ", " + c17);
                if (a19 > 0) {
                    layoutParams4.bottomMargin = a19;
                    m68025x6d2fdb0f().setLayoutParams(layoutParams4);
                }
                if (i17 != 2) {
                    this.f237366z = i17;
                    this.A = i18;
                } else {
                    this.f237366z = i17;
                    this.A = -1;
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = m68024x22ac3e13().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        float dimension = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562122a91);
        float dimension2 = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        float dimension3 = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        ht3.m mVar = ht3.m.f366487a;
        android.content.Context context = m68024x22ac3e13().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int a27 = (int) mVar.a(context, dimension3);
        float dimension4 = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561861up);
        float dimension5 = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561862uq);
        m68024x22ac3e13().setPadding(a27, 0, a27, 0);
        m68024x22ac3e13().setTextSize(0, i65.a.f(m68024x22ac3e13().getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        android.content.Context context2 = m68024x22ac3e13().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        layoutParams6.width = (int) mVar.a(context2, dimension2);
        android.content.Context context3 = m68024x22ac3e13().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        layoutParams6.height = (int) mVar.a(context3, dimension);
        android.content.Context context4 = m68024x22ac3e13().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        layoutParams6.leftMargin = (int) mVar.a(context4, dimension4);
        android.content.Context context5 = m68024x22ac3e13().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        layoutParams6.rightMargin = (int) mVar.a(context5, dimension5);
        m68024x22ac3e13().setLayoutParams(layoutParams6);
        int dimension6 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a2g);
        int dimension7 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561863ur);
        int dimension8 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562122a91);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d7o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        mVar.c(findViewById, dimension6, dimension7, dimension8);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.d7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        mVar.c(findViewById2, dimension6, dimension7, dimension8);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.d7p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        mVar.c(findViewById3, dimension6, dimension7, dimension8);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.d8r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        mVar.c(findViewById4, dimension6, dimension7, dimension8);
        m68025x6d2fdb0f().post(new ju3.l1(this));
        m68023xe2ac4207().post(new ju3.m1(this));
        this.C = false;
        if (this.f237366z != -1) {
            getEditPhotoWrapper().f547126u = this.A;
        }
        getEditPhotoWrapper().f547127v = this.B;
        super.r(bVar);
        yt3.p0 editPhotoWrapper = getEditPhotoWrapper();
        ju3.n1 n1Var = new ju3.n1(this);
        editPhotoWrapper.getClass();
        l45.q qVar = editPhotoWrapper.f547120o;
        if (qVar != null) {
            ((l45.n) qVar).f398007o = n1Var;
        }
    }
}
