package em;

/* loaded from: classes12.dex */
public class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336031a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f336032b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f336033c;

    public k1(android.view.View view) {
        this.f336031a = view;
    }

    public android.widget.ImageView a() {
        if (this.f336033c == null) {
            this.f336033c = (android.widget.ImageView) this.f336031a.findViewById(com.p314xaae8f345.mm.R.id.d3c);
        }
        return this.f336033c;
    }

    public android.widget.TextView b() {
        if (this.f336032b == null) {
            this.f336032b = (android.widget.TextView) this.f336031a.findViewById(com.p314xaae8f345.mm.R.id.d3d);
        }
        return this.f336032b;
    }
}
