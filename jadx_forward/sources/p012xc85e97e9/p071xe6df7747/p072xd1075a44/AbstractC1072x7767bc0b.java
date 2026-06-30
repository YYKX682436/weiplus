package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.ConstraintHelper */
/* loaded from: classes15.dex */
public abstract class AbstractC1072x7767bc0b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int[] f92391d;

    /* renamed from: e, reason: collision with root package name */
    public int f92392e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f92393f;

    /* renamed from: g, reason: collision with root package name */
    public v2.m f92394g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f92395h;

    public AbstractC1072x7767bc0b(android.content.Context context) {
        super(context);
        this.f92391d = new int[32];
        this.f92393f = context;
        b(null);
    }

    /* renamed from: setIds */
    private void m7171xca026ef6(java.lang.String str) {
        if (str == null) {
            return;
        }
        int i17 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i17);
            if (indexOf == -1) {
                a(str.substring(i17));
                return;
            } else {
                a(str.substring(i17, indexOf));
                i17 = indexOf + 1;
            }
        }
    }

    public final void a(java.lang.String str) {
        android.content.Context context;
        int i17;
        java.util.HashMap hashMap;
        if (str == null || (context = this.f92393f) == null) {
            return;
        }
        java.lang.String trim = str.trim();
        try {
            i17 = p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1079x25daad.class.getField(trim).getInt(null);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        if (i17 == 0) {
            i17 = context.getResources().getIdentifier(trim, dm.i4.f66865x76d1ec5a, context.getPackageName());
        }
        if (i17 == 0 && isInEditMode() && (getParent() instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787)) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) getParent();
            c1073x7e08a787.getClass();
            java.lang.Object obj = ((trim instanceof java.lang.String) && (hashMap = c1073x7e08a787.f92408s) != null && hashMap.containsKey(trim)) ? c1073x7e08a787.f92408s.get(trim) : null;
            if (obj != null && (obj instanceof java.lang.Integer)) {
                i17 = ((java.lang.Integer) obj).intValue();
            }
        }
        if (i17 != 0) {
            setTag(i17, null);
        }
    }

    public void b(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2714xfdac0702);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2724x3a6c0f97) {
                    java.lang.String string = obtainStyledAttributes.getString(index);
                    this.f92395h = string;
                    m7171xca026ef6(string);
                }
            }
        }
    }

    public void c(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
    }

    public void d(p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787) {
        if (isInEditMode()) {
            m7171xca026ef6(this.f92395h);
        }
        v2.m mVar = this.f92394g;
        if (mVar == null) {
            return;
        }
        mVar.f514248j0 = 0;
        for (int i17 = 0; i17 < this.f92392e; i17++) {
            android.view.View view = (android.view.View) c1073x7e08a787.f92396d.get(this.f92391d[i17]);
            if (view != null) {
                v2.m mVar2 = this.f92394g;
                v2.i v17 = c1073x7e08a787.v(view);
                int i18 = mVar2.f514248j0 + 1;
                v2.i[] iVarArr = mVar2.f514247i0;
                if (i18 > iVarArr.length) {
                    mVar2.f514247i0 = (v2.i[]) java.util.Arrays.copyOf(iVarArr, iVarArr.length * 2);
                }
                v2.i[] iVarArr2 = mVar2.f514247i0;
                int i19 = mVar2.f514248j0;
                iVarArr2[i19] = v17;
                mVar2.f514248j0 = i19 + 1;
            }
        }
    }

    public void e() {
        if (this.f92394g == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) {
            ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams).f92433k0 = this.f92394g;
        }
    }

    /* renamed from: getReferencedIds */
    public int[] m7172x1cd2f1c9() {
        return java.util.Arrays.copyOf(this.f92391d, this.f92392e);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }

    /* renamed from: setReferencedIds */
    public void m7173xafa9583d(int[] iArr) {
        this.f92392e = 0;
        for (int i17 : iArr) {
            setTag(i17, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i17, java.lang.Object obj) {
        int i18 = this.f92392e + 1;
        int[] iArr = this.f92391d;
        if (i18 > iArr.length) {
            this.f92391d = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f92391d;
        int i19 = this.f92392e;
        iArr2[i19] = i17;
        this.f92392e = i19 + 1;
    }

    public AbstractC1072x7767bc0b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92391d = new int[32];
        this.f92393f = context;
        b(attributeSet);
    }

    public AbstractC1072x7767bc0b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f92391d = new int[32];
        this.f92393f = context;
        b(attributeSet);
    }
}
