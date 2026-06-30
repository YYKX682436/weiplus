package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&R\"\u0010\t\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView;", "Lb11/a;", "VM", "Lcom/tencent/mm/mvvm/MvvmView;", "Landroid/graphics/Bitmap;", "getBitmap", "", "g", "Z", "isTopView", "()Z", "setTopView", "(Z)V", "Ljava/lang/Class;", "h", "Ljz5/g;", "getResolvedViewModelClazz", "()Ljava/lang/Class;", "resolvedViewModelClazz", "", "value", "getMaskAlpha", "()F", "setMaskAlpha", "(F)V", "maskAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView */
/* loaded from: classes13.dex */
public abstract class AbstractC22098xdb6634aa<VM extends b11.a> extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<b11.a> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f286233i = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 f286234f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isTopView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resolvedViewModelClazz;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC22098xdb6634aa(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getResolvedViewModelClazz */
    private final java.lang.Class<? extends b11.a> m80163x9ec2ca42() {
        return (java.lang.Class) this.resolvedViewModelClazz.mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public final android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 c10395x48f00a39 = new com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39(context, null, 0, 6, null);
        c10395x48f00a39.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (com.p314xaae8f345.mm.ui.gk.c() * 3), (int) (com.p314xaae8f345.mm.ui.gk.c() * 4)));
        c10395x48f00a39.addView(g(context));
        c10395x48f00a39.m43572x73334604(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        c10395x48f00a39.m43573xd60c1057(context.getColor(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77669x8b2be79f : com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        c10395x48f00a39.m43574xd7230eba(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh));
        c10395x48f00a39.m43577xdfa9e512(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560840vn));
        c10395x48f00a39.m43578xe0c0e375(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561174bg));
        c10395x48f00a39.m43576x571ddd95(-16777216);
        c10395x48f00a39.m43575x57005f90(0.0f);
        this.f286234f = c10395x48f00a39;
        return c10395x48f00a39;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        b11.a aVar = (b11.a) pVar;
        b11.a aVar2 = (b11.a) pVar2;
        if (aVar2 == null) {
            return;
        }
        if (i(aVar2)) {
            if (aVar == null) {
                aVar = null;
            }
            j(aVar, aVar2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingMediaGroupBaseItemMvvmView", "onUpdateViewModel, not available viewModel: " + aVar2.getClass());
        }
    }

    public abstract android.view.View g(android.content.Context context);

    /* renamed from: getBitmap */
    public abstract android.graphics.Bitmap mo80164x12501425();

    /* renamed from: getMaskAlpha */
    public final float m80165xfaac9f1c() {
        com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 c10395x48f00a39 = this.f286234f;
        if (c10395x48f00a39 != null) {
            return c10395x48f00a39.getMaskAlpha();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clipContainer");
        throw null;
    }

    public final java.lang.Class h(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
            if (rawType instanceof java.lang.Class) {
                return (java.lang.Class) rawType;
            }
        } else if (type instanceof java.lang.reflect.WildcardType) {
            java.lang.reflect.Type[] upperBounds = ((java.lang.reflect.WildcardType) type).getUpperBounds();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperBounds, "getUpperBounds(...)");
            return h((java.lang.reflect.Type) kz5.z.O(upperBounds));
        }
        return null;
    }

    public final boolean i(b11.a viewModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        return m80163x9ec2ca42().isInstance(viewModel);
    }

    public abstract void j(b11.a aVar, b11.a aVar2);

    public void k(boolean z17) {
        this.isTopView = z17;
    }

    public void l() {
    }

    public final void m(android.view.View view, android.view.View.OnClickListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        view.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.b(this, listener));
    }

    /* renamed from: setMaskAlpha */
    public final void m80166x57005f90(float f17) {
        com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39 c10395x48f00a39 = this.f286234f;
        if (c10395x48f00a39 != null) {
            c10395x48f00a39.m43575x57005f90(f17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clipContainer");
            throw null;
        }
    }

    /* renamed from: setTopView */
    public final void m80167x6d4e46d8(boolean z17) {
        this.isTopView = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC22098xdb6634aa(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.resolvedViewModelClazz = jz5.h.a(jz5.i.f384364f, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.a(this));
    }
}
