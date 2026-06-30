package em;

/* loaded from: classes12.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336305a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e f336306b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f336307c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f336308d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f336309e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f336310f;

    public s1(android.view.View view) {
        this.f336305a = view;
    }

    public android.widget.RelativeLayout a() {
        if (this.f336309e == null) {
            this.f336309e = (android.widget.RelativeLayout) this.f336305a.findViewById(com.p314xaae8f345.mm.R.id.shw);
        }
        return this.f336309e;
    }

    public android.widget.FrameLayout b() {
        if (this.f336308d == null) {
            this.f336308d = (android.widget.FrameLayout) this.f336305a.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        }
        return this.f336308d;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e c() {
        if (this.f336306b == null) {
            this.f336306b = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16494x7edfff8e) this.f336305a.findViewById(com.p314xaae8f345.mm.R.id.mhc);
        }
        return this.f336306b;
    }
}
