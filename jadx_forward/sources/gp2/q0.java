package gp2;

/* loaded from: classes10.dex */
public final class q0 implements in5.z {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f355829d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f355830e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f355831f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f355832g;

    /* renamed from: h, reason: collision with root package name */
    public int f355833h;

    /* renamed from: i, reason: collision with root package name */
    public int f355834i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f355835m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f355836n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f355837o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.MotionEvent f355838p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f355839q;

    public q0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, boolean z17, yz5.l invokeOnTouchMoveCallback, yz5.l invokeAutoPlayCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeOnTouchMoveCallback, "invokeOnTouchMoveCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeAutoPlayCallback, "invokeAutoPlayCallback");
        this.f355829d = recyclerView;
        this.f355830e = z17;
        this.f355831f = invokeOnTouchMoveCallback;
        this.f355832g = invokeAutoPlayCallback;
        this.f355833h = -1;
        this.f355839q = jz5.h.b(new gp2.n0(this));
    }

    @Override // in5.z
    public boolean f(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.MotionEvent event) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "ACTION pos:" + i17 + " (" + event.getAction() + ", " + event.getX() + ", " + event.getY() + ')');
        this.f355833h = i17;
        int action = event.getAction();
        if (action == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "ACTION_DOWN pos:" + i17 + " (" + event.getX() + ", " + event.getY() + ')');
            this.f355835m = false;
            this.f355834i = 0;
        } else if (action == 1 || action == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveItemOnTouchEventAdapter", "ACTION_UP pos:" + i17 + " (" + event.getX() + ", " + event.getY() + ')');
        }
        return false;
    }
}
