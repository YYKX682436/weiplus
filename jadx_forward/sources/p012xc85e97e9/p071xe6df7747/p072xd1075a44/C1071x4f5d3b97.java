package p012xc85e97e9.p071xe6df7747.p072xd1075a44;

/* renamed from: androidx.constraintlayout.widget.Barrier */
/* loaded from: classes15.dex */
public class C1071x4f5d3b97 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b {

    /* renamed from: i, reason: collision with root package name */
    public int f92388i;

    /* renamed from: m, reason: collision with root package name */
    public int f92389m;

    /* renamed from: n, reason: collision with root package name */
    public v2.b f92390n;

    public C1071x4f5d3b97(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // p012xc85e97e9.p071xe6df7747.p072xd1075a44.AbstractC1072x7767bc0b
    public void b(android.util.AttributeSet attributeSet) {
        super.b(attributeSet);
        this.f92390n = new v2.b();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2714xfdac0702);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i17 = 0; i17 < indexCount; i17++) {
                int index = obtainStyledAttributes.getIndex(i17);
                if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2721x2324c125) {
                    m7170x7650bebc(obtainStyledAttributes.getInt(index, 0));
                } else if (index == p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1080x77359cb9.f2720xb213880c) {
                    this.f92390n.f514137m0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f92394g = this.f92390n;
        e();
    }

    /* renamed from: getType */
    public int m7168xfb85f7b0() {
        return this.f92388i;
    }

    /* renamed from: setAllowsGoneWidget */
    public void m7169xfd695e2f(boolean z17) {
        this.f92390n.f514137m0 = z17;
    }

    /* renamed from: setType */
    public void m7170x7650bebc(int i17) {
        this.f92388i = i17;
        this.f92389m = i17;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i18 = this.f92388i;
            if (i18 == 5) {
                this.f92389m = 1;
            } else if (i18 == 6) {
                this.f92389m = 0;
            }
        } else {
            int i19 = this.f92388i;
            if (i19 == 5) {
                this.f92389m = 0;
            } else if (i19 == 6) {
                this.f92389m = 1;
            }
        }
        this.f92390n.f514135k0 = this.f92389m;
    }

    public C1071x4f5d3b97(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C1071x4f5d3b97(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        super.setVisibility(8);
    }
}
