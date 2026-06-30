package em;

/* loaded from: classes9.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336362a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f336363b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f336364c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f336365d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f336366e;

    public u0(android.view.View view) {
        this.f336362a = view;
    }

    public android.widget.TextView a() {
        if (this.f336365d == null) {
            this.f336365d = (android.widget.TextView) this.f336362a.findViewById(com.p314xaae8f345.mm.R.id.g4e);
        }
        return this.f336365d;
    }

    public android.widget.ImageView b() {
        if (this.f336363b == null) {
            this.f336363b = (android.widget.ImageView) this.f336362a.findViewById(com.p314xaae8f345.mm.R.id.twa);
        }
        return this.f336363b;
    }
}
