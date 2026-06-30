package com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708;

/* renamed from: com.tencent.wemagic.adframework.plugin.scl.zidl_gen.ZIDL_ItEWxcf4B */
/* loaded from: classes8.dex */
class C27726x8884d344 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.a f301574a;

    /* renamed from: ZIDL_AX */
    private native void m119698x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m119699x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m119700x1964d1bd(long j17, long j18);

    /* renamed from: ZIDL_DX */
    private native void m119701x1964d1dc(long j17, long j18);

    /* renamed from: ZIDL_EX */
    private native void m119702x1964d1fb(long j17, long j18);

    /* renamed from: ZIDL_FX */
    private native void m119703x1964d21a(long j17, long j18);

    /* renamed from: ZIDL_GX */
    private native void m119704x1964d239(long j17, long j18);

    /* renamed from: ZIDL_HX */
    private native void m119705x1964d258(long j17, long j18);

    /* renamed from: ZIDL_IX */
    private native void m119706x1964d277(long j17, long j18, int i17, int i18);

    /* renamed from: ZIDL_AV */
    public void m119707x1964d17d(long j17, java.lang.String str, long j18) {
        this.f301574a.getClass();
    }

    /* renamed from: ZIDL_BV */
    public void m119708x1964d19c(long j17, java.lang.String str, long j18) {
        tw5.a aVar;
        android.view.View aVar2;
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        nw5.b bVar = lw5.a.f403195a;
        bVar.getClass();
        java.lang.String format = "onCanvasViewCreate, frameSetId: " + str + ", canvasId: " + j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        mw5.a aVar3 = (mw5.a) ((java.util.HashMap) bVar.f422564a).get(str);
        if (aVar3 == null || (aVar = ((nw5.a) aVar3).f422563e) == null) {
            return;
        }
        android.view.View view = aVar.f504022i;
        if (view != null && view != null) {
            aVar.removeView(view);
            aVar.f504022i = null;
        }
        android.content.Context context = aVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66 c27732x57207a66 = new com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.p3184xac8f1cfd.C27732x57207a66(aVar.f504017d);
        ww5.c type = aVar.f504020g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            aVar2 = new ww5.a(j18, c27732x57207a66, context);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            aVar2 = new ww5.b(j18, c27732x57207a66, context);
        }
        aVar.f504022i = aVar2;
        aVar.addView(aVar2);
    }

    /* renamed from: ZIDL_CV */
    public void m119709x1964d1bb(long j17, java.lang.String str, long j18, float f17, float f18, float f19, float f27, int i17) {
        tw5.a aVar;
        android.view.View view;
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        int i18 = (int) f17;
        int i19 = (int) f18;
        int i27 = (int) f19;
        int i28 = (int) f27;
        nw5.b bVar = lw5.a.f403195a;
        bVar.getClass();
        java.lang.String format = "onCanvasViewLayout, frameSetId: " + str + ", canvasId: " + j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        mw5.a aVar2 = (mw5.a) ((java.util.HashMap) bVar.f422564a).get(str);
        if (aVar2 == null || (aVar = ((nw5.a) aVar2).f422563e) == null || (view = aVar.f504022i) == null) {
            return;
        }
        float f28 = aVar.f504024n;
        view.layout(i18, i19, ((int) (i27 * f28)) + i18, ((int) (i28 * f28)) + i19);
    }

    /* renamed from: ZIDL_DV */
    public void m119710x1964d1da(long j17, java.lang.String str, long j18) {
        tw5.a aVar;
        android.view.View view;
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        nw5.b bVar = lw5.a.f403195a;
        bVar.getClass();
        java.lang.String format = "onCanvasViewDestroy, frameSetId: " + str + ", canvasId: " + j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        mw5.a aVar2 = (mw5.a) ((java.util.HashMap) bVar.f422564a).get(str);
        if (aVar2 == null || (aVar = ((nw5.a) aVar2).f422563e) == null || (view = aVar.f504022i) == null) {
            return;
        }
        aVar.removeView(view);
        aVar.f504022i = null;
    }

    /* renamed from: ZIDL_EV */
    public void m119711x1964d1f9(long j17, java.lang.String str, long j18) {
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        lw5.a.f403195a.getClass();
        java.lang.String format = "onCanvasFirstFrameRendered, viewId: " + str + ", canvasId: " + j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
    }

    /* renamed from: ZIDL_FV */
    public void m119712x1964d218(long j17, java.lang.String frameSetId, java.lang.String rootId) {
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
        nw5.b bVar = lw5.a.f403195a;
        bVar.getClass();
        java.lang.String format = "onFrameSetViewBind, frameSetId: ".concat(frameSetId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        mw5.a aVar = (mw5.a) ((java.util.HashMap) bVar.f422564a).get(frameSetId);
        if (aVar != null) {
            nw5.a aVar2 = (nw5.a) aVar;
            tw5.a aVar3 = new tw5.a(aVar2.f422559a, rootId, frameSetId, aVar2.f422560b, null, 16, null);
            aVar3.m167115x1faad40d(aVar2.f422562d);
            aVar2.f422561c.mo146xb9724478(aVar3);
            aVar2.f422563e = aVar3;
        }
    }

    /* renamed from: ZIDL_GV */
    public void m119713x1964d237(long j17, java.lang.String str) {
        tw5.a aVar;
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        nw5.b bVar = lw5.a.f403195a;
        bVar.getClass();
        java.lang.String format = "onFrameSetViewUnBind, frameSetId: ".concat(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        java.util.HashMap hashMap = (java.util.HashMap) bVar.f422564a;
        mw5.a aVar2 = (mw5.a) hashMap.get(str);
        if (aVar2 != null && (aVar = ((nw5.a) aVar2).f422563e) != null) {
            android.view.View view = aVar.f504022i;
            if (view != null) {
                aVar.removeView(view);
                aVar.f504022i = null;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.getParent();
            if (viewGroup != null && viewGroup.indexOfChild(aVar) != -1) {
                viewGroup.removeView(aVar);
            }
            aVar.f504021h = false;
        }
        hashMap.remove(str);
    }

    /* renamed from: ZIDL_HV */
    public void m119714x1964d256(long j17, java.lang.String str, int i17, int i18) {
        tw5.a aVar;
        ((lw5.a) this.f301574a).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        nw5.b bVar = lw5.a.f403195a;
        bVar.getClass();
        java.lang.String format = "onFrameSetViewResize, frameSetId: " + str + ", width: " + i17 + ", height: " + i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        mw5.a aVar2 = (mw5.a) ((java.util.HashMap) bVar.f422564a).get(str);
        if (aVar2 == null || (aVar = ((nw5.a) aVar2).f422563e) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        float f17 = aVar.f504024n;
        if (i17 > 0 && layoutParams.width != i17) {
            layoutParams.width = (int) (i17 * f17);
        }
        if (i18 > 0 && layoutParams.height != i18) {
            layoutParams.height = (int) (i18 * f17);
        }
        aVar.setLayoutParams(layoutParams);
        aVar.requestLayout();
    }

    /* renamed from: ZIDL_IV */
    public void m119715x1964d275(long j17, java.lang.String str) {
        ((lw5.a) this.f301574a).getClass();
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.a aVar = (com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.a) obj;
        this.f301574a = aVar;
        aVar.getClass();
    }
}
