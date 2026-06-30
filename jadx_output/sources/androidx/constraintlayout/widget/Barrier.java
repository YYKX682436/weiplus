package androidx.constraintlayout.widget;

/* loaded from: classes15.dex */
public class Barrier extends androidx.constraintlayout.widget.ConstraintHelper {

    /* renamed from: i, reason: collision with root package name */
    public int f10855i;

    /* renamed from: m, reason: collision with root package name */
    public int f10856m;

    /* renamed from: n, reason: collision with root package name */
    public v2.b f10857n;

    public Barrier(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void b(android.util.AttributeSet attributeSet) {
        super.b(attributeSet);
        this.f10857n = new v2.b();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f10857n.f432604m0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f10861g = this.f10857n;
        e();
    }

    public int getType() {
        return this.f10855i;
    }

    public void setAllowsGoneWidget(boolean z17) {
        this.f10857n.f432604m0 = z17;
    }

    public void setType(int i17) {
        this.f10855i = i17;
        this.f10856m = i17;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i18 = this.f10855i;
            if (i18 == 5) {
                this.f10856m = 1;
            } else if (i18 == 6) {
                this.f10856m = 0;
            }
        } else {
            int i19 = this.f10855i;
            if (i19 == 5) {
                this.f10856m = 0;
            } else if (i19 == 6) {
                this.f10856m = 1;
            }
        }
        this.f10857n.f432602k0 = this.f10856m;
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        super.setVisibility(8);
    }
}
