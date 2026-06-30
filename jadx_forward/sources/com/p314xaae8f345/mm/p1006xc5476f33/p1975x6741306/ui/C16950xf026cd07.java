package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarStateChooseView;", "Landroid/widget/RelativeLayout;", "Landroid/view/animation/Animation;", "d", "Ljz5/g;", "getSlideOutAnim", "()Landroid/view/animation/Animation;", "slideOutAnim", "e", "getSlideInAnim", "slideInAnim", "Lps3/o;", "g", "Lps3/o;", "getMStatus", "()Lps3/o;", "setMStatus", "(Lps3/o;)V", "mStatus", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarStateChooseView */
/* loaded from: classes8.dex */
public final class C16950xf026cd07 extends android.widget.RelativeLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f236539h = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g slideOutAnim;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g slideInAnim;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236542f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ps3.o mStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16950xf026cd07(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.slideOutAnim = jz5.h.b(new qs3.a0(this));
        this.slideInAnim = jz5.h.b(new qs3.y(this));
        this.f236542f = true;
        this.mStatus = ps3.o.f439649e;
    }

    /* renamed from: getSlideInAnim */
    private final android.view.animation.Animation m67804x9129d0b1() {
        return (android.view.animation.Animation) this.slideInAnim.mo141623x754a37bb();
    }

    /* renamed from: getSlideOutAnim */
    private final android.view.animation.Animation m67805xe021e204() {
        return (android.view.animation.Animation) this.slideOutAnim.mo141623x754a37bb();
    }

    public final void a() {
        int ordinal = this.mStatus.ordinal();
        if (ordinal == 0) {
            setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80932x2016cc55);
            setVisibility(0);
        } else if (ordinal != 1) {
            setVisibility(4);
        } else {
            setVisibility(4);
        }
    }

    public final void b(ps3.o status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (this.mStatus != status) {
            this.mStatus = status;
            int ordinal = status.ordinal();
            if (ordinal == 0) {
                if (this.f236542f) {
                    a();
                    startAnimation(m67805xe021e204());
                    return;
                }
                return;
            }
            if (ordinal == 1 && this.f236542f) {
                a();
                startAnimation(m67804x9129d0b1());
            }
        }
    }

    public final ps3.o getMStatus() {
        return this.mStatus;
    }

    /* renamed from: setMStatus */
    public final void m67807xcb787ffd(ps3.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<set-?>");
        this.mStatus = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16950xf026cd07(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.slideOutAnim = jz5.h.b(new qs3.a0(this));
        this.slideInAnim = jz5.h.b(new qs3.y(this));
        this.f236542f = true;
        this.mStatus = ps3.o.f439649e;
    }
}
