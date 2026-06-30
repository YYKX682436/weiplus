package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b!\u0010$J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u000f\u001a\u00020\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\u00188B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/bubble/FrameBubbleContentLayout;", "Landroid/widget/FrameLayout;", "", "Lu4/j0;", "getTargetScene", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/view/ViewGroup;", "getTargetLayout", "o", "Lcom/tencent/mm/plugin/finder/live/bubble/FrameBubbleContentLayout;", "getSceneRoot", "()Lcom/tencent/mm/plugin/finder/live/bubble/FrameBubbleContentLayout;", "sceneRoot", "Lie2/h;", "p", "Lie2/h;", "getSceneStateListener", "()Lie2/h;", "setSceneStateListener", "(Lie2/h;)V", "sceneStateListener", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout */
/* loaded from: classes13.dex */
public class C14179xd6e3454a extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final u4.j0 f193038d;

    /* renamed from: e, reason: collision with root package name */
    public final u4.j0 f193039e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f193040f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Bundle f193041g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Bundle f193042h;

    /* renamed from: i, reason: collision with root package name */
    public int f193043i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f193044m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f193045n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a sceneRoot;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public ie2.h sceneStateListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14179xd6e3454a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTAG */
    public final java.lang.String m56776xb5886c64() {
        return "FrameBubbleContentLayout_" + this.f193040f + '@' + hashCode();
    }

    public final void b() {
        setVisibility(8);
        e();
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64(), "requestBubbleHide: " + getVisibility());
        android.view.ViewParent parent = getParent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1 = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1) parent : null;
        if (c14180x477b7cf1 != null) {
            pm0.v.X(new ie2.i(this, c14180x477b7cf1));
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64(), "requestBubbleShow: " + getVisibility());
        android.view.ViewParent parent = getParent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 c14180x477b7cf1 = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14180x477b7cf1) parent : null;
        if (c14180x477b7cf1 != null) {
            pm0.v.X(new ie2.j(this, c14180x477b7cf1));
        }
    }

    public final void e() {
        java.lang.String m56776xb5886c64 = m56776xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setToSourceScene: ");
        sb6.append(this.f193043i);
        sb6.append(" visibility: ");
        android.view.ViewGroup viewGroup = this.f193045n;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetLayout");
            throw null;
        }
        sb6.append(viewGroup.getVisibility());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64, sb6.toString());
        if (this.f193043i != 1) {
            android.view.ViewGroup viewGroup2 = this.f193044m;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceLayout");
                throw null;
            }
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetLayout");
                throw null;
            }
            viewGroup2.setVisibility(viewGroup.getVisibility());
            u4.j0 j0Var = this.f193038d;
            if (j0Var != null) {
                u4.g1.c(j0Var, new tl2.d(0L, 1, null));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceScene");
                throw null;
            }
        }
    }

    public final void f() {
        java.lang.String m56776xb5886c64 = m56776xb5886c64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setToTargetScene: ");
        sb6.append(this.f193043i);
        sb6.append(" visibility: ");
        android.view.ViewGroup viewGroup = this.f193044m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceLayout");
            throw null;
        }
        sb6.append(viewGroup.getVisibility());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64, sb6.toString());
        if (this.f193043i != 2) {
            android.view.ViewGroup viewGroup2 = this.f193045n;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetLayout");
                throw null;
            }
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceLayout");
                throw null;
            }
            viewGroup2.setVisibility(viewGroup.getVisibility());
            u4.j0 j0Var = this.f193039e;
            if (j0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetScene");
                throw null;
            }
            tl2.e eVar = new tl2.e(null);
            eVar.Z(0L);
            u4.g1.c(j0Var, eVar);
        }
    }

    public final java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ie2.h hVar = this.sceneStateListener;
        if (!(hVar != null && hVar.g())) {
            return java.lang.Boolean.FALSE;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        android.view.ViewGroup viewGroup = this.f193045n;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetLayout");
            throw null;
        }
        viewGroup.setVisibility(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64(), "startTransition");
        u4.j0 j0Var = this.f193039e;
        if (j0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetScene");
            throw null;
        }
        u4.g1.c(j0Var, new tl2.e(new ie2.g(rVar)));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a getSceneRoot() {
        return this.sceneRoot;
    }

    public final ie2.h getSceneStateListener() {
        return this.sceneStateListener;
    }

    /* renamed from: getTargetLayout */
    public final android.view.ViewGroup m56779x33bfba91() {
        android.view.ViewGroup viewGroup = this.f193045n;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetLayout");
        throw null;
    }

    /* renamed from: getTargetScene */
    public final u4.j0 m56780x5ce55045() {
        u4.j0 j0Var = this.f193039e;
        if (j0Var != null) {
            return j0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetScene");
        throw null;
    }

    /* renamed from: setSceneStateListener */
    public final void m56781xa1160b3b(ie2.h hVar) {
        this.sceneStateListener = hVar;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m56776xb5886c64(), "setVisibility visibility: " + i17);
    }

    @Override // android.view.View
    public java.lang.String toString() {
        return "bubbleName: " + this.f193040f + " sceneMode: " + this.f193043i + " visibility: " + getVisibility() + ' ';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14179xd6e3454a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193040f = "";
        this.sceneRoot = this;
        setClipChildren(false);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f517547i, i17, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
            java.lang.String string = obtainStyledAttributes.getString(0);
            this.f193040f = string == null ? "Default" : string;
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(resourceId, (android.view.ViewGroup) this, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
            this.f193044m = viewGroup;
            viewGroup.setVisibility(8);
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(resourceId2, (android.view.ViewGroup) this, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate2;
            this.f193045n = viewGroup2;
            viewGroup2.setVisibility(8);
            u4.j0 j0Var = new u4.j0(this, viewGroup);
            j0Var.f506036e = new ie2.c(this);
            j0Var.f506037f = new ie2.d(this);
            this.f193038d = j0Var;
            u4.j0 j0Var2 = new u4.j0(this, viewGroup2);
            j0Var2.f506036e = new ie2.e(this);
            j0Var2.f506037f = new ie2.f(this);
            this.f193039e = j0Var2;
            obtainStyledAttributes.recycle();
        }
        b();
    }
}
