package com.tencent.mm.mj_publisher.finder.widgets.picker;

/* loaded from: classes5.dex */
public class MJCustomTimePicker extends android.widget.FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f69708r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f69709d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f69710e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f69711f;

    /* renamed from: g, reason: collision with root package name */
    public int f69712g;

    /* renamed from: h, reason: collision with root package name */
    public int f69713h;

    /* renamed from: i, reason: collision with root package name */
    public int f69714i;

    /* renamed from: m, reason: collision with root package name */
    public int f69715m;

    /* renamed from: n, reason: collision with root package name */
    public int f69716n;

    /* renamed from: o, reason: collision with root package name */
    public int f69717o;

    /* renamed from: p, reason: collision with root package name */
    public v51.e f69718p;

    /* renamed from: q, reason: collision with root package name */
    public v51.f f69719q;

    public MJCustomTimePicker(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve));
        this.f69709d = null;
        this.f69712g = -1;
        this.f69713h = -1;
        this.f69714i = -1;
        this.f69715m = -1;
        this.f69716n = -1;
        this.f69717o = -1;
        this.f69711f = context;
        this.f69710e = new w51.g(context);
    }

    public android.view.View getView() {
        if (this.f69709d == null) {
            this.f69709d = this.f69710e.d();
        }
        return this.f69709d;
    }

    public void setOnTimeSelectListener(v51.f fVar) {
        this.f69719q = fVar;
    }

    public void setTimeSelectChangeListener(v51.e eVar) {
        this.f69718p = eVar;
    }

    public MJCustomTimePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
        this.f69709d = null;
        this.f69712g = -1;
        this.f69713h = -1;
        this.f69714i = -1;
        this.f69715m = -1;
        this.f69716n = -1;
        this.f69717o = -1;
        this.f69711f = context;
        this.f69710e = new w51.g(context);
    }

    public MJCustomTimePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f69709d = null;
        this.f69712g = -1;
        this.f69713h = -1;
        this.f69714i = -1;
        this.f69715m = -1;
        this.f69716n = -1;
        this.f69717o = -1;
        this.f69711f = context;
        this.f69710e = new w51.g(context);
    }
}
