package em;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f335721a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f335722b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f335723c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f335724d;

    public d(android.view.View view) {
        this.f335721a = view;
    }

    public android.widget.ImageView a() {
        if (this.f335723c == null) {
            this.f335723c = (android.widget.ImageView) this.f335721a.findViewById(com.p314xaae8f345.mm.R.id.vgp);
        }
        return this.f335723c;
    }

    public android.widget.TextView b() {
        if (this.f335722b == null) {
            this.f335722b = (android.widget.TextView) this.f335721a.findViewById(com.p314xaae8f345.mm.R.id.vgu);
        }
        return this.f335722b;
    }
}
