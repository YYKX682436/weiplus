package em;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336151a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f336152b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f336153c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f336154d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f336155e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f336156f;

    public n(android.view.View view) {
        this.f336151a = view;
    }

    public android.widget.ImageView a() {
        if (this.f336154d == null) {
            this.f336154d = (android.widget.ImageView) this.f336151a.findViewById(com.p314xaae8f345.mm.R.id.ei8);
        }
        return this.f336154d;
    }

    public android.widget.TextView b() {
        if (this.f336155e == null) {
            this.f336155e = (android.widget.TextView) this.f336151a.findViewById(com.p314xaae8f345.mm.R.id.ei9);
        }
        return this.f336155e;
    }
}
