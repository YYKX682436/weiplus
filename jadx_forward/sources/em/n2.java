package em;

/* loaded from: classes.dex */
public class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336172a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f336173b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f336174c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f336175d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f336176e;

    public n2(android.view.View view) {
        this.f336172a = view;
    }

    public android.widget.TextView a() {
        if (this.f336176e == null) {
            this.f336176e = (android.widget.TextView) this.f336172a.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        }
        return this.f336176e;
    }

    public android.widget.RelativeLayout b() {
        if (this.f336175d == null) {
            this.f336175d = (android.widget.RelativeLayout) this.f336172a.findViewById(com.p314xaae8f345.mm.R.id.gzg);
        }
        return this.f336175d;
    }
}
