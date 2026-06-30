package p61;

/* loaded from: classes8.dex */
public class n3 {

    /* renamed from: a, reason: collision with root package name */
    public int f433854a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f433855b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f433856c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f433857d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f433858e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f433859f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ProgressBar f433860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p61.o3 f433861h;

    public n3(p61.o3 o3Var, android.view.View view) {
        this.f433861h = o3Var;
        this.f433855b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gq6);
        this.f433856c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gq_);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.gqa);
        this.f433858e = findViewById;
        this.f433859f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gqb);
        this.f433860g = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.gq9);
        this.f433857d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gq7);
        findViewById.setOnClickListener(new p61.m3(this, o3Var));
    }
}
