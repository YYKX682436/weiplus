package com.tencent.mm.mj_publisher.finder.widgets.picker;

/* loaded from: classes5.dex */
public class MJCustomDatePicker extends android.widget.FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f69694t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f69695d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f69696e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f69697f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Date f69698g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Date f69699h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69700i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69701m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69702n;

    /* renamed from: o, reason: collision with root package name */
    public int f69703o;

    /* renamed from: p, reason: collision with root package name */
    public int f69704p;

    /* renamed from: q, reason: collision with root package name */
    public int f69705q;

    /* renamed from: r, reason: collision with root package name */
    public v51.e f69706r;

    /* renamed from: s, reason: collision with root package name */
    public v51.f f69707s;

    public MJCustomDatePicker(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve));
        this.f69695d = null;
        this.f69700i = true;
        this.f69701m = true;
        this.f69702n = true;
        this.f69697f = context;
        this.f69696e = new w51.g(context, false);
    }

    public android.view.View getView() {
        if (this.f69695d == null) {
            this.f69695d = this.f69696e.d();
        }
        return this.f69695d;
    }

    public void setMaxDate(java.lang.Long l17) {
        this.f69699h = new java.util.Date(l17.longValue());
    }

    public void setMinDate(java.lang.Long l17) {
        this.f69698g = new java.util.Date(l17.longValue());
    }

    public void setOnTimeSelectListener(v51.f fVar) {
        this.f69707s = fVar;
    }

    public void setTimeSelectChangeListener(v51.e eVar) {
        this.f69706r = eVar;
    }

    public MJCustomDatePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
        this.f69695d = null;
        this.f69700i = true;
        this.f69701m = true;
        this.f69702n = true;
        this.f69697f = context;
        this.f69696e = new w51.g(context, false);
    }

    public MJCustomDatePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f69695d = null;
        this.f69700i = true;
        this.f69701m = true;
        this.f69702n = true;
        this.f69697f = context;
        this.f69696e = new w51.g(context, false);
    }
}
