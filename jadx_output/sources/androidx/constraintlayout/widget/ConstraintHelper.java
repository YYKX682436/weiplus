package androidx.constraintlayout.widget;

/* loaded from: classes15.dex */
public abstract class ConstraintHelper extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int[] f10858d;

    /* renamed from: e, reason: collision with root package name */
    public int f10859e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f10860f;

    /* renamed from: g, reason: collision with root package name */
    public v2.m f10861g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f10862h;

    public ConstraintHelper(android.content.Context context) {
        super(context);
        this.f10858d = new int[32];
        this.f10860f = context;
        b(null);
    }

    private void setIds(java.lang.String str) {
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
        if (str == null || (context = this.f10860f) == null) {
            return;
        }
        java.lang.String trim = str.trim();
        try {
            i17 = androidx.constraintlayout.widget.R$id.class.getField(trim).getInt(null);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        if (i17 == 0) {
            i17 = context.getResources().getIdentifier(trim, dm.i4.COL_ID, context.getPackageName());
        }
        if (i17 == 0 && isInEditMode() && (getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
            constraintLayout.getClass();
            java.lang.Object obj = ((trim instanceof java.lang.String) && (hashMap = constraintLayout.f10875s) != null && hashMap.containsKey(trim)) ? constraintLayout.f10875s.get(trim) : null;
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
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    java.lang.String string = obtainStyledAttributes.getString(index);
                    this.f10862h = string;
                    setIds(string);
                }
            }
        }
    }

    public void c(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f10862h);
        }
        v2.m mVar = this.f10861g;
        if (mVar == null) {
            return;
        }
        mVar.f432715j0 = 0;
        for (int i17 = 0; i17 < this.f10859e; i17++) {
            android.view.View view = (android.view.View) constraintLayout.f10863d.get(this.f10858d[i17]);
            if (view != null) {
                v2.m mVar2 = this.f10861g;
                v2.i v17 = constraintLayout.v(view);
                int i18 = mVar2.f432715j0 + 1;
                v2.i[] iVarArr = mVar2.f432714i0;
                if (i18 > iVarArr.length) {
                    mVar2.f432714i0 = (v2.i[]) java.util.Arrays.copyOf(iVarArr, iVarArr.length * 2);
                }
                v2.i[] iVarArr2 = mVar2.f432714i0;
                int i19 = mVar2.f432715j0;
                iVarArr2[i19] = v17;
                mVar2.f432715j0 = i19 + 1;
            }
        }
    }

    public void e() {
        if (this.f10861g == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).f10900k0 = this.f10861g;
        }
    }

    public int[] getReferencedIds() {
        return java.util.Arrays.copyOf(this.f10858d, this.f10859e);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f10859e = 0;
        for (int i17 : iArr) {
            setTag(i17, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i17, java.lang.Object obj) {
        int i18 = this.f10859e + 1;
        int[] iArr = this.f10858d;
        if (i18 > iArr.length) {
            this.f10858d = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f10858d;
        int i19 = this.f10859e;
        iArr2[i19] = i17;
        this.f10859e = i19 + 1;
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10858d = new int[32];
        this.f10860f = context;
        b(attributeSet);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f10858d = new int[32];
        this.f10860f = context;
        b(attributeSet);
    }
}
