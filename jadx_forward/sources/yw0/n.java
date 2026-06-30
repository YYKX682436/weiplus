package yw0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10996x891f422e f548104a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f548105b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f548106c;

    /* renamed from: d, reason: collision with root package name */
    public final float f548107d;

    /* renamed from: e, reason: collision with root package name */
    public final yw0.l f548108e;

    public n(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10996x891f422e mcReferenceLineView, android.widget.TextView mcReferenceTipTextView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mcReferenceLineView, "mcReferenceLineView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mcReferenceTipTextView, "mcReferenceTipTextView");
        this.f548104a = mcReferenceLineView;
        this.f548105b = mcReferenceTipTextView;
        this.f548106c = new java.util.HashMap();
        this.f548107d = j65.q.a(mcReferenceTipTextView.getContext()).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        this.f548108e = new yw0.l(this);
    }

    public final void a(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        d();
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        int generateViewId = android.view.View.generateViewId();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10996x891f422e c10996x891f422e = this.f548104a;
        c10996x891f422e.setId(generateViewId);
        parent.addView(c10996x891f422e, layoutParams);
    }

    public final yw0.s b(yw0.q drawType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawType, "drawType");
        yw0.s sVar = (yw0.s) this.f548106c.get(drawType);
        return sVar == null ? c(drawType) : sVar;
    }

    public final yw0.s c(yw0.q drawType) {
        yw0.s kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawType, "drawType");
        int ordinal = drawType.ordinal();
        yw0.l lVar = this.f548108e;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10996x891f422e c10996x891f422e = this.f548104a;
        if (ordinal == 0) {
            android.content.Context context = c10996x891f422e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            kVar = new yw0.k(context, lVar);
        } else if (ordinal == 1) {
            android.content.Context context2 = c10996x891f422e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            kVar = new yw0.t(context2, lVar);
        } else if (ordinal == 2) {
            android.content.Context context3 = c10996x891f422e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            kVar = new yw0.b(context3, lVar);
        } else if (ordinal == 3) {
            android.content.Context context4 = c10996x891f422e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            kVar = new yw0.g(context4, lVar);
        } else {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            android.content.Context context5 = c10996x891f422e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
            kVar = new yw0.p(context5, lVar);
        }
        this.f548106c.put(drawType, kVar);
        c10996x891f422e.getClass();
        java.util.ArrayList arrayList = c10996x891f422e.f151218d;
        if (!arrayList.contains(kVar)) {
            arrayList.add(kVar);
        }
        return kVar;
    }

    public final void d() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10996x891f422e c10996x891f422e = this.f548104a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c10996x891f422e, "<this>");
        android.view.ViewParent parent = c10996x891f422e.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c10996x891f422e);
        }
    }

    public final void e(yw0.q drawType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawType, "drawType");
        java.util.HashMap hashMap = this.f548106c;
        yw0.s sVar = (yw0.s) hashMap.get(drawType);
        if (sVar != null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10996x891f422e c10996x891f422e = this.f548104a;
            c10996x891f422e.getClass();
            c10996x891f422e.f151218d.remove(sVar);
        }
        hashMap.remove(drawType);
    }
}
