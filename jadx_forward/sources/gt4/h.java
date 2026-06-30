package gt4;

/* loaded from: classes8.dex */
public class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gt4.k f356971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f356972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f356973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f356976g;

    public h(android.content.Context context, gt4.k kVar, android.widget.TextView textView, android.widget.EditText editText, java.lang.String str, java.lang.String str2, android.widget.TextView textView2) {
        this.f356970a = context;
        this.f356971b = kVar;
        this.f356972c = textView;
        this.f356973d = editText;
        this.f356974e = str;
        this.f356975f = str2;
        this.f356976g = textView2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        android.content.Context context = this.f356970a;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            gt4.k kVar = this.f356971b;
            if (kVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w0) kVar).a(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f356972c.getText().toString().trim()), this.f356973d.getText().toString().trim(), this.f356974e, this.f356975f, this.f356976g.getText().toString().trim());
            }
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gt4.g(this));
            }
        }
    }
}
