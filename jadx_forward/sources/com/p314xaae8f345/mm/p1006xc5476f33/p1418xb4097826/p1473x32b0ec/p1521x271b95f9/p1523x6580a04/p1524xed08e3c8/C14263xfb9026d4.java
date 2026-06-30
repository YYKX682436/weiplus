package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamPreviewView;", "Landroid/widget/FrameLayout;", "Ljava/util/LinkedList;", "Lr45/qa4;", "h", "Ljz5/g;", "getEnterLiveStep", "()Ljava/util/LinkedList;", "enterLiveStep", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "wk2/k", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView */
/* loaded from: classes3.dex */
public final class C14263xfb9026d4 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public mn0.b0 f193289d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf f193290e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f193291f;

    /* renamed from: g, reason: collision with root package name */
    public uk2.a f193292g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g enterLiveStep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14263xfb9026d4(android.content.Context context) {
        super(context.getApplicationContext());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.enterLiveStep = jz5.h.b(wk2.l.f528489d);
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getEnterLiveStep */
    public final java.util.LinkedList<r45.qa4> m56892x5cd4a51a() {
        return (java.util.LinkedList) this.enterLiveStep.mo141623x754a37bb();
    }

    public final void b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193290e = new com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(context);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(8);
        this.f193291f = imageView;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.View view = this.f193291f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        android.view.View view2 = this.f193290e;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        addView(view2, layoutParams2);
        mn0.z zVar = new mn0.z(context);
        this.f193289d = zVar;
        zVar.f(true);
        mn0.b0 b0Var = this.f193289d;
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new wk2.k(this));
        }
        mn0.b0 b0Var2 = this.f193289d;
        if (b0Var2 != null) {
            ((mn0.y) b0Var2).G(true);
        }
    }

    public final void c(uk2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        m56892x5cd4a51a().clear();
        java.util.LinkedList<r45.qa4> m56892x5cd4a51a = m56892x5cd4a51a();
        r45.qa4 qa4Var = new r45.qa4();
        qa4Var.set(0, "startPlay");
        qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        m56892x5cd4a51a.add(qa4Var);
        this.f193292g = data;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay: ");
        sb6.append(this.f193289d);
        sb6.append(" hashCode: ");
        mn0.b0 b0Var = this.f193289d;
        sb6.append(b0Var != null ? b0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPreviewView", sb6.toString());
        android.widget.ImageView imageView = this.f193291f;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
        imageView.setVisibility(8);
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = this.f193290e;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46537xcd50899c();
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 = this.f193290e;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
            throw null;
        }
        scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf2.mo46533x473bda1f(new android.view.TextureView(getContext()));
        mn0.b0 b0Var2 = this.f193289d;
        if (b0Var2 != null) {
            ((mn0.y) b0Var2).F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a, "MultiStreamPreviewView", true, null, data.f510053f, 0, 0, 52, null));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("start player: ");
        sb7.append(this.f193289d);
        sb7.append(" hashCode: ");
        mn0.b0 b0Var3 = this.f193289d;
        sb7.append(b0Var3 != null ? b0Var3.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPreviewView", sb7.toString());
        r45.ka4 ka4Var = data.f510053f;
        if (ka4Var != null && ka4Var.V >= ka4Var.W) {
            mn0.b0 b0Var4 = this.f193289d;
            if (b0Var4 != null) {
                ((mn0.y) b0Var4).Q(1);
            }
        } else {
            mn0.b0 b0Var5 = this.f193289d;
            if (b0Var5 != null) {
                ((mn0.y) b0Var5).Q(0);
            }
        }
        mn0.b0 b0Var6 = this.f193289d;
        if (b0Var6 != null) {
            com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3 = this.f193290e;
            if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoView");
                throw null;
            }
            mn0.b0.B(b0Var6, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf3, null, 2, null);
        }
        mn0.b0 b0Var7 = this.f193289d;
        if (b0Var7 != null) {
            ((mn0.y) b0Var7).J(new wk2.k(this));
        }
        mn0.b0 b0Var8 = this.f193289d;
        if (b0Var8 != null) {
            java.lang.String str = data.f510052e;
            r45.ka4 ka4Var2 = data.f510053f;
            je2.z zVar = (je2.z) dk2.ef.f314905a.i(je2.z.class);
            mn0.b0.D(b0Var8, str, 1, ka4Var2, zVar != null ? zVar.P6() : null, false, false, 48, null);
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d c17 = g1Var.c();
        mn2.e0 e0Var = new mn2.e0(data.f510051d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        android.widget.ImageView imageView2 = this.f193291f;
        if (imageView2 != null) {
            c17.c(e0Var, imageView2, g1Var.h(mn2.f1.f411490h));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlay: ");
        sb6.append(this.f193289d);
        sb6.append(" hashCode: ");
        mn0.b0 b0Var = this.f193289d;
        sb6.append(b0Var != null ? b0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPreviewView", sb6.toString());
        mn0.b0 b0Var2 = this.f193289d;
        if (b0Var2 != null) {
            mn0.b0.C(b0Var2, true, false, false, 6, null);
        }
        android.widget.ImageView imageView = this.f193291f;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14263xfb9026d4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.enterLiveStep = jz5.h.b(wk2.l.f528489d);
        b(context);
    }
}
