package em;

/* loaded from: classes9.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f336392a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f336393b;

    public v0(android.view.View view) {
        this.f336392a = view;
    }

    public static em.v0 a(android.content.Context context) {
        return new em.v0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehq, (android.view.ViewGroup) null));
    }

    public android.widget.FrameLayout b() {
        if (this.f336393b == null) {
            this.f336393b = (android.widget.FrameLayout) this.f336392a.findViewById(com.p314xaae8f345.mm.R.id.cgz);
        }
        return this.f336393b;
    }
}
