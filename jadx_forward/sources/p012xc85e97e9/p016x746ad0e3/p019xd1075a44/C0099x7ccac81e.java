package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ListPopupWindow */
/* loaded from: classes15.dex */
public class C0099x7ccac81e implements o.k0 {
    public static final java.lang.reflect.Method F;
    public static final java.lang.reflect.Method G;
    public static final java.lang.reflect.Method H;
    public final android.os.Handler A;
    public final android.graphics.Rect B;
    public android.graphics.Rect C;
    public boolean D;
    public final android.widget.PopupWindow E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f90950d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListAdapter f90951e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 f90952f;

    /* renamed from: g, reason: collision with root package name */
    public final int f90953g;

    /* renamed from: h, reason: collision with root package name */
    public int f90954h;

    /* renamed from: i, reason: collision with root package name */
    public int f90955i;

    /* renamed from: m, reason: collision with root package name */
    public int f90956m;

    /* renamed from: n, reason: collision with root package name */
    public final int f90957n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f90958o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f90959p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f90960q;

    /* renamed from: r, reason: collision with root package name */
    public int f90961r;

    /* renamed from: s, reason: collision with root package name */
    public final int f90962s;

    /* renamed from: t, reason: collision with root package name */
    public android.database.DataSetObserver f90963t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f90964u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f90965v;

    /* renamed from: w, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l1 f90966w;

    /* renamed from: x, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k1 f90967x;

    /* renamed from: y, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j1 f90968y;

    /* renamed from: z, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h1 f90969z;

    static {
        try {
            F = android.widget.PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", java.lang.Boolean.TYPE);
        } catch (java.lang.NoSuchMethodException unused) {
        }
        try {
            G = android.widget.PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", android.view.View.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE);
        } catch (java.lang.NoSuchMethodException unused2) {
        }
        try {
            H = android.widget.PopupWindow.class.getDeclaredMethod("setEpicenterBounds", android.graphics.Rect.class);
        } catch (java.lang.NoSuchMethodException unused3) {
        }
    }

    public C0099x7ccac81e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559849gj);
    }

    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 c(android.content.Context context, boolean z17) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1(context, z17);
    }

    public void d(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.f90963t;
        if (dataSetObserver == null) {
            this.f90963t = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i1(this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f90951e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f90951e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f90963t);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var = this.f90952f;
        if (b1Var != null) {
            b1Var.setAdapter(this.f90951e);
        }
    }

    @Override // o.k0
    /* renamed from: dismiss */
    public void mo2732x63a3b28a() {
        android.widget.PopupWindow popupWindow = this.E;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f90952f = null;
        this.A.removeCallbacks(this.f90966w);
    }

    public void e(int i17) {
        android.graphics.drawable.Drawable background = this.E.getBackground();
        if (background == null) {
            this.f90954h = i17;
            return;
        }
        android.graphics.Rect rect = this.B;
        background.getPadding(rect);
        this.f90954h = rect.left + rect.right + i17;
    }

    @Override // o.k0
    /* renamed from: getListView */
    public android.widget.ListView mo2733xcc101dd9() {
        return this.f90952f;
    }

    @Override // o.k0
    /* renamed from: isShowing */
    public boolean mo2734x58a9c73b() {
        return this.E.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    @Override // o.k0
    /* renamed from: show */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2735x35dafd() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e.mo2735x35dafd():void");
    }

    public C0099x7ccac81e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public C0099x7ccac81e(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f90953g = -2;
        this.f90954h = -2;
        this.f90957n = 1002;
        this.f90961r = 0;
        this.f90962s = Integer.MAX_VALUE;
        this.f90966w = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l1(this);
        this.f90967x = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k1(this);
        this.f90968y = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j1(this);
        this.f90969z = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h1(this);
        this.B = new android.graphics.Rect();
        this.f90950d = context;
        this.A = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377721p, i17, i18);
        this.f90955i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f90956m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f90958o = true;
        }
        obtainStyledAttributes.recycle();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0087x2f16f6d9 c0087x2f16f6d9 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0087x2f16f6d9(context, attributeSet, i17, i18);
        this.E = c0087x2f16f6d9;
        c0087x2f16f6d9.setInputMethodMode(1);
    }
}
