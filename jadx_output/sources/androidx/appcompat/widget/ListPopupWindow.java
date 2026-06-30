package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class ListPopupWindow implements o.k0 {
    public static final java.lang.reflect.Method F;
    public static final java.lang.reflect.Method G;
    public static final java.lang.reflect.Method H;
    public final android.os.Handler A;
    public final android.graphics.Rect B;
    public android.graphics.Rect C;
    public boolean D;
    public final android.widget.PopupWindow E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f9417d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListAdapter f9418e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.b1 f9419f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9420g;

    /* renamed from: h, reason: collision with root package name */
    public int f9421h;

    /* renamed from: i, reason: collision with root package name */
    public int f9422i;

    /* renamed from: m, reason: collision with root package name */
    public int f9423m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9424n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9425o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9426p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9427q;

    /* renamed from: r, reason: collision with root package name */
    public int f9428r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9429s;

    /* renamed from: t, reason: collision with root package name */
    public android.database.DataSetObserver f9430t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f9431u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f9432v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.appcompat.widget.l1 f9433w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.appcompat.widget.k1 f9434x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.appcompat.widget.j1 f9435y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.appcompat.widget.h1 f9436z;

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

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478316gj);
    }

    public androidx.appcompat.widget.b1 c(android.content.Context context, boolean z17) {
        return new androidx.appcompat.widget.b1(context, z17);
    }

    public void d(android.widget.ListAdapter listAdapter) {
        android.database.DataSetObserver dataSetObserver = this.f9430t;
        if (dataSetObserver == null) {
            this.f9430t = new androidx.appcompat.widget.i1(this);
        } else {
            android.widget.ListAdapter listAdapter2 = this.f9418e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9418e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9430t);
        }
        androidx.appcompat.widget.b1 b1Var = this.f9419f;
        if (b1Var != null) {
            b1Var.setAdapter(this.f9418e);
        }
    }

    @Override // o.k0
    public void dismiss() {
        android.widget.PopupWindow popupWindow = this.E;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f9419f = null;
        this.A.removeCallbacks(this.f9433w);
    }

    public void e(int i17) {
        android.graphics.drawable.Drawable background = this.E.getBackground();
        if (background == null) {
            this.f9421h = i17;
            return;
        }
        android.graphics.Rect rect = this.B;
        background.getPadding(rect);
        this.f9421h = rect.left + rect.right + i17;
    }

    @Override // o.k0
    public android.widget.ListView getListView() {
        return this.f9419f;
    }

    @Override // o.k0
    public boolean isShowing() {
        return this.E.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    @Override // o.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.show():void");
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public ListPopupWindow(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        this.f9420g = -2;
        this.f9421h = -2;
        this.f9424n = 1002;
        this.f9428r = 0;
        this.f9429s = Integer.MAX_VALUE;
        this.f9433w = new androidx.appcompat.widget.l1(this);
        this.f9434x = new androidx.appcompat.widget.k1(this);
        this.f9435y = new androidx.appcompat.widget.j1(this);
        this.f9436z = new androidx.appcompat.widget.h1(this);
        this.B = new android.graphics.Rect();
        this.f9417d = context;
        this.A = new android.os.Handler(context.getMainLooper());
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296188p, i17, i18);
        this.f9422i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f9423m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9425o = true;
        }
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.AppCompatPopupWindow appCompatPopupWindow = new androidx.appcompat.widget.AppCompatPopupWindow(context, attributeSet, i17, i18);
        this.E = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
